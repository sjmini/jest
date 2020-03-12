package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeletePropertyOrThrow {
  val length: Int = 2
  val func: Func = Func("""DeletePropertyOrThrow""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Delete"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(5248), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5249), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5250)).setId(5251), ISeq(List()).setId(5268)).setId(5252), ILet(Id("""success"""), ERef(RefId(Id("""__x0__""")))).setId(5253), IIf(EBOp(OEq, ERef(RefId(Id("""success"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(5255), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5256))).setId(5273), ISeq(List()).setId(5274)).setId(5258), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""success"""))))).setId(5260), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5261))).setId(5278))
  val instToStepMap: Map[Int, Int] = HashMap(5260 -> 5, 5257 -> 3, 5252 -> 2, 5256 -> 3, 5259 -> 4, 5253 -> 2, 5262 -> 5, 5258 -> 4, 5247 -> 1, 5254 -> 2, 5248 -> 2, 5261 -> 5, 5255 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(5247), 5 -> HashSet(5260, 5262, 5261), 1 -> HashSet(5247), 2 -> HashSet(5252, 5253, 5254, 5248), 3 -> HashSet(5257, 5256, 5255), 4 -> HashSet(5259, 5258))
  /* Beautified form:
  "DeletePropertyOrThrow" (O, P) => {
    app __x0__ = (O["Delete"] O P)
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
