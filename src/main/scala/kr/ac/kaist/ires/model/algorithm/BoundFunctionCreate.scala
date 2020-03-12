package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BoundFunctionCreate {
  val length: Int = 3
  val func: Func = Func("""BoundFunctionCreate""", List(Id("""targetFunction"""), Id("""boundThis"""), Id("""boundArgs""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""targetFunction""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""targetFunction"""))))).setId(53801), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(53802), IReturn(ERef(RefId(Id("""__x0__""")))).setId(53803)).setId(53804), ISeq(List()).setId(53870)).setId(53805), ILet(Id("""proto"""), ERef(RefId(Id("""__x0__""")))).setId(53806), ILet(Id("""obj"""), EMap(Ty("""BoundFunctionExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(53808), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(53810), ISeq(List()).setId(53875)).setId(53812), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(53813), ISeq(List()).setId(53878)).setId(53815), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(53816), ISeq(List()).setId(53881)).setId(53818), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(53819), ISeq(List()).setId(53884)).setId(53821), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(53822), ISeq(List()).setId(53887)).setId(53824), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(53825), ISeq(List()).setId(53890)).setId(53827), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(53828), ISeq(List()).setId(53893)).setId(53830), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(53831), ISeq(List()).setId(53896)).setId(53833), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(53834), ISeq(List()).setId(53899)).setId(53836), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(53837), ISeq(List()).setId(53902)).setId(53839), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(53840), ISeq(List()).setId(53905)).setId(53842), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Call""")), ERef(RefId(Id("""BoundFunctionExoticObjectDOTCall""")))).setId(53844), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""targetFunction"""))))).setId(53846), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Construct""")), ERef(RefId(Id("""BoundFunctionExoticObjectDOTConstruct""")))).setId(53847), ISeq(List()).setId(53910)).setId(53850), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Prototype""")), ERef(RefId(Id("""proto""")))).setId(53852), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Extensible""")), EBool(true)).setId(53854), IAssign(RefProp(RefId(Id("""obj""")), EStr("""BoundTargetFunction""")), ERef(RefId(Id("""targetFunction""")))).setId(53856), IAssign(RefProp(RefId(Id("""obj""")), EStr("""BoundThis""")), ERef(RefId(Id("""boundThis""")))).setId(53858), IAssign(RefProp(RefId(Id("""obj""")), EStr("""BoundArguments""")), ERef(RefId(Id("""boundArgs""")))).setId(53860), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(53862), IReturn(ERef(RefId(Id("""__x2__""")))).setId(53863))).setId(53919))
  val instToStepMap: Map[Int, Int] = HashMap(53851 -> 8, 53805 -> 1, 53800 -> 0, 53860 -> 13, 53864 -> 14, 53847 -> 7, 53850 -> 8, 53812 -> 3, 53807 -> 1, 53833 -> 3, 53858 -> 12, 53845 -> 4, 53806 -> 1, 53846 -> 8, 53827 -> 3, 53859 -> 12, 53842 -> 3, 53863 -> 14, 53854 -> 10, 53843 -> 3, 53815 -> 3, 53818 -> 3, 53857 -> 11, 53808 -> 2, 53821 -> 3, 53853 -> 9, 53849 -> 7, 53844 -> 4, 53861 -> 13, 53848 -> 7, 53836 -> 3, 53839 -> 3, 53824 -> 3, 53809 -> 2, 53830 -> 3, 53856 -> 11, 53801 -> 1, 53862 -> 14, 53852 -> 9, 53855 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(53800), 10 -> HashSet(53854, 53855), 14 -> HashSet(53863, 53864, 53862), 1 -> HashSet(53805, 53807, 53801, 53806), 9 -> HashSet(53853, 53852), 13 -> HashSet(53860, 53861), 2 -> HashSet(53808, 53809), 12 -> HashSet(53859, 53858), 7 -> HashSet(53847, 53849, 53848), 3 -> HashSet(53827, 53842, 53818, 53821, 53812, 53830, 53833, 53843, 53815, 53836, 53839, 53824), 11 -> HashSet(53857, 53856), 8 -> HashSet(53846, 53851, 53850), 4 -> HashSet(53844, 53845))
  /* Beautified form:
  "BoundFunctionCreate" (targetFunction, boundThis, boundArgs) => {
    app __x0__ = (targetFunction["GetPrototypeOf"] targetFunction)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let proto = __x0__
    let obj = (new BoundFunctionExoticObject("SubMap" -> (new SubMap())))
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
    obj["Call"] = BoundFunctionExoticObjectDOTCall
    app __x1__ = (IsConstructor targetFunction)
    if (= __x1__ true) obj["Construct"] = BoundFunctionExoticObjectDOTConstruct else {}
    obj["Prototype"] = proto
    obj["Extensible"] = true
    obj["BoundTargetFunction"] = targetFunction
    obj["BoundThis"] = boundThis
    obj["BoundArguments"] = boundArgs
    app __x2__ = (WrapCompletion obj)
    return __x2__
  }
  */
}
