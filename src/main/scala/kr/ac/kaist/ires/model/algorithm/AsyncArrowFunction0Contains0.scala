package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowFunction0Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction0Contains0""", List(Id("""this"""), Id("""AsyncArrowBindingIdentifier"""), Id("""AsyncConciseBody"""), Id("""symbol""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """NewTarget"""), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperProperty""")), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperCall""")), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""super"""))), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""this""")))), IReturn(EBool(false)).setId(44145), ISeq(List()).setId(44156)).setId(44148), IAccess(Id("""__x0__"""), ERef(RefId(Id("""AsyncConciseBody"""))), EStr("""Contains""")).setId(44150), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(44151), IReturn(ERef(RefId(Id("""__x1__""")))).setId(44152))).setId(44161))
  val instToStepMap: Map[Int, Int] = HashMap(44148 -> 1, 44149 -> 1, 44151 -> 2, 44152 -> 2, 44153 -> 2, 44146 -> 0, 44150 -> 2, 44145 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44145, 44146), 1 -> HashSet(44148, 44149), 2 -> HashSet(44151, 44150, 44152, 44153))
  /* Beautified form:
  "AsyncArrowFunction0Contains0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody, symbol) => {
    if (! (|| (|| (|| (|| (is-instance-of symbol NewTarget) (is-instance-of symbol SuperProperty)) (is-instance-of symbol SuperCall)) (= symbol "super")) (= symbol "this"))) return false else {}
    access __x0__ = (AsyncConciseBody "Contains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }
  */
}
