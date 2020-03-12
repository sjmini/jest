package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSymbolDOTkeyFor {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Symbol.keyFor""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67682), ILet(Id("""sym"""), ERef(RefId(Id("""__x0__""")))).setId(67683), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""sym"""))))).setId(67685), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Symbol"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(67686), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67687))).setId(67702), ISeq(List()).setId(67703)).setId(67690), IExpr(ENotSupported("""Etc""")).setId(67692), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(67693), IReturn(ERef(RefId(Id("""__x3__""")))).setId(67694))).setId(67708))
  val instToStepMap: Map[Int, Int] = HashMap(67695 -> 6, 67691 -> 2, 67688 -> 1, 67690 -> 2, 67692 -> 4, 67687 -> 1, 67684 -> 0, 67683 -> 0, 67693 -> 6, 67686 -> 1, 67694 -> 6, 67682 -> 0, 67685 -> 2, 67689 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(67684, 67683, 67682), 5 -> HashSet(67689), 1 -> HashSet(67688, 67687, 67686), 6 -> HashSet(67695, 67693, 67694), 2 -> HashSet(67691, 67690, 67685), 4 -> HashSet(67692))
  /* Beautified form:
  "GLOBAL.Symbol.keyFor" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let sym = __x0__
    app __x1__ = (Type sym)
    if (! (= __x1__ Symbol)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    !!! "Etc"
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }
  */
}
