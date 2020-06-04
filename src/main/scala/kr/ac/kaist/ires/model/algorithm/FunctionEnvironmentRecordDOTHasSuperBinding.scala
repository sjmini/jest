package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionEnvironmentRecordDOTHasSuperBinding {
  val length: Int = 0
  val func: Func = Func("""FunctionEnvironmentRecord.HasSuperBinding""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47901), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus"""))), EStr("""lexical""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47903), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47904))).setId(47905), ISeq(List()).setId(47906)).setId(47907), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""HomeObject"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47909), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47910))).setId(47911), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(47912), IReturn(ERef(RefId(Id("""__x2__""")))).setId(47913))).setId(47914)).setId(47915))).setId(-1))
  /* Beautified form:
  "FunctionEnvironmentRecord.HasSuperBinding" (this) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] "lexical") {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (= envRec["HomeObject"] undefined) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion true)
      return __x2__
    }
  }
  */
}
