package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleNamespaceExoticObjectDOTPreventExtensions {
  val length: Int = 0
  val func: Func = Func("""ModuleNamespaceExoticObject.PreventExtensions""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(57596), IReturn(ERef(RefId(Id("""__x0__""")))).setId(57597))).setId(57602))
  val instToStepMap: Map[Int, Int] = Map(57596 -> 0, 57597 -> 0, 57598 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(57596, 57597, 57598))
  /* Beautified form:
  "ModuleNamespaceExoticObject.PreventExtensions" (O) => {
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
