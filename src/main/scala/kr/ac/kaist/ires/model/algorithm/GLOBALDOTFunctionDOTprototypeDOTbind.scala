package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTbind {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Function.prototype.bind""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(66853), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x0__""")))).setId(66854), ILet(Id("""Target"""), ERef(RefId(Id("""this""")))).setId(66856), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""Target"""))))).setId(66858), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66859), IReturn(ERef(RefId(Id("""__x2__""")))).setId(66860))).setId(66861), ISeq(List()).setId(66862)).setId(66863), IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), IExpr(EPop(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(66865), ISeq(List()).setId(66866)).setId(66867), ILet(Id("""args"""), ERef(RefId(Id("""argumentsList""")))).setId(66868), IApp(Id("""__x3__"""), ERef(RefId(Id("""BoundFunctionCreate"""))), List(ERef(RefId(Id("""Target"""))), ERef(RefId(Id("""thisArg"""))), ERef(RefId(Id("""args"""))))).setId(66870), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(66871), IReturn(ERef(RefId(Id("""__x3__""")))).setId(66872)).setId(66873), ISeq(List()).setId(66862)).setId(66874), ILet(Id("""F"""), ERef(RefId(Id("""__x3__""")))).setId(66875), IApp(Id("""__x4__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""Target"""))), EStr("""length"""))).setId(66877), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(66878), IReturn(ERef(RefId(Id("""__x4__""")))).setId(66879)).setId(66880), ISeq(List()).setId(66862)).setId(66881), ILet(Id("""targetHasLength"""), ERef(RefId(Id("""__x4__""")))).setId(66882), IIf(EBOp(OEq, ERef(RefId(Id("""targetHasLength"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Target"""))), EStr("""length"""))).setId(66884), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(66885), IReturn(ERef(RefId(Id("""__x5__""")))).setId(66886)).setId(66887), ISeq(List()).setId(66862)).setId(66888), ILet(Id("""targetLen"""), ERef(RefId(Id("""__x5__""")))).setId(66889), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""targetLen"""))))).setId(66891), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Number"""))))), ILet(Id("""L"""), EINum(0L)).setId(66892), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""targetLen"""))))).setId(66894), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(66895), IReturn(ERef(RefId(Id("""__x7__""")))).setId(66896)).setId(66897), ISeq(List()).setId(66862)).setId(66898), IAssign(RefId(Id("""targetLen""")), ERef(RefId(Id("""__x7__""")))).setId(66899), IIf(EBOp(OLt, EINum(0L), EBOp(OSub, ERef(RefId(Id("""targetLen"""))), ERef(RefProp(RefId(Id("""args""")), EStr("""length"""))))), ILet(Id("""__x8__"""), EBOp(OSub, ERef(RefId(Id("""targetLen"""))), ERef(RefProp(RefId(Id("""args""")), EStr("""length"""))))).setId(66901), ILet(Id("""__x8__"""), EINum(0L)).setId(66902)).setId(66903), ILet(Id("""L"""), ERef(RefId(Id("""__x8__""")))).setId(66905))).setId(66907)).setId(66908))).setId(66910), ILet(Id("""L"""), EINum(0L)).setId(66911)).setId(66913), IApp(Id("""__x9__"""), ERef(RefId(Id("""SetFunctionLength"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""L"""))))).setId(66915), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(66916), IReturn(ERef(RefId(Id("""__x9__""")))).setId(66917)).setId(66918), ISeq(List()).setId(66862)).setId(66919), IExpr(ERef(RefId(Id("""__x9__""")))).setId(66920), IApp(Id("""__x10__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Target"""))), EStr("""name"""))).setId(66922), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(66923), IReturn(ERef(RefId(Id("""__x10__""")))).setId(66924)).setId(66925), ISeq(List()).setId(66862)).setId(66926), ILet(Id("""targetName"""), ERef(RefId(Id("""__x10__""")))).setId(66927), IApp(Id("""__x11__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""targetName"""))))).setId(66929), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x11__"""))), ERef(RefId(Id("""String"""))))), IAssign(RefId(Id("""targetName""")), EStr("""""")).setId(66930), ISeq(List()).setId(66862)).setId(66932), IApp(Id("""__x12__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""targetName"""))), EStr("""bound"""))).setId(66934), IExpr(ERef(RefId(Id("""__x12__""")))).setId(66935), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(66937), IReturn(ERef(RefId(Id("""__x13__""")))).setId(66938))).setId(-1))
  /* Beautified form:
  "GLOBAL.Function.prototype.bind" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let thisArg = __x0__
    let Target = this
    app __x1__ = (IsCallable Target)
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    if (< 0i argumentsList["length"]) (pop argumentsList 0i) else {}
    let args = argumentsList
    app __x3__ = (BoundFunctionCreate Target thisArg args)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let F = __x3__
    app __x4__ = (HasOwnProperty Target "length")
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let targetHasLength = __x4__
    if (= targetHasLength true) {
      app __x5__ = (Get Target "length")
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let targetLen = __x5__
      app __x6__ = (Type targetLen)
      if (! (= __x6__ Number)) let L = 0i else {
        app __x7__ = (ToInteger targetLen)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        targetLen = __x7__
        if (< 0i (- targetLen args["length"])) let __x8__ = (- targetLen args["length"]) else let __x8__ = 0i
        let L = __x8__
      }
    } else let L = 0i
    app __x9__ = (SetFunctionLength F L)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (Get Target "name")
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    let targetName = __x10__
    app __x11__ = (Type targetName)
    if (! (= __x11__ String)) targetName = "" else {}
    app __x12__ = (SetFunctionName F targetName "bound")
    __x12__
    app __x13__ = (WrapCompletion F)
    return __x13__
  }
  */
}
