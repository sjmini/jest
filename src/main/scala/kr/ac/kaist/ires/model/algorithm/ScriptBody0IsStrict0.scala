package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ScriptBody0IsStrict0 {
  val length: Int = 0
  val func: Func = Func("""ScriptBody0IsStrict0""", List(Id("""this"""), Id("""StatementList""")), None, IIf(EBool(true), IReturn(EBool(true)).setId(46251), IReturn(EBool(false)).setId(46253)).setId(46255))
  val instToStepMap: Map[Int, Int] = HashMap(46254 -> 0, 46253 -> 0, 46252 -> 0, 46256 -> 0, 46251 -> 0, 46255 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46254, 46253, 46252, 46256, 46251, 46255))
  /* Beautified form:
  "ScriptBody0IsStrict0" (this, StatementList) => if true return true else return false
  */
}
