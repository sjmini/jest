package kr.ac.kaist.ires.generator

import kr.ac.kaist.ires.ir.Interp
import kr.ac.kaist.ires.model.{ Script, ModelHelper, Parser => JSParser }
import kr.ac.kaist.ires.coverage.Visited

object Generator {
  // max iteration
  val MAX_ITER = 100

  // generate JavaScript programs
  def generate: List[Script] = {
    var total: List[Script] = Nil
    val totalVisited: Visited = new Visited
    var condMap: Map[(Int, Boolean), Script] = Map()

    for (_ <- 0 until MAX_ITER) {
      val script = getSample
      // TODO extend to use `mutate`
      val visited = getVisited(script)
      if (!(visited subsetOf totalVisited)) {
        val newCondCovered = visited.getCondCovered -- totalVisited.getCondCovered
        for (cond <- newCondCovered) condMap += cond -> script
        totalVisited ++= visited
        total ::= script
      }
    }

    val coverage = totalVisited.getCoverage
    println(coverage.summary)

    total
  }

  // TODO random sampling
  def getSample: Script = JSParser.parse(JSParser.Script(Nil), "var x = 42").get

  // TODO mutate given JavaScript program
  def mutate(script: Script): Script = script

  // get visited points in ECMAScript
  def getVisited(script: Script): Visited = {
    val interp = new Interp
    val initSt = ModelHelper.initState(script)
    val st = interp(initSt)
    interp.visited
  }
}
