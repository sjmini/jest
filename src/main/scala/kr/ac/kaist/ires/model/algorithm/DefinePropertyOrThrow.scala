package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefinePropertyOrThrow {
  val length: Int = 3
  val func: Func = Func("""DefinePropertyOrThrow""", List(Id("""O"""), Id("""P"""), Id("""desc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""desc"""))))).setId(5201), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5202), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5203)).setId(5204), ISeq(List()).setId(5221)).setId(5205), ILet(Id("""success"""), ERef(RefId(Id("""__x0__""")))).setId(5206), IIf(EBOp(OEq, ERef(RefId(Id("""success"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(5208), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5209))).setId(5226), ISeq(List()).setId(5227)).setId(5211), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""success"""))))).setId(5213), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5214))).setId(5231))
  val instToStepMap: Map[Int, Int] = HashMap(5205 -> 2, 5214 -> 5, 5210 -> 3, 5206 -> 2, 5201 -> 2, 5213 -> 5, 5209 -> 3, 5207 -> 2, 5212 -> 4, 5208 -> 3, 5211 -> 4, 5215 -> 5, 5200 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(5200), 5 -> HashSet(5214, 5213, 5215), 1 -> HashSet(5200), 2 -> HashSet(5205, 5206, 5201, 5207), 3 -> HashSet(5210, 5209, 5208), 4 -> HashSet(5212, 5211))
  /* Beautified form:
  "DefinePropertyOrThrow" (O, P, desc) => {
    app __x0__ = (O["DefineOwnProperty"] O P desc)
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
