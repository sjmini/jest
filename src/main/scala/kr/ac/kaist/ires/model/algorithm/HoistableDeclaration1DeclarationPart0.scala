package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object HoistableDeclaration1DeclarationPart0 {
  val length: Int = 0
  val func: Func = Func("""HoistableDeclaration1DeclarationPart0""", List(Id("""this"""), Id("""GeneratorDeclaration""")), None, IReturn(ERef(RefId(Id("""GeneratorDeclaration""")))).setId(25804))
  val instToStepMap: Map[Int, Int] = Map(25804 -> 0, 25805 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25805, 25804))
  /* Beautified form:
  "HoistableDeclaration1DeclarationPart0" (this, GeneratorDeclaration) => return GeneratorDeclaration
  */
}
