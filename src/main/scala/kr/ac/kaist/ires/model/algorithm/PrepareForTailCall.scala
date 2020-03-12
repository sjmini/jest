package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrepareForTailCall {
  val length: Int = 0
  val func: Func = Func("""PrepareForTailCall""", List(), None, ISeq(List(ILet(Id("""leafContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(46217), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(46219), IAssign(RefId(Id("""leafContext""")), ENull).setId(46220), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(46222), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""leafContext""")))), ISeq(List(IAssign(RefId(Id("""__x0__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(46223), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x0__"""))))).setId(46224))).setId(46237), ISeq(List()).setId(46238)).setId(46227))).setId(46240))
  val instToStepMap: Map[Int, Int] = HashMap(46222 -> 2, 46221 -> 1, 46217 -> 0, 46220 -> 1, 46229 -> 3, 46219 -> 1, 46227 -> 2, 46228 -> 2, 46218 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46218, 46217), 1 -> HashSet(46221, 46220, 46219), 2 -> HashSet(46228, 46222, 46227), 3 -> HashSet(46229))
  /* Beautified form:
  "PrepareForTailCall" () => {
    let leafContext = GLOBAL_context
    GLOBAL_context = null
    leafContext = null
    GLOBAL_context = null
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] leafContext) {
      __x0__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x0__)
    } else {}
  }
  */
}
