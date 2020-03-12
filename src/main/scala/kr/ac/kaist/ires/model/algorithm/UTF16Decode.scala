package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UTF16Decode {
  val length: Int = 2
  val func: Func = Func("""UTF16Decode""", List(Id("""lead"""), Id("""trail""")), None, ISeq(List(ILet(Id("""cp"""), EBOp(OPlus, EBOp(OPlus, EBOp(OMul, EBOp(OSub, ERef(RefId(Id("""lead"""))), EINum(55296L)), EINum(1024L)), EBOp(OSub, ERef(RefId(Id("""trail"""))), EINum(56320L))), EINum(65536L))).setId(8893), IExpr(ENotSupported("""Etc""")).setId(8895))).setId(8899))
  val instToStepMap: Map[Int, Int] = Map(8892 -> 0, 8893 -> 1, 8894 -> 1, 8895 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(8892), 1 -> HashSet(8894, 8893), 2 -> HashSet(8895))
  /* Beautified form:
  "UTF16Decode" (lead, trail) => {
    let cp = (+ (+ (* (- lead 55296i) 1024i) (- trail 56320i)) 65536i)
    !!! "Etc"
  }
  */
}
