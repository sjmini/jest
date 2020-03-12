package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTfind {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.find""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(77517), ILet(Id("""predicate"""), ERef(RefId(Id("""__x0__""")))).setId(77518), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(77520), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(77521), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(77523), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(77524), IReturn(ERef(RefId(Id("""__x2__""")))).setId(77525)).setId(77526), ISeq(List()).setId(77600)).setId(77528), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(77529), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(77531), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(77532), IReturn(ERef(RefId(Id("""__x3__""")))).setId(77533)).setId(77534), ISeq(List()).setId(77607)).setId(77535), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(77536), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""predicate"""))))).setId(77538), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(77539), IReturn(ERef(RefId(Id("""__x5__""")))).setId(77540))).setId(77613), ISeq(List()).setId(77614)).setId(77542), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(77544), ILet(Id("""T"""), EUndef).setId(77546)).setId(77548), ILet(Id("""k"""), EINum(0L)).setId(77550), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(77552), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(77553), IReturn(ERef(RefId(Id("""__x6__""")))).setId(77554)).setId(77555), ISeq(List()).setId(77624)).setId(77556), ILet(Id("""Pk"""), ERef(RefId(Id("""__x6__""")))).setId(77557), IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(77559), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(77560), IReturn(ERef(RefId(Id("""__x7__""")))).setId(77561)).setId(77562), ISeq(List()).setId(77631)).setId(77563), ILet(Id("""kValue"""), ERef(RefId(Id("""__x7__""")))).setId(77564), IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""predicate"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""O"""))))))).setId(77566), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(77567), IReturn(ERef(RefId(Id("""__x8__""")))).setId(77568)).setId(77569), ISeq(List()).setId(77638)).setId(77570), IApp(Id("""__x9__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(77571), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(77572), IReturn(ERef(RefId(Id("""__x9__""")))).setId(77573)).setId(77574), ISeq(List()).setId(77644)).setId(77575), ILet(Id("""testResult"""), ERef(RefId(Id("""__x9__""")))).setId(77576), IIf(EBOp(OEq, ERef(RefId(Id("""testResult"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""kValue"""))))).setId(77578), IReturn(ERef(RefId(Id("""__x10__""")))).setId(77579))).setId(77649), ISeq(List()).setId(77650)).setId(77581), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(77583))).setId(77653)).setId(77586), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(77588), IReturn(ERef(RefId(Id("""__x11__""")))).setId(77589))).setId(77657))
  val instToStepMap: Map[Int, Int] = HashMap(77523 -> 2, 77580 -> 14, 77565 -> 16, 77540 -> 4, 77548 -> 6, 77585 -> 16, 77589 -> 17, 77538 -> 5, 77587 -> 16, 77530 -> 2, 77544 -> 6, 77545 -> 6, 77566 -> 16, 77549 -> 6, 77517 -> 0, 77578 -> 14, 77543 -> 5, 77581 -> 16, 77558 -> 16, 77577 -> 16, 77559 -> 16, 77552 -> 16, 77588 -> 17, 77537 -> 3, 77520 -> 1, 77529 -> 2, 77570 -> 16, 77551 -> 7, 77556 -> 16, 77547 -> 6, 77519 -> 0, 77583 -> 16, 77536 -> 3, 77564 -> 16, 77521 -> 1, 77584 -> 16, 77541 -> 4, 77546 -> 6, 77586 -> 16, 77571 -> 16, 77535 -> 3, 77518 -> 0, 77528 -> 2, 77550 -> 7, 77590 -> 17, 77531 -> 3, 77576 -> 16, 77563 -> 16, 77542 -> 5, 77582 -> 16, 77575 -> 16, 77539 -> 4, 77579 -> 14, 77522 -> 1, 77557 -> 16)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(77517, 77519, 77518), 5 -> HashSet(77543, 77538, 77542), 14 -> HashSet(77578, 77580, 77579), 1 -> HashSet(77520, 77521, 77522), 6 -> HashSet(77549, 77548, 77547, 77546, 77544, 77545), 13 -> HashSet(77566, 77577, 77570, 77571, 77576, 77575), 2 -> HashSet(77530, 77523, 77529, 77528), 17 -> HashSet(77588, 77589, 77590), 12 -> HashSet(77565, 77559, 77564, 77563), 7 -> HashSet(77551, 77550), 3 -> HashSet(77537, 77536, 77535, 77531), 16 -> HashSet(77587, 77566, 77565, 77552, 77585, 77583, 77564, 77584, 77557, 77581, 77558, 77577, 77559, 77570, 77556, 77586, 77571, 77576, 77563, 77582, 77575), 11 -> HashSet(77558, 77552, 77556, 77557), 4 -> HashSet(77540, 77541, 77539), 15 -> HashSet(77581, 77582))
  /* Beautified form:
  "GLOBAL.Array.prototype.find" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let predicate = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (IsCallable predicate)
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    let k = 0i
    while (< k len) {
      app __x6__ = (ToString k)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let Pk = __x6__
      app __x7__ = (Get O Pk)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let kValue = __x7__
      app __x8__ = (Call predicate T (new [kValue, k, O]))
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (ToBoolean __x8__)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let testResult = __x9__
      if (= testResult true) {
        app __x10__ = (WrapCompletion kValue)
        return __x10__
      } else {}
      k = (+ k 1i)
    }
    app __x11__ = (WrapCompletion undefined)
    return __x11__
  }
  */
}
