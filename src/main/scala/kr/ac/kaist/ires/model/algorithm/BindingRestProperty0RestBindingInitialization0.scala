package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingRestProperty0RestBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingRestProperty0RestBindingInitialization0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""value"""), Id("""environment"""), Id("""excludedNames""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(28649), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""environment"""))))).setId(28650), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(28651), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28652)).setId(28653), ISeq(List()).setId(28654)).setId(28655), ILet(Id("""lhs"""), ERef(RefId(Id("""__x1__""")))).setId(28656), IApp(Id("""__x2__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(28658), ILet(Id("""restObj"""), ERef(RefId(Id("""__x2__""")))).setId(28659), IApp(Id("""__x3__"""), ERef(RefId(Id("""CopyDataProperties"""))), List(ERef(RefId(Id("""restObj"""))), ERef(RefId(Id("""value"""))), ERef(RefId(Id("""excludedNames"""))))).setId(28661), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(28662), IReturn(ERef(RefId(Id("""__x3__""")))).setId(28663)).setId(28664), ISeq(List()).setId(28654)).setId(28665), IExpr(ERef(RefId(Id("""__x3__""")))).setId(28666), IIf(EBOp(OEq, ERef(RefId(Id("""environment"""))), EUndef), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""restObj"""))))).setId(28668), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(28669), IReturn(ERef(RefId(Id("""__x5__""")))).setId(28670))).setId(28671), ISeq(List()).setId(28654)).setId(28672), IApp(Id("""__x6__"""), ERef(RefId(Id("""InitializeReferencedBinding"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""restObj"""))))).setId(28674), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(28675), IReturn(ERef(RefId(Id("""__x7__""")))).setId(28676))).setId(-1))
  /* Beautified form:
  "BindingRestProperty0RestBindingInitialization0" (this, BindingIdentifier, value, environment, excludedNames) => {
    access __x0__ = (BindingIdentifier "StringValue")
    app __x1__ = (ResolveBinding __x0__ environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    app __x2__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let restObj = __x2__
    app __x3__ = (CopyDataProperties restObj value excludedNames)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    if (= environment undefined) {
      app __x4__ = (PutValue lhs restObj)
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (InitializeReferencedBinding lhs restObj)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
