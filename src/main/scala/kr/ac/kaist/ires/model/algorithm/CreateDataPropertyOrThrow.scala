package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateDataPropertyOrThrow {
  val length: Int = 3
  val func: Func = Func("""CreateDataPropertyOrThrow""", List(Id("""O"""), Id("""P"""), Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))))).setId(5154), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5155), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5156)).setId(5157), ISeq(List()).setId(5174)).setId(5158), ILet(Id("""success"""), ERef(RefId(Id("""__x0__""")))).setId(5159), IIf(EBOp(OEq, ERef(RefId(Id("""success"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(5161), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5162))).setId(5179), ISeq(List()).setId(5180)).setId(5164), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""success"""))))).setId(5166), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5167))).setId(5184))
  val instToStepMap: Map[Int, Int] = HashMap(5168 -> 5, 5160 -> 2, 5167 -> 5, 5166 -> 5, 5153 -> 1, 5158 -> 2, 5165 -> 4, 5154 -> 2, 5159 -> 2, 5163 -> 3, 5161 -> 3, 5164 -> 4, 5162 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(5153), 5 -> HashSet(5168, 5167, 5166), 1 -> HashSet(5153), 2 -> HashSet(5160, 5158, 5154, 5159), 3 -> HashSet(5162, 5163, 5161), 4 -> HashSet(5165, 5164))
  /* Beautified form:
  "CreateDataPropertyOrThrow" (O, P, V) => {
    app __x0__ = (CreateDataProperty O P V)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let success = __x0__
    if (= success false) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion success)
    return __x2__
  }
  */
}
