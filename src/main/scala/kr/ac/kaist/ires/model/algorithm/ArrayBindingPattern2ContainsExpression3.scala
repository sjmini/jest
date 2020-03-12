package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern2ContainsExpression3 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern2ContainsExpression3""", List(Id("""this"""), Id("""BindingElementList"""), Id("""Elision"""), Id("""BindingRestElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""ContainsExpression""")).setId(28007), ILet(Id("""has"""), ERef(RefId(Id("""__x0__""")))).setId(28008), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), IReturn(EBool(true)).setId(28010), ISeq(List()).setId(28022)).setId(28013), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""ContainsExpression""")).setId(28015), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28016))).setId(28026))
  val instToStepMap: Map[Int, Int] = HashMap(28009 -> 0, 28016 -> 3, 28015 -> 3, 28011 -> 1, 28017 -> 3, 28010 -> 1, 28013 -> 2, 28008 -> 0, 28007 -> 0, 28014 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28008, 28009, 28007), 1 -> HashSet(28011, 28010), 2 -> HashSet(28013, 28014), 3 -> HashSet(28016, 28015, 28017))
  /* Beautified form:
  "ArrayBindingPattern2ContainsExpression3" (this, BindingElementList, Elision, BindingRestElement) => {
    access __x0__ = (BindingElementList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingRestElement "ContainsExpression")
    return __x1__
  }
  */
}
