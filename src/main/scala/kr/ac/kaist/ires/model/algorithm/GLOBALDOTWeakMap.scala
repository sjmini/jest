package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTWeakMap {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.WeakMap""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(86525), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(86526), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(86528), IReturn(ERef(RefId(Id("""__x1__""")))).setId(86529))).setId(86568), ISeq(List()).setId(86569)).setId(86532), IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%WeakMapPrototype%"""), EList(List(EStr("""WeakMapData"""))))).setId(86534), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(86535), IReturn(ERef(RefId(Id("""__x2__""")))).setId(86536)).setId(86537), ISeq(List()).setId(86575)).setId(86538), ILet(Id("""map"""), ERef(RefId(Id("""__x2__""")))).setId(86539), IAssign(RefProp(RefId(Id("""map""")), EStr("""WeakMapData""")), EList(List())).setId(86541), IIf(EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EAbsent), EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EUndef), EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), ENull))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""map"""))))).setId(86543), IReturn(ERef(RefId(Id("""__x3__""")))).setId(86544))).setId(86581), ISeq(List()).setId(86582)).setId(86546), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""map"""))), EStr("""set"""))).setId(86548), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(86549), IReturn(ERef(RefId(Id("""__x4__""")))).setId(86550)).setId(86551), ISeq(List()).setId(86588)).setId(86552), ILet(Id("""adder"""), ERef(RefId(Id("""__x4__""")))).setId(86553), IApp(Id("""__x5__"""), ERef(RefId(Id("""AddEntriesFromIterable"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""iterable"""))), ERef(RefId(Id("""adder"""))))).setId(86555), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(86556), IReturn(ERef(RefId(Id("""__x5__""")))).setId(86557)).setId(86558), ISeq(List()).setId(86595)).setId(86559), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(86560), IReturn(ERef(RefId(Id("""__x6__""")))).setId(86561))).setId(86599))
  val instToStepMap: Map[Int, Int] = HashMap(86552 -> 7, 86539 -> 3, 86553 -> 7, 86530 -> 1, 86562 -> 8, 86534 -> 3, 86525 -> 0, 86538 -> 3, 86555 -> 8, 86559 -> 8, 86554 -> 7, 86542 -> 4, 86527 -> 0, 86532 -> 2, 86547 -> 6, 86540 -> 3, 86545 -> 5, 86548 -> 7, 86526 -> 0, 86544 -> 5, 86533 -> 2, 86560 -> 8, 86543 -> 5, 86541 -> 4, 86546 -> 6, 86528 -> 1, 86561 -> 8, 86529 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(86526, 86525, 86527), 5 -> HashSet(86545, 86544, 86543), 1 -> HashSet(86530, 86528, 86529), 6 -> HashSet(86546, 86547), 2 -> HashSet(86533, 86532), 7 -> HashSet(86552, 86548, 86553, 86554), 3 -> HashSet(86539, 86534, 86538, 86540), 8 -> HashSet(86562, 86560, 86555, 86559, 86561), 4 -> HashSet(86541, 86542))
  /* Beautified form:
  "GLOBAL.WeakMap" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    if (= NewTarget undefined) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (OrdinaryCreateFromConstructor NewTarget "%WeakMapPrototype%" (new ["WeakMapData"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let map = __x2__
    map["WeakMapData"] = (new [])
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
