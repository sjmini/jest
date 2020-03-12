package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object HoistableDeclaration3DeclarationPart0 {
  val length: Int = 0
  val func: Func = Func("""HoistableDeclaration3DeclarationPart0""", List(Id("""this"""), Id("""AsyncGeneratorDeclaration""")), None, IReturn(ERef(RefId(Id("""AsyncGeneratorDeclaration""")))).setId(25814))
  val instToStepMap: Map[Int, Int] = Map(25814 -> 0, 25815 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25815, 25814))
  /* Beautified form:
  "HoistableDeclaration3DeclarationPart0" (this, AsyncGeneratorDeclaration) => return AsyncGeneratorDeclaration
  */
}
