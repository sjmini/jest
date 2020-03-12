package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncGeneratorYield {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AsyncGeneratorYield""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90522), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(90523), ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(90525), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))).setId(90528), IApp(Id("""__x1__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""value"""))))).setId(90530), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(90531), IReturn(ERef(RefId(Id("""__x1__""")))).setId(90532)).setId(90533), ISeq(List()).setId(90606)).setId(90534), IAssign(RefId(Id("""value""")), ERef(RefId(Id("""__x1__""")))).setId(90535), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""suspendedYield""")).setId(90537), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x2__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(90539), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x2__"""))))).setId(90540))).setId(90612), ISeq(List()).setId(90613)).setId(90543), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(90544), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(Id("""resumptionValue""")), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""resumptionValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""resumptionValue"""))))).setId(90565), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(90566), IReturn(ERef(RefId(Id("""__x4__""")))).setId(90567))).setId(90619), ISeq(List()).setId(90620)).setId(90570), IApp(Id("""__x5__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefProp(RefId(Id("""resumptionValue""")), EStr("""Value"""))))).setId(90572), ILet(Id("""awaited"""), ERef(RefId(Id("""__x5__""")))).setId(90573), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""awaited""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""awaited"""))))).setId(90575), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(90576), IReturn(ERef(RefId(Id("""__x7__""")))).setId(90577))).setId(90627), ISeq(List()).setId(90628)).setId(90580), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefProp(RefId(Id("""awaited""")), EStr("""Value""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(90583), IReturn(ERef(RefId(Id("""__x8__""")))).setId(90584))).setId(90632))).setId(90588), IApp(Id("""__x9__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""value"""))), EBool(false))).setId(90589), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(90590), IReturn(ERef(RefId(Id("""__x9__""")))).setId(90591)).setId(90592), ISeq(List()).setId(90638)).setId(90593), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(90594), IReturn(ERef(RefId(Id("""__x10__""")))).setId(90595))).setId(90642))
  val instToStepMap: Map[Int, Int] = HashMap(90538 -> 6, 90558 -> 13, 90554 -> 17, 90525 -> 1, 90550 -> 17, 90535 -> 5, 90551 -> 17, 90593 -> 18, 90560 -> 17, 90564 -> 17, 90523 -> 0, 90559 -> 17, 90528 -> 3, 90549 -> 10, 90524 -> 0, 90536 -> 5, 90546 -> 10, 90557 -> 13, 90522 -> 0, 90596 -> 18, 90589 -> 18, 90553 -> 17, 90526 -> 1, 90595 -> 18, 90563 -> 17, 90543 -> 7, 90534 -> 5, 90556 -> 13, 90561 -> 17, 90529 -> 3, 90547 -> 10, 90544 -> 7, 90527 -> 19, 90530 -> 5, 90552 -> 17, 90588 -> 17, 90555 -> 13, 90545 -> 7, 90562 -> 17, 90594 -> 18, 90548 -> 10, 90537 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(90522, 90523, 90524), 5 -> HashSet(90536, 90535, 90534, 90530), 10 -> HashSet(90546, 90547, 90548, 90549), 14 -> HashSet(90560, 90559), 1 -> HashSet(90525, 90526), 6 -> HashSet(90538, 90537), 13 -> HashSet(90558, 90557, 90556, 90555), 2 -> HashSet(90527), 17 -> HashSet(90554, 90550, 90553, 90563, 90551, 90561, 90560, 90564, 90527, 90562, 90559, 90552, 90588), 12 -> HashSet(90554, 90553, 90552), 7 -> HashSet(90543, 90544, 90545), 3 -> HashSet(90529, 90528), 18 -> HashSet(90596, 90589, 90595, 90593, 90594), 16 -> HashSet(90563, 90561, 90562), 11 -> HashSet(90550, 90551), 19 -> HashSet(90527), 4 -> HashSet(90527), 15 -> HashSet(90527))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorYield" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    app __x1__ = (Await value)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    value = __x1__
    generator["AsyncGeneratorState"] = "suspendedYield"
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x2__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x2__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      if (! (= resumptionValue["Type"] CONST_return)) {
        app __x3__ = (Completion resumptionValue)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      app __x5__ = (Await resumptionValue["Value"])
      let awaited = __x5__
      if (= awaited["Type"] CONST_throw) {
        app __x6__ = (Completion awaited)
        app __x7__ = (WrapCompletion __x6__)
        return __x7__
      } else {}
      app __x8__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> awaited["Value"], "Target" -> CONST_empty)))
      return __x8__
    }
    app __x9__ = (AsyncGeneratorResolve generator value false)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }
  */
}
