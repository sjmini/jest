package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTMap {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Map""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(84020), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(84021), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(84023), IReturn(ERef(RefId(Id("""__x1__""")))).setId(84024))).setId(84063), ISeq(List()).setId(84064)).setId(84027), IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%MapPrototype%"""), EList(List(EStr("""MapData"""))))).setId(84029), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(84030), IReturn(ERef(RefId(Id("""__x2__""")))).setId(84031)).setId(84032), ISeq(List()).setId(84070)).setId(84033), ILet(Id("""map"""), ERef(RefId(Id("""__x2__""")))).setId(84034), IAssign(RefProp(RefId(Id("""map""")), EStr("""MapData""")), EList(List())).setId(84036), IIf(EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EAbsent), EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EUndef), EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), ENull))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""map"""))))).setId(84038), IReturn(ERef(RefId(Id("""__x3__""")))).setId(84039))).setId(84076), ISeq(List()).setId(84077)).setId(84041), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""map"""))), EStr("""set"""))).setId(84043), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(84044), IReturn(ERef(RefId(Id("""__x4__""")))).setId(84045)).setId(84046), ISeq(List()).setId(84083)).setId(84047), ILet(Id("""adder"""), ERef(RefId(Id("""__x4__""")))).setId(84048), IApp(Id("""__x5__"""), ERef(RefId(Id("""AddEntriesFromIterable"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""iterable"""))), ERef(RefId(Id("""adder"""))))).setId(84050), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(84051), IReturn(ERef(RefId(Id("""__x5__""")))).setId(84052)).setId(84053), ISeq(List()).setId(84090)).setId(84054), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(84055), IReturn(ERef(RefId(Id("""__x6__""")))).setId(84056))).setId(84094))
  val instToStepMap: Map[Int, Int] = HashMap(84027 -> 2, 84036 -> 4, 84022 -> 0, 84037 -> 4, 84054 -> 8, 84033 -> 3, 84038 -> 5, 84025 -> 1, 84056 -> 8, 84024 -> 1, 84043 -> 7, 84040 -> 5, 84020 -> 0, 84042 -> 6, 84055 -> 8, 84023 -> 1, 84048 -> 7, 84034 -> 3, 84029 -> 3, 84049 -> 7, 84039 -> 5, 84041 -> 6, 84028 -> 2, 84050 -> 8, 84047 -> 7, 84035 -> 3, 84021 -> 0, 84057 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(84022, 84020, 84021), 5 -> HashSet(84038, 84039, 84040), 1 -> HashSet(84023, 84025, 84024), 6 -> HashSet(84042, 84041), 2 -> HashSet(84027, 84028), 7 -> HashSet(84048, 84049, 84043, 84047), 3 -> HashSet(84033, 84034, 84029, 84035), 8 -> HashSet(84054, 84055, 84056, 84050, 84057), 4 -> HashSet(84036, 84037))
  /* Beautified form:
  "GLOBAL.Map" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    if (= NewTarget undefined) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (OrdinaryCreateFromConstructor NewTarget "%MapPrototype%" (new ["MapData"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let map = __x2__
    map["MapData"] = (new [])
    if (|| (= argumentsList[0i] absent) (|| (= argumentsList[0i] undefined) (= argumentsList[0i] null))) {
      app __x3__ = (WrapCompletion map)
      return __x3__
    } else {}
    app __x4__ = (Get map "set")
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let adder = __x4__
    app __x5__ = (AddEntriesFromIterable map iterable adder)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
