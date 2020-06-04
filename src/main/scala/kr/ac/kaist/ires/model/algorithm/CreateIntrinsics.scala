package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateIntrinsics {
  val length: Int = 1
  val func: Func = Func("""CreateIntrinsics""", List(Id("""realmRec""")), None, ISeq(List(ILet(Id("""intrinsics"""), EMap(Ty("""Record"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8170), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""Intrinsics""")), ERef(RefId(Id("""intrinsics""")))).setId(8172), IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ENull)).setId(8174), ILet(Id("""objProto"""), ERef(RefId(Id("""__x0__""")))).setId(8175), IAssign(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_ObjectPrototype""")), ERef(RefId(Id("""objProto""")))).setId(8177), ILet(Id("""throwerSteps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(0L)), (EStr("""step"""), ERef(RefId(Id("""INTRINSIC_ThrowTypeError"""))))))).setId(8179), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""throwerSteps"""))), EList(List()), ERef(RefId(Id("""realmRec"""))), ENull)).setId(8181), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(8182), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8183)).setId(8184), ISeq(List()).setId(8185)).setId(8186), ILet(Id("""thrower"""), ERef(RefId(Id("""__x1__""")))).setId(8187), IAssign(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_ThrowTypeError""")), ERef(RefId(Id("""thrower""")))).setId(8189), ILet(Id("""noSteps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(0L)), (EStr("""step"""), EFunc(List(), None, ISeq(List()).setId(8185)))))).setId(8191), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""noSteps"""))), EList(List()), ERef(RefId(Id("""realmRec"""))), ERef(RefId(Id("""objProto"""))))).setId(8193), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(8194), IReturn(ERef(RefId(Id("""__x2__""")))).setId(8195)).setId(8196), ISeq(List()).setId(8185)).setId(8197), ILet(Id("""funcProto"""), ERef(RefId(Id("""__x2__""")))).setId(8198), IAssign(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_FunctionPrototype""")), ERef(RefId(Id("""funcProto""")))).setId(8200), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""thrower""")), EStr("""SetPrototypeOf"""))), List(ERef(RefId(Id("""thrower"""))), ERef(RefId(Id("""funcProto"""))))).setId(8202), IExpr(ERef(RefId(Id("""__x3__""")))).setId(8203), IApp(Id("""__x4__"""), ERef(RefId(Id("""AddRestrictedFunctionProperties"""))), List(ERef(RefId(Id("""funcProto"""))), ERef(RefId(Id("""realmRec"""))))).setId(8205), IExpr(ERef(RefId(Id("""__x4__""")))).setId(8206), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""intrinsics"""))))).setId(8208), IReturn(ERef(RefId(Id("""__x5__""")))).setId(8209))).setId(-1))
  /* Beautified form:
  "CreateIntrinsics" (realmRec) => {
    let intrinsics = (new Record("SubMap" -> (new SubMap())))
    realmRec["Intrinsics"] = intrinsics
    app __x0__ = (ObjectCreate null)
    let objProto = __x0__
    intrinsics["INTRINSIC_ObjectPrototype"] = objProto
    let throwerSteps = (new algorithm("name" -> "", "length" -> 0i, "step" -> INTRINSIC_ThrowTypeError))
    app __x1__ = (CreateBuiltinFunction throwerSteps (new []) realmRec null)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let thrower = __x1__
    intrinsics["INTRINSIC_ThrowTypeError"] = thrower
    let noSteps = (new algorithm("name" -> "", "length" -> 0i, "step" -> () => {}))
    app __x2__ = (CreateBuiltinFunction noSteps (new []) realmRec objProto)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let funcProto = __x2__
    intrinsics["INTRINSIC_FunctionPrototype"] = funcProto
    app __x3__ = (thrower["SetPrototypeOf"] thrower funcProto)
    __x3__
    app __x4__ = (AddRestrictedFunctionProperties funcProto realmRec)
    __x4__
    app __x5__ = (WrapCompletion intrinsics)
    return __x5__
  }
  */
}
