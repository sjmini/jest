package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Construct {
  val length: Int = 1
  val func: Func = Func("""Construct""", List(Id("""F"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""newTarget"""))), EAbsent), IAssign(RefId(Id("""newTarget""")), ERef(RefId(Id("""F""")))).setId(5490), ISeq(List()).setId(5509)).setId(5493), IIf(EBOp(OEq, ERef(RefId(Id("""argumentsList"""))), EAbsent), IAssign(RefId(Id("""argumentsList""")), EList(List())).setId(5495), ISeq(List()).setId(5512)).setId(5497), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Construct"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""argumentsList"""))), ERef(RefId(Id("""newTarget"""))))).setId(5499), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5500), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5501)).setId(5502), ISeq(List()).setId(5518)).setId(5503), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(5504), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5505))).setId(5522))
  val instToStepMap: Map[Int, Int] = HashMap(5493 -> 1, 5492 -> 5, 5497 -> 3, 5496 -> 2, 5498 -> 3, 5503 -> 6, 5495 -> 2, 5499 -> 6, 5504 -> 6, 5490 -> 0, 5505 -> 6, 5494 -> 1, 5506 -> 6, 5491 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(5491, 5490), 5 -> HashSet(5492), 1 -> HashSet(5493, 5494), 6 -> HashSet(5503, 5506, 5499, 5504, 5505), 2 -> HashSet(5496, 5495), 3 -> HashSet(5497, 5498), 4 -> HashSet(5492))
  /* Beautified form:
  "Construct" (F, argumentsList, newTarget) => {
    if (= newTarget absent) newTarget = F else {}
    if (= argumentsList absent) argumentsList = (new []) else {}
    app __x0__ = (F["Construct"] F argumentsList newTarget)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
