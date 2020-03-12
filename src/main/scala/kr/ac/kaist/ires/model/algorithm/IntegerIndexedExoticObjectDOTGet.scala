package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IntegerIndexedExoticObjectDOTGet {
  val length: Int = 2
  val func: Func = Func("""IntegerIndexedExoticObject.Get""", List(Id("""O"""), Id("""P"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(56964), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))).setId(56965), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(56966), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56967)).setId(56968), ISeq(List()).setId(57000)).setId(56969), ILet(Id("""numericIndex"""), ERef(RefId(Id("""__x1__""")))).setId(56970), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IntegerIndexedElementGet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""numericIndex"""))))).setId(56972), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(56973), IReturn(ERef(RefId(Id("""__x2__""")))).setId(56974)).setId(56975), ISeq(List()).setId(57007)).setId(56976), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(56977), IReturn(ERef(RefId(Id("""__x3__""")))).setId(56978))).setId(57011), ISeq(List()).setId(57012)).setId(56981))).setId(57014), ISeq(List()).setId(57015)).setId(56984), IApp(Id("""__x4__"""), ERef(RefId(Id("""OrdinaryGet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))).setId(56986), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(56987), IReturn(ERef(RefId(Id("""__x4__""")))).setId(56988)).setId(56989), ISeq(List()).setId(57021)).setId(56990), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(56991), IReturn(ERef(RefId(Id("""__x5__""")))).setId(56992))).setId(57025))
  val instToStepMap: Map[Int, Int] = HashMap(56983 -> 6, 56986 -> 8, 56971 -> 6, 56972 -> 6, 56991 -> 8, 56978 -> 6, 56969 -> 6, 56965 -> 6, 56970 -> 6, 56980 -> 6, 56964 -> 7, 56990 -> 8, 56982 -> 6, 56979 -> 6, 56981 -> 6, 56963 -> 0, 56992 -> 8, 56977 -> 6, 56984 -> 7, 56985 -> 7, 56993 -> 8, 56976 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(56963), 6 -> HashSet(56983, 56971, 56972, 56978, 56981, 56969, 56977, 56965, 56970, 56976, 56980, 56982, 56979), 7 -> HashSet(56964, 56984, 56985), 3 -> HashSet(56971, 56969, 56965, 56970), 8 -> HashSet(56986, 56990, 56991, 56992, 56993))
  /* Beautified form:
  "IntegerIndexedExoticObject.Get" (O, P, Receiver) => {
    app __x0__ = (Type P)
    if (= __x0__ String) {
      app __x1__ = (CanonicalNumericIndexString P)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let numericIndex = __x1__
      if (! (= numericIndex undefined)) {
        app __x2__ = (IntegerIndexedElementGet O numericIndex)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        app __x3__ = (WrapCompletion __x2__)
        return __x3__
      } else {}
    } else {}
    app __x4__ = (OrdinaryGet O P Receiver)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
