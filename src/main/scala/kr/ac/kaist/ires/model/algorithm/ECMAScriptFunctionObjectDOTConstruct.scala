package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ECMAScriptFunctionObjectDOTConstruct {
  val length: Int = 2
  val func: Func = Func("""ECMAScriptFunctionObject.Construct""", List(Id("""F"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(51625), ILet(Id("""kind"""), ERef(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind""")))).setId(51627), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""base""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ObjectPrototype%"""))).setId(51629), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(51630), IReturn(ERef(RefId(Id("""__x0__""")))).setId(51631)).setId(51632), ISeq(List()).setId(51704)).setId(51633), ILet(Id("""thisArgument"""), ERef(RefId(Id("""__x0__""")))).setId(51634))).setId(51707), ISeq(List()).setId(51708)).setId(51637), IApp(Id("""__x1__"""), ERef(RefId(Id("""PrepareForOrdinaryCall"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""newTarget"""))))).setId(51639), ILet(Id("""calleeContext"""), ERef(RefId(Id("""__x1__""")))).setId(51640), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""base""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryCallBindThis"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""calleeContext"""))), ERef(RefId(Id("""thisArgument"""))))).setId(51642), IExpr(ERef(RefId(Id("""__x2__""")))).setId(51643))).setId(51714), ISeq(List()).setId(51715)).setId(51645), IAccess(Id("""__x3__"""), ERef(RefId(Id("""calleeContext"""))), EStr("""LexicalEnvironment""")).setId(51647), ILet(Id("""constructorEnv"""), ERef(RefId(Id("""__x3__""")))).setId(51648), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""constructorEnv""")), EStr("""EnvironmentRecord""")))).setId(51650), IApp(Id("""__x4__"""), ERef(RefId(Id("""OrdinaryCallEvaluateBody"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""argumentsList"""))))).setId(51652), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))).setId(51653), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""calleeContext""")))), ISeq(List(IAssign(RefId(Id("""__x5__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(51655), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x5__"""))))).setId(51656))).setId(51724), ISeq(List()).setId(51725)).setId(51659), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(51660), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))).setId(51662), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))).setId(51663), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(51664), IReturn(ERef(RefId(Id("""__x8__""")))).setId(51665))).setId(51732), ISeq(List()).setId(51733)).setId(51667), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""base""")), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""thisArgument"""))))).setId(51669), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(51670), IReturn(ERef(RefId(Id("""__x10__""")))).setId(51671))).setId(51738), ISeq(List()).setId(51739)).setId(51673), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), EUndef)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(51675), IReturn(ERef(RefId(Id("""__x11__""")))).setId(51676))).setId(51743), ISeq(List()).setId(51744)).setId(51678))).setId(51746), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(51681), IReturn(ERef(RefId(Id("""result""")))).setId(51682)).setId(51683), ISeq(List()).setId(51750)).setId(51684), IExpr(ERef(RefId(Id("""result""")))).setId(51685))).setId(51753)).setId(51687), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""GetThisBinding"""))), List(ERef(RefId(Id("""envRec"""))))).setId(51689), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(51690), IReturn(ERef(RefId(Id("""__x12__""")))).setId(51691)).setId(51692), ISeq(List()).setId(51759)).setId(51693), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(51694), IReturn(ERef(RefId(Id("""__x13__""")))).setId(51695))).setId(51763))
  val instToStepMap: Map[Int, Int] = HashMap(51659 -> 15, 51694 -> 24, 51643 -> 10, 51662 -> 22, 51674 -> 22, 51624 -> 9, 51684 -> 23, 51641 -> 8, 51668 -> 22, 51636 -> 6, 51671 -> 20, 51639 -> 8, 51695 -> 24, 51654 -> 14, 51676 -> 22, 51663 -> 18, 51627 -> 3, 51686 -> 23, 51644 -> 10, 51680 -> 22, 51648 -> 12, 51667 -> 22, 51633 -> 6, 51672 -> 20, 51640 -> 8, 51675 -> 22, 51687 -> 23, 51679 -> 22, 51649 -> 12, 51626 -> 2, 51647 -> 12, 51693 -> 24, 51637 -> 7, 51634 -> 6, 51669 -> 20, 51650 -> 13, 51629 -> 6, 51688 -> 23, 51646 -> 11, 51665 -> 18, 51625 -> 2, 51689 -> 24, 51678 -> 22, 51642 -> 10, 51661 -> 15, 51635 -> 6, 51652 -> 14, 51696 -> 24, 51638 -> 7, 51673 -> 22, 51670 -> 20, 51660 -> 15, 51653 -> 14, 51645 -> 11, 51628 -> 3, 51685 -> 23, 51666 -> 18, 51664 -> 18, 51677 -> 22, 51651 -> 13)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(51624), 10 -> HashSet(51644, 51643, 51642), 24 -> HashSet(51695, 51694, 51693, 51689, 51696), 14 -> HashSet(51654, 51652, 51653), 20 -> HashSet(51671, 51672, 51669, 51670), 1 -> HashSet(51624), 6 -> HashSet(51636, 51633, 51634, 51629, 51635), 21 -> HashSet(51674, 51673), 9 -> HashSet(51624), 13 -> HashSet(51650, 51651), 2 -> HashSet(51626, 51625), 22 -> HashSet(51668, 51676, 51675, 51679, 51662, 51674, 51678, 51673, 51677, 51680, 51667), 12 -> HashSet(51648, 51649, 51647), 7 -> HashSet(51637, 51638), 3 -> HashSet(51627, 51628), 18 -> HashSet(51663, 51665, 51666, 51664), 11 -> HashSet(51646, 51645), 23 -> HashSet(51686, 51687, 51688, 51684, 51685), 8 -> HashSet(51639, 51640, 51641), 19 -> HashSet(51668, 51667, 51662), 15 -> HashSet(51659, 51661, 51660))
  /* Beautified form:
  "ECMAScriptFunctionObject.Construct" (F, argumentsList, newTarget) => {
    let callerContext = GLOBAL_context
    let kind = F["ConstructorKind"]
    if (= kind "base") {
      app __x0__ = (OrdinaryCreateFromConstructor newTarget "%ObjectPrototype%")
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let thisArgument = __x0__
    } else {}
    app __x1__ = (PrepareForOrdinaryCall F newTarget)
    let calleeContext = __x1__
    if (= kind "base") {
      app __x2__ = (OrdinaryCallBindThis F calleeContext thisArgument)
      __x2__
    } else {}
    access __x3__ = (calleeContext "LexicalEnvironment")
    let constructorEnv = __x3__
    let envRec = constructorEnv["EnvironmentRecord"]
    app __x4__ = (OrdinaryCallEvaluateBody F argumentsList)
    let result = __x4__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] calleeContext) {
      __x5__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x5__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    if (= result["Type"] CONST_return) {
      app __x6__ = (Type result["Value"])
      if (= __x6__ Object) {
        app __x7__ = (NormalCompletion result["Value"])
        app __x8__ = (WrapCompletion __x7__)
        return __x8__
      } else {}
      if (= kind "base") {
        app __x9__ = (NormalCompletion thisArgument)
        app __x10__ = (WrapCompletion __x9__)
        return __x10__
      } else {}
      if (! (= result["Value"] undefined)) {
        app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x11__
      } else {}
    } else {
      if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else return result else {}
      result
    }
    app __x12__ = (envRec["GetThisBinding"] envRec)
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }
  */
}
