package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclaration1InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration1InstantiateFunctionObject0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody"""), Id("""scope""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(38461), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))).setId(38462), IApp(Id("""__x1__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""F"""))))).setId(38464), IExpr(ERef(RefId(Id("""__x1__""")))).setId(38465), IApp(Id("""__x2__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), EStr("""default"""))).setId(38467), IExpr(ERef(RefId(Id("""__x2__""")))).setId(38468), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(38470), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(38472), IReturn(ERef(RefId(Id("""__x3__""")))).setId(38473))).setId(38485))
  val instToStepMap: Map[Int, Int] = HashMap(38462 -> 0, 38473 -> 4, 38470 -> 3, 38474 -> 4, 38468 -> 2, 38472 -> 4, 38467 -> 2, 38461 -> 0, 38465 -> 1, 38463 -> 0, 38469 -> 2, 38464 -> 1, 38471 -> 3, 38466 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(38462, 38463, 38461), 1 -> HashSet(38465, 38464, 38466), 2 -> HashSet(38469, 38468, 38467), 3 -> HashSet(38470, 38471), 4 -> HashSet(38473, 38474, 38472))
  /* Beautified form:
  "FunctionDeclaration1InstantiateFunctionObject0" (this, FormalParameters, FunctionBody, scope) => {
    app __x0__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody scope)
    let F = __x0__
    app __x1__ = (MakeConstructor F)
    __x1__
    app __x2__ = (SetFunctionName F "default")
    __x2__
    F["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion F)
    return __x3__
  }
  */
}
