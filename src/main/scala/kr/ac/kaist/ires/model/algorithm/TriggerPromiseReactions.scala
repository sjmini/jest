package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TriggerPromiseReactions {
  val length: Int = 2
  val func: Func = Func("""TriggerPromiseReactions""", List(Id("""reactions"""), Id("""argument""")), None, ISeq(List(ILet(Id("""__x0__"""), ERef(RefId(Id("""reactions""")))).setId(12454), ILet(Id("""__x1__"""), EINum(0L)).setId(12455), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""reaction"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))).setId(12456), IApp(Id("""__x2__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""reaction"""))), ERef(RefId(Id("""argument"""))))))).setId(12450), IExpr(ERef(RefId(Id("""__x2__""")))).setId(12451), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L))).setId(12457))).setId(12472)).setId(12459), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(12462), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12463))).setId(12476))
  val instToStepMap: Map[Int, Int] = HashMap(12462 -> 3, 12453 -> 2, 12454 -> 2, 12451 -> 2, 12464 -> 3, 12460 -> 2, 12455 -> 2, 12452 -> 2, 12463 -> 3, 12459 -> 2, 12461 -> 2, 12450 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(12453, 12454, 12451, 12460, 12455, 12452, 12459, 12461, 12450), 3 -> HashSet(12462, 12464, 12463))
  /* Beautified form:
  "TriggerPromiseReactions" (reactions, argument) => {
    let __x0__ = reactions
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let reaction = __x0__[__x1__]
      app __x2__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [reaction, argument]))
      __x2__
      __x1__ = (+ __x1__ 1i)
    }
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }
  */
}
