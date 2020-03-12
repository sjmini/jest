package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionCreate {
  val length: Int = 4
  val func: Func = Func("""FunctionCreate""", List(Id("""kind"""), Id("""ParameterList"""), Id("""Body"""), Id("""Scope"""), Id("""prototype""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""prototype"""))), EAbsent), IAssign(RefId(Id("""prototype""")), ERef(RefId(Id("""INTRINSIC_FunctionPrototype""")))).setId(52104), ISeq(List()).setId(52125)).setId(52108), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""CONST_Normal"""))))), ILet(Id("""allocKind"""), EStr("""non-constructor""")).setId(52110), ILet(Id("""allocKind"""), EStr("""normal""")).setId(52112)).setId(52114), IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionAllocate"""))), List(ERef(RefId(Id("""prototype"""))), ERef(RefId(Id("""allocKind"""))))).setId(52116), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))).setId(52117), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionInitialize"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""ParameterList"""))), ERef(RefId(Id("""Body"""))), ERef(RefId(Id("""Scope"""))))).setId(52119), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(52120), IReturn(ERef(RefId(Id("""__x2__""")))).setId(52121))).setId(52135))
  val instToStepMap: Map[Int, Int] = HashMap(52120 -> 7, 52113 -> 5, 52108 -> 3, 52121 -> 7, 52104 -> 2, 52111 -> 4, 52118 -> 6, 52110 -> 4, 52114 -> 5, 52109 -> 3, 52119 -> 7, 52116 -> 6, 52122 -> 7, 52105 -> 2, 52117 -> 6, 52112 -> 5, 52106 -> 2, 52115 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(52113, 52112, 52115, 52114), 6 -> HashSet(52117, 52118, 52116), 2 -> HashSet(52104, 52106, 52105), 7 -> HashSet(52120, 52121, 52119, 52122), 3 -> HashSet(52108, 52109), 4 -> HashSet(52111, 52110))
  /* Beautified form:
  "FunctionCreate" (kind, ParameterList, Body, Scope, prototype) => {
    if (= prototype absent) prototype = INTRINSIC_FunctionPrototype else {}
    if (! (= kind CONST_Normal)) let allocKind = "non-constructor" else let allocKind = "normal"
    app __x0__ = (FunctionAllocate prototype allocKind)
    let F = __x0__
    app __x1__ = (FunctionInitialize F kind ParameterList Body Scope)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
