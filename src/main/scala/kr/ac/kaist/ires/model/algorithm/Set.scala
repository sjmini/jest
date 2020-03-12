package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Set {
  val length: Int = 4
  val func: Func = Func("""Set""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Throw""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""O"""))))).setId(5043), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5044), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5045)).setId(5046), ISeq(List()).setId(5063)).setId(5047), ILet(Id("""success"""), ERef(RefId(Id("""__x0__""")))).setId(5048), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""success"""))), EBool(false)), EBOp(OEq, ERef(RefId(Id("""Throw"""))), EBool(true))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(5050), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5051))).setId(5068), ISeq(List()).setId(5069)).setId(5053), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""success"""))))).setId(5055), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5056))).setId(5073))
  val instToStepMap: Map[Int, Int] = HashMap(5056 -> 6, 5052 -> 4, 5049 -> 3, 5053 -> 5, 5050 -> 4, 5054 -> 5, 5047 -> 3, 5055 -> 6, 5051 -> 4, 5048 -> 3, 5043 -> 3, 5057 -> 6, 5042 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(5042), 5 -> HashSet(5053, 5054), 1 -> HashSet(5042), 6 -> HashSet(5056, 5057, 5055), 2 -> HashSet(5042), 3 -> HashSet(5049, 5047, 5048, 5043), 4 -> HashSet(5052, 5050, 5051))
  /* Beautified form:
  "Set" (O, P, V, Throw) => {
    app __x0__ = (O["Set"] O P V O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let success = __x0__
    if (&& (= success false) (= Throw true)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion success)
    return __x2__
  }
  */
}
