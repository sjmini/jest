package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectCreate {
  val length: Int = 1
  val func: Func = Func("""ObjectCreate""", List(Id("""proto"""), Id("""internalSlotsList""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""internalSlotsList"""))), EAbsent), IAssign(RefId(Id("""internalSlotsList""")), EList(List())).setId(51027), ISeq(List()).setId(51085)).setId(51030), ILet(Id("""obj"""), EMap(Ty("""OrdinaryObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(51032), ILet(Id("""__x0__"""), ERef(RefId(Id("""internalSlotsList""")))).setId(51034), ILet(Id("""__x1__"""), EINum(0L)).setId(51035), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x2__"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))).setId(51036), IAssign(RefProp(RefId(Id("""obj""")), ERef(RefId(Id("""__x2__""")))), EUndef).setId(51033), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L))).setId(51037))).setId(51093)).setId(51039), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(51042), ISeq(List()).setId(51096)).setId(51044), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(51045), ISeq(List()).setId(51099)).setId(51047), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(51048), ISeq(List()).setId(51102)).setId(51050), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(51051), ISeq(List()).setId(51105)).setId(51053), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(51054), ISeq(List()).setId(51108)).setId(51056), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(51057), ISeq(List()).setId(51111)).setId(51059), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(51060), ISeq(List()).setId(51114)).setId(51062), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(51063), ISeq(List()).setId(51117)).setId(51065), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(51066), ISeq(List()).setId(51120)).setId(51068), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(51069), ISeq(List()).setId(51123)).setId(51071), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(51072), ISeq(List()).setId(51126)).setId(51074), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Prototype""")), ERef(RefId(Id("""proto""")))).setId(51076), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Extensible""")), EBool(true)).setId(51078), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(51080), IReturn(ERef(RefId(Id("""__x3__""")))).setId(51081))).setId(51132))
  val instToStepMap: Map[Int, Int] = HashMap(51077 -> 4, 51062 -> 3, 51027 -> 0, 51050 -> 3, 51034 -> 2, 51071 -> 3, 51039 -> 2, 51047 -> 3, 51068 -> 3, 51044 -> 3, 51075 -> 3, 51031 -> 1, 51082 -> 6, 51056 -> 3, 51081 -> 6, 51078 -> 5, 51059 -> 3, 51053 -> 3, 51030 -> 1, 51035 -> 2, 51065 -> 3, 51079 -> 5, 51074 -> 3, 51032 -> 2, 51041 -> 2, 51040 -> 2, 51080 -> 6, 51028 -> 0, 51076 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(51027, 51028), 5 -> HashSet(51078, 51079), 1 -> HashSet(51031, 51030), 6 -> HashSet(51082, 51081, 51080), 2 -> HashSet(51034, 51039, 51035, 51040, 51032, 51041), 3 -> HashSet(51062, 51050, 51071, 51056, 51047, 51068, 51044, 51075, 51059, 51053, 51065, 51074), 4 -> HashSet(51077, 51076))
  /* Beautified form:
  "ObjectCreate" (proto, internalSlotsList) => {
    if (= internalSlotsList absent) internalSlotsList = (new []) else {}
    let obj = (new OrdinaryObject("SubMap" -> (new SubMap())))
    let __x0__ = internalSlotsList
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let __x2__ = __x0__[__x1__]
      obj[__x2__] = undefined
      __x1__ = (+ __x1__ 1i)
    }
    if (= obj["HasProperty"] absent) obj["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= obj["DefineOwnProperty"] absent) obj["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= obj["Set"] absent) obj["Set"] = OrdinaryObjectDOTSet else {}
    if (= obj["SetPrototypeOf"] absent) obj["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= obj["Get"] absent) obj["Get"] = OrdinaryObjectDOTGet else {}
    if (= obj["PreventExtensions"] absent) obj["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= obj["Delete"] absent) obj["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= obj["GetOwnProperty"] absent) obj["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= obj["OwnPropertyKeys"] absent) obj["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= obj["GetPrototypeOf"] absent) obj["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= obj["IsExtensible"] absent) obj["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    obj["Prototype"] = proto
    obj["Extensible"] = true
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }
  */
}
