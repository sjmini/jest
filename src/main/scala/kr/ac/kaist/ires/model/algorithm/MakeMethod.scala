package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MakeMethod {
  val length: Int = 2
  val func: Func = Func("""MakeMethod""", List(Id("""F"""), Id("""homeObject""")), None, ISeq(List(IAssign(RefProp(RefId(Id("""F""")), EStr("""HomeObject""")), ERef(RefId(Id("""homeObject""")))).setId(52442), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(52444), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(52445), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52446))).setId(52453))
  val instToStepMap: Map[Int, Int] = HashMap(52441 -> 1, 52442 -> 2, 52446 -> 3, 52447 -> 3, 52443 -> 2, 52444 -> 3, 52445 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(52441), 1 -> HashSet(52441), 2 -> HashSet(52442, 52443), 3 -> HashSet(52446, 52447, 52444, 52445))
  /* Beautified form:
  "MakeMethod" (F, homeObject) => {
    F["HomeObject"] = homeObject
    app __x0__ = (NormalCompletion undefined)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
