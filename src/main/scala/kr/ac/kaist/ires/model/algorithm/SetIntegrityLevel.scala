package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SetIntegrityLevel {
  val length: Int = 2
  val func: Func = Func("""SetIntegrityLevel""", List(Id("""O"""), Id("""level""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""PreventExtensions"""))), List(ERef(RefId(Id("""O"""))))).setId(5539), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5540), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5541)).setId(5542), ISeq(List()).setId(5621)).setId(5543), ILet(Id("""status"""), ERef(RefId(Id("""__x0__""")))).setId(5544), IIf(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(5546), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5547))).setId(5626), ISeq(List()).setId(5627)).setId(5549), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))).setId(5551), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(5552), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5553)).setId(5554), ISeq(List()).setId(5633)).setId(5555), ILet(Id("""keys"""), ERef(RefId(Id("""__x2__""")))).setId(5556), IIf(EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""sealed""")), ISeq(List(ILet(Id("""__x3__"""), ERef(RefId(Id("""keys""")))).setId(5566), ILet(Id("""__x4__"""), EINum(0L)).setId(5567), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))).setId(5568), IApp(Id("""__x5__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""k"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Configurable"""), EBool(false)))))).setId(5558), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(5559), IReturn(ERef(RefId(Id("""__x5__""")))).setId(5560)).setId(5561), ISeq(List()).setId(5643)).setId(5562), IExpr(ERef(RefId(Id("""__x5__""")))).setId(5563), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L))).setId(5569))).setId(5647)).setId(5571))).setId(5649), ISeq(List(ILet(Id("""__x6__"""), ERef(RefId(Id("""keys""")))).setId(5602), ILet(Id("""__x7__"""), EINum(0L)).setId(5603), IWhile(EBOp(OLt, ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""length""")))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x7__""")))))).setId(5604), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""k"""))))).setId(5575), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(5576), IReturn(ERef(RefId(Id("""__x8__""")))).setId(5577)).setId(5578), ISeq(List()).setId(5657)).setId(5579), ILet(Id("""currentDesc"""), ERef(RefId(Id("""__x8__""")))).setId(5580), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""currentDesc"""))), EUndef)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""currentDesc"""))))).setId(5582), IIf(EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EBool(true)), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Configurable"""), EBool(false))))).setId(5583), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Configurable"""), EBool(false)), (EStr("""Writable"""), EBool(false))))).setId(5586)).setId(5589), IApp(Id("""__x10__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""desc"""))))).setId(5591), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(5592), IReturn(ERef(RefId(Id("""__x10__""")))).setId(5593)).setId(5594), ISeq(List()).setId(5668)).setId(5595), IExpr(ERef(RefId(Id("""__x10__""")))).setId(5596))).setId(5671), ISeq(List()).setId(5672)).setId(5599), IAssign(RefId(Id("""__x7__""")), EBOp(OPlus, ERef(RefId(Id("""__x7__"""))), EINum(1L))).setId(5605))).setId(5675)).setId(5607))).setId(5677)).setId(5611), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(5613), IReturn(ERef(RefId(Id("""__x11__""")))).setId(5614))).setId(5681))
  val instToStepMap: Map[Int, Int] = HashMap(5582 -> 25, 5614 -> 26, 5585 -> 21, 5572 -> 10, 5603 -> 25, 5612 -> 25, 5610 -> 25, 5575 -> 25, 5573 -> 10, 5600 -> 25, 5601 -> 25, 5581 -> 25, 5550 -> 4, 5565 -> 10, 5589 -> 25, 5597 -> 25, 5558 -> 10, 5545 -> 2, 5562 -> 10, 5611 -> 25, 5579 -> 25, 5551 -> 5, 5566 -> 10, 5609 -> 25, 5615 -> 26, 5583 -> 21, 5588 -> 24, 5547 -> 3, 5557 -> 5, 5544 -> 2, 5571 -> 10, 5608 -> 25, 5598 -> 25, 5546 -> 3, 5567 -> 10, 5595 -> 25, 5539 -> 2, 5556 -> 5, 5580 -> 25, 5563 -> 10, 5584 -> 21, 5599 -> 25, 5548 -> 3, 5538 -> 25, 5587 -> 24, 5607 -> 25, 5602 -> 25, 5555 -> 5, 5543 -> 2, 5613 -> 26, 5596 -> 25, 5549 -> 4, 5590 -> 25, 5564 -> 10, 5586 -> 24, 5591 -> 25, 5574 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(5538), 5 -> HashSet(5551, 5557, 5556, 5555), 10 -> HashSet(5565, 5558, 5572, 5562, 5566, 5571, 5567, 5563, 5573, 5564, 5574), 1 -> HashSet(5538), 21 -> HashSet(5585, 5583, 5584), 13 -> HashSet(5538), 2 -> HashSet(5545, 5544, 5539, 5543), 3 -> HashSet(5547, 5546, 5548), 16 -> HashSet(5579, 5580, 5575, 5581), 26 -> HashSet(5614, 5615, 5613), 4 -> HashSet(5550, 5549), 24 -> HashSet(5582, 5589, 5588, 5587, 5590, 5586), 25 -> HashSet(5582, 5589, 5597, 5609, 5603, 5612, 5610, 5599, 5575, 5538, 5596, 5600, 5590, 5601, 5581, 5591, 5611, 5579, 5608, 5598, 5595, 5580, 5607, 5602))
  /* Beautified form:
  "SetIntegrityLevel" (O, level) => {
    app __x0__ = (O["PreventExtensions"] O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let status = __x0__
    if (= status false) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (O["OwnPropertyKeys"] O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let keys = __x2__
    if (= level "sealed") {
      let __x3__ = keys
      let __x4__ = 0i
      while (< __x4__ __x3__["length"]) {
        let k = __x3__[__x4__]
        app __x5__ = (DefinePropertyOrThrow O k (new PropertyDescriptor("Configurable" -> false)))
        if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
        __x4__ = (+ __x4__ 1i)
      }
    } else {
      let __x6__ = keys
      let __x7__ = 0i
      while (< __x7__ __x6__["length"]) {
        let k = __x6__[__x7__]
        app __x8__ = (O["GetOwnProperty"] O k)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let currentDesc = __x8__
        if (! (= currentDesc undefined)) {
          app __x9__ = (IsAccessorDescriptor currentDesc)
          if (= __x9__ true) let desc = (new PropertyDescriptor("Configurable" -> false)) else let desc = (new PropertyDescriptor("Configurable" -> false, "Writable" -> false))
          app __x10__ = (DefinePropertyOrThrow O k desc)
          if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          __x10__
        } else {}
        __x7__ = (+ __x7__ 1i)
      }
    }
    app __x11__ = (WrapCompletion true)
    return __x11__
  }
  */
}
