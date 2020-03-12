package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetActiveScriptOrModule {
  val length: Int = 0
  val func: Func = Func("""GetActiveScriptOrModule""", List(), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENull)).setId(8386), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8387))).setId(8408), ISeq(List()).setId(8409)).setId(8390), ILet(Id("""__x1__"""), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(8396), ILet(Id("""__x2__"""), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))).setId(8397), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""__x2__""")))), ISeq(List(IAssign(RefId(Id("""__x2__""")), EBOp(OSub, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(8398), ILet(Id("""ec"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(8399), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""ec""")), EStr("""ScriptOrModule"""))), ENull)), IReturn(ERef(RefProp(RefId(Id("""ec""")), EStr("""ScriptOrModule""")))).setId(8392), ISeq(List()).setId(8416)).setId(8394))).setId(8418)).setId(8401), IReturn(ENull).setId(8403))).setId(8421))
  val instToStepMap: Map[Int, Int] = HashMap(8402 -> 3, 8397 -> 3, 8390 -> 1, 8404 -> 3, 8387 -> 0, 8401 -> 3, 8388 -> 0, 8386 -> 0, 8403 -> 3, 8396 -> 3, 8391 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(8386, 8387, 8388), 1 -> HashSet(8390, 8391), 3 -> HashSet(8402, 8397, 8403, 8404, 8396, 8401))
  /* Beautified form:
  "GetActiveScriptOrModule" () => {
    if (= GLOBAL_executionStack["length"] 0i) {
      app __x0__ = (WrapCompletion null)
      return __x0__
    } else {}
    let __x1__ = GLOBAL_executionStack
    let __x2__ = __x1__["length"]
    while (< 0i __x2__) {
      __x2__ = (- __x2__ 1i)
      let ec = __x1__[__x2__]
      if (! (= ec["ScriptOrModule"] null)) return ec["ScriptOrModule"] else {}
    }
    return null
  }
  */
}
