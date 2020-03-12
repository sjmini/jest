package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Arguments0ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""Arguments0ArgumentListEvaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List()))).setId(17986), IReturn(ERef(RefId(Id("""__x0__""")))).setId(17987))).setId(17992))
  val instToStepMap: Map[Int, Int] = Map(17986 -> 0, 17987 -> 0, 17988 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(17986, 17988, 17987))
  /* Beautified form:
  "Arguments0ArgumentListEvaluation0" (this) => {
    app __x0__ = (WrapCompletion (new []))
    return __x0__
  }
  */
}
