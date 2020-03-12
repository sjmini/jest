package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTNumberDOTisNaN {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.isNaN""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(69016), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(69017), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""number"""))))).setId(69019), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Number"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(69020), IReturn(ERef(RefId(Id("""__x2__""")))).setId(69021))).setId(69040), ISeq(List()).setId(69041)).setId(69024), IIf(EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(69026), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69027))).setId(69045), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(69029), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69030))).setId(69048)).setId(69032))).setId(69050))
  val instToStepMap: Map[Int, Int] = HashMap(69028 -> 3, 69017 -> 0, 69027 -> 3, 69022 -> 1, 69018 -> 0, 69016 -> 0, 69030 -> 4, 69019 -> 2, 69025 -> 2, 69020 -> 1, 69031 -> 4, 69021 -> 1, 69033 -> 4, 69032 -> 4, 69024 -> 2, 69029 -> 4, 69026 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(69017, 69018, 69016), 1 -> HashSet(69021, 69022, 69020), 2 -> HashSet(69019, 69025, 69024), 3 -> HashSet(69028, 69027, 69026), 4 -> HashSet(69031, 69030, 69029, 69033, 69032))
  /* Beautified form:
  "GLOBAL.Number.isNaN" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (Type number)
    if (! (= __x1__ Number)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (= number NaN) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {
      app __x4__ = (WrapCompletion false)
      return __x4__
    }
  }
  */
}
