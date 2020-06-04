package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceCreate {
  val length: Int = 2
  val func: Func = Func("""ModuleNamespaceCreate""", List(Id("""module"""), Id("""exports""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(58129), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(58130), ISeq(List()).setId(58131)).setId(58132), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(58133), ISeq(List()).setId(58134)).setId(58135), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(58136), ISeq(List()).setId(58137)).setId(58138), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(58139), ISeq(List()).setId(58140)).setId(58141), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(58142), ISeq(List()).setId(58143)).setId(58144), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(58145), ISeq(List()).setId(58146)).setId(58147), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(58148), ISeq(List()).setId(58149)).setId(58150), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(58151), ISeq(List()).setId(58152)).setId(58153), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(58154), ISeq(List()).setId(58155)).setId(58156), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(58157), ISeq(List()).setId(58158)).setId(58159), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(58160), ISeq(List()).setId(58161)).setId(58162), IAssign(RefProp(RefId(Id("""M""")), EStr("""Module""")), ERef(RefId(Id("""module""")))).setId(58164), IExpr(ENotSupported("""Etc""")).setId(58129), IAssign(RefProp(RefId(Id("""M""")), EStr("""Exports""")), ERef(RefId(Id("""sortedExports""")))).setId(58166), IExpr(ENotSupported("""Etc""")).setId(58129), IAssign(RefProp(RefId(Id("""module""")), EStr("""Namespace""")), ERef(RefId(Id("""M""")))).setId(58168), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))).setId(58170), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58171))).setId(-1))
  /* Beautified form:
  "ModuleNamespaceCreate" (module, exports) => {
    !!! "Etc"
    if (= M["HasProperty"] absent) M["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= M["DefineOwnProperty"] absent) M["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= M["Set"] absent) M["Set"] = OrdinaryObjectDOTSet else {}
    if (= M["SetPrototypeOf"] absent) M["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= M["Get"] absent) M["Get"] = OrdinaryObjectDOTGet else {}
    if (= M["PreventExtensions"] absent) M["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= M["Delete"] absent) M["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= M["GetOwnProperty"] absent) M["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= M["OwnPropertyKeys"] absent) M["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= M["GetPrototypeOf"] absent) M["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= M["IsExtensible"] absent) M["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    M["Module"] = module
    !!! "Etc"
    M["Exports"] = sortedExports
    !!! "Etc"
    module["Namespace"] = M
    app __x0__ = (WrapCompletion M)
    return __x0__
  }
  */
}
