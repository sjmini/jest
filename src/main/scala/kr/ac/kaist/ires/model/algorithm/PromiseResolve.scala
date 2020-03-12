package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PromiseResolve {
  val length: Int = 2
  val func: Func = Func("""PromiseResolve""", List(Id("""C"""), Id("""x""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPromise"""))), List(ERef(RefId(Id("""x"""))))).setId(12655), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""x"""))), EStr("""constructor"""))).setId(12656), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(12657), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12658)).setId(12659), ISeq(List()).setId(12695)).setId(12660), ILet(Id("""xConstructor"""), ERef(RefId(Id("""__x1__""")))).setId(12661), IApp(Id("""__x2__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""xConstructor"""))), ERef(RefId(Id("""C"""))))).setId(12663), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""x"""))))).setId(12664), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12665))).setId(12701), ISeq(List()).setId(12702)).setId(12667))).setId(12704), ISeq(List()).setId(12705)).setId(12670), IApp(Id("""__x4__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))).setId(12672), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(12673), IReturn(ERef(RefId(Id("""__x4__""")))).setId(12674)).setId(12675), ISeq(List()).setId(12711)).setId(12676), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x4__""")))).setId(12677), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""x"""))))))).setId(12679), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(12680), IReturn(ERef(RefId(Id("""__x5__""")))).setId(12681)).setId(12682), ISeq(List()).setId(12718)).setId(12683), IExpr(ERef(RefId(Id("""__x5__""")))).setId(12684), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(12686), IReturn(ERef(RefId(Id("""__x6__""")))).setId(12687))).setId(12723))
  val instToStepMap: Map[Int, Int] = HashMap(12666 -> 4, 12667 -> 4, 12671 -> 5, 12677 -> 6, 12684 -> 7, 12665 -> 4, 12679 -> 7, 12669 -> 4, 12686 -> 8, 12661 -> 4, 12678 -> 6, 12670 -> 5, 12664 -> 4, 12687 -> 8, 12660 -> 4, 12683 -> 7, 12654 -> 0, 12688 -> 8, 12663 -> 4, 12676 -> 6, 12668 -> 4, 12656 -> 4, 12655 -> 5, 12672 -> 6, 12662 -> 4, 12685 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12654), 5 -> HashSet(12670, 12671, 12655), 6 -> HashSet(12678, 12677, 12676, 12672), 7 -> HashSet(12683, 12684, 12685, 12679), 3 -> HashSet(12661, 12660, 12656, 12662), 8 -> HashSet(12686, 12687, 12688), 4 -> HashSet(12666, 12661, 12664, 12667, 12660, 12663, 12665, 12662, 12669, 12668, 12656))
  /* Beautified form:
  "PromiseResolve" (C, x) => {
    app __x0__ = (IsPromise x)
    if (= __x0__ true) {
      app __x1__ = (Get x "constructor")
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let xConstructor = __x1__
      app __x2__ = (SameValue xConstructor C)
      if (= __x2__ true) {
        app __x3__ = (WrapCompletion x)
        return __x3__
      } else {}
    } else {}
    app __x4__ = (NewPromiseCapability C)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let promiseCapability = __x4__
    app __x5__ = (Call promiseCapability["Resolve"] undefined (new [x]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion promiseCapability["Promise"])
    return __x6__
  }
  */
}
