package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncGeneratorResumeNextReturnProcessorFulfilledFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90300), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(90301), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(90303), IAssign(RefProp(RefProp(RefId(Id("""F""")), EStr("""Generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(90305), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefProp(RefId(Id("""F""")), EStr("""Generator"""))), ERef(RefId(Id("""value"""))), EBool(true))).setId(90307), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(90308), IReturn(ERef(RefId(Id("""__x1__""")))).setId(90309)).setId(90310), ISeq(List()).setId(90325)).setId(90312), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(90313), IReturn(ERef(RefId(Id("""__x2__""")))).setId(90314))).setId(90329))
  val instToStepMap: Map[Int, Int] = HashMap(90312 -> 3, 90302 -> 0, 90307 -> 3, 90315 -> 3, 90303 -> 1, 90313 -> 3, 90306 -> 2, 90304 -> 1, 90314 -> 3, 90301 -> 0, 90305 -> 2, 90300 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(90302, 90300, 90301), 1 -> HashSet(90303, 90304), 2 -> HashSet(90306, 90305), 3 -> HashSet(90312, 90307, 90315, 90313, 90314))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let F = GLOBAL_context["Function"]
    F["Generator"]["AsyncGeneratorState"] = "completed"
    app __x1__ = (AsyncGeneratorResolve F["Generator"] value true)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
