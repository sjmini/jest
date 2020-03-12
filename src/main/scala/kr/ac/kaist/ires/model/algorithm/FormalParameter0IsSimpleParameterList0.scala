package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameter0IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameter0IsSimpleParameterList0""", List(Id("""this"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""IsSimpleParameterList""")).setId(38060), IReturn(ERef(RefId(Id("""__x0__""")))).setId(38061))).setId(38066))
  val instToStepMap: Map[Int, Int] = Map(38060 -> 0, 38061 -> 0, 38062 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38062, 38061, 38060))
  /* Beautified form:
  "FormalParameter0IsSimpleParameterList0" (this, BindingElement) => {
    access __x0__ = (BindingElement "IsSimpleParameterList")
    return __x0__
  }
  */
}
