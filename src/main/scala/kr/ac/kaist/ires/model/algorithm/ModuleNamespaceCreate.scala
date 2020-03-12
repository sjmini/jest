package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleNamespaceCreate {
  val length: Int = 2
  val func: Func = Func("""ModuleNamespaceCreate""", List(Id("""module"""), Id("""exports""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(58129), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(58130), ISeq(List()).setId(58176)).setId(58132), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(58133), ISeq(List()).setId(58179)).setId(58135), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(58136), ISeq(List()).setId(58182)).setId(58138), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(58139), ISeq(List()).setId(58185)).setId(58141), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(58142), ISeq(List()).setId(58188)).setId(58144), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(58145), ISeq(List()).setId(58191)).setId(58147), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(58148), ISeq(List()).setId(58194)).setId(58150), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(58151), ISeq(List()).setId(58197)).setId(58153), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(58154), ISeq(List()).setId(58200)).setId(58156), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(58157), ISeq(List()).setId(58203)).setId(58159), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""M""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""M""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(58160), ISeq(List()).setId(58206)).setId(58162), IAssign(RefProp(RefId(Id("""M""")), EStr("""Module""")), ERef(RefId(Id("""module""")))).setId(58164), IExpr(ENotSupported("""Etc""")).setId(58129), IAssign(RefProp(RefId(Id("""M""")), EStr("""Exports""")), ERef(RefId(Id("""sortedExports""")))).setId(58166), IExpr(ENotSupported("""Etc""")).setId(58129), IAssign(RefProp(RefId(Id("""module""")), EStr("""Namespace""")), ERef(RefId(Id("""M""")))).setId(58168), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""M"""))))).setId(58170), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58171))).setId(58215))
  val instToStepMap: Map[Int, Int] = HashMap(58150 -> 4, 58172 -> 10, 58169 -> 9, 58132 -> 4, 58168 -> 9, 58159 -> 4, 58163 -> 4, 58138 -> 4, 58135 -> 4, 58147 -> 4, 58162 -> 4, 58129 -> 8, 58144 -> 4, 58153 -> 4, 58164 -> 5, 58141 -> 4, 58165 -> 5, 58170 -> 10, 58167 -> 7, 58128 -> 2, 58156 -> 4, 58166 -> 7, 58171 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(58128), 5 -> HashSet(58164, 58165), 10 -> HashSet(58172, 58170, 58171), 1 -> HashSet(58128), 6 -> HashSet(58129), 9 -> HashSet(58169, 58168), 2 -> HashSet(58128), 7 -> HashSet(58167, 58166), 3 -> HashSet(58129), 8 -> HashSet(58129), 4 -> HashSet(58150, 58132, 58141, 58159, 58163, 58138, 58135, 58147, 58162, 58156, 58144, 58153))
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
