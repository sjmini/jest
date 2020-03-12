package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition0DefineMethod0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition0DefineMethod0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""FunctionBody"""), Id("""object"""), Id("""functionPrototype""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")).setId(39622), ILet(Id("""propKey"""), ERef(RefId(Id("""__x0__""")))).setId(39623), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""propKey""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""propKey""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""propKey""")), ERef(RefProp(RefId(Id("""propKey""")), EStr("""Value""")))).setId(39625), IReturn(ERef(RefId(Id("""propKey""")))).setId(39626)).setId(39627), ISeq(List()).setId(39663)).setId(39629), IExpr(ERef(RefId(Id("""propKey""")))).setId(39630), ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(39632), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""functionPrototype"""))), EAbsent)), ISeq(List(ILet(Id("""kind"""), ERef(RefId(Id("""CONST_Normal""")))).setId(39634), ILet(Id("""prototype"""), ERef(RefId(Id("""functionPrototype""")))).setId(39636))).setId(39669), ISeq(List(ILet(Id("""kind"""), ERef(RefId(Id("""CONST_Method""")))).setId(39639), ILet(Id("""prototype"""), ERef(RefId(Id("""INTRINSIC_FunctionPrototype""")))).setId(39641))).setId(39672)).setId(39644), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""UniqueFormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""scope"""))), ERef(RefId(Id("""prototype"""))))).setId(39646), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(39647), IApp(Id("""__x2__"""), ERef(RefId(Id("""MakeMethod"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""object"""))))).setId(39649), IExpr(ERef(RefId(Id("""__x2__""")))).setId(39650), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(39652), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Record"""), List((EStr("""Key"""), ERef(RefId(Id("""propKey""")))), (EStr("""Closure"""), ERef(RefId(Id("""closure""")))))))).setId(39654), IReturn(ERef(RefId(Id("""__x3__""")))).setId(39655))).setId(39681))
  val instToStepMap: Map[Int, Int] = HashMap(39634 -> 6, 39648 -> 11, 39653 -> 13, 39643 -> 10, 39642 -> 10, 39629 -> 1, 39645 -> 10, 39631 -> 1, 39652 -> 13, 39633 -> 2, 39637 -> 6, 39644 -> 10, 39649 -> 12, 39638 -> 6, 39639 -> 10, 39650 -> 12, 39635 -> 6, 39654 -> 14, 39647 -> 11, 39622 -> 0, 39632 -> 2, 39640 -> 10, 39655 -> 14, 39636 -> 6, 39651 -> 12, 39623 -> 0, 39641 -> 10, 39646 -> 11, 39656 -> 14, 39630 -> 1, 39624 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(39622, 39623, 39624), 5 -> HashSet(39634, 39635), 10 -> HashSet(39643, 39639, 39642, 39640, 39645, 39641, 39644), 14 -> HashSet(39654, 39655, 39656), 1 -> HashSet(39629, 39631, 39630), 6 -> HashSet(39634, 39638, 39635, 39636, 39637), 9 -> HashSet(39639, 39640), 13 -> HashSet(39653, 39652), 2 -> HashSet(39632, 39633), 12 -> HashSet(39649, 39650, 39651), 11 -> HashSet(39648, 39647, 39646))
  /* Beautified form:
  "MethodDefinition0DefineMethod0" (this, PropertyName, UniqueFormalParameters, FunctionBody, object, functionPrototype) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (= (typeof propKey) "Completion") if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    let scope = GLOBAL_context["LexicalEnvironment"]
    if (! (= functionPrototype absent)) {
      let kind = CONST_Normal
      let prototype = functionPrototype
    } else {
      let kind = CONST_Method
      let prototype = INTRINSIC_FunctionPrototype
    }
    app __x1__ = (FunctionCreate kind UniqueFormalParameters FunctionBody scope prototype)
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    __x2__
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion (new Record("Key" -> propKey, "Closure" -> closure)))
    return __x3__
  }
  */
}
