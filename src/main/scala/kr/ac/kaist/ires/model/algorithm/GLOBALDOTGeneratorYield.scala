package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTGeneratorYield {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.GeneratorYield""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89377), ILet(Id("""iterNextObj"""), ERef(RefId(Id("""__x0__""")))).setId(89378), ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(89381), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))).setId(89383), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""suspendedYield""")).setId(89385), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(89387), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))).setId(89388))).setId(89416), ISeq(List()).setId(89417)).setId(89391), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(89392), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(Id("""resumptionValue""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""resumptionValue"""))))).setId(89398), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89399))).setId(89422))).setId(89403), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""iterNextObj"""))))).setId(89404), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(89405), IReturn(ERef(RefId(Id("""__x4__""")))).setId(89406))).setId(89427))
  val instToStepMap: Map[Int, Int] = HashMap(89382 -> 2, 89378 -> 0, 89404 -> 12, 89397 -> 11, 89407 -> 12, 89393 -> 7, 89405 -> 12, 89385 -> 6, 89391 -> 7, 89395 -> 11, 89406 -> 12, 89384 -> 4, 89394 -> 11, 89403 -> 11, 89383 -> 4, 89379 -> 0, 89377 -> 0, 89396 -> 11, 89381 -> 2, 89386 -> 6, 89380 -> 13, 89392 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(89378, 89377, 89379), 5 -> HashSet(89380), 10 -> HashSet(89396, 89395, 89394), 1 -> HashSet(89380), 6 -> HashSet(89386, 89385), 13 -> HashSet(89380), 2 -> HashSet(89382, 89381), 12 -> HashSet(89404, 89407, 89405, 89406), 7 -> HashSet(89393, 89391, 89392), 3 -> HashSet(89380), 11 -> HashSet(89397, 89396, 89395, 89380, 89394, 89403), 4 -> HashSet(89384, 89383))
  /* Beautified form:
  "GLOBAL.GeneratorYield" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterNextObj = __x0__
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    generator["GeneratorState"] = "suspendedYield"
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x1__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x1__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      app __x2__ = (WrapCompletion resumptionValue)
      return __x2__
    }
    app __x3__ = (NormalCompletion iterNextObj)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
