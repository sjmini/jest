package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionAllocate {
  val length: Int = 2
  val func: Func = Func("""FunctionAllocate""", List(Id("""functionPrototype"""), Id("""functionKind""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""normal""")), ILet(Id("""needsConstruct"""), EBool(true)).setId(51831), ILet(Id("""needsConstruct"""), EBool(false)).setId(51833)).setId(51835), IIf(EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""non-constructor""")), IAssign(RefId(Id("""functionKind""")), EStr("""normal""")).setId(51837), ISeq(List()).setId(51904)).setId(51839), ILet(Id("""F"""), EMap(Ty("""ECMAScriptFunctionObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(51841), IDelete(RefProp(RefId(Id("""F""")), EStr("""Call"""))).setId(51842), IDelete(RefProp(RefId(Id("""F""")), EStr("""Construct"""))).setId(51843), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(51845), ISeq(List()).setId(51910)).setId(51847), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(51848), ISeq(List()).setId(51913)).setId(51850), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(51851), ISeq(List()).setId(51916)).setId(51853), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(51854), ISeq(List()).setId(51919)).setId(51856), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(51857), ISeq(List()).setId(51922)).setId(51859), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(51860), ISeq(List()).setId(51925)).setId(51862), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(51863), ISeq(List()).setId(51928)).setId(51865), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(51866), ISeq(List()).setId(51931)).setId(51868), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(51869), ISeq(List()).setId(51934)).setId(51871), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(51872), ISeq(List()).setId(51937)).setId(51874), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(51875), ISeq(List()).setId(51940)).setId(51877), IAssign(RefProp(RefId(Id("""F""")), EStr("""Call""")), ERef(RefId(Id("""ECMAScriptFunctionObjectDOTCall""")))).setId(51879), IIf(EBOp(OEq, ERef(RefId(Id("""needsConstruct"""))), EBool(true)), ISeq(List(IAssign(RefProp(RefId(Id("""F""")), EStr("""Construct""")), ERef(RefId(Id("""ECMAScriptFunctionObjectDOTConstruct""")))).setId(51881), IAssign(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind""")), EStr("""base""")).setId(51883))).setId(51945), ISeq(List()).setId(51946)).setId(51886), IAssign(RefProp(RefId(Id("""F""")), EStr("""FunctionKind""")), ERef(RefId(Id("""functionKind""")))).setId(51888), IAssign(RefProp(RefId(Id("""F""")), EStr("""Prototype""")), ERef(RefId(Id("""functionPrototype""")))).setId(51890), IAssign(RefProp(RefId(Id("""F""")), EStr("""Extensible""")), EBool(true)).setId(51892), IAssign(RefProp(RefId(Id("""F""")), EStr("""Realm""")), ERef(RefId(Id("""REALM""")))).setId(51894), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(51896), IReturn(ERef(RefId(Id("""__x0__""")))).setId(51897))).setId(51954))
  val instToStepMap: Map[Int, Int] = HashMap(51886 -> 13, 51893 -> 16, 51874 -> 7, 51880 -> 8, 51887 -> 13, 51865 -> 7, 51840 -> 5, 51896 -> 18, 51881 -> 12, 51830 -> 1, 51878 -> 7, 51895 -> 17, 51890 -> 15, 51882 -> 12, 51898 -> 18, 51838 -> 4, 51883 -> 12, 51832 -> 2, 51842 -> 6, 51868 -> 7, 51871 -> 7, 51839 -> 5, 51889 -> 14, 51835 -> 3, 51850 -> 7, 51877 -> 7, 51833 -> 3, 51884 -> 12, 51831 -> 2, 51897 -> 18, 51892 -> 16, 51847 -> 7, 51879 -> 8, 51841 -> 6, 51836 -> 3, 51856 -> 7, 51859 -> 7, 51837 -> 4, 51888 -> 14, 51853 -> 7, 51891 -> 15, 51885 -> 12, 51844 -> 6, 51862 -> 7, 51834 -> 3, 51894 -> 17, 51843 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(51830), 5 -> HashSet(51839, 51840), 14 -> HashSet(51889, 51888), 1 -> HashSet(51830), 6 -> HashSet(51842, 51841, 51844, 51843), 13 -> HashSet(51886, 51887), 2 -> HashSet(51832, 51831), 17 -> HashSet(51895, 51894), 12 -> HashSet(51883, 51884, 51881, 51885, 51882), 7 -> HashSet(51874, 51850, 51877, 51865, 51847, 51853, 51878, 51862, 51868, 51871, 51856, 51859), 3 -> HashSet(51835, 51833, 51836, 51834), 18 -> HashSet(51897, 51896, 51898), 16 -> HashSet(51893, 51892), 11 -> HashSet(51881, 51882), 8 -> HashSet(51880, 51879), 4 -> HashSet(51837, 51838), 15 -> HashSet(51891, 51890))
  /* Beautified form:
  "FunctionAllocate" (functionPrototype, functionKind) => {
    if (= functionKind "normal") let needsConstruct = true else let needsConstruct = false
    if (= functionKind "non-constructor") functionKind = "normal" else {}
    let F = (new ECMAScriptFunctionObject("SubMap" -> (new SubMap())))
    delete F["Call"]
    delete F["Construct"]
    if (= F["HasProperty"] absent) F["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= F["DefineOwnProperty"] absent) F["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= F["Set"] absent) F["Set"] = OrdinaryObjectDOTSet else {}
    if (= F["SetPrototypeOf"] absent) F["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= F["Get"] absent) F["Get"] = OrdinaryObjectDOTGet else {}
    if (= F["PreventExtensions"] absent) F["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= F["Delete"] absent) F["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= F["GetOwnProperty"] absent) F["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= F["OwnPropertyKeys"] absent) F["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= F["GetPrototypeOf"] absent) F["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= F["IsExtensible"] absent) F["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    F["Call"] = ECMAScriptFunctionObjectDOTCall
    if (= needsConstruct true) {
      F["Construct"] = ECMAScriptFunctionObjectDOTConstruct
      F["ConstructorKind"] = "base"
    } else {}
    F["FunctionKind"] = functionKind
    F["Prototype"] = functionPrototype
    F["Extensible"] = true
    F["Realm"] = REALM
    app __x0__ = (WrapCompletion F)
    return __x0__
  }
  */
}
