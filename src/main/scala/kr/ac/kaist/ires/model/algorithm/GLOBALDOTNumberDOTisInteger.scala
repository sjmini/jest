package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTNumberDOTisInteger {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.isInteger""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(68981), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(68982), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""number"""))))).setId(68984), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(68985), IReturn(ERef(RefId(Id("""__x1__""")))).setId(68986)).setId(68987), ISeq(List()).setId(69000)).setId(68989), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(68990), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68991))).setId(69004))
  val instToStepMap: Map[Int, Int] = HashMap(68990 -> 1, 68981 -> 0, 68991 -> 1, 68989 -> 1, 68982 -> 0, 68983 -> 0, 68984 -> 1, 68992 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(68981, 68982, 68983), 1 -> HashSet(68990, 68991, 68989, 68984, 68992))
  /* Beautified form:
  "GLOBAL.Number.isInteger" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (IsInteger number)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
