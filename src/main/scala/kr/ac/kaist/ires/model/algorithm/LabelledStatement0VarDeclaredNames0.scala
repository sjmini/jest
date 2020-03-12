package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledStatement0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0VarDeclaredNames0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""VarDeclaredNames""")).setId(36449), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36450))).setId(36455))
  val instToStepMap: Map[Int, Int] = Map(36449 -> 0, 36450 -> 0, 36451 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36451, 36449, 36450))
  /* Beautified form:
  "LabelledStatement0VarDeclaredNames0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "VarDeclaredNames")
    return __x0__
  }
  */
}
