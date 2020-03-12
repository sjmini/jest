package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassExpression0HasName0 {
  val length: Int = 0
  val func: Func = Func("""ClassExpression0HasName0""", List(Id("""this"""), Id("""ClassTail""")), None, IReturn(EBool(false)).setId(42454))
  val instToStepMap: Map[Int, Int] = Map(42454 -> 0, 42455 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42455, 42454))
  /* Beautified form:
  "ClassExpression0HasName0" (this, ClassTail) => return false
  */
}
