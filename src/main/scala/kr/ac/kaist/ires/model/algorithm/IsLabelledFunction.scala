package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsLabelledFunction {
  val length: Int = 1
  val func: Func = Func("""IsLabelledFunction""", List(Id("""stmt""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(36258), IAccess(Id("""__x0__"""), ERef(RefId(Id("""stmt"""))), EStr("""LabelledItem""")).setId(36259), ILet(Id("""item"""), ERef(RefId(Id("""__x0__""")))).setId(36260), IIf(EIsInstanceOf(ERef(RefId(Id("""item"""))), """LabelledItem1"""), ISeq(List(IAccess(Id("""FunctionDeclaration"""), ERef(RefId(Id("""item"""))), EStr("""FunctionDeclaration""")).setId(36264), IReturn(EBool(true)).setId(36262))).setId(36265), ISeq(List()).setId(36266)).setId(36267), IAccess(Id("""__x1__"""), ERef(RefId(Id("""item"""))), EStr("""Statement""")).setId(36268), ILet(Id("""subStmt"""), ERef(RefId(Id("""__x1__""")))).setId(36269), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsLabelledFunction"""))), List(ERef(RefId(Id("""subStmt"""))))).setId(36271), IReturn(ERef(RefId(Id("""__x2__""")))).setId(36272))).setId(-1))
  /* Beautified form:
  "IsLabelledFunction" (stmt) => {
    !!! "Etc"
    access __x0__ = (stmt "LabelledItem")
    let item = __x0__
    if (is-instance-of item LabelledItem1) {
      access FunctionDeclaration = (item "FunctionDeclaration")
      return true
    } else {}
    access __x1__ = (item "Statement")
    let subStmt = __x1__
    app __x2__ = (IsLabelledFunction subStmt)
    return __x2__
  }
  */
}
