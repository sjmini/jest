package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IntegerIndexedExoticObjectDOTSet {
  val length: Int = 3
  val func: Func = Func("""IntegerIndexedExoticObject.Set""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(57058), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))).setId(57059), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(57060), IReturn(ERef(RefId(Id("""__x1__""")))).setId(57061)).setId(57062), ISeq(List()).setId(57094)).setId(57063), ILet(Id("""numericIndex"""), ERef(RefId(Id("""__x1__""")))).setId(57064), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""numericIndex"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IntegerIndexedElementSet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""numericIndex"""))), ERef(RefId(Id("""V"""))))).setId(57066), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(57067), IReturn(ERef(RefId(Id("""__x2__""")))).setId(57068)).setId(57069), ISeq(List()).setId(57101)).setId(57070), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(57071), IReturn(ERef(RefId(Id("""__x3__""")))).setId(57072))).setId(57105), ISeq(List()).setId(57106)).setId(57075))).setId(57108), ISeq(List()).setId(57109)).setId(57078), IApp(Id("""__x4__"""), ERef(RefId(Id("""OrdinarySet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))))).setId(57080), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(57081), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57082)).setId(57083), ISeq(List()).setId(57115)).setId(57084), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(57085), IReturn(ERef(RefId(Id("""__x5__""")))).setId(57086))).setId(57119))
  val instToStepMap: Map[Int, Int] = HashMap(57086 -> 8, 57075 -> 6, 57071 -> 6, 57072 -> 6, 57064 -> 6, 57079 -> 7, 57063 -> 6, 57074 -> 6, 57087 -> 8, 57078 -> 7, 57059 -> 6, 57065 -> 6, 57073 -> 6, 57077 -> 6, 57058 -> 7, 57084 -> 8, 57085 -> 8, 57076 -> 6, 57057 -> 0, 57070 -> 6, 57066 -> 6, 57080 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(57057), 6 -> HashSet(57075, 57071, 57072, 57064, 57063, 57074, 57059, 57065, 57073, 57077, 57066, 57076, 57070), 7 -> HashSet(57079, 57078, 57058), 3 -> HashSet(57064, 57063, 57059, 57065), 8 -> HashSet(57086, 57087, 57084, 57085, 57080))
  /* Beautified form:
  "IntegerIndexedExoticObject.Set" (O, P, V, Receiver) => {
    app __x0__ = (Type P)
    if (= __x0__ String) {
      app __x1__ = (CanonicalNumericIndexString P)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let numericIndex = __x1__
      if (! (= numericIndex undefined)) {
        app __x2__ = (IntegerIndexedElementSet O numericIndex V)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        app __x3__ = (WrapCompletion __x2__)
        return __x3__
      } else {}
    } else {}
    app __x4__ = (OrdinarySet O P V Receiver)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
