package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EvalDeclarationInstantiation {
  val length: Int = 4
  val func: Func = Func("""EvalDeclarationInstantiation""", List(Id("""body"""), Id("""varEnv"""), Id("""lexEnv"""), Id("""strict""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""body"""))), EStr("""VarDeclaredNames""")).setId(62003), ILet(Id("""varNames"""), ERef(RefId(Id("""__x0__""")))).setId(62004), IAccess(Id("""__x1__"""), ERef(RefId(Id("""body"""))), EStr("""VarScopedDeclarations""")).setId(62006), ILet(Id("""varDeclarations"""), ERef(RefId(Id("""__x1__""")))).setId(62007), ILet(Id("""lexEnvRec"""), ERef(RefProp(RefId(Id("""lexEnv""")), EStr("""EnvironmentRecord""")))).setId(62009), ILet(Id("""varEnvRec"""), ERef(RefProp(RefId(Id("""varEnv""")), EStr("""EnvironmentRecord""")))).setId(62011), IIf(EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(false)), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(ILet(Id("""__x2__"""), ERef(RefId(Id("""varNames""")))).setId(62021), ILet(Id("""__x3__"""), EINum(0L)).setId(62022), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(62023), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""HasLexicalDeclaration"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""name"""))))).setId(62013), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(62014), IReturn(ERef(RefId(Id("""__x5__""")))).setId(62015))).setId(62304), ISeq(List()).setId(62305)).setId(62018), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(62024))).setId(62308)).setId(62026))).setId(62310), ISeq(List()).setId(62311)).setId(62030), ILet(Id("""thisLex"""), ERef(RefId(Id("""lexEnv""")))).setId(62032), IWhile(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""thisLex"""))), ERef(RefId(Id("""varEnv"""))))), ISeq(List(ILet(Id("""thisEnvRec"""), ERef(RefProp(RefId(Id("""thisLex""")), EStr("""EnvironmentRecord""")))).setId(62034), IIf(EUOp(ONot, EBOp(OEq, ETypeOf(ERef(RefId(Id("""thisEnvRec""")))), EStr("""ObjectEnvironmentRecord"""))), ISeq(List(ILet(Id("""__x6__"""), ERef(RefId(Id("""varNames""")))).setId(62044), ILet(Id("""__x7__"""), EINum(0L)).setId(62045), IWhile(EBOp(OLt, ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x7__""")))))).setId(62046), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""thisEnvRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""thisEnvRec"""))), ERef(RefId(Id("""name"""))))).setId(62036), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(62037), IReturn(ERef(RefId(Id("""__x9__""")))).setId(62038))).setId(62321), ISeq(List()).setId(62322)).setId(62041), IAssign(RefId(Id("""__x7__""")), EBOp(OPlus, ERef(RefId(Id("""__x7__"""))), EINum(1L))).setId(62047))).setId(62325)).setId(62049))).setId(62327), ISeq(List()).setId(62328)).setId(62053), IAssign(RefId(Id("""thisLex""")), ERef(RefProp(RefId(Id("""thisLex""")), EStr("""Outer""")))).setId(62055))).setId(62331)).setId(62058))).setId(62333), ISeq(List()).setId(62334)).setId(62061), ILet(Id("""functionsToInitialize"""), EList(List())).setId(62063), ILet(Id("""declaredFunctionNames"""), EList(List())).setId(62065), ILet(Id("""__x10__"""), ERef(RefId(Id("""varDeclarations""")))).setId(62096), ILet(Id("""__x11__"""), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""length""")))).setId(62097), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""__x11__""")))), ISeq(List(IAssign(RefId(Id("""__x11__""")), EBOp(OSub, ERef(RefId(Id("""__x11__"""))), EINum(1L))).setId(62098), ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x10__""")), ERef(RefId(Id("""__x11__""")))))).setId(62099), IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier"""))), ISeq(List(IAccess(Id("""__x12__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(62067), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x12__""")), EINum(0L)))).setId(62068), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""fn"""))))), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x13__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CanDeclareGlobalFunction"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))))).setId(62070), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(62071), IReturn(ERef(RefId(Id("""__x13__""")))).setId(62072)).setId(62073), ISeq(List()).setId(62348)).setId(62074), ILet(Id("""fnDefinable"""), ERef(RefId(Id("""__x13__""")))).setId(62075), IIf(EBOp(OEq, ERef(RefId(Id("""fnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(62077), IReturn(ERef(RefId(Id("""__x14__""")))).setId(62078))).setId(62353), ISeq(List()).setId(62354)).setId(62080))).setId(62356), ISeq(List()).setId(62357)).setId(62083), IAppend(ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""declaredFunctionNames""")))).setId(62085), IPrepend(ERef(RefId(Id("""d"""))), ERef(RefId(Id("""functionsToInitialize""")))).setId(62087))).setId(62361), ISeq(List()).setId(62362)).setId(62090))).setId(62364), ISeq(List()).setId(62365)).setId(62093))).setId(62367)).setId(62101), ILet(Id("""declaredVarNames"""), EList(List())).setId(62104), ILet(Id("""__x15__"""), ERef(RefId(Id("""varDeclarations""")))).setId(62143), ILet(Id("""__x16__"""), EINum(0L)).setId(62144), IWhile(EBOp(OLt, ERef(RefId(Id("""__x16__"""))), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x15__""")), ERef(RefId(Id("""__x16__""")))))).setId(62145), IIf(EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier""")), ISeq(List(IAccess(Id("""__x17__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(62106), ILet(Id("""__x18__"""), ERef(RefId(Id("""__x17__""")))).setId(62131), ILet(Id("""__x19__"""), EINum(0L)).setId(62132), IWhile(EBOp(OLt, ERef(RefId(Id("""__x19__"""))), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x18__""")), ERef(RefId(Id("""__x19__""")))))).setId(62133), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""vn"""))))), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x20__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CanDeclareGlobalVar"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))))).setId(62107), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))).setId(62108), IReturn(ERef(RefId(Id("""__x20__""")))).setId(62109)).setId(62110), ISeq(List()).setId(62381)).setId(62111), ILet(Id("""vnDefinable"""), ERef(RefId(Id("""__x20__""")))).setId(62112), IIf(EBOp(OEq, ERef(RefId(Id("""vnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(62114), IReturn(ERef(RefId(Id("""__x21__""")))).setId(62115))).setId(62386), ISeq(List()).setId(62387)).setId(62117))).setId(62389), ISeq(List()).setId(62390)).setId(62120), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredVarNames"""))), ERef(RefId(Id("""vn"""))))), IAppend(ERef(RefId(Id("""vn"""))), ERef(RefId(Id("""declaredVarNames""")))).setId(62122), ISeq(List()).setId(62393)).setId(62125))).setId(62395), ISeq(List()).setId(62396)).setId(62128), IAssign(RefId(Id("""__x19__""")), EBOp(OPlus, ERef(RefId(Id("""__x19__"""))), EINum(1L))).setId(62134))).setId(62399)).setId(62136))).setId(62401), ISeq(List()).setId(62402)).setId(62140), IAssign(RefId(Id("""__x16__""")), EBOp(OPlus, ERef(RefId(Id("""__x16__"""))), EINum(1L))).setId(62146))).setId(62405)).setId(62148), IAccess(Id("""__x22__"""), ERef(RefId(Id("""body"""))), EStr("""LexicallyScopedDeclarations""")).setId(62151), ILet(Id("""lexDeclarations"""), ERef(RefId(Id("""__x22__""")))).setId(62152), ILet(Id("""__x23__"""), ERef(RefId(Id("""lexDeclarations""")))).setId(62184), ILet(Id("""__x24__"""), EINum(0L)).setId(62185), IWhile(EBOp(OLt, ERef(RefId(Id("""__x24__"""))), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x23__""")), ERef(RefId(Id("""__x24__""")))))).setId(62186), IAccess(Id("""__x25__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(62154), ILet(Id("""__x26__"""), ERef(RefId(Id("""__x25__""")))).setId(62175), ILet(Id("""__x27__"""), EINum(0L)).setId(62176), IWhile(EBOp(OLt, ERef(RefId(Id("""__x27__"""))), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x26__""")), ERef(RefId(Id("""__x27__""")))))).setId(62177), IAccess(Id("""__x28__"""), ERef(RefId(Id("""d"""))), EStr("""IsConstantDeclaration""")).setId(62155), IIf(EBOp(OEq, ERef(RefId(Id("""__x28__"""))), EBool(true)), ISeq(List(IApp(Id("""__x29__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))).setId(62156), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))).setId(62157), IReturn(ERef(RefId(Id("""__x29__""")))).setId(62158)).setId(62159), ISeq(List()).setId(62421)).setId(62160), IExpr(ERef(RefId(Id("""__x29__""")))).setId(62161))).setId(62424), ISeq(List(IApp(Id("""__x30__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))).setId(62164), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x30__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x30__""")), ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Value""")))).setId(62165), IReturn(ERef(RefId(Id("""__x30__""")))).setId(62166)).setId(62167), ISeq(List()).setId(62429)).setId(62168), IExpr(ERef(RefId(Id("""__x30__""")))).setId(62169))).setId(62432)).setId(62172), IAssign(RefId(Id("""__x27__""")), EBOp(OPlus, ERef(RefId(Id("""__x27__"""))), EINum(1L))).setId(62178))).setId(62435)).setId(62180), IAssign(RefId(Id("""__x24__""")), EBOp(OPlus, ERef(RefId(Id("""__x24__"""))), EINum(1L))).setId(62187))).setId(62438)).setId(62189), ILet(Id("""__x31__"""), ERef(RefId(Id("""functionsToInitialize""")))).setId(62239), ILet(Id("""__x32__"""), EINum(0L)).setId(62240), IWhile(EBOp(OLt, ERef(RefId(Id("""__x32__"""))), ERef(RefProp(RefId(Id("""__x31__""")), EStr("""length""")))), ISeq(List(ILet(Id("""f"""), ERef(RefProp(RefId(Id("""__x31__""")), ERef(RefId(Id("""__x32__""")))))).setId(62241), IAccess(Id("""__x33__"""), ERef(RefId(Id("""f"""))), EStr("""BoundNames""")).setId(62192), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x33__""")), EINum(0L)))).setId(62193), IAccess(Id("""__x34__"""), ERef(RefId(Id("""f"""))), EStr("""InstantiateFunctionObject""")).setId(62195), IApp(Id("""__x35__"""), ERef(RefId(Id("""__x34__"""))), List(ERef(RefId(Id("""lexEnv"""))))).setId(62196), ILet(Id("""fo"""), ERef(RefId(Id("""__x35__""")))).setId(62197), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x36__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateGlobalFunctionBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(true))).setId(62199), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x36__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x36__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x36__""")), ERef(RefProp(RefId(Id("""__x36__""")), EStr("""Value""")))).setId(62200), IReturn(ERef(RefId(Id("""__x36__""")))).setId(62201)).setId(62202), ISeq(List()).setId(62452)).setId(62203), IExpr(ERef(RefId(Id("""__x36__""")))).setId(62204))).setId(62455), ISeq(List(IApp(Id("""__x37__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))))).setId(62207), ILet(Id("""bindingExists"""), ERef(RefId(Id("""__x37__""")))).setId(62208), IIf(EBOp(OEq, ERef(RefId(Id("""bindingExists"""))), EBool(false)), ISeq(List(IApp(Id("""__x38__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), EBool(true))).setId(62210), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x38__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x38__""")), ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Value""")))).setId(62211), IReturn(ERef(RefId(Id("""__x38__""")))).setId(62212)).setId(62213), ISeq(List()).setId(62462)).setId(62214), ILet(Id("""status"""), ERef(RefId(Id("""__x38__""")))).setId(62215), IApp(Id("""__x39__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))))).setId(62217), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x39__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x39__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x39__""")), ERef(RefProp(RefId(Id("""__x39__""")), EStr("""Value""")))).setId(62218), IReturn(ERef(RefId(Id("""__x39__""")))).setId(62219)).setId(62220), ISeq(List()).setId(62469)).setId(62221), IExpr(ERef(RefId(Id("""__x39__""")))).setId(62222))).setId(62472), ISeq(List(IApp(Id("""__x40__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(false))).setId(62225), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x40__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x40__""")), ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Value""")))).setId(62226), IReturn(ERef(RefId(Id("""__x40__""")))).setId(62227)).setId(62228), ISeq(List()).setId(62477)).setId(62229), IExpr(ERef(RefId(Id("""__x40__""")))).setId(62230))).setId(62480)).setId(62233))).setId(62482)).setId(62236), IAssign(RefId(Id("""__x32__""")), EBOp(OPlus, ERef(RefId(Id("""__x32__"""))), EINum(1L))).setId(62242))).setId(62485)).setId(62244), ILet(Id("""__x41__"""), ERef(RefId(Id("""declaredVarNames""")))).setId(62279), ILet(Id("""__x42__"""), EINum(0L)).setId(62280), IWhile(EBOp(OLt, ERef(RefId(Id("""__x42__"""))), ERef(RefProp(RefId(Id("""__x41__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x41__""")), ERef(RefId(Id("""__x42__""")))))).setId(62281), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x43__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateGlobalVarBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))), EBool(true))).setId(62247), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x43__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x43__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x43__""")), ERef(RefProp(RefId(Id("""__x43__""")), EStr("""Value""")))).setId(62248), IReturn(ERef(RefId(Id("""__x43__""")))).setId(62249)).setId(62250), ISeq(List()).setId(62494)).setId(62251), IExpr(ERef(RefId(Id("""__x43__""")))).setId(62252))).setId(62497), ISeq(List(IApp(Id("""__x44__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))))).setId(62255), ILet(Id("""bindingExists"""), ERef(RefId(Id("""__x44__""")))).setId(62256), IIf(EBOp(OEq, ERef(RefId(Id("""bindingExists"""))), EBool(false)), ISeq(List(IApp(Id("""__x45__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))), EBool(true))).setId(62258), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x45__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x45__""")), ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Value""")))).setId(62259), IReturn(ERef(RefId(Id("""__x45__""")))).setId(62260)).setId(62261), ISeq(List()).setId(62504)).setId(62262), ILet(Id("""status"""), ERef(RefId(Id("""__x45__""")))).setId(62263), IApp(Id("""__x46__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))), EUndef)).setId(62265), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x46__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x46__""")), ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Value""")))).setId(62266), IReturn(ERef(RefId(Id("""__x46__""")))).setId(62267)).setId(62268), ISeq(List()).setId(62511)).setId(62269), IExpr(ERef(RefId(Id("""__x46__""")))).setId(62270))).setId(62514), ISeq(List()).setId(62515)).setId(62273))).setId(62517)).setId(62276), IAssign(RefId(Id("""__x42__""")), EBOp(OPlus, ERef(RefId(Id("""__x42__"""))), EINum(1L))).setId(62282))).setId(62520)).setId(62284), IApp(Id("""__x47__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(62287), IApp(Id("""__x48__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x47__"""))))).setId(62288), IReturn(ERef(RefId(Id("""__x48__""")))).setId(62289))).setId(62525))
  val instToStepMap: Map[Int, Int] = HashMap(62032 -> 31, 62232 -> 99, 62154 -> 81, 62161 -> 78, 62247 -> 104, 62053 -> 31, 62215 -> 96, 62269 -> 112, 62193 -> 99, 62237 -> 99, 62264 -> 112, 62021 -> 12, 62148 -> 68, 62180 -> 81, 62097 -> 50, 62104 -> 52, 62116 -> 64, 62070 -> 47, 62141 -> 68, 62049 -> 29, 62044 -> 29, 62173 -> 81, 62119 -> 64, 62275 -> 112, 62151 -> 70, 62136 -> 68, 62279 -> 112, 62017 -> 112, 62012 -> 3, 62090 -> 50, 62122 -> 68, 62183 -> 81, 62087 -> 50, 62129 -> 68, 62168 -> 81, 62077 -> 47, 62066 -> 34, 62029 -> 12, 62061 -> 32, 62115 -> 64, 62190 -> 81, 62205 -> 88, 62257 -> 112, 62240 -> 99, 62083 -> 50, 62132 -> 68, 62094 -> 50, 62016 -> 10, 62126 -> 68, 62272 -> 112, 62289 -> 113, 62034 -> 31, 62197 -> 99, 62039 -> 27, 62278 -> 112, 62231 -> 99, 62263 -> 112, 62287 -> 113, 62196 -> 99, 62182 -> 81, 62123 -> 68, 62138 -> 68, 62210 -> 96, 62118 -> 64, 62091 -> 50, 62164 -> 81, 62086 -> 50, 62170 -> 81, 62078 -> 47, 62011 -> 3, 62054 -> 31, 62106 -> 68, 62274 -> 112, 62150 -> 68, 62103 -> 50, 62246 -> 99, 62199 -> 88, 62060 -> 31, 62214 -> 96, 62206 -> 88, 62043 -> 29, 62015 -> 10, 62028 -> 12, 62286 -> 112, 62050 -> 29, 62131 -> 68, 62234 -> 99, 62038 -> 27, 62155 -> 81, 62064 -> 33, 62035 -> 31, 62003 -> 0, 62251 -> 104, 62057 -> 31, 62142 -> 68, 62127 -> 68, 62018 -> 12, 62095 -> 50, 62174 -> 81, 62114 -> 64, 62191 -> 81, 62074 -> 47, 62163 -> 78, 62222 -> 96, 62006 -> 1, 62067 -> 50, 62254 -> 104, 62082 -> 47, 62014 -> 10, 62258 -> 112, 62207 -> 99, 62092 -> 50, 62195 -> 99, 62288 -> 113, 62102 -> 50, 62055 -> 31, 62265 -> 112, 62040 -> 27, 62107 -> 64, 62262 -> 112, 62171 -> 81, 62027 -> 12, 62079 -> 47, 62010 -> 2, 62008 -> 1, 62256 -> 112, 62203 -> 88, 62290 -> 113, 62230 -> 99, 62198 -> 99, 62059 -> 31, 62031 -> 31, 62042 -> 29, 62139 -> 68, 62209 -> 99, 62252 -> 104, 62007 -> 1, 62255 -> 112, 62022 -> 12, 62004 -> 0, 62169 -> 81, 62128 -> 68, 62075 -> 47, 62162 -> 78, 62270 -> 112, 62223 -> 96, 62009 -> 2, 62156 -> 78, 62194 -> 99, 62105 -> 52, 62277 -> 112, 62063 -> 33, 62143 -> 68, 62019 -> 12, 62238 -> 99, 62096 -> 50, 62130 -> 68, 62124 -> 68, 62111 -> 64, 62160 -> 78, 62041 -> 29, 62068 -> 50, 62137 -> 68, 62051 -> 29, 62175 -> 81, 62036 -> 29, 62235 -> 99, 62192 -> 99, 62233 -> 99, 62245 -> 99, 62284 -> 112, 62058 -> 31, 62244 -> 99, 62216 -> 96, 62120 -> 68, 62217 -> 96, 62093 -> 50, 62208 -> 99, 62030 -> 31, 62069 -> 50, 62125 -> 68, 62285 -> 112, 62037 -> 27, 62056 -> 31, 62140 -> 68, 62221 -> 96, 62204 -> 88, 62081 -> 47, 62088 -> 50, 62026 -> 12, 62065 -> 34, 62189 -> 81, 62080 -> 47, 62033 -> 31, 62005 -> 0, 62276 -> 112, 62152 -> 70, 62225 -> 99, 62253 -> 104, 62101 -> 50, 62113 -> 64, 62184 -> 81, 62045 -> 29, 62013 -> 12, 62085 -> 50, 62172 -> 81, 62224 -> 96, 62084 -> 50, 62185 -> 81, 62076 -> 47, 62117 -> 64, 62280 -> 112, 62239 -> 99, 62229 -> 99, 62153 -> 70, 62062 -> 32, 62181 -> 81, 62176 -> 81, 62089 -> 50, 62052 -> 29, 62112 -> 64, 62236 -> 99, 62273 -> 112, 62149 -> 68, 62020 -> 12, 62144 -> 68, 62121 -> 68, 62271 -> 112)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(10 -> HashSet(62016, 62015, 62014), 84 -> HashSet(62193, 62194, 62192), 1 -> HashSet(62006, 62008, 62007), 85 -> HashSet(62197, 62196, 62195, 62198), 65 -> HashSet(62120, 62121), 96 -> HashSet(62215, 62017, 62210, 62214, 62222, 62223, 62221, 62224, 62216, 62217), 27 -> HashSet(62017, 62039, 62038, 62040, 62037), 91 -> HashSet(62207, 62209, 62208), 3 -> HashSet(62012, 62011), 112 -> HashSet(62269, 62264, 62275, 62257, 62272, 62274, 62286, 62258, 62265, 62255, 62284, 62285, 62276, 62280, 62279, 62017, 62278, 62263, 62262, 62256, 62270, 62277, 62271, 62273), 11 -> HashSet(62018, 62019, 62013), 111 -> HashSet(62017), 69 -> HashSet(62017), 0 -> HashSet(62003, 62004, 62005), 88 -> HashSet(62205, 62203, 62204, 62199, 62206), 52 -> HashSet(62104, 62105), 14 -> HashSet(62032, 62033), 110 -> HashSet(62264, 62263, 62258, 62262), 46 -> HashSet(62070, 62074, 62075, 62076), 78 -> HashSet(62161, 62163, 62162, 62156, 62160), 29 -> HashSet(62017, 62043, 62050, 62042, 62045, 62052, 62049, 62044, 62041, 62051, 62036), 28 -> HashSet(62042, 62041, 62036), 70 -> HashSet(62151, 62152, 62153), 21 -> HashSet(62017), 33 -> HashSet(62064, 62063), 13 -> HashSet(62031, 62030), 41 -> HashSet(62067, 62068, 62069), 73 -> HashSet(62017), 2 -> HashSet(62010, 62009), 64 -> HashSet(62115, 62118, 62114, 62107, 62111, 62113, 62117, 62112, 62116, 62119), 32 -> HashSet(62061, 62062), 34 -> HashSet(62066, 62065), 12 -> HashSet(62021, 62017, 62029, 62028, 62018, 62027, 62022, 62019, 62026, 62013, 62020), 49 -> HashSet(62086, 62085), 113 -> HashSet(62289, 62287, 62288, 62290), 81 -> HashSet(62154, 62180, 62173, 62190, 62182, 62155, 62171, 62169, 62175, 62189, 62184, 62183, 62017, 62168, 62164, 62170, 62174, 62191, 62185, 62172, 62181, 62176), 39 -> HashSet(62017), 48 -> HashSet(62083, 62084), 63 -> HashSet(62107, 62111, 62113, 62112), 18 -> HashSet(62034, 62035), 95 -> HashSet(62017), 50 -> HashSet(62097, 62103, 62092, 62102, 62096, 62068, 62088, 62101, 62089, 62087, 62017, 62090, 62083, 62094, 62091, 62086, 62095, 62067, 62093, 62069, 62085, 62084), 31 -> HashSet(62053, 62017, 62034, 62054, 62060, 62032, 62055, 62056, 62033, 62035, 62057, 62059, 62031, 62058, 62030), 99 -> HashSet(62240, 62197, 62246, 62234, 62207, 62195, 62194, 62238, 62225, 62236, 62232, 62193, 62237, 62231, 62196, 62230, 62198, 62209, 62245, 62235, 62192, 62233, 62244, 62208, 62229, 62239), 104 -> HashSet(62247, 62251, 62254, 62252, 62253), 40 -> HashSet(62017), 26 -> HashSet(62039, 62038, 62037), 30 -> HashSet(62053, 62054), 51 -> HashSet(62017), 107 -> HashSet(62257, 62256, 62255), 94 -> HashSet(62215, 62210, 62214, 62216), 47 -> HashSet(62070, 62077, 62078, 62079, 62075, 62076, 62074, 62082, 62080, 62081), 15 -> HashSet(62017), 68 -> HashSet(62148, 62141, 62123, 62138, 62131, 62139, 62128, 62143, 62137, 62120, 62125, 62140, 62136, 62122, 62129, 62126, 62132, 62106, 62150, 62127, 62142, 62124, 62130, 62121, 62149, 62144))
  /* Beautified form:
  "EvalDeclarationInstantiation" (body, varEnv, lexEnv, strict) => {
    access __x0__ = (body "VarDeclaredNames")
    let varNames = __x0__
    access __x1__ = (body "VarScopedDeclarations")
    let varDeclarations = __x1__
    let lexEnvRec = lexEnv["EnvironmentRecord"]
    let varEnvRec = varEnv["EnvironmentRecord"]
    if (= strict false) {
      if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
        let __x2__ = varNames
        let __x3__ = 0i
        while (< __x3__ __x2__["length"]) {
          let name = __x2__[__x3__]
          app __x4__ = (varEnvRec["HasLexicalDeclaration"] varEnvRec name)
          if (= __x4__ true) {
            app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x5__
          } else {}
          __x3__ = (+ __x3__ 1i)
        }
      } else {}
      let thisLex = lexEnv
      while (! (= thisLex varEnv)) {
        let thisEnvRec = thisLex["EnvironmentRecord"]
        if (! (= (typeof thisEnvRec) "ObjectEnvironmentRecord")) {
          let __x6__ = varNames
          let __x7__ = 0i
          while (< __x7__ __x6__["length"]) {
            let name = __x6__[__x7__]
            app __x8__ = (thisEnvRec["HasBinding"] thisEnvRec name)
            if (= __x8__ true) {
              app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
              return __x9__
            } else {}
            __x7__ = (+ __x7__ 1i)
          }
        } else {}
        thisLex = thisLex["Outer"]
      }
    } else {}
    let functionsToInitialize = (new [])
    let declaredFunctionNames = (new [])
    let __x10__ = varDeclarations
    let __x11__ = __x10__["length"]
    while (< 0i __x11__) {
      __x11__ = (- __x11__ 1i)
      let d = __x10__[__x11__]
      if (! (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier))) {
        access __x12__ = (d "BoundNames")
        let fn = __x12__[0i]
        if (! (contains declaredFunctionNames fn)) {
          if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
            app __x13__ = (varEnvRec["CanDeclareGlobalFunction"] varEnvRec fn)
            if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
            let fnDefinable = __x13__
            if (= fnDefinable false) {
              app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
              return __x14__
            } else {}
          } else {}
          append fn -> declaredFunctionNames
          prepend d -> functionsToInitialize
        } else {}
      } else {}
    }
    let declaredVarNames = (new [])
    let __x15__ = varDeclarations
    let __x16__ = 0i
    while (< __x16__ __x15__["length"]) {
      let d = __x15__[__x16__]
      if (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier)) {
        access __x17__ = (d "BoundNames")
        let __x18__ = __x17__
        let __x19__ = 0i
        while (< __x19__ __x18__["length"]) {
          let vn = __x18__[__x19__]
          if (! (contains declaredFunctionNames vn)) {
            if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
              app __x20__ = (varEnvRec["CanDeclareGlobalVar"] varEnvRec vn)
              if (= (typeof __x20__) "Completion") if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
              let vnDefinable = __x20__
              if (= vnDefinable false) {
                app __x21__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
                return __x21__
              } else {}
            } else {}
            if (! (contains declaredVarNames vn)) append vn -> declaredVarNames else {}
          } else {}
          __x19__ = (+ __x19__ 1i)
        }
      } else {}
      __x16__ = (+ __x16__ 1i)
    }
    access __x22__ = (body "LexicallyScopedDeclarations")
    let lexDeclarations = __x22__
    let __x23__ = lexDeclarations
    let __x24__ = 0i
    while (< __x24__ __x23__["length"]) {
      let d = __x23__[__x24__]
      access __x25__ = (d "BoundNames")
      let __x26__ = __x25__
      let __x27__ = 0i
      while (< __x27__ __x26__["length"]) {
        let dn = __x26__[__x27__]
        access __x28__ = (d "IsConstantDeclaration")
        if (= __x28__ true) {
          app __x29__ = (lexEnvRec["CreateImmutableBinding"] lexEnvRec dn true)
          if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
          __x29__
        } else {
          app __x30__ = (lexEnvRec["CreateMutableBinding"] lexEnvRec dn false)
          if (= (typeof __x30__) "Completion") if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          __x30__
        }
        __x27__ = (+ __x27__ 1i)
      }
      __x24__ = (+ __x24__ 1i)
    }
    let __x31__ = functionsToInitialize
    let __x32__ = 0i
    while (< __x32__ __x31__["length"]) {
      let f = __x31__[__x32__]
      access __x33__ = (f "BoundNames")
      let fn = __x33__[0i]
      access __x34__ = (f "InstantiateFunctionObject")
      app __x35__ = (__x34__ lexEnv)
      let fo = __x35__
      if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
        app __x36__ = (varEnvRec["CreateGlobalFunctionBinding"] varEnvRec fn fo true)
        if (= (typeof __x36__) "Completion") if (= __x36__["Type"] CONST_normal) __x36__ = __x36__["Value"] else return __x36__ else {}
        __x36__
      } else {
        app __x37__ = (varEnvRec["HasBinding"] varEnvRec fn)
        let bindingExists = __x37__
        if (= bindingExists false) {
          app __x38__ = (varEnvRec["CreateMutableBinding"] varEnvRec fn true)
          if (= (typeof __x38__) "Completion") if (= __x38__["Type"] CONST_normal) __x38__ = __x38__["Value"] else return __x38__ else {}
          let status = __x38__
          app __x39__ = (varEnvRec["InitializeBinding"] varEnvRec fn fo)
          if (= (typeof __x39__) "Completion") if (= __x39__["Type"] CONST_normal) __x39__ = __x39__["Value"] else return __x39__ else {}
          __x39__
        } else {
          app __x40__ = (varEnvRec["SetMutableBinding"] varEnvRec fn fo false)
          if (= (typeof __x40__) "Completion") if (= __x40__["Type"] CONST_normal) __x40__ = __x40__["Value"] else return __x40__ else {}
          __x40__
        }
      }
      __x32__ = (+ __x32__ 1i)
    }
    let __x41__ = declaredVarNames
    let __x42__ = 0i
    while (< __x42__ __x41__["length"]) {
      let vn = __x41__[__x42__]
      if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
        app __x43__ = (varEnvRec["CreateGlobalVarBinding"] varEnvRec vn true)
        if (= (typeof __x43__) "Completion") if (= __x43__["Type"] CONST_normal) __x43__ = __x43__["Value"] else return __x43__ else {}
        __x43__
      } else {
        app __x44__ = (varEnvRec["HasBinding"] varEnvRec vn)
        let bindingExists = __x44__
        if (= bindingExists false) {
          app __x45__ = (varEnvRec["CreateMutableBinding"] varEnvRec vn true)
          if (= (typeof __x45__) "Completion") if (= __x45__["Type"] CONST_normal) __x45__ = __x45__["Value"] else return __x45__ else {}
          let status = __x45__
          app __x46__ = (varEnvRec["InitializeBinding"] varEnvRec vn undefined)
          if (= (typeof __x46__) "Completion") if (= __x46__["Type"] CONST_normal) __x46__ = __x46__["Value"] else return __x46__ else {}
          __x46__
        } else {}
      }
      __x42__ = (+ __x42__ 1i)
    }
    app __x47__ = (NormalCompletion CONST_empty)
    app __x48__ = (WrapCompletion __x47__)
    return __x48__
  }
  */
}
