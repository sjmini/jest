package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsCallable {
  val length: Int = 1
  val func: Func = Func("""IsCallable""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))).setId(3426), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3427), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3428))).setId(3445), ISeq(List()).setId(3446)).setId(3431), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argument""")), EStr("""Call"""))), EAbsent)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3433), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3434))).setId(3450), ISeq(List()).setId(3451)).setId(3436), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3438), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3439))).setId(3455))
  val instToStepMap: Map[Int, Int] = HashMap(3434 -> 2, 3435 -> 2, 3440 -> 4, 3428 -> 0, 3436 -> 3, 3427 -> 0, 3433 -> 2, 3426 -> 1, 3439 -> 4, 3429 -> 0, 3431 -> 1, 3438 -> 4, 3437 -> 3, 3432 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(3429, 3428, 3427), 1 -> HashSet(3431, 3426, 3432), 2 -> HashSet(3434, 3435, 3433), 3 -> HashSet(3436, 3437), 4 -> HashSet(3439, 3438, 3440))
  /* Beautified form:
  "IsCallable" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (! (= argument["Call"] absent)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }
  */
}
