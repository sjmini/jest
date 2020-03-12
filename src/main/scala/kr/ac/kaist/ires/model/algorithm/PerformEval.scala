package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PerformEval {
  val length: Int = 4
  val func: Func = Func("""PerformEval""", List(Id("""x"""), Id("""callerRealm"""), Id("""strictCaller"""), Id("""direct""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(61543), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""x"""))))).setId(61544), IReturn(ERef(RefId(Id("""__x1__""")))).setId(61545))).setId(61726), ISeq(List()).setId(61727)).setId(61547), ILet(Id("""evalRealm"""), ERef(RefId(Id("""REALM""")))).setId(61549), IApp(Id("""__x2__"""), ERef(RefId(Id("""HostEnsureCanCompileStrings"""))), List(ERef(RefId(Id("""callerRealm"""))), ERef(RefId(Id("""evalRealm"""))))).setId(61551), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(61552), IReturn(ERef(RefId(Id("""__x2__""")))).setId(61553)).setId(61554), ISeq(List()).setId(61734)).setId(61555), IExpr(ERef(RefId(Id("""__x2__""")))).setId(61556), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()).setId(61558), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(61559), IReturn(ERef(RefId(Id("""__x3__""")))).setId(61560)).setId(61561), ISeq(List()).setId(61741)).setId(61562), ILet(Id("""thisEnvRec"""), ERef(RefId(Id("""__x3__""")))).setId(61563), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""thisEnvRec""")))), EStr("""FunctionEnvironmentRecord""")), ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""thisEnvRec""")), EStr("""FunctionObject""")))).setId(61565), ILet(Id("""inFunction"""), EBool(true)).setId(61567), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""thisEnvRec""")), EStr("""HasSuperBinding"""))), List(ERef(RefId(Id("""thisEnvRec"""))))).setId(61569), ILet(Id("""inMethod"""), ERef(RefId(Id("""__x4__""")))).setId(61570), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind"""))), EStr("""derived""")), ILet(Id("""inDerivedConstructor"""), EBool(true)).setId(61572), ILet(Id("""inDerivedConstructor"""), EBool(false)).setId(61574)).setId(61576))).setId(61751), ISeq(List(ILet(Id("""inFunction"""), EBool(false)).setId(61579), ILet(Id("""inMethod"""), EBool(false)).setId(61581), ILet(Id("""inDerivedConstructor"""), EBool(false)).setId(61583))).setId(61755)).setId(61586), ILet(Id("""__x5__"""), EParseSyntax(ERef(RefId(Id("""x"""))), EStr("""Script"""), List())).setId(61588), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EAbsent), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61589), IReturn(ERef(RefId(Id("""__x6__""")))).setId(61590))).setId(61760), ISeq(List()).setId(61761)).setId(61593), ILet(Id("""script"""), ERef(RefId(Id("""__x5__""")))).setId(61595), IAccess(Id("""__x7__"""), ERef(RefId(Id("""script"""))), EStr("""Contains""")).setId(61597), IApp(Id("""__x8__"""), ERef(RefId(Id("""__x7__"""))), List(EStr("""ScriptBody"""))).setId(61598), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(61599), IReturn(ERef(RefId(Id("""__x9__""")))).setId(61600))).setId(61768), ISeq(List()).setId(61769)).setId(61602), IAccess(Id("""__x10__"""), ERef(RefId(Id("""script"""))), EStr("""ScriptBody""")).setId(61604), ILet(Id("""body"""), ERef(RefId(Id("""__x10__""")))).setId(61605), ILet(Id("""__x11__"""), EBOp(OEq, ERef(RefId(Id("""inFunction"""))), EBool(false))).setId(61613), IIf(ERef(RefId(Id("""__x11__"""))), ISeq(List(IAccess(Id("""__x12__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")).setId(61607), IApp(Id("""__x13__"""), ERef(RefId(Id("""__x12__"""))), List(EStr("""NewTarget"""))).setId(61608), IAssign(RefId(Id("""__x11__""")), ERef(RefId(Id("""__x13__""")))).setId(61611))).setId(61777), ISeq(List()).setId(61778)).setId(61614), IIf(ERef(RefId(Id("""__x11__"""))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61615), IReturn(ERef(RefId(Id("""__x14__""")))).setId(61616))).setId(61782), ISeq(List()).setId(61783)).setId(61618), ILet(Id("""__x15__"""), EBOp(OEq, ERef(RefId(Id("""inMethod"""))), EBool(false))).setId(61626), IIf(ERef(RefId(Id("""__x15__"""))), ISeq(List(IAccess(Id("""__x16__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")).setId(61620), IApp(Id("""__x17__"""), ERef(RefId(Id("""__x16__"""))), List(EStr("""SuperProperty"""))).setId(61621), IAssign(RefId(Id("""__x15__""")), ERef(RefId(Id("""__x17__""")))).setId(61624))).setId(61789), ISeq(List()).setId(61790)).setId(61627), IIf(ERef(RefId(Id("""__x15__"""))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61628), IReturn(ERef(RefId(Id("""__x18__""")))).setId(61629))).setId(61794), ISeq(List()).setId(61795)).setId(61631), ILet(Id("""__x19__"""), EBOp(OEq, ERef(RefId(Id("""inDerivedConstructor"""))), EBool(false))).setId(61639), IIf(ERef(RefId(Id("""__x19__"""))), ISeq(List(IAccess(Id("""__x20__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")).setId(61633), IApp(Id("""__x21__"""), ERef(RefId(Id("""__x20__"""))), List(EStr("""SuperCall"""))).setId(61634), IAssign(RefId(Id("""__x19__""")), ERef(RefId(Id("""__x21__""")))).setId(61637))).setId(61801), ISeq(List()).setId(61802)).setId(61640), IIf(ERef(RefId(Id("""__x19__"""))), ISeq(List(IApp(Id("""__x22__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61641), IReturn(ERef(RefId(Id("""__x22__""")))).setId(61642))).setId(61806), ISeq(List()).setId(61807)).setId(61644), IIf(EBOp(OEq, ERef(RefId(Id("""strictCaller"""))), EBool(true)), ILet(Id("""strictEval"""), EBool(true)).setId(61647), ISeq(List(IAccess(Id("""__x23__"""), ERef(RefId(Id("""script"""))), EStr("""IsStrict""")).setId(61649), ILet(Id("""strictEval"""), ERef(RefId(Id("""__x23__""")))).setId(61650))).setId(61812)).setId(61652), ILet(Id("""ctx"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(61654), IIf(EBOp(OEq, ERef(RefId(Id("""direct"""))), EBool(true)), ISeq(List(IApp(Id("""__x24__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefProp(RefId(Id("""ctx""")), EStr("""LexicalEnvironment"""))))).setId(61656), ILet(Id("""lexEnv"""), ERef(RefId(Id("""__x24__""")))).setId(61657), ILet(Id("""varEnv"""), ERef(RefProp(RefId(Id("""ctx""")), EStr("""VariableEnvironment""")))).setId(61659))).setId(61818), ISeq(List(IApp(Id("""__x25__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefProp(RefId(Id("""evalRealm""")), EStr("""GlobalEnv"""))))).setId(61662), ILet(Id("""lexEnv"""), ERef(RefId(Id("""__x25__""")))).setId(61663), ILet(Id("""varEnv"""), ERef(RefProp(RefId(Id("""evalRealm""")), EStr("""GlobalEnv""")))).setId(61665))).setId(61822)).setId(61668), IIf(EBOp(OEq, ERef(RefId(Id("""strictEval"""))), EBool(true)), IAssign(RefId(Id("""varEnv""")), ERef(RefId(Id("""lexEnv""")))).setId(61670), ISeq(List()).setId(61825)).setId(61672), IIf(EBOp(OEq, ERef(RefId(Id("""ctx"""))), ENull), ISeq(List(IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(61674), IAssign(RefId(Id("""ctx""")), ENull).setId(61675))).setId(61829), ISeq(List()).setId(61830)).setId(61677), ILet(Id("""evalCxt"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(61679), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""Function""")), ENull).setId(61681), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""Realm""")), ERef(RefId(Id("""evalRealm""")))).setId(61683), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""ScriptOrModule""")), ERef(RefProp(RefId(Id("""ctx""")), EStr("""ScriptOrModule""")))).setId(61685), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""varEnv""")))).setId(61687), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lexEnv""")))).setId(61689), IAppend(ERef(RefId(Id("""evalCxt"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(61691), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(61692), IApp(Id("""__x26__"""), ERef(RefId(Id("""EvalDeclarationInstantiation"""))), List(ERef(RefId(Id("""body"""))), ERef(RefId(Id("""varEnv"""))), ERef(RefId(Id("""lexEnv"""))), ERef(RefId(Id("""strictEval"""))))).setId(61694), ILet(Id("""result"""), ERef(RefId(Id("""__x26__""")))).setId(61695), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IAccess(Id("""__x27__"""), ERef(RefId(Id("""body"""))), EStr("""Evaluation""")).setId(61698), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x27__""")))).setId(61699))).setId(61844), ISeq(List()).setId(61845)).setId(61702), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IApp(Id("""__x28__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(61704), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x28__""")))).setId(61705))).setId(61849), ISeq(List()).setId(61850)).setId(61708), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(61710), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""evalCxt""")))), ISeq(List(IAssign(RefId(Id("""__x29__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(61711), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x29__"""))))).setId(61712))).setId(61855), ISeq(List()).setId(61856)).setId(61715), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(61717), IApp(Id("""__x30__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(61718), IApp(Id("""__x31__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x30__"""))))).setId(61719), IReturn(ERef(RefId(Id("""__x31__""")))).setId(61720))).setId(61862))
  val instToStepMap: Map[Int, Int] = HashMap(61596 -> 27, 61670 -> 40, 61652 -> 29, 61696 -> 51, 61548 -> 2, 61698 -> 54, 61684 -> 46, 61641 -> 27, 61574 -> 11, 61667 -> 39, 61719 -> 62, 61606 -> 27, 61687 -> 48, 61577 -> 11, 61568 -> 11, 61655 -> 30, 61692 -> 50, 61588 -> 27, 61556 -> 4, 61715 -> 60, 61702 -> 55, 61543 -> 2, 61705 -> 58, 61581 -> 16, 61600 -> 20, 61613 -> 27, 61564 -> 5, 61628 -> 25, 61660 -> 35, 61677 -> 43, 61587 -> 16, 61645 -> 27, 61664 -> 39, 61673 -> 41, 61632 -> 27, 61602 -> 27, 61570 -> 11, 61565 -> 11, 61573 -> 11, 61551 -> 4, 61689 -> 49, 61686 -> 47, 61657 -> 35, 61651 -> 29, 61683 -> 46, 61605 -> 27, 61654 -> 30, 61701 -> 54, 61666 -> 39, 61693 -> 50, 61669 -> 39, 61718 -> 62, 61593 -> 27, 61619 -> 27, 61578 -> 11, 61665 -> 39, 61678 -> 43, 61597 -> 27, 61721 -> 62, 61646 -> 27, 61614 -> 27, 61706 -> 58, 61582 -> 16, 61586 -> 16, 61547 -> 2, 61569 -> 11, 61661 -> 35, 61709 -> 59, 61544 -> 1, 61674 -> 42, 61601 -> 20, 61618 -> 27, 61642 -> 27, 61557 -> 4, 61629 -> 25, 61626 -> 27, 61704 -> 58, 61685 -> 47, 61579 -> 16, 61566 -> 11, 61690 -> 49, 61717 -> 61, 61682 -> 45, 61576 -> 11, 61700 -> 54, 61672 -> 41, 61640 -> 27, 61650 -> 29, 61594 -> 27, 61694 -> 51, 61550 -> 3, 61653 -> 29, 61662 -> 39, 61675 -> 42, 61643 -> 27, 61572 -> 11, 61615 -> 23, 61598 -> 27, 61649 -> 29, 61546 -> 1, 61647 -> 28, 61679 -> 44, 61630 -> 25, 61585 -> 16, 61617 -> 23, 61558 -> 5, 61658 -> 35, 61710 -> 60, 61707 -> 58, 61583 -> 16, 61562 -> 5, 61720 -> 62, 61595 -> 27, 61580 -> 16, 61695 -> 51, 61716 -> 60, 61668 -> 39, 61703 -> 55, 61656 -> 35, 61555 -> 4, 61604 -> 27, 61639 -> 27, 61681 -> 45, 61699 -> 54, 61549 -> 3, 61567 -> 11, 61691 -> 50, 61575 -> 11, 61688 -> 48, 61671 -> 40, 61603 -> 27, 61616 -> 23, 61627 -> 27, 61584 -> 16, 61676 -> 42, 61563 -> 5, 61571 -> 11, 61644 -> 27, 61545 -> 1, 61659 -> 35, 61599 -> 20, 61648 -> 28, 61708 -> 59, 61631 -> 27, 61663 -> 39, 61680 -> 44, 61542 -> 31)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(61542), 5 -> HashSet(61564, 61558, 61562, 61563), 10 -> HashSet(61570, 61569, 61571), 14 -> HashSet(61579, 61580), 60 -> HashSet(61715, 61710, 61716), 9 -> HashSet(61568, 61567), 41 -> HashSet(61673, 61672), 2 -> HashSet(61548, 61543, 61547), 39 -> HashSet(61667, 61664, 61665, 61662, 61668, 61663, 61666, 61669), 48 -> HashSet(61687, 61688), 4 -> HashSet(61556, 61551, 61557, 61555), 42 -> HashSet(61674, 61675, 61676), 24 -> HashSet(61613, 61619, 61614, 61618), 25 -> HashSet(61628, 61629, 61630), 20 -> HashSet(61600, 61601, 61599), 46 -> HashSet(61684, 61683), 29 -> HashSet(61652, 61651, 61649, 61650, 61653), 61 -> HashSet(61717), 1 -> HashSet(61544, 61546, 61545), 21 -> HashSet(61602, 61597, 61598, 61603), 28 -> HashSet(61647, 61648), 38 -> HashSet(61664, 61662, 61663), 34 -> HashSet(61657, 61658, 61656), 45 -> HashSet(61682, 61681), 22 -> HashSet(61606, 61605, 61604), 44 -> HashSet(61679, 61680), 59 -> HashSet(61709, 61708), 27 -> HashSet(61588, 61613, 61596, 61605, 61626, 61643, 61598, 61595, 61644, 61631, 61606, 61641, 61645, 61632, 61602, 61593, 61619, 61597, 61646, 61614, 61618, 61642, 61640, 61594, 61604, 61639, 61603, 61627), 54 -> HashSet(61698, 61701, 61700, 61699), 49 -> HashSet(61689, 61690), 3 -> HashSet(61550, 61549), 35 -> HashSet(61660, 61657, 61661, 61658, 61656, 61659), 50 -> HashSet(61692, 61693, 61691), 16 -> HashSet(61581, 61587, 61582, 61586, 61579, 61585, 61583, 61580, 61584), 31 -> HashSet(61542), 11 -> HashSet(61574, 61570, 61578, 61569, 61566, 61576, 61572, 61571, 61577, 61568, 61565, 61573, 61567, 61575), 43 -> HashSet(61677, 61678), 40 -> HashSet(61670, 61671), 26 -> HashSet(61632, 61626, 61627, 61631), 55 -> HashSet(61702, 61703), 23 -> HashSet(61615, 61617, 61616), 8 -> HashSet(61565, 61566), 58 -> HashSet(61705, 61706, 61704, 61707), 30 -> HashSet(61655, 61654), 51 -> HashSet(61696, 61694, 61695), 19 -> HashSet(61588, 61596, 61593, 61594, 61595), 47 -> HashSet(61686, 61685), 15 -> HashSet(61581, 61582), 62 -> HashSet(61719, 61718, 61721, 61720))
  /* Beautified form:
  "PerformEval" (x, callerRealm, strictCaller, direct) => {
    app __x0__ = (Type x)
    if (! (= __x0__ String)) {
      app __x1__ = (WrapCompletion x)
      return __x1__
    } else {}
    let evalRealm = REALM
    app __x2__ = (HostEnsureCanCompileStrings callerRealm evalRealm)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (GetThisEnvironment )
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let thisEnvRec = __x3__
    if (= (typeof thisEnvRec) "FunctionEnvironmentRecord") {
      let F = thisEnvRec["FunctionObject"]
      let inFunction = true
      app __x4__ = (thisEnvRec["HasSuperBinding"] thisEnvRec)
      let inMethod = __x4__
      if (= F["ConstructorKind"] "derived") let inDerivedConstructor = true else let inDerivedConstructor = false
    } else {
      let inFunction = false
      let inMethod = false
      let inDerivedConstructor = false
    }
    let __x5__ = (parse-syntax x "Script" )
    if (= __x5__ absent) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    let script = __x5__
    access __x7__ = (script "Contains")
    app __x8__ = (__x7__ "ScriptBody")
    if (= __x8__ false) {
      app __x9__ = (WrapCompletion undefined)
      return __x9__
    } else {}
    access __x10__ = (script "ScriptBody")
    let body = __x10__
    let __x11__ = (= inFunction false)
    if __x11__ {
      access __x12__ = (body "Contains")
      app __x13__ = (__x12__ "NewTarget")
      __x11__ = __x13__
    } else {}
    if __x11__ {
      app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x14__
    } else {}
    let __x15__ = (= inMethod false)
    if __x15__ {
      access __x16__ = (body "Contains")
      app __x17__ = (__x16__ "SuperProperty")
      __x15__ = __x17__
    } else {}
    if __x15__ {
      app __x18__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x18__
    } else {}
    let __x19__ = (= inDerivedConstructor false)
    if __x19__ {
      access __x20__ = (body "Contains")
      app __x21__ = (__x20__ "SuperCall")
      __x19__ = __x21__
    } else {}
    if __x19__ {
      app __x22__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x22__
    } else {}
    if (= strictCaller true) let strictEval = true else {
      access __x23__ = (script "IsStrict")
      let strictEval = __x23__
    }
    let ctx = GLOBAL_context
    if (= direct true) {
      app __x24__ = (NewDeclarativeEnvironment ctx["LexicalEnvironment"])
      let lexEnv = __x24__
      let varEnv = ctx["VariableEnvironment"]
    } else {
      app __x25__ = (NewDeclarativeEnvironment evalRealm["GlobalEnv"])
      let lexEnv = __x25__
      let varEnv = evalRealm["GlobalEnv"]
    }
    if (= strictEval true) varEnv = lexEnv else {}
    if (= ctx null) {
      GLOBAL_context = null
      ctx = null
    } else {}
    let evalCxt = (new ExecutionContext("SubMap" -> (new SubMap())))
    evalCxt["Function"] = null
    evalCxt["Realm"] = evalRealm
    evalCxt["ScriptOrModule"] = ctx["ScriptOrModule"]
    evalCxt["VariableEnvironment"] = varEnv
    evalCxt["LexicalEnvironment"] = lexEnv
    append evalCxt -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x26__ = (EvalDeclarationInstantiation body varEnv lexEnv strictEval)
    let result = __x26__
    if (= result["Type"] CONST_normal) {
      access __x27__ = (body "Evaluation")
      result = __x27__
    } else {}
    if (&& (= result["Type"] CONST_normal) (= result["Value"] CONST_empty)) {
      app __x28__ = (NormalCompletion undefined)
      result = __x28__
    } else {}
    GLOBAL_context = null
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] evalCxt) {
      __x29__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x29__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x30__ = (Completion result)
    app __x31__ = (WrapCompletion __x30__)
    return __x31__
  }
  */
}
