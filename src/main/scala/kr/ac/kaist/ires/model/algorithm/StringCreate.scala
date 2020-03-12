package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StringCreate {
  val length: Int = 2
  val func: Func = Func("""StringCreate""", List(Id("""value"""), Id("""prototype""")), None, ISeq(List(ILet(Id("""S"""), EMap(Ty("""StringExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""StringData"""), EUndef)))).setId(55073), IAssign(RefProp(RefId(Id("""S""")), EStr("""StringData""")), ERef(RefId(Id("""value""")))).setId(55075), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(55077), ISeq(List()).setId(55137)).setId(55079), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(55080), ISeq(List()).setId(55140)).setId(55082), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(55083), ISeq(List()).setId(55143)).setId(55085), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(55086), ISeq(List()).setId(55146)).setId(55088), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(55089), ISeq(List()).setId(55149)).setId(55091), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(55092), ISeq(List()).setId(55152)).setId(55094), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(55095), ISeq(List()).setId(55155)).setId(55097), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(55098), ISeq(List()).setId(55158)).setId(55100), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(55101), ISeq(List()).setId(55161)).setId(55103), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(55104), ISeq(List()).setId(55164)).setId(55106), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""S""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""S""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(55107), ISeq(List()).setId(55167)).setId(55109), IAssign(RefProp(RefId(Id("""S""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""StringExoticObjectDOTGetOwnProperty""")))).setId(55111), IAssign(RefProp(RefId(Id("""S""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""StringExoticObjectDOTDefineOwnProperty""")))).setId(55113), IAssign(RefProp(RefId(Id("""S""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""StringExoticObjectDOTOwnPropertyKeys""")))).setId(55115), IAssign(RefProp(RefId(Id("""S""")), EStr("""Prototype""")), ERef(RefId(Id("""prototype""")))).setId(55117), IAssign(RefProp(RefId(Id("""S""")), EStr("""Extensible""")), EBool(true)).setId(55119), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""value""")), EStr("""length""")))).setId(55121), IApp(Id("""__x0__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""S"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""length""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(55123), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(55124), IReturn(ERef(RefId(Id("""__x0__""")))).setId(55125)).setId(55126), ISeq(List()).setId(55179)).setId(55127), IExpr(ERef(RefId(Id("""__x0__""")))).setId(55128), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(55130), IReturn(ERef(RefId(Id("""__x1__""")))).setId(55131))).setId(55184))
  val instToStepMap: Map[Int, Int] = HashMap(55109 -> 3, 55131 -> 11, 55117 -> 7, 55073 -> 1, 55085 -> 3, 55123 -> 10, 55112 -> 4, 55127 -> 10, 55118 -> 7, 55091 -> 3, 55129 -> 10, 55110 -> 3, 55097 -> 3, 55120 -> 8, 55115 -> 6, 55103 -> 3, 55076 -> 2, 55113 -> 5, 55079 -> 3, 55072 -> 0, 55100 -> 3, 55094 -> 3, 55132 -> 11, 55122 -> 9, 55075 -> 2, 55111 -> 4, 55114 -> 5, 55119 -> 8, 55106 -> 3, 55116 -> 6, 55121 -> 9, 55088 -> 3, 55082 -> 3, 55130 -> 11, 55074 -> 1, 55128 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(55072), 5 -> HashSet(55113, 55114), 10 -> HashSet(55123, 55127, 55129, 55128), 1 -> HashSet(55073, 55074), 6 -> HashSet(55116, 55115), 9 -> HashSet(55122, 55121), 2 -> HashSet(55076, 55075), 7 -> HashSet(55117, 55118), 3 -> HashSet(55109, 55085, 55103, 55091, 55094, 55110, 55097, 55106, 55079, 55100, 55088, 55082), 11 -> HashSet(55131, 55132, 55130), 8 -> HashSet(55119, 55120), 4 -> HashSet(55112, 55111))
  /* Beautified form:
  "StringCreate" (value, prototype) => {
    let S = (new StringExoticObject("SubMap" -> (new SubMap()), "StringData" -> undefined))
    S["StringData"] = value
    if (= S["HasProperty"] absent) S["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= S["DefineOwnProperty"] absent) S["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= S["Set"] absent) S["Set"] = OrdinaryObjectDOTSet else {}
    if (= S["SetPrototypeOf"] absent) S["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= S["Get"] absent) S["Get"] = OrdinaryObjectDOTGet else {}
    if (= S["PreventExtensions"] absent) S["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= S["Delete"] absent) S["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= S["GetOwnProperty"] absent) S["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= S["OwnPropertyKeys"] absent) S["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= S["GetPrototypeOf"] absent) S["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= S["IsExtensible"] absent) S["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    S["GetOwnProperty"] = StringExoticObjectDOTGetOwnProperty
    S["DefineOwnProperty"] = StringExoticObjectDOTDefineOwnProperty
    S["OwnPropertyKeys"] = StringExoticObjectDOTOwnPropertyKeys
    S["Prototype"] = prototype
    S["Extensible"] = true
    let length = value["length"]
    app __x0__ = (DefinePropertyOrThrow S "length" (new PropertyDescriptor("Value" -> length, "Writable" -> false, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (WrapCompletion S)
    return __x1__
  }
  */
}
