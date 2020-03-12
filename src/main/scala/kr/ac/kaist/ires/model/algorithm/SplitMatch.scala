package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SplitMatch {
  val length: Int = 3
  val func: Func = Func("""SplitMatch""", List(Id("""S"""), Id("""q"""), Id("""R""")), None, ISeq(List(ILet(Id("""r"""), ERef(RefProp(RefId(Id("""R""")), EStr("""length""")))).setId(73802), ILet(Id("""s"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(73804), IIf(EBOp(OLt, ERef(RefId(Id("""s"""))), EBOp(OPlus, ERef(RefId(Id("""q"""))), ERef(RefId(Id("""r"""))))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(73806), IReturn(ERef(RefId(Id("""__x0__""")))).setId(73807))).setId(73820), ISeq(List()).setId(73821)).setId(73809), IExpr(ENotSupported("""NumberOp""")).setId(73811), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""q"""))), ERef(RefId(Id("""r""")))))).setId(73812), IReturn(ERef(RefId(Id("""__x1__""")))).setId(73813))).setId(73826))
  val instToStepMap: Map[Int, Int] = HashMap(73804 -> 2, 73801 -> 0, 73805 -> 2, 73802 -> 1, 73812 -> 6, 73806 -> 3, 73814 -> 6, 73811 -> 5, 73803 -> 1, 73807 -> 3, 73813 -> 6, 73810 -> 4, 73809 -> 4, 73808 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(73801), 5 -> HashSet(73811), 1 -> HashSet(73802, 73803), 6 -> HashSet(73813, 73812, 73814), 2 -> HashSet(73804, 73805), 3 -> HashSet(73808, 73806, 73807), 4 -> HashSet(73810, 73809))
  /* Beautified form:
  "SplitMatch" (S, q, R) => {
    let r = R["length"]
    let s = S["length"]
    if (< s (+ q r)) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    !!! "NumberOp"
    app __x1__ = (WrapCompletion (+ q r))
    return __x1__
  }
  */
}
