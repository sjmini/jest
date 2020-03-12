package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0Evaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(38547), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(38548), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(38550), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(38551), IApp(Id("""__x2__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""closure"""))))).setId(38553), IExpr(ERef(RefId(Id("""__x2__""")))).setId(38554), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(38556), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(38558), IReturn(ERef(RefId(Id("""__x3__""")))).setId(38559))).setId(38571))
  val instToStepMap: Map[Int, Int] = HashMap(38552 -> 1, 38557 -> 3, 38549 -> 0, 38560 -> 4, 38555 -> 2, 38550 -> 1, 38556 -> 3, 38554 -> 2, 38559 -> 4, 38547 -> 0, 38548 -> 0, 38553 -> 2, 38558 -> 4, 38551 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(38548, 38549, 38547), 1 -> HashSet(38552, 38550, 38551), 2 -> HashSet(38553, 38555, 38554), 3 -> HashSet(38557, 38556), 4 -> HashSet(38560, 38559, 38558))
  /* Beautified form:
  "FunctionExpression0Evaluation0" (this, FormalParameters, FunctionBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody scope)
    let closure = __x1__
    app __x2__ = (MakeConstructor closure)
    __x2__
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion closure)
    return __x3__
  }
  */
}
