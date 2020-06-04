package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetGlobalObject {
  val length: Int = 0
  val func: Func = Func("""GetGlobalObject""", List(), None, ISeq(List(ILet(Id("""ctx"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(8590), ILet(Id("""currentRealm"""), ERef(RefProp(RefId(Id("""ctx""")), EStr("""Realm""")))).setId(8592), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""currentRealm""")), EStr("""GlobalObject"""))))).setId(8594), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8595))).setId(-1))
  /* Beautified form:
  "GetGlobalObject" () => {
    let ctx = GLOBAL_context
    let currentRealm = ctx["Realm"]
    app __x0__ = (WrapCompletion currentRealm["GlobalObject"])
    return __x0__
  }
  */
}
