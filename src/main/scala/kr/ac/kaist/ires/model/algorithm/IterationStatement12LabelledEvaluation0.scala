package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement12LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement12LabelledEvaluation0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ForInOfHeadEvaluation"""))), List(EList(List()), ERef(RefId(Id("""AssignmentExpression"""))), ERef(RefId(Id("""CONST_asynciterate"""))))).setId(32999), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(33000), IReturn(ERef(RefId(Id("""__x0__""")))).setId(33001)).setId(33002), ISeq(List()).setId(33020)).setId(33004), ILet(Id("""keyResult"""), ERef(RefId(Id("""__x0__""")))).setId(33005), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForInOfBodyEvaluation"""))), List(ERef(RefId(Id("""ForBinding"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""keyResult"""))), ERef(RefId(Id("""CONST_iterate"""))), ERef(RefId(Id("""CONST_varBinding"""))), ERef(RefId(Id("""labelSet"""))), ERef(RefId(Id("""CONST_async"""))))).setId(33007), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(33008), IReturn(ERef(RefId(Id("""__x1__""")))).setId(33009)).setId(33010), ISeq(List()).setId(33027)).setId(33011), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(33012), IReturn(ERef(RefId(Id("""__x2__""")))).setId(33013))).setId(33031))
  val instToStepMap: Map[Int, Int] = HashMap(33004 -> 0, 33013 -> 1, 33014 -> 1, 32999 -> 0, 33007 -> 1, 33006 -> 0, 33011 -> 1, 33005 -> 0, 33012 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(33004, 32999, 33006, 33005), 1 -> HashSet(33013, 33014, 33007, 33011, 33012))
  /* Beautified form:
  "IterationStatement12LabelledEvaluation0" (this, ForBinding, AssignmentExpression, Statement, labelSet) => {
    app __x0__ = (ForInOfHeadEvaluation (new []) AssignmentExpression CONST_asynciterate)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let keyResult = __x0__
    app __x1__ = (ForInOfBodyEvaluation ForBinding Statement keyResult CONST_iterate CONST_varBinding labelSet CONST_async)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
