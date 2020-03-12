package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleNamespaceExoticObjectDOTSet {
  val length: Int = 3
  val func: Func = Func("""ModuleNamespaceExoticObject.Set""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(58013), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58014))).setId(58019))
  val instToStepMap: Map[Int, Int] = Map(58013 -> 0, 58014 -> 0, 58015 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(58013, 58014, 58015))
  /* Beautified form:
  "ModuleNamespaceExoticObject.Set" (O, P, V, Receiver) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
