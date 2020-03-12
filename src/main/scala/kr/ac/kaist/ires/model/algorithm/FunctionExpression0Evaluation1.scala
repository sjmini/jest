package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionExpression0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0Evaluation1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(38582), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""scope"""))))).setId(38584), ILet(Id("""funcEnv"""), ERef(RefId(Id("""__x0__""")))).setId(38585), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""funcEnv""")), EStr("""EnvironmentRecord""")))).setId(38587), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(38589), ILet(Id("""name"""), ERef(RefId(Id("""__x1__""")))).setId(38590), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), EBool(false))).setId(38592), IExpr(ERef(RefId(Id("""__x2__""")))).setId(38593), IApp(Id("""__x3__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""funcEnv"""))))).setId(38595), ILet(Id("""closure"""), ERef(RefId(Id("""__x3__""")))).setId(38596), IApp(Id("""__x4__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""closure"""))))).setId(38598), IExpr(ERef(RefId(Id("""__x4__""")))).setId(38599), IApp(Id("""__x5__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(38601), IExpr(ERef(RefId(Id("""__x5__""")))).setId(38602), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(38604), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""closure"""))))).setId(38606), IExpr(ERef(RefId(Id("""__x6__""")))).setId(38607), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(38609), IReturn(ERef(RefId(Id("""__x7__""")))).setId(38610))).setId(38632))
  val instToStepMap: Map[Int, Int] = HashMap(38606 -> 9, 38585 -> 1, 38584 -> 1, 38595 -> 5, 38605 -> 8, 38603 -> 7, 38596 -> 5, 38600 -> 6, 38602 -> 7, 38610 -> 10, 38597 -> 5, 38582 -> 0, 38604 -> 8, 38611 -> 10, 38601 -> 7, 38591 -> 3, 38583 -> 0, 38599 -> 6, 38590 -> 3, 38589 -> 3, 38609 -> 10, 38587 -> 2, 38592 -> 4, 38588 -> 2, 38593 -> 4, 38598 -> 6, 38586 -> 1, 38607 -> 9, 38608 -> 9, 38594 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(38582, 38583), 5 -> HashSet(38595, 38596, 38597), 10 -> HashSet(38609, 38610, 38611), 1 -> HashSet(38585, 38584, 38586), 6 -> HashSet(38599, 38600, 38598), 9 -> HashSet(38606, 38607, 38608), 2 -> HashSet(38587, 38588), 7 -> HashSet(38603, 38602, 38601), 3 -> HashSet(38590, 38589, 38591), 8 -> HashSet(38605, 38604), 4 -> HashSet(38592, 38593, 38594))
  /* Beautified form:
  "FunctionExpression0Evaluation1" (this, BindingIdentifier, FormalParameters, FunctionBody) => {
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment scope)
    let funcEnv = __x0__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x1__ = (BindingIdentifier "StringValue")
    let name = __x1__
    app __x2__ = (envRec["CreateImmutableBinding"] envRec name false)
    __x2__
    app __x3__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody funcEnv)
    let closure = __x3__
    app __x4__ = (MakeConstructor closure)
    __x4__
    app __x5__ = (SetFunctionName closure name)
    __x5__
    closure["SourceText"] = (get-syntax this)
    app __x6__ = (envRec["InitializeBinding"] envRec name closure)
    __x6__
    app __x7__ = (WrapCompletion closure)
    return __x7__
  }
  */
}
