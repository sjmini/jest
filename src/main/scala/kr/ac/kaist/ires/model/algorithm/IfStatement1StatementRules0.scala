package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement1StatementRules0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement0"""), Id("""Statement1""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement0"""))), EStr("""HasCallInTailPosition""")).setId(44925), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(44926), ILet(Id("""has"""), ERef(RefId(Id("""__x1__""")))).setId(44927), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(44929), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44930))).setId(44946), ISeq(List()).setId(44947)).setId(44933), IAccess(Id("""__x3__"""), ERef(RefId(Id("""Statement1"""))), EStr("""HasCallInTailPosition""")).setId(44935), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""call"""))))).setId(44936), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(44937), IReturn(ERef(RefId(Id("""__x5__""")))).setId(44938))).setId(44953))
  val instToStepMap: Map[Int, Int] = HashMap(44935 -> 3, 44938 -> 3, 44939 -> 3, 44930 -> 1, 44929 -> 1, 44927 -> 0, 44937 -> 3, 44936 -> 3, 44928 -> 0, 44931 -> 1, 44934 -> 2, 44925 -> 0, 44926 -> 0, 44933 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44928, 44925, 44926, 44927), 1 -> HashSet(44931, 44930, 44929), 2 -> HashSet(44934, 44933), 3 -> HashSet(44935, 44938, 44939, 44937, 44936))
  /* Beautified form:
  "IfStatement1StatementRules0" (this, Expression, Statement0, Statement1) => {
    access __x0__ = (Statement0 "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    let has = __x1__
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (Statement1 "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
