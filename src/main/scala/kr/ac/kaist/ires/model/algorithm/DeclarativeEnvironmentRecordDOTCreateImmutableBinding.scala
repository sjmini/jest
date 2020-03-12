package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeclarativeEnvironmentRecordDOTCreateImmutableBinding {
  val length: Int = 2
  val func: Func = Func("""DeclarativeEnvironmentRecord.CreateImmutableBinding""", List(Id("""this"""), Id("""N"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47150), IAssign(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EMap(Ty("""ImmutableBinding"""), List((EStr("""initialized"""), EBool(false)), (EStr("""strict"""), ERef(RefId(Id("""S"""))))))).setId(47153), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(47154), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(47155), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47156))).setId(47164))
  val instToStepMap: Map[Int, Int] = HashMap(47156 -> 3, 47155 -> 3, 47150 -> 0, 47154 -> 3, 47151 -> 0, 47157 -> 3, 47152 -> 1, 47153 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47150, 47151), 1 -> HashSet(47152), 2 -> HashSet(47153), 3 -> HashSet(47156, 47155, 47154, 47157))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.CreateImmutableBinding" (this, N, S) => {
    let envRec = this
    envRec["SubMap"][N] = (new ImmutableBinding("initialized" -> false, "strict" -> S))
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
