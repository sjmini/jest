package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryObjectDOTIsExtensible {
  val length: Int = 0
  val func: Func = Func("""OrdinaryObject.IsExtensible""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryIsExtensible"""))), List(ERef(RefId(Id("""O"""))))).setId(49345), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(49346), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49347)).setId(49348), ISeq(List()).setId(49359)).setId(49350), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(49351), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49352))).setId(49363))
  val instToStepMap: Map[Int, Int] = HashMap(49350 -> 0, 49351 -> 0, 49353 -> 0, 49345 -> 0, 49352 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49350, 49351, 49353, 49345, 49352))
  /* Beautified form:
  "OrdinaryObject.IsExtensible" (O) => {
    app __x0__ = (OrdinaryIsExtensible O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
