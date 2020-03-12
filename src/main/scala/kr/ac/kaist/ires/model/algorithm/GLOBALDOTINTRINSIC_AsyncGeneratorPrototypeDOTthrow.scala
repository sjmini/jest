package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_AsyncGeneratorPrototypeDOTthrow {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_AsyncGeneratorPrototype.throw""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89536), ILet(Id("""exception"""), ERef(RefId(Id("""__x0__""")))).setId(89537), ILet(Id("""generator"""), ERef(RefId(Id("""this""")))).setId(89539), IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(ERef(RefId(Id("""exception"""))))).setId(89541), ILet(Id("""completion"""), ERef(RefId(Id("""__x1__""")))).setId(89542), IApp(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorEnqueue"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""completion"""))))).setId(89544), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(89545), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89546)).setId(89547), ISeq(List()).setId(89563)).setId(89549), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(89550), IReturn(ERef(RefId(Id("""__x3__""")))).setId(89551))).setId(89567))
  val instToStepMap: Map[Int, Int] = HashMap(89537 -> 0, 89544 -> 3, 89549 -> 3, 89536 -> 0, 89538 -> 0, 89542 -> 2, 89539 -> 1, 89543 -> 2, 89550 -> 3, 89552 -> 3, 89540 -> 1, 89541 -> 2, 89551 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(89537, 89536, 89538), 1 -> HashSet(89539, 89540), 2 -> HashSet(89541, 89542, 89543), 3 -> HashSet(89544, 89549, 89551, 89550, 89552))
  /* Beautified form:
  "GLOBAL.INTRINSIC_AsyncGeneratorPrototype.throw" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let exception = __x0__
    let generator = this
    app __x1__ = (ThrowCompletion exception)
    let completion = __x1__
    app __x2__ = (AsyncGeneratorEnqueue generator completion)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
