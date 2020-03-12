package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression0IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression0IsDestructuring0""", List(Id("""this"""), Id("""PrimaryExpression""")), None, ISeq(List(IIf(EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""PrimaryExpression"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""PrimaryExpression"""))), """ArrayLiteral""")), IReturn(EBool(true)).setId(16356), ISeq(List()).setId(16365)).setId(16359), IReturn(EBool(false)).setId(16361))).setId(16368))
  val instToStepMap: Map[Int, Int] = HashMap(16357 -> 0, 16356 -> 0, 16360 -> 1, 16361 -> 2, 16359 -> 1, 16362 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16357, 16356), 1 -> HashSet(16360, 16359), 2 -> HashSet(16361, 16362))
  /* Beautified form:
  "MemberExpression0IsDestructuring0" (this, PrimaryExpression) => {
    if (|| (is-instance-of PrimaryExpression ObjectLiteral) (is-instance-of PrimaryExpression ArrayLiteral)) return true else {}
    return false
  }
  */
}
