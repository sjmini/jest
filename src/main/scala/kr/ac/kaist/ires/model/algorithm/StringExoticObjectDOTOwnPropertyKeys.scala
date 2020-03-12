package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StringExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""StringExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""keys"""), EList(List())).setId(55040), ILet(Id("""str"""), ERef(RefProp(RefId(Id("""O""")), EStr("""StringData""")))).setId(55042), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))).setId(55045), IExpr(ENotSupported("""Etc""")).setId(55047), IExpr(ENotSupported("""Etc""")).setId(55047), IExpr(ENotSupported("""Etc""")).setId(55047), IExpr(ENotSupported("""Etc""")).setId(55047), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""keys"""))))).setId(55048), IReturn(ERef(RefId(Id("""__x0__""")))).setId(55049))).setId(55061))
  val instToStepMap: Map[Int, Int] = HashMap(55045 -> 3, 55048 -> 12, 55041 -> 0, 55044 -> 2, 55047 -> 11, 55043 -> 1, 55049 -> 12, 55050 -> 12, 55042 -> 1, 55046 -> 3, 55040 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(55041, 55040), 5 -> HashSet(55047), 1 -> HashSet(55043, 55042), 9 -> HashSet(55047), 2 -> HashSet(55044), 12 -> HashSet(55048, 55049, 55050), 7 -> HashSet(55047), 3 -> HashSet(55045, 55046), 11 -> HashSet(55047))
  /* Beautified form:
  "StringExoticObject.OwnPropertyKeys" (O) => {
    let keys = (new [])
    let str = O["StringData"]
    let len = str["length"]
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion keys)
    return __x0__
  }
  */
}
