package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_AsyncGeneratorPrototypeDOTnext {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_AsyncGeneratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89447), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(89448), ILet(Id("""generator"""), ERef(RefId(Id("""this""")))).setId(89450), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(89452), ILet(Id("""completion"""), ERef(RefId(Id("""__x1__""")))).setId(89453), IApp(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorEnqueue"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""completion"""))))).setId(89455), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(89456), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89457)).setId(89458), ISeq(List()).setId(89474)).setId(89460), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(89461), IReturn(ERef(RefId(Id("""__x3__""")))).setId(89462))).setId(89478))
  val instToStepMap: Map[Int, Int] = HashMap(89453 -> 2, 89461 -> 3, 89454 -> 2, 89448 -> 0, 89463 -> 3, 89450 -> 1, 89447 -> 0, 89451 -> 1, 89452 -> 2, 89462 -> 3, 89460 -> 3, 89455 -> 3, 89449 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(89449, 89448, 89447), 1 -> HashSet(89450, 89451), 2 -> HashSet(89453, 89454, 89452), 3 -> HashSet(89461, 89463, 89462, 89460, 89455))
  /* Beautified form:
  "GLOBAL.INTRINSIC_AsyncGeneratorPrototype.next" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let generator = this
    app __x1__ = (NormalCompletion value)
    let completion = __x1__
    app __x2__ = (AsyncGeneratorEnqueue generator completion)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
