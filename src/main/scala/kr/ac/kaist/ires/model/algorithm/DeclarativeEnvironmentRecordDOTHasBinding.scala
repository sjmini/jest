package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeclarativeEnvironmentRecordDOTHasBinding {
  val length: Int = 1
  val func: Func = Func("""DeclarativeEnvironmentRecord.HasBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47099), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N"""))))), EAbsent)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(47101), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47102))).setId(47114), ISeq(List()).setId(47115)).setId(47105), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47107), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47108))).setId(47119))
  val instToStepMap: Map[Int, Int] = HashMap(47109 -> 3, 47100 -> 0, 47103 -> 1, 47105 -> 2, 47108 -> 3, 47101 -> 1, 47107 -> 3, 47099 -> 0, 47102 -> 1, 47106 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47100, 47099), 1 -> HashSet(47103, 47101, 47102), 2 -> HashSet(47105, 47106), 3 -> HashSet(47109, 47108, 47107))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.HasBinding" (this, N) => {
    let envRec = this
    if (! (= envRec["SubMap"][N] absent)) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
