package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UTF16Encoding {
  val length: Int = 1
  val func: Func = Func("""UTF16Encoding""", List(Id("""cp""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OLt, EINum(65535L), ERef(RefId(Id("""cp"""))))), IReturn(ERef(RefId(Id("""cp""")))).setId(8865), ISeq(List()).setId(8877)).setId(8867), IApp(Id("""__x0__"""), ERef(RefId(Id("""floor"""))), List(EBOp(ODiv, EBOp(OSub, ERef(RefId(Id("""cp"""))), EINum(65536L)), EINum(1024L)))).setId(8869), ILet(Id("""cu1"""), EBOp(OPlus, ERef(RefId(Id("""__x0__"""))), EINum(55296L))).setId(8870), ILet(Id("""cu2"""), EBOp(OPlus, EBOp(OUMod, EBOp(OSub, ERef(RefId(Id("""cp"""))), EINum(65536L)), EINum(1024L)), EINum(56320L))).setId(8872), IExpr(ENotSupported("""Etc""")).setId(8874))).setId(8883))
  val instToStepMap: Map[Int, Int] = HashMap(8866 -> 1, 8870 -> 3, 8867 -> 2, 8864 -> 0, 8871 -> 3, 8874 -> 5, 8872 -> 4, 8868 -> 2, 8873 -> 4, 8865 -> 1, 8869 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(8864), 5 -> HashSet(8874), 1 -> HashSet(8866, 8865), 2 -> HashSet(8867, 8868), 3 -> HashSet(8870, 8871, 8869), 4 -> HashSet(8872, 8873))
  /* Beautified form:
  "UTF16Encoding" (cp) => {
    if (! (< 65535i cp)) return cp else {}
    app __x0__ = (floor (/ (- cp 65536i) 1024i))
    let cu1 = (+ __x0__ 55296i)
    let cu2 = (+ (%% (- cp 65536i) 1024i) 56320i)
    !!! "Etc"
  }
  */
}
