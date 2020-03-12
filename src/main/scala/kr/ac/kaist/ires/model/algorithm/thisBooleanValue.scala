package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object thisBooleanValue {
  val length: Int = 0
  val func: Func = Func("""thisBooleanValue""", List(Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(67443), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Boolean""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(67444), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67445))).setId(67466), ISeq(List()).setId(67467)).setId(67448), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(67450), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""BooleanData"""))), EAbsent))), ISeq(List(ILet(Id("""b"""), ERef(RefProp(RefId(Id("""value""")), EStr("""BooleanData""")))).setId(67451), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""b"""))))).setId(67453), IReturn(ERef(RefId(Id("""__x3__""")))).setId(67454))).setId(67473), ISeq(List()).setId(67474)).setId(67457), IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(67459), IReturn(ERef(RefId(Id("""__x4__""")))).setId(67460))).setId(67478))
  val instToStepMap: Map[Int, Int] = HashMap(67451 -> 6, 67460 -> 8, 67447 -> 6, 67455 -> 6, 67457 -> 7, 67449 -> 1, 67448 -> 1, 67444 -> 0, 67445 -> 0, 67459 -> 8, 67453 -> 6, 67446 -> 0, 67452 -> 6, 67443 -> 1, 67450 -> 7, 67454 -> 6, 67458 -> 7, 67456 -> 6, 67461 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(67446, 67444, 67445), 5 -> HashSet(67447), 1 -> HashSet(67443, 67449, 67448), 6 -> HashSet(67452, 67451, 67447, 67455, 67454, 67456, 67453), 7 -> HashSet(67450, 67457, 67458), 8 -> HashSet(67460, 67461, 67459), 4 -> HashSet(67452, 67451))
  /* Beautified form:
  "thisBooleanValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ Boolean) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["BooleanData"] absent))) {
      let b = value["BooleanData"]
      app __x3__ = (WrapCompletion b)
      return __x3__
    } else {}
    app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x4__
  }
  */
}
