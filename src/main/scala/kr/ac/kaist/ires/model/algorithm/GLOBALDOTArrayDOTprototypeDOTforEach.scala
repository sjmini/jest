package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTforEach {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.forEach""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(78544), ILet(Id("""callbackfn"""), ERef(RefId(Id("""__x0__""")))).setId(78545), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(78547), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(78548), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(78550), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(78551), IReturn(ERef(RefId(Id("""__x2__""")))).setId(78552)).setId(78553), ISeq(List()).setId(78627)).setId(78555), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(78556), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(78558), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(78559), IReturn(ERef(RefId(Id("""__x3__""")))).setId(78560)).setId(78561), ISeq(List()).setId(78634)).setId(78562), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(78563), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""callbackfn"""))))).setId(78565), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(78566), IReturn(ERef(RefId(Id("""__x5__""")))).setId(78567))).setId(78640), ISeq(List()).setId(78641)).setId(78569), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(78571), ILet(Id("""T"""), EUndef).setId(78573)).setId(78575), ILet(Id("""k"""), EINum(0L)).setId(78577), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(78579), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(78580), IReturn(ERef(RefId(Id("""__x6__""")))).setId(78581)).setId(78582), ISeq(List()).setId(78651)).setId(78583), ILet(Id("""Pk"""), ERef(RefId(Id("""__x6__""")))).setId(78584), IApp(Id("""__x7__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(78586), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(78587), IReturn(ERef(RefId(Id("""__x7__""")))).setId(78588)).setId(78589), ISeq(List()).setId(78658)).setId(78590), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x7__""")))).setId(78591), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(78593), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(78594), IReturn(ERef(RefId(Id("""__x8__""")))).setId(78595)).setId(78596), ISeq(List()).setId(78665)).setId(78597), ILet(Id("""kValue"""), ERef(RefId(Id("""__x8__""")))).setId(78598), IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""callbackfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""O"""))))))).setId(78600), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(78601), IReturn(ERef(RefId(Id("""__x9__""")))).setId(78602)).setId(78603), ISeq(List()).setId(78672)).setId(78604), IExpr(ERef(RefId(Id("""__x9__""")))).setId(78605))).setId(78675), ISeq(List()).setId(78676)).setId(78608), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(78610))).setId(78679)).setId(78613), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(78615), IReturn(ERef(RefId(Id("""__x10__""")))).setId(78616))).setId(78683))
  val instToStepMap: Map[Int, Int] = HashMap(78575 -> 6, 78585 -> 18, 78604 -> 16, 78586 -> 18, 78590 -> 18, 78579 -> 18, 78564 -> 3, 78572 -> 6, 78583 -> 18, 78556 -> 2, 78592 -> 18, 78549 -> 1, 78598 -> 16, 78571 -> 6, 78593 -> 16, 78607 -> 16, 78562 -> 3, 78613 -> 18, 78584 -> 18, 78570 -> 5, 78591 -> 18, 78599 -> 16, 78577 -> 7, 78610 -> 18, 78574 -> 6, 78545 -> 0, 78555 -> 2, 78569 -> 5, 78609 -> 18, 78614 -> 18, 78606 -> 16, 78578 -> 7, 78546 -> 0, 78566 -> 4, 78617 -> 19, 78563 -> 3, 78615 -> 19, 78600 -> 16, 78611 -> 18, 78558 -> 3, 78573 -> 6, 78550 -> 2, 78547 -> 1, 78567 -> 4, 78616 -> 19, 78565 -> 5, 78576 -> 6, 78605 -> 16, 78544 -> 0, 78612 -> 18, 78597 -> 16, 78568 -> 4, 78608 -> 18, 78548 -> 1, 78557 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(78545, 78546, 78544), 5 -> HashSet(78570, 78569, 78565), 1 -> HashSet(78549, 78547, 78548), 6 -> HashSet(78575, 78571, 78574, 78573, 78576, 78572), 2 -> HashSet(78556, 78555, 78550, 78557), 17 -> HashSet(78609, 78608), 12 -> HashSet(78592, 78591, 78586, 78590), 7 -> HashSet(78577, 78578), 3 -> HashSet(78562, 78563, 78558, 78564), 18 -> HashSet(78592, 78585, 78591, 78610, 78586, 78611, 78590, 78579, 78612, 78583, 78608, 78613, 78584, 78609, 78614), 16 -> HashSet(78598, 78593, 78607, 78604, 78599, 78606, 78600, 78605, 78597), 11 -> HashSet(78585, 78584, 78579, 78583), 19 -> HashSet(78617, 78615, 78616), 4 -> HashSet(78566, 78567, 78568), 15 -> HashSet(78598, 78593, 78599, 78597))
  /* Beautified form:
  "GLOBAL.Array.prototype.forEach" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (IsCallable callbackfn)
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
      app __x7__ = (HasProperty O Pk)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let kPresent = __x7__
      if (= kPresent true) {
        app __x8__ = (Get O Pk)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let kValue = __x8__
        app __x9__ = (Call callbackfn T (new [kValue, k, O]))
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        __x9__
      } else {}
      k = (+ k 1i)
    }
    app __x10__ = (WrapCompletion undefined)
    return __x10__
  }
  */
}
