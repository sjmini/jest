package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetGlobalObject {
  val length: Int = 0
  val func: Func = Func("""GetGlobalObject""", List(), None, ISeq(List(ILet(Id("""ctx"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(8590), ILet(Id("""currentRealm"""), ERef(RefProp(RefId(Id("""ctx""")), EStr("""Realm""")))).setId(8592), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""currentRealm""")), EStr("""GlobalObject"""))))).setId(8594), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8595))).setId(8602))
  val instToStepMap: Map[Int, Int] = HashMap(8590 -> 0, 8595 -> 2, 8594 -> 2, 8591 -> 0, 8596 -> 2, 8593 -> 1, 8592 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(8590, 8591), 1 -> HashSet(8593, 8592), 2 -> HashSet(8595, 8594, 8596))
  /* Beautified form:
  "GetGlobalObject" () => {
    let ctx = GLOBAL_context
    let currentRealm = ctx["Realm"]
    app __x0__ = (WrapCompletion currentRealm["GlobalObject"])
    return __x0__
  }
  */
}
