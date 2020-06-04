package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionAllocate {
  val length: Int = 2
  val func: Func = Func("""FunctionAllocate""", List(Id("""functionPrototype"""), Id("""functionKind""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""normal""")), ILet(Id("""needsConstruct"""), EBool(true)).setId(51831), ILet(Id("""needsConstruct"""), EBool(false)).setId(51833)).setId(51835), IIf(EBOp(OEq, ERef(RefId(Id("""functionKind"""))), EStr("""non-constructor""")), IAssign(RefId(Id("""functionKind""")), EStr("""normal""")).setId(51837), ISeq(List()).setId(51830)).setId(51839), ILet(Id("""F"""), EMap(Ty("""ECMAScriptFunctionObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(51841), IDelete(RefProp(RefId(Id("""F""")), EStr("""Call"""))).setId(51842), IDelete(RefProp(RefId(Id("""F""")), EStr("""Construct"""))).setId(51843), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(51845), ISeq(List()).setId(51846)).setId(51847), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(51848), ISeq(List()).setId(51849)).setId(51850), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(51851), ISeq(List()).setId(51852)).setId(51853), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(51854), ISeq(List()).setId(51855)).setId(51856), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(51857), ISeq(List()).setId(51858)).setId(51859), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(51860), ISeq(List()).setId(51861)).setId(51862), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(51863), ISeq(List()).setId(51864)).setId(51865), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(51866), ISeq(List()).setId(51867)).setId(51868), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(51869), ISeq(List()).setId(51870)).setId(51871), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(51872), ISeq(List()).setId(51873)).setId(51874), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""F""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(51875), ISeq(List()).setId(51876)).setId(51877), IAssign(RefProp(RefId(Id("""F""")), EStr("""Call""")), ERef(RefId(Id("""ECMAScriptFunctionObjectDOTCall""")))).setId(51879), IIf(EBOp(OEq, ERef(RefId(Id("""needsConstruct"""))), EBool(true)), ISeq(List(IAssign(RefProp(RefId(Id("""F""")), EStr("""Construct""")), ERef(RefId(Id("""ECMAScriptFunctionObjectDOTConstruct""")))).setId(51881), IAssign(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind""")), EStr("""base""")).setId(51883))).setId(51885), ISeq(List()).setId(51830)).setId(51886), IAssign(RefProp(RefId(Id("""F""")), EStr("""FunctionKind""")), ERef(RefId(Id("""functionKind""")))).setId(51888), IAssign(RefProp(RefId(Id("""F""")), EStr("""Prototype""")), ERef(RefId(Id("""functionPrototype""")))).setId(51890), IAssign(RefProp(RefId(Id("""F""")), EStr("""Extensible""")), EBool(true)).setId(51892), IAssign(RefProp(RefId(Id("""F""")), EStr("""Realm""")), ERef(RefId(Id("""REALM""")))).setId(51894), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(51896), IReturn(ERef(RefId(Id("""__x0__""")))).setId(51897))).setId(-1))
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
