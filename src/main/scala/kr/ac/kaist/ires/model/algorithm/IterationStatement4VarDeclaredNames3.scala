package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement4VarDeclaredNames3 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement4VarDeclaredNames3""", List(Id("""this"""), Id("""LexicalDeclaration"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(31085), IReturn(ERef(RefId(Id("""__x0__""")))).setId(31086))).setId(31091))
  val instToStepMap: Map[Int, Int] = Map(31085 -> 0, 31086 -> 0, 31087 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31087, 31086, 31085))
  /* Beautified form:
  "IterationStatement4VarDeclaredNames3" (this, LexicalDeclaration, Expression0, Expression1, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
