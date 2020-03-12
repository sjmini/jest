package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem1LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1LexicallyDeclaredNames0""", List(Id("""this"""), Id("""FunctionDeclaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FunctionDeclaration"""))), EStr("""BoundNames""")).setId(36316), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36317))).setId(36322))
  val instToStepMap: Map[Int, Int] = Map(36316 -> 0, 36317 -> 0, 36318 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36316, 36317, 36318))
  /* Beautified form:
  "LabelledItem1LexicallyDeclaredNames0" (this, FunctionDeclaration) => {
    access __x0__ = (FunctionDeclaration "BoundNames")
    return __x0__
  }
  */
}
