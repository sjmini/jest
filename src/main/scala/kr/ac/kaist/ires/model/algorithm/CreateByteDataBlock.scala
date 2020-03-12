package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateByteDataBlock {
  val length: Int = 1
  val func: Func = Func("""CreateByteDataBlock""", List(Id("""size""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(1967), IExpr(ENotSupported("""Etc""")).setId(1967), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""db"""))))).setId(1968), IReturn(ERef(RefId(Id("""__x0__""")))).setId(1969))).setId(1976))
  val instToStepMap: Map[Int, Int] = HashMap(1967 -> 2, 1968 -> 3, 1970 -> 3, 1969 -> 3, 1966 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(1966), 1 -> HashSet(1967), 2 -> HashSet(1967), 3 -> HashSet(1968, 1970, 1969))
  /* Beautified form:
  "CreateByteDataBlock" (size) => {
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion db)
    return __x0__
  }
  */
}
