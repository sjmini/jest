package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EnumerableOwnPropertyNames {
  val length: Int = 2
  val func: Func = Func("""EnumerableOwnPropertyNames""", List(Id("""O"""), Id("""kind""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))).setId(6550), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(6551), IReturn(ERef(RefId(Id("""__x0__""")))).setId(6552)).setId(6553), ISeq(List()).setId(6616)).setId(6554), ILet(Id("""ownKeys"""), ERef(RefId(Id("""__x0__""")))).setId(6555), ILet(Id("""properties"""), EList(List())).setId(6557), ILet(Id("""__x1__"""), ERef(RefId(Id("""ownKeys""")))).setId(6600), ILet(Id("""__x2__"""), EINum(0L)).setId(6601), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(6602), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""key"""))))).setId(6559), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""key"""))))).setId(6560), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(6561), IReturn(ERef(RefId(Id("""__x4__""")))).setId(6562)).setId(6563), ISeq(List()).setId(6628)).setId(6564), ILet(Id("""desc"""), ERef(RefId(Id("""__x4__""")))).setId(6565), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Enumerable"""))), EBool(true))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""key""")), IAppend(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""properties""")))).setId(6567), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""key"""))))).setId(6569), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(6570), IReturn(ERef(RefId(Id("""__x5__""")))).setId(6571)).setId(6572), ISeq(List()).setId(6636)).setId(6573), ILet(Id("""value"""), ERef(RefId(Id("""__x5__""")))).setId(6574), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""value""")), IAppend(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""properties""")))).setId(6576), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(EList(List(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""value"""))))))).setId(6578), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(6579), IReturn(ERef(RefId(Id("""__x6__""")))).setId(6580)).setId(6581), ISeq(List()).setId(6644)).setId(6582), ILet(Id("""entry"""), ERef(RefId(Id("""__x6__""")))).setId(6583), IAppend(ERef(RefId(Id("""entry"""))), ERef(RefId(Id("""properties""")))).setId(6585))).setId(6648)).setId(6588))).setId(6650)).setId(6591), ISeq(List()).setId(6652)).setId(6594))).setId(6654), ISeq(List()).setId(6655)).setId(6597), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(6603))).setId(6658)).setId(6605), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""properties"""))))).setId(6608), IReturn(ERef(RefId(Id("""__x7__""")))).setId(6609))).setId(6662))
  val instToStepMap: Map[Int, Int] = HashMap(6559 -> 19, 6591 -> 19, 6556 -> 1, 6606 -> 19, 6549 -> 20, 6585 -> 19, 6568 -> 10, 6601 -> 19, 6600 -> 19, 6595 -> 19, 6575 -> 19, 6555 -> 1, 6566 -> 19, 6587 -> 19, 6576 -> 14, 6583 -> 19, 6608 -> 21, 6599 -> 19, 6594 -> 19, 6560 -> 19, 6588 -> 19, 6550 -> 1, 6605 -> 19, 6565 -> 19, 6582 -> 19, 6593 -> 19, 6573 -> 19, 6592 -> 19, 6610 -> 21, 6578 -> 19, 6598 -> 19, 6589 -> 19, 6574 -> 19, 6609 -> 21, 6564 -> 19, 6557 -> 2, 6577 -> 14, 6597 -> 19, 6596 -> 19, 6607 -> 19, 6567 -> 10, 6584 -> 19, 6554 -> 1, 6586 -> 19, 6569 -> 19, 6558 -> 2, 6590 -> 19)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(6549), 10 -> HashSet(6568, 6567), 14 -> HashSet(6576, 6577), 20 -> HashSet(6549), 1 -> HashSet(6555, 6550, 6556, 6554), 21 -> HashSet(6608, 6610, 6609), 13 -> HashSet(6573, 6574, 6569, 6575), 2 -> HashSet(6557, 6558), 17 -> HashSet(6549), 7 -> HashSet(6566, 6560, 6565, 6564), 18 -> HashSet(6583, 6582, 6578, 6584), 19 -> HashSet(6566, 6587, 6583, 6559, 6591, 6592, 6606, 6549, 6585, 6564, 6601, 6600, 6590, 6595, 6575, 6599, 6594, 6560, 6588, 6605, 6565, 6582, 6593, 6573, 6578, 6598, 6589, 6574, 6597, 6596, 6607, 6584, 6586, 6569))
  /* Beautified form:
  "EnumerableOwnPropertyNames" (O, kind) => {
    app __x0__ = (O["OwnPropertyKeys"] O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let ownKeys = __x0__
    let properties = (new [])
    let __x1__ = ownKeys
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let key = __x1__[__x2__]
      app __x3__ = (Type key)
      if (= __x3__ String) {
        app __x4__ = (O["GetOwnProperty"] O key)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let desc = __x4__
        if (&& (! (= desc undefined)) (= desc["Enumerable"] true)) if (= kind "key") append key -> properties else {
          app __x5__ = (Get O key)
          if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          let value = __x5__
          if (= kind "value") append value -> properties else {
            app __x6__ = (CreateArrayFromList (new [key, value]))
            if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
            let entry = __x6__
            append entry -> properties
          }
        } else {}
      } else {}
      __x2__ = (+ __x2__ 1i)
    }
    app __x7__ = (WrapCompletion properties)
    return __x7__
  }
  */
}
