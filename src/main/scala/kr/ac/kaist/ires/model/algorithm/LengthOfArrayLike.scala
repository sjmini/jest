package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LengthOfArrayLike {
  val length: Int = 1
  val func: Func = Func("""LengthOfArrayLike""", List(Id("""obj""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""obj"""))), EStr("""length"""))).setId(6008), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(6009), IReturn(ERef(RefId(Id("""__x0__""")))).setId(6010)).setId(6011), ISeq(List()).setId(6026)).setId(6012), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToLength"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(6013), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(6014), IReturn(ERef(RefId(Id("""__x1__""")))).setId(6015)).setId(6016), ISeq(List()).setId(6032)).setId(6017), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(6018), IReturn(ERef(RefId(Id("""__x2__""")))).setId(6019))).setId(6036))
  val instToStepMap: Map[Int, Int] = HashMap(6017 -> 1, 6020 -> 1, 6019 -> 1, 6008 -> 1, 6012 -> 1, 6013 -> 1, 6018 -> 1, 6007 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(6007), 1 -> HashSet(6017, 6020, 6019, 6008, 6012, 6013, 6018))
  /* Beautified form:
  "LengthOfArrayLike" (obj) => {
    app __x0__ = (Get obj "length")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (ToLength __x0__)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
