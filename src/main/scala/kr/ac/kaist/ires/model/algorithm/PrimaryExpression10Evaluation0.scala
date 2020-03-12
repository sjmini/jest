package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression10Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression10Evaluation0""", List(Id("""this"""), Id("""RegularExpressionLiteral""")), None, ISeq(List(ILet(Id("""pattern"""), ENotSupported("""StringOp""")).setId(15088), ILet(Id("""flags"""), ENotSupported("""StringOp""")).setId(15090), IApp(Id("""__x0__"""), ERef(RefId(Id("""RegExpCreate"""))), List(ERef(RefId(Id("""pattern"""))), ERef(RefId(Id("""flags"""))))).setId(15092), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(15093), IReturn(ERef(RefId(Id("""__x1__""")))).setId(15094))).setId(15102))
  val instToStepMap: Map[Int, Int] = HashMap(15092 -> 2, 15093 -> 2, 15089 -> 0, 15094 -> 2, 15090 -> 1, 15095 -> 2, 15088 -> 0, 15091 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(15089, 15088), 1 -> HashSet(15090, 15091), 2 -> HashSet(15092, 15093, 15094, 15095))
  /* Beautified form:
  "PrimaryExpression10Evaluation0" (this, RegularExpressionLiteral) => {
    let pattern = !!! "StringOp"
    let flags = !!! "StringOp"
    app __x0__ = (RegExpCreate pattern flags)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
