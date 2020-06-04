package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EvaluateNew {
  val length: Int = 2
  val func: Func = Func("""EvaluateNew""", List(Id("""constructExpr"""), Id("""arguments""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""constructExpr"""))), EStr("""Evaluation""")).setId(16988), ILet(Id("""ref"""), ERef(RefId(Id("""__x0__""")))).setId(16989), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""ref"""))))).setId(16991), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(16992), IReturn(ERef(RefId(Id("""__x1__""")))).setId(16993)).setId(16994), ISeq(List()).setId(16986)).setId(16995), ILet(Id("""constructor"""), ERef(RefId(Id("""__x1__""")))).setId(16996), IIf(EBOp(OEq, ERef(RefId(Id("""arguments"""))), ERef(RefId(Id("""CONST_empty""")))), ILet(Id("""argList"""), EList(List())).setId(16998), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""arguments"""))), EStr("""ArgumentListEvaluation""")).setId(17000), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(17001), IReturn(ERef(RefId(Id("""__x2__""")))).setId(17002)).setId(17003), ISeq(List()).setId(16986)).setId(17004), ILet(Id("""argList"""), ERef(RefId(Id("""__x2__""")))).setId(17005))).setId(17007)).setId(17008), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""constructor"""))))).setId(17010), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(17011), IReturn(ERef(RefId(Id("""__x4__""")))).setId(17012))).setId(17013), ISeq(List()).setId(16986)).setId(17014), IApp(Id("""__x5__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""constructor"""))), ERef(RefId(Id("""argList"""))))).setId(17016), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(17017), IReturn(ERef(RefId(Id("""__x5__""")))).setId(17018)).setId(17019), ISeq(List()).setId(16986)).setId(17020), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(17021), IReturn(ERef(RefId(Id("""__x6__""")))).setId(17022))).setId(-1))
  /* Beautified form:
  "EvaluateNew" (constructExpr, arguments) => {
    access __x0__ = (constructExpr "Evaluation")
    let ref = __x0__
    app __x1__ = (GetValue ref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let constructor = __x1__
    if (= arguments CONST_empty) let argList = (new []) else {
      access __x2__ = (arguments "ArgumentListEvaluation")
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let argList = __x2__
    }
    app __x3__ = (IsConstructor constructor)
    if (= __x3__ false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (Construct constructor argList)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
