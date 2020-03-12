package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object HoistableDeclaration0DeclarationPart0 {
  val length: Int = 0
  val func: Func = Func("""HoistableDeclaration0DeclarationPart0""", List(Id("""this"""), Id("""FunctionDeclaration""")), None, IReturn(ERef(RefId(Id("""FunctionDeclaration""")))).setId(25799))
  val instToStepMap: Map[Int, Int] = Map(25799 -> 0, 25800 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25800, 25799))
  /* Beautified form:
  "HoistableDeclaration0DeclarationPart0" (this, FunctionDeclaration) => return FunctionDeclaration
  */
}
