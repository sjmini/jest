package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsPromise {
  val length: Int = 1
  val func: Func = Func("""IsPromise""", List(Id("""x""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(12357), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(12358), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12359))).setId(12376), ISeq(List()).setId(12377)).setId(12362), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""x""")), EStr("""PromiseState"""))), EAbsent), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(12364), IReturn(ERef(RefId(Id("""__x2__""")))).setId(12365))).setId(12381), ISeq(List()).setId(12382)).setId(12367), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(12369), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12370))).setId(12386))
  val instToStepMap: Map[Int, Int] = HashMap(12366 -> 2, 12371 -> 4, 12362 -> 1, 12365 -> 2, 12357 -> 1, 12369 -> 4, 12358 -> 0, 12368 -> 3, 12364 -> 2, 12360 -> 0, 12370 -> 4, 12367 -> 3, 12363 -> 1, 12359 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12358, 12360, 12359), 1 -> HashSet(12362, 12357, 12363), 2 -> HashSet(12366, 12365, 12364), 3 -> HashSet(12368, 12367), 4 -> HashSet(12371, 12369, 12370))
  /* Beautified form:
  "IsPromise" (x) => {
    app __x0__ = (Type x)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= x["PromiseState"] absent) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion true)
    return __x3__
  }
  */
}
