package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Script0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""Script0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(46304), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(46305), IReturn(ERef(RefId(Id("""__x1__""")))).setId(46306))).setId(46312))
  val instToStepMap: Map[Int, Int] = Map(46304 -> 0, 46305 -> 0, 46306 -> 0, 46307 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46305, 46307, 46306, 46304))
  /* Beautified form:
  "Script0Evaluation0" (this) => {
    app __x0__ = (NormalCompletion undefined)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
