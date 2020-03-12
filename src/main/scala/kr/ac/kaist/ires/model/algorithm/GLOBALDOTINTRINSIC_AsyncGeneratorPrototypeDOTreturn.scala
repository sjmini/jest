package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_AsyncGeneratorPrototypeDOTreturn {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_AsyncGeneratorPrototype.return""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89493), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(89494), ILet(Id("""generator"""), ERef(RefId(Id("""this""")))).setId(89496), ILet(Id("""completion"""), EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty"""))))))).setId(89498), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorEnqueue"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""completion"""))))).setId(89500), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(89501), IReturn(ERef(RefId(Id("""__x1__""")))).setId(89502)).setId(89503), ISeq(List()).setId(89518)).setId(89505), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(89506), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89507))).setId(89522))
  val instToStepMap: Map[Int, Int] = HashMap(89500 -> 3, 89508 -> 3, 89497 -> 1, 89498 -> 2, 89507 -> 3, 89499 -> 2, 89494 -> 0, 89506 -> 3, 89496 -> 1, 89493 -> 0, 89505 -> 3, 89495 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(89493, 89495, 89494), 1 -> HashSet(89496, 89497), 2 -> HashSet(89498, 89499), 3 -> HashSet(89500, 89506, 89505, 89508, 89507))
  /* Beautified form:
  "GLOBAL.INTRINSIC_AsyncGeneratorPrototype.return" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let generator = this
    let completion = (new Completion("Type" -> CONST_return, "Value" -> value, "Target" -> CONST_empty))
    app __x1__ = (AsyncGeneratorEnqueue generator completion)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
