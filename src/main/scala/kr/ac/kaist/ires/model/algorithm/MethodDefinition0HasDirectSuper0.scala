package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition0HasDirectSuper0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition0HasDirectSuper0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UniqueFormalParameters"""))), EStr("""Contains""")).setId(39488), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EStr("""SuperCall"""))).setId(39489), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)).setId(39490), ISeq(List()).setId(39503)).setId(39493), IAccess(Id("""__x2__"""), ERef(RefId(Id("""FunctionBody"""))), EStr("""Contains""")).setId(39495), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(EStr("""SuperCall"""))).setId(39496), IReturn(ERef(RefId(Id("""__x3__""")))).setId(39497))).setId(39508))
  val instToStepMap: Map[Int, Int] = HashMap(39488 -> 1, 39496 -> 2, 39491 -> 0, 39495 -> 2, 39490 -> 0, 39497 -> 2, 39489 -> 1, 39494 -> 1, 39493 -> 1, 39498 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39491, 39490), 1 -> HashSet(39488, 39493, 39489, 39494), 2 -> HashSet(39496, 39495, 39497, 39498))
  /* Beautified form:
  "MethodDefinition0HasDirectSuper0" (this, PropertyName, UniqueFormalParameters, FunctionBody) => {
    access __x0__ = (UniqueFormalParameters "Contains")
    app __x1__ = (__x0__ "SuperCall")
    if (= __x1__ true) return true else {}
    access __x2__ = (FunctionBody "Contains")
    app __x3__ = (__x2__ "SuperCall")
    return __x3__
  }
  */
}
