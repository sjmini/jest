package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsConstructor {
  val length: Int = 1
  val func: Func = Func("""IsConstructor""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))).setId(3470), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3471), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3472))).setId(3489), ISeq(List()).setId(3490)).setId(3475), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argument""")), EStr("""Construct"""))), EAbsent)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3477), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3478))).setId(3494), ISeq(List()).setId(3495)).setId(3480), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3482), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3483))).setId(3499))
  val instToStepMap: Map[Int, Int] = HashMap(3477 -> 2, 3481 -> 3, 3470 -> 1, 3473 -> 0, 3471 -> 0, 3482 -> 4, 3476 -> 1, 3472 -> 0, 3483 -> 4, 3480 -> 3, 3475 -> 1, 3478 -> 2, 3484 -> 4, 3479 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(3473, 3471, 3472), 1 -> HashSet(3470, 3476, 3475), 2 -> HashSet(3477, 3478, 3479), 3 -> HashSet(3481, 3480), 4 -> HashSet(3482, 3483, 3484))
  /* Beautified form:
  "IsConstructor" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (! (= argument["Construct"] absent)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }
  */
}
