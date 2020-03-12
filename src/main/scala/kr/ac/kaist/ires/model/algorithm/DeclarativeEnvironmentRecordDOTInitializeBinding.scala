package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeclarativeEnvironmentRecordDOTInitializeBinding {
  val length: Int = 2
  val func: Func = Func("""DeclarativeEnvironmentRecord.InitializeBinding""", List(Id("""this"""), Id("""N"""), Id("""V""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47171), IAssign(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""BoundValue""")), ERef(RefId(Id("""V""")))).setId(47174), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N"""))))), EAbsent)), IAssign(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized""")), EBool(true)).setId(47176), ISeq(List()).setId(47187)).setId(47178), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(47179), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(47180), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47181))).setId(47192))
  val instToStepMap: Map[Int, Int] = HashMap(47173 -> 1, 47172 -> 0, 47182 -> 4, 47171 -> 0, 47175 -> 2, 47178 -> 3, 47174 -> 2, 47179 -> 4, 47181 -> 4, 47180 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(47172, 47171), 1 -> HashSet(47173), 2 -> HashSet(47175, 47174), 3 -> HashSet(47178), 4 -> HashSet(47182, 47179, 47181, 47180))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.InitializeBinding" (this, N, V) => {
    let envRec = this
    envRec["SubMap"][N]["BoundValue"] = V
    if (! (= envRec["SubMap"][N] absent)) envRec["SubMap"][N]["initialized"] = true else {}
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
