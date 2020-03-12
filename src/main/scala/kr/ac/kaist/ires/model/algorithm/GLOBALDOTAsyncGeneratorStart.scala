package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncGeneratorStart {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.AsyncGeneratorStart""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89582), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(89583), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(89585), ILet(Id("""generatorBody"""), ERef(RefId(Id("""__x1__""")))).setId(89586), ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(89589), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(89591), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""generatorBody"""))), EStr("""Evaluation""")).setId(89636), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))).setId(89637), IAccess(Id("""__ret__"""), ERef(RefId(Id("""genContext"""))), EStr("""ReturnCont""")).setId(89639), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))).setId(89640), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x3__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(89642), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x3__"""))))).setId(89643))).setId(89704), ISeq(List()).setId(89705)).setId(89646), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(89647), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(89649), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal"""))))), ILet(Id("""resultValue"""), EUndef).setId(89651), ISeq(List(ILet(Id("""resultValue"""), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(89653), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""resultValue"""))))).setId(89655), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(89656), IReturn(ERef(RefId(Id("""__x4__""")))).setId(89657)).setId(89658), ISeq(List()).setId(89715)).setId(89660), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(89661), IReturn(ERef(RefId(Id("""__x5__""")))).setId(89662))).setId(89719), ISeq(List()).setId(89720)).setId(89666))).setId(89722)).setId(89669), IApp(Id("""__x6__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""resultValue"""))), EBool(true))).setId(89671), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(89672), IReturn(ERef(RefId(Id("""__x6__""")))).setId(89673)).setId(89674), ISeq(List()).setId(89728)).setId(89676), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(89677), IReturn(ERef(RefId(Id("""__x7__""")))).setId(89678))).setId(89732))).setId(89681), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorContext""")), ERef(RefId(Id("""genContext""")))).setId(89682), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""suspendedStart""")).setId(89684), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")), EList(List())).setId(89686), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(89688), IReturn(ERef(RefId(Id("""__x8__""")))).setId(89689))).setId(89739))
  val instToStepMap: Map[Int, Int] = HashMap(89687 -> 22, 89635 -> 19, 89683 -> 20, 89585 -> 1, 89626 -> 19, 89685 -> 21, 89681 -> 19, 89597 -> 19, 89587 -> 1, 89607 -> 19, 89609 -> 12, 89591 -> 5, 89619 -> 18, 89604 -> 19, 89682 -> 20, 89631 -> 19, 89627 -> 19, 89588 -> 3, 89583 -> 0, 89612 -> 18, 89623 -> 18, 89596 -> 19, 89608 -> 19, 89633 -> 19, 89592 -> 5, 89620 -> 18, 89684 -> 21, 89589 -> 4, 89611 -> 18, 89599 -> 19, 89605 -> 19, 89690 -> 23, 89595 -> 19, 89610 -> 12, 89598 -> 19, 89624 -> 18, 89689 -> 23, 89586 -> 1, 89617 -> 18, 89590 -> 4, 89621 -> 18, 89606 -> 19, 89594 -> 19, 89625 -> 19, 89688 -> 23, 89686 -> 22, 89613 -> 18, 89618 -> 18, 89582 -> 0, 89584 -> 0, 89622 -> 18, 89632 -> 19, 89634 -> 19)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(89583, 89582, 89584), 5 -> HashSet(89591, 89592), 10 -> HashSet(89604, 89605, 89606), 20 -> HashSet(89682, 89683), 1 -> HashSet(89585, 89586, 89587), 21 -> HashSet(89684, 89685), 9 -> HashSet(89599, 89598, 89597), 2 -> HashSet(89588), 22 -> HashSet(89687, 89686), 12 -> HashSet(89610, 89609), 3 -> HashSet(89588), 18 -> HashSet(89619, 89620, 89611, 89626, 89624, 89617, 89621, 89625, 89613, 89618, 89622, 89612, 89623), 11 -> HashSet(89608, 89607), 23 -> HashSet(89690, 89689, 89688), 8 -> HashSet(89596, 89595, 89594), 19 -> HashSet(89627, 89635, 89633, 89626, 89595, 89598, 89681, 89597, 89607, 89604, 89631, 89596, 89608, 89599, 89605, 89606, 89625, 89594, 89632, 89634), 4 -> HashSet(89589, 89590), 15 -> HashSet(89612, 89611))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorStart" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let generatorBody = __x1__
    let genContext = GLOBAL_context
    genContext["Generator"] = generator
    genContext["ResumeCont"] = () [=>] {
      access __x2__ = (generatorBody "Evaluation")
      let result = __x2__
      access __ret__ = (genContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
        __x3__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x3__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      generator["AsyncGeneratorState"] = "completed"
      if (&& (= (typeof result) "Completion") (= result["Type"] CONST_normal)) let resultValue = undefined else {
        let resultValue = result["Value"]
        if (! (= result["Type"] CONST_return)) {
          app __x4__ = (AsyncGeneratorReject generator resultValue)
          if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
          app __x5__ = (WrapCompletion __x4__)
          return __x5__
        } else {}
      }
      app __x6__ = (AsyncGeneratorResolve generator resultValue true)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    }
    generator["AsyncGeneratorContext"] = genContext
    generator["AsyncGeneratorState"] = "suspendedStart"
    generator["AsyncGeneratorQueue"] = (new [])
    app __x8__ = (WrapCompletion undefined)
    return __x8__
  }
  */
}
