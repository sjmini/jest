package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions""", List(), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(11478), IAssign(RefProp(RefProp(RefId(Id("""F""")), EStr("""Generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(11480), IApp(Id("""__x0__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefProp(RefId(Id("""F""")), EStr("""Generator"""))), ERef(RefId(Id("""value"""))), EBool(true))).setId(11482), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(11483), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11484)).setId(11485), ISeq(List()).setId(11498)).setId(11487), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(11488), IReturn(ERef(RefId(Id("""__x1__""")))).setId(11489))).setId(11502))
  val instToStepMap: Map[Int, Int] = HashMap(11481 -> 1, 11488 -> 2, 11487 -> 2, 11482 -> 2, 11480 -> 1, 11478 -> 0, 11490 -> 2, 11479 -> 0, 11489 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(11478, 11479), 1 -> HashSet(11481, 11480), 2 -> HashSet(11490, 11488, 11487, 11482, 11489))
  /* Beautified form:
  "AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions" () => {
    let F = GLOBAL_context["Function"]
    F["Generator"]["AsyncGeneratorState"] = "completed"
    app __x0__ = (AsyncGeneratorResolve F["Generator"] value true)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
