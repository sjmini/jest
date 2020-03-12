package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTIsPromise {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.IsPromise""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91236), ILet(Id("""x"""), ERef(RefId(Id("""__x0__""")))).setId(91237), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(91239), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(91240), IReturn(ERef(RefId(Id("""__x2__""")))).setId(91241))).setId(91260), ISeq(List()).setId(91261)).setId(91244), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""x""")), EStr("""PromiseState"""))), EAbsent), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(91246), IReturn(ERef(RefId(Id("""__x3__""")))).setId(91247))).setId(91265), ISeq(List()).setId(91266)).setId(91249), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(91251), IReturn(ERef(RefId(Id("""__x4__""")))).setId(91252))).setId(91270))
  val instToStepMap: Map[Int, Int] = HashMap(91248 -> 3, 91249 -> 4, 91239 -> 2, 91247 -> 3, 91250 -> 4, 91236 -> 0, 91246 -> 3, 91242 -> 1, 91237 -> 0, 91252 -> 5, 91245 -> 2, 91253 -> 5, 91238 -> 0, 91240 -> 1, 91251 -> 5, 91244 -> 2, 91241 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(91236, 91237, 91238), 5 -> HashSet(91251, 91252, 91253), 1 -> HashSet(91240, 91242, 91241), 2 -> HashSet(91239, 91245, 91244), 3 -> HashSet(91248, 91247, 91246), 4 -> HashSet(91249, 91250))
  /* Beautified form:
  "GLOBAL.IsPromise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let x = __x0__
    app __x1__ = (Type x)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (= x["PromiseState"] absent) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion true)
    return __x4__
  }
  */
}
