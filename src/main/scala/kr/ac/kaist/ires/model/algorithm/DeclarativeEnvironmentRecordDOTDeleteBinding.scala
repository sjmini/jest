package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeclarativeEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = Func("""DeclarativeEnvironmentRecord.DeleteBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47344), IExpr(ENotSupported("""Etc""")).setId(47347), IExpr(ENotSupported("""Etc""")).setId(47347), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(47348), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47349))).setId(47357))
  val instToStepMap: Map[Int, Int] = HashMap(47344 -> 0, 47345 -> 0, 47350 -> 4, 47346 -> 1, 47347 -> 3, 47348 -> 4, 47349 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(47344, 47345), 1 -> HashSet(47346), 2 -> HashSet(47347), 3 -> HashSet(47347), 4 -> HashSet(47350, 47348, 47349))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
