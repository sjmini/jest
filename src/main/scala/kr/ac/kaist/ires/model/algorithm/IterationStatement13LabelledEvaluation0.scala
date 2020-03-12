package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement13LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement13LabelledEvaluation0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForDeclaration"""))), EStr("""BoundNames""")).setId(33048), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForInOfHeadEvaluation"""))), List(ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""AssignmentExpression"""))), ERef(RefId(Id("""CONST_asynciterate"""))))).setId(33049), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(33050), IReturn(ERef(RefId(Id("""__x1__""")))).setId(33051)).setId(33052), ISeq(List()).setId(33071)).setId(33054), ILet(Id("""keyResult"""), ERef(RefId(Id("""__x1__""")))).setId(33055), IApp(Id("""__x2__"""), ERef(RefId(Id("""ForInOfBodyEvaluation"""))), List(ERef(RefId(Id("""ForDeclaration"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""keyResult"""))), ERef(RefId(Id("""CONST_iterate"""))), ERef(RefId(Id("""CONST_lexicalBinding"""))), ERef(RefId(Id("""labelSet"""))), ERef(RefId(Id("""CONST_async"""))))).setId(33057), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(33058), IReturn(ERef(RefId(Id("""__x2__""")))).setId(33059)).setId(33060), ISeq(List()).setId(33078)).setId(33061), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(33062), IReturn(ERef(RefId(Id("""__x3__""")))).setId(33063))).setId(33082))
  val instToStepMap: Map[Int, Int] = HashMap(33062 -> 1, 33055 -> 0, 33063 -> 1, 33054 -> 0, 33048 -> 0, 33061 -> 1, 33049 -> 0, 33064 -> 1, 33057 -> 1, 33056 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(33055, 33054, 33049, 33048, 33056), 1 -> HashSet(33062, 33063, 33064, 33061, 33057))
  /* Beautified form:
  "IterationStatement13LabelledEvaluation0" (this, ForDeclaration, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (ForDeclaration "BoundNames")
    app __x1__ = (ForInOfHeadEvaluation __x0__ AssignmentExpression CONST_asynciterate)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let keyResult = __x1__
    app __x2__ = (ForInOfBodyEvaluation ForDeclaration Statement keyResult CONST_iterate CONST_lexicalBinding labelSet CONST_async)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
