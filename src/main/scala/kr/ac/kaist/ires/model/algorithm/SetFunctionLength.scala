package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SetFunctionLength {
  val length: Int = 2
  val func: Func = Func("""SetFunctionLength""", List(Id("""F"""), Id("""length""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""length""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(52527), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(52528), IReturn(ERef(RefId(Id("""__x0__""")))).setId(52529)).setId(52530), ISeq(List()).setId(52540)).setId(52531), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(52532), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52533))).setId(52544))
  val instToStepMap: Map[Int, Int] = HashMap(52534 -> 3, 52527 -> 3, 52533 -> 3, 52526 -> 2, 52532 -> 3, 52531 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(52526), 1 -> HashSet(52526), 2 -> HashSet(52526), 3 -> HashSet(52534, 52527, 52533, 52532, 52531))
  /* Beautified form:
  "SetFunctionLength" (F, length) => {
    app __x0__ = (DefinePropertyOrThrow F "length" (new PropertyDescriptor("Value" -> length, "Writable" -> false, "Enumerable" -> false, "Configurable" -> true)))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
