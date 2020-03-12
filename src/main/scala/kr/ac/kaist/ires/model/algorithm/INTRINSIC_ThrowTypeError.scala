package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object INTRINSIC_ThrowTypeError {
  val length: Int = 0
  val func: Func = Func("""INTRINSIC_ThrowTypeError""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(52331), IReturn(ERef(RefId(Id("""__x0__""")))).setId(52332))).setId(52337))
  val instToStepMap: Map[Int, Int] = Map(52331 -> 0, 52332 -> 0, 52333 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(52331, 52332, 52333))
  /* Beautified form:
  "INTRINSIC_ThrowTypeError" () => {
    app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x0__
  }
  */
}
