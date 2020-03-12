package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateDataProperty {
  val length: Int = 3
  val func: Func = Func("""CreateDataProperty""", List(Id("""O"""), Id("""P"""), Id("""V""")), None, ISeq(List(ILet(Id("""newDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""V""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(true))))).setId(5090), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""newDesc"""))))).setId(5092), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5093), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5094)).setId(5095), ISeq(List()).setId(5106)).setId(5096), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(5097), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5098))).setId(5110))
  val instToStepMap: Map[Int, Int] = HashMap(5091 -> 2, 5096 -> 3, 5098 -> 3, 5090 -> 2, 5089 -> 1, 5092 -> 3, 5099 -> 3, 5097 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(5089), 1 -> HashSet(5089), 2 -> HashSet(5091, 5090), 3 -> HashSet(5096, 5098, 5092, 5099, 5097))
  /* Beautified form:
  "CreateDataProperty" (O, P, V) => {
    let newDesc = (new PropertyDescriptor("Value" -> V, "Writable" -> true, "Enumerable" -> true, "Configurable" -> true))
    app __x0__ = (O["DefineOwnProperty"] O P newDesc)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
