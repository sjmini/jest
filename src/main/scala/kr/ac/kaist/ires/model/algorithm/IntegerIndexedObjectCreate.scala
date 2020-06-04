package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedObjectCreate {
  val length: Int = 2
  val func: Func = Func("""IntegerIndexedObjectCreate""", List(Id("""prototype"""), Id("""internalSlotsList""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(57178), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(57179), ISeq(List()).setId(57180)).setId(57181), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(57182), ISeq(List()).setId(57183)).setId(57184), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(57185), ISeq(List()).setId(57186)).setId(57187), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(57188), ISeq(List()).setId(57189)).setId(57190), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(57191), ISeq(List()).setId(57192)).setId(57193), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(57194), ISeq(List()).setId(57195)).setId(57196), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(57197), ISeq(List()).setId(57198)).setId(57199), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(57200), ISeq(List()).setId(57201)).setId(57202), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(57203), ISeq(List()).setId(57204)).setId(57205), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(57206), ISeq(List()).setId(57207)).setId(57208), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""A""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""A""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(57209), ISeq(List()).setId(57210)).setId(57211), IAssign(RefProp(RefId(Id("""A""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTGetOwnProperty""")))).setId(57213), IAssign(RefProp(RefId(Id("""A""")), EStr("""HasProperty""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTHasProperty""")))).setId(57215), IAssign(RefProp(RefId(Id("""A""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTDefineOwnProperty""")))).setId(57217), IAssign(RefProp(RefId(Id("""A""")), EStr("""Get""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTGet""")))).setId(57219), IAssign(RefProp(RefId(Id("""A""")), EStr("""Set""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTSet""")))).setId(57221), IAssign(RefProp(RefId(Id("""A""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""IntegerIndexedExoticObjectDOTOwnPropertyKeys""")))).setId(57223), IAssign(RefProp(RefId(Id("""A""")), EStr("""Prototype""")), ERef(RefId(Id("""prototype""")))).setId(57225), IAssign(RefProp(RefId(Id("""A""")), EStr("""Extensible""")), EBool(true)).setId(57227), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(57229), IReturn(ERef(RefId(Id("""__x0__""")))).setId(57230))).setId(-1))
  /* Beautified form:
  "IntegerIndexedObjectCreate" (prototype, internalSlotsList) => {
    !!! "Etc"
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
    A["GetOwnProperty"] = IntegerIndexedExoticObjectDOTGetOwnProperty
    A["HasProperty"] = IntegerIndexedExoticObjectDOTHasProperty
    A["DefineOwnProperty"] = IntegerIndexedExoticObjectDOTDefineOwnProperty
    A["Get"] = IntegerIndexedExoticObjectDOTGet
    A["Set"] = IntegerIndexedExoticObjectDOTSet
    A["OwnPropertyKeys"] = IntegerIndexedExoticObjectDOTOwnPropertyKeys
    A["Prototype"] = prototype
    A["Extensible"] = true
    app __x0__ = (WrapCompletion A)
    return __x0__
  }
  */
}
