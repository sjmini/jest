package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTis {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Object.is""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(64993), ILet(Id("""value1"""), ERef(RefId(Id("""__x0__""")))).setId(64994), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(64996), ILet(Id("""value2"""), ERef(RefId(Id("""__x1__""")))).setId(64997), IApp(Id("""__x2__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""value1"""))), ERef(RefId(Id("""value2"""))))).setId(64999), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(65000), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65001))).setId(65011))
  val instToStepMap: Map[Int, Int] = HashMap(64995 -> 0, 64999 -> 2, 64996 -> 1, 65000 -> 2, 65002 -> 2, 64997 -> 1, 64993 -> 0, 65001 -> 2, 64998 -> 1, 64994 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(64995, 64993, 64994), 1 -> HashSet(64996, 64997, 64998), 2 -> HashSet(64999, 65000, 65002, 65001))
  /* Beautified form:
  "GLOBAL.Object.is" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value1 = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value2 = __x1__
    app __x2__ = (SameValue value1 value2)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
