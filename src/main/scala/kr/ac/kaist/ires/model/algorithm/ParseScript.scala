package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ParseScript {
  val length: Int = 3
  val func: Func = Func("""ParseScript""", List(Id("""sourceText"""), Id("""realm"""), Id("""hostDefined""")), None, ISeq(List(ILet(Id("""body"""), ERef(RefId(Id("""script""")))).setId(46318), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""ScriptRecord"""), List((EStr("""Realm"""), ERef(RefId(Id("""realm""")))), (EStr("""Environment"""), EUndef), (EStr("""ECMAScriptCode"""), ERef(RefId(Id("""body""")))), (EStr("""HostDefined"""), ERef(RefId(Id("""hostDefined""")))))))).setId(46319), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46320))).setId(46326))
  val instToStepMap: Map[Int, Int] = HashMap(46318 -> 1, 46317 -> 2, 46320 -> 3, 46321 -> 3, 46319 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46317), 1 -> HashSet(46318), 2 -> HashSet(46317), 3 -> HashSet(46320, 46321, 46319))
  /* Beautified form:
  "ParseScript" (sourceText, realm, hostDefined) => {
    let body = script
    app __x0__ = (WrapCompletion (new ScriptRecord("Realm" -> realm, "Environment" -> undefined, "ECMAScriptCode" -> body, "HostDefined" -> hostDefined)))
    return __x0__
  }
  */
}
