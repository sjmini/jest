package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IntegerIndexedExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""IntegerIndexedExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""keys"""), EList(List())).setId(57151), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))).setId(57154), IExpr(ENotSupported("""Etc""")).setId(57156), IExpr(ENotSupported("""Etc""")).setId(57156), IExpr(ENotSupported("""Etc""")).setId(57156), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""keys"""))))).setId(57157), IReturn(ERef(RefId(Id("""__x0__""")))).setId(57158))).setId(57168))
  val instToStepMap: Map[Int, Int] = HashMap(57153 -> 1, 57156 -> 8, 57155 -> 2, 57154 -> 2, 57158 -> 9, 57151 -> 0, 57157 -> 9, 57159 -> 9, 57152 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(57151, 57152), 1 -> HashSet(57153), 6 -> HashSet(57156), 9 -> HashSet(57157, 57159, 57158), 2 -> HashSet(57155, 57154), 8 -> HashSet(57156), 4 -> HashSet(57156))
  /* Beautified form:
  "IntegerIndexedExoticObject.OwnPropertyKeys" (O) => {
    let keys = (new [])
    let len = O["ArrayLength"]
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion keys)
    return __x0__
  }
  */
}
