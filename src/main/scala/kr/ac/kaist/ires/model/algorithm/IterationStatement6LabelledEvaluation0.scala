package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement6LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement6LabelledEvaluation0""", List(Id("""this"""), Id("""ForBinding"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ForInOfHeadEvaluation"""))), List(EList(List()), ERef(RefId(Id("""Expression"""))), ERef(RefId(Id("""CONST_enumerate"""))))).setId(32699), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(32700), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32701)).setId(32702), ISeq(List()).setId(32720)).setId(32704), ILet(Id("""keyResult"""), ERef(RefId(Id("""__x0__""")))).setId(32705), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForInOfBodyEvaluation"""))), List(ERef(RefId(Id("""ForBinding"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""keyResult"""))), ERef(RefId(Id("""CONST_enumerate"""))), ERef(RefId(Id("""CONST_varBinding"""))), ERef(RefId(Id("""labelSet"""))))).setId(32707), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(32708), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32709)).setId(32710), ISeq(List()).setId(32727)).setId(32711), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(32712), IReturn(ERef(RefId(Id("""__x2__""")))).setId(32713))).setId(32731))
  val instToStepMap: Map[Int, Int] = HashMap(32706 -> 0, 32707 -> 1, 32699 -> 0, 32704 -> 0, 32705 -> 0, 32714 -> 1, 32711 -> 1, 32712 -> 1, 32713 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32706, 32699, 32704, 32705), 1 -> HashSet(32707, 32714, 32711, 32712, 32713))
  /* Beautified form:
  "IterationStatement6LabelledEvaluation0" (this, ForBinding, Expression, Statement, labelSet) => {
    app __x0__ = (ForInOfHeadEvaluation (new []) Expression CONST_enumerate)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let keyResult = __x0__
    app __x1__ = (ForInOfBodyEvaluation ForBinding Statement keyResult CONST_enumerate CONST_varBinding labelSet)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
