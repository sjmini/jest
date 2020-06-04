package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayCreate {
  val length: Int = 1
  val func: Func = Func("""ArrayCreate""", List(Id("""length"""), Id("""proto""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""length"""))), ENum(-0.0)), IAssign(RefId(Id("""length""")), EINum(0L)).setId(54144), ISeq(List()).setId(54143)).setId(54146), IIf(EBOp(OLt, EBOp(OSub, EINum(4294967296L), EINum(1L)), ERef(RefId(Id("""length""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(54148), IReturn(ERef(RefId(Id("""__x0__""")))).setId(54149))).setId(54150), ISeq(List()).setId(54143)).setId(54151), IIf(EBOp(OEq, ERef(RefId(Id("""proto"""))), EAbsent), IAssign(RefId(Id("""proto""")), ERef(RefId(Id("""INTRINSIC_ArrayPrototype""")))).setId(54153), ISeq(List()).setId(54143)).setId(54155), ILet(Id("""A"""), EMap(Ty("""ArrayExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(54157), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(54159), ISeq(List()).setId(54160)).setId(54161), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(54162), ISeq(List()).setId(54163)).setId(54164), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(54165), ISeq(List()).setId(54166)).setId(54167), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(54168), ISeq(List()).setId(54169)).setId(54170), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(54171), ISeq(List()).setId(54172)).setId(54173), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(54174), ISeq(List()).setId(54175)).setId(54176), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(54177), ISeq(List()).setId(54178)).setId(54179), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(54180), ISeq(List()).setId(54181)).setId(54182), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(54183), ISeq(List()).setId(54184)).setId(54185), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(54186), ISeq(List()).setId(54187)).setId(54188), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(54189), ISeq(List()).setId(54190)).setId(54191), IAssign(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""ArrayExoticObjectDOTDefineOwnProperty""")))).setId(54193), IAssign(RefProp(RefId(Id("""A""")), EStr("""Prototype""")), ERef(RefId(Id("""proto""")))).setId(54195), IAssign(RefProp(RefId(Id("""A""")), EStr("""Extensible""")), EBool(true)).setId(54197), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""length""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(54199), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(54200), IReturn(ERef(RefId(Id("""__x1__""")))).setId(54201)).setId(54202), ISeq(List()).setId(54143)).setId(54203), IExpr(ERef(RefId(Id("""__x1__""")))).setId(54204), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(54206), IReturn(ERef(RefId(Id("""__x2__""")))).setId(54207))).setId(-1))
  /* Beautified form:
  "ArrayCreate" (length, proto) => {
    if (= length -0.0) length = 0i else {}
    if (< (- 4294967296i 1i) length) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    if (= proto absent) proto = INTRINSIC_ArrayPrototype else {}
    let A = (new ArrayExoticObject("SubMap" -> (new SubMap())))
    if (= A["HasProperty"] absent) A["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= A["DefineOwnProperty"] absent) A["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= A["Set"] absent) A["Set"] = OrdinaryObjectDOTSet else {}
    if (= A["SetPrototypeOf"] absent) A["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= A["Get"] absent) A["Get"] = OrdinaryObjectDOTGet else {}
    if (= A["PreventExtensions"] absent) A["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= A["Delete"] absent) A["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= A["GetOwnProperty"] absent) A["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= A["OwnPropertyKeys"] absent) A["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= A["GetPrototypeOf"] absent) A["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= A["IsExtensible"] absent) A["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    A["DefineOwnProperty"] = ArrayExoticObjectDOTDefineOwnProperty
    A["Prototype"] = proto
    A["Extensible"] = true
    app __x1__ = (OrdinaryDefineOwnProperty A "length" (new PropertyDescriptor("Value" -> length, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (WrapCompletion A)
    return __x2__
  }
  */
}
