package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateRealm {
  val length: Int = 0
  val func: Func = Func("""CreateRealm""", List(), None, ISeq(List(ILet(Id("""realmRec"""), ERef(RefId(Id("""REALM""")))).setId(8138), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateIntrinsics"""))), List(ERef(RefId(Id("""realmRec"""))))).setId(8139), IExpr(ERef(RefId(Id("""__x0__""")))).setId(8140), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalObject""")), EUndef).setId(8142), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalEnv""")), EUndef).setId(8144), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""TemplateMap""")), EList(List())).setId(8146), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""realmRec"""))))).setId(8148), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8149))).setId(-1))
  /* Beautified form:
  "CreateRealm" () => {
    let realmRec = REALM
    app __x0__ = (CreateIntrinsics realmRec)
    __x0__
    realmRec["GlobalObject"] = undefined
    realmRec["GlobalEnv"] = undefined
    realmRec["TemplateMap"] = (new [])
    app __x1__ = (WrapCompletion realmRec)
    return __x1__
  }
  */
}
