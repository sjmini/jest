package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgumentList2ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArgumentList2ArgumentListEvaluation0""", List(Id("""this"""), Id("""ArgumentList"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ArgumentList"""))), EStr("""ArgumentListEvaluation""")).setId(18161), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(18162), IReturn(ERef(RefId(Id("""__x0__""")))).setId(18163)).setId(18164), ISeq(List()).setId(18190)).setId(18166), ILet(Id("""precedingArgs"""), ERef(RefId(Id("""__x0__""")))).setId(18167), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(18170), ILet(Id("""ref"""), ERef(RefId(Id("""__x1__""")))).setId(18171), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""ref"""))))).setId(18173), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(18174), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18175)).setId(18176), ISeq(List()).setId(18199)).setId(18177), ILet(Id("""arg"""), ERef(RefId(Id("""__x2__""")))).setId(18178), IAppend(ERef(RefId(Id("""arg"""))), ERef(RefId(Id("""precedingArgs""")))).setId(18180), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""precedingArgs"""))))).setId(18182), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18183))).setId(18205))
  val instToStepMap: Map[Int, Int] = HashMap(18180 -> 3, 18171 -> 1, 18177 -> 2, 18168 -> 0, 18183 -> 4, 18172 -> 1, 18173 -> 2, 18170 -> 1, 18179 -> 2, 18166 -> 0, 18181 -> 3, 18161 -> 0, 18178 -> 2, 18184 -> 4, 18182 -> 4, 18167 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(18161, 18168, 18167, 18166), 1 -> HashSet(18171, 18172, 18170), 2 -> HashSet(18178, 18177, 18173, 18179), 3 -> HashSet(18180, 18181), 4 -> HashSet(18184, 18183, 18182))
  /* Beautified form:
  "ArgumentList2ArgumentListEvaluation0" (this, ArgumentList, AssignmentExpression) => {
    access __x0__ = (ArgumentList "ArgumentListEvaluation")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let precedingArgs = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let ref = __x1__
    app __x2__ = (GetValue ref)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let arg = __x2__
    append arg -> precedingArgs
    app __x3__ = (WrapCompletion precedingArgs)
    return __x3__
  }
  */
}
