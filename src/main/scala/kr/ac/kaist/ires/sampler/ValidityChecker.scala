package kr.ac.kaist.ires.sampler

import java.io.OutputStream
import javax.script._
import kr.ac.kaist.ires.LINE_SEP
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.model.Script
import kr.ac.kaist.ires.util.Useful._
import sys.process._
import java.util.concurrent.LinkedBlockingQueue
import io.Source

object ValidityChecker {
  val MESSAGE = "IRES-EXPECTED-EXCEPTION"
  def apply(script: String, debug: Boolean = false): Boolean =
    useGraalJs(script, debug)

  def useGraalJs(script: String, debug: Boolean = false): Boolean = {
    val manager = new ScriptEngineManager
    val engine = manager.getEngineByName("Graal.js")
    if (engine == null) {
      Console.err.println("[WARNING] ValidityChecker always return true because Graal.js is not yet installed in this environment.")
      true
    } else try {
      val revised = s"'use strict'; throw '$MESSAGE'; $script"
      engine.eval(revised)
      false
    } catch {
      case e: ScriptException =>
        val pass = e.toString.endsWith(MESSAGE)
        if (debug && !pass) println(script)
        pass
    }
  }

  def useNodeJs(script: String, debug: Boolean = false): Boolean = {
    var pass = false
    val logger = ProcessLogger(_ => {}, str => if (str == MESSAGE) pass = true)
    val status = s"""node --trace-uncaught -e "'use strict'; throw '$MESSAGE'; $script"""" ! logger
    pass
  }

  def test: Unit = {
    println(s"Loading samples...")
    val samples = Generator.getSample().map(_.toString)
    println(s"Finished loading.")
    val (gres, graaljs) = time(samples.map(s => (s, useGraalJs(s))))
    println(s"GraalJs took $graaljs ms.")
    val (nres, nodejs) = time(samples.map(s => (s, useNodeJs(s))))
    println(s"Node.js took $nodejs ms.")

    ((gres zip nres) zip samples).foreach {
      case ((g, n), s) => if (g != n) println(s)
    }
  }
}
