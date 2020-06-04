package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTCreateMutableBinding {
  val length: Int = 2
  val func: Func = Func("""DeclarativeEnvironmentRecord.CreateMutableBinding""", List(Id("""this"""), Id("""N"""), Id("""D""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47129), IAssign(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EMap(Ty("""MutableBinding"""), List((EStr("""initialized"""), EBool(false))))).setId(47132), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(47133), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(47134), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47135))).setId(-1))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.CreateMutableBinding" (this, N, D) => {
    let envRec = this
    envRec["SubMap"][N] = (new MutableBinding("initialized" -> false))
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
