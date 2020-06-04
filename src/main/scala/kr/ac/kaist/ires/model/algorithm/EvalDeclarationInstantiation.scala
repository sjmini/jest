package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EvalDeclarationInstantiation {
  val length: Int = 4
  val func: Func = Func("""EvalDeclarationInstantiation""", List(Id("""body"""), Id("""varEnv"""), Id("""lexEnv"""), Id("""strict""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""body"""))), EStr("""VarDeclaredNames""")).setId(62003), ILet(Id("""varNames"""), ERef(RefId(Id("""__x0__""")))).setId(62004), IAccess(Id("""__x1__"""), ERef(RefId(Id("""body"""))), EStr("""VarScopedDeclarations""")).setId(62006), ILet(Id("""varDeclarations"""), ERef(RefId(Id("""__x1__""")))).setId(62007), ILet(Id("""lexEnvRec"""), ERef(RefProp(RefId(Id("""lexEnv""")), EStr("""EnvironmentRecord""")))).setId(62009), ILet(Id("""varEnvRec"""), ERef(RefProp(RefId(Id("""varEnv""")), EStr("""EnvironmentRecord""")))).setId(62011), IIf(EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(false)), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(ILet(Id("""__x2__"""), ERef(RefId(Id("""varNames""")))).setId(62021), ILet(Id("""__x3__"""), EINum(0L)).setId(62022), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(62023), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""HasLexicalDeclaration"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""name"""))))).setId(62013), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(62014), IReturn(ERef(RefId(Id("""__x5__""")))).setId(62015))).setId(62016), ISeq(List()).setId(62017)).setId(62018), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(62024))).setId(62025)).setId(62026))).setId(62029), ISeq(List()).setId(62017)).setId(62030), ILet(Id("""thisLex"""), ERef(RefId(Id("""lexEnv""")))).setId(62032), IWhile(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""thisLex"""))), ERef(RefId(Id("""varEnv"""))))), ISeq(List(ILet(Id("""thisEnvRec"""), ERef(RefProp(RefId(Id("""thisLex""")), EStr("""EnvironmentRecord""")))).setId(62034), IIf(EUOp(ONot, EBOp(OEq, ETypeOf(ERef(RefId(Id("""thisEnvRec""")))), EStr("""ObjectEnvironmentRecord"""))), ISeq(List(ILet(Id("""__x6__"""), ERef(RefId(Id("""varNames""")))).setId(62044), ILet(Id("""__x7__"""), EINum(0L)).setId(62045), IWhile(EBOp(OLt, ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x7__""")))))).setId(62046), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""thisEnvRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""thisEnvRec"""))), ERef(RefId(Id("""name"""))))).setId(62036), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(62037), IReturn(ERef(RefId(Id("""__x9__""")))).setId(62038))).setId(62040), ISeq(List()).setId(62017)).setId(62041), IAssign(RefId(Id("""__x7__""")), EBOp(OPlus, ERef(RefId(Id("""__x7__"""))), EINum(1L))).setId(62047))).setId(62048)).setId(62049))).setId(62052), ISeq(List()).setId(62017)).setId(62053), IAssign(RefId(Id("""thisLex""")), ERef(RefProp(RefId(Id("""thisLex""")), EStr("""Outer""")))).setId(62055))).setId(62057)).setId(62058))).setId(62060), ISeq(List()).setId(62017)).setId(62061), ILet(Id("""functionsToInitialize"""), EList(List())).setId(62063), ILet(Id("""declaredFunctionNames"""), EList(List())).setId(62065), ILet(Id("""__x10__"""), ERef(RefId(Id("""varDeclarations""")))).setId(62096), ILet(Id("""__x11__"""), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""length""")))).setId(62097), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""__x11__""")))), ISeq(List(IAssign(RefId(Id("""__x11__""")), EBOp(OSub, ERef(RefId(Id("""__x11__"""))), EINum(1L))).setId(62098), ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x10__""")), ERef(RefId(Id("""__x11__""")))))).setId(62099), IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier"""))), ISeq(List(IAccess(Id("""__x12__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(62067), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x12__""")), EINum(0L)))).setId(62068), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""fn"""))))), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x13__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CanDeclareGlobalFunction"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))))).setId(62070), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(62071), IReturn(ERef(RefId(Id("""__x13__""")))).setId(62072)).setId(62073), ISeq(List()).setId(62017)).setId(62074), ILet(Id("""fnDefinable"""), ERef(RefId(Id("""__x13__""")))).setId(62075), IIf(EBOp(OEq, ERef(RefId(Id("""fnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(62077), IReturn(ERef(RefId(Id("""__x14__""")))).setId(62078))).setId(62079), ISeq(List()).setId(62017)).setId(62080))).setId(62082), ISeq(List()).setId(62017)).setId(62083), IAppend(ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""declaredFunctionNames""")))).setId(62085), IPrepend(ERef(RefId(Id("""d"""))), ERef(RefId(Id("""functionsToInitialize""")))).setId(62087))).setId(62089), ISeq(List()).setId(62017)).setId(62090))).setId(62092), ISeq(List()).setId(62017)).setId(62093))).setId(62100)).setId(62101), ILet(Id("""declaredVarNames"""), EList(List())).setId(62104), ILet(Id("""__x15__"""), ERef(RefId(Id("""varDeclarations""")))).setId(62143), ILet(Id("""__x16__"""), EINum(0L)).setId(62144), IWhile(EBOp(OLt, ERef(RefId(Id("""__x16__"""))), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x15__""")), ERef(RefId(Id("""__x16__""")))))).setId(62145), IIf(EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier""")), ISeq(List(IAccess(Id("""__x17__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(62106), ILet(Id("""__x18__"""), ERef(RefId(Id("""__x17__""")))).setId(62131), ILet(Id("""__x19__"""), EINum(0L)).setId(62132), IWhile(EBOp(OLt, ERef(RefId(Id("""__x19__"""))), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x18__""")), ERef(RefId(Id("""__x19__""")))))).setId(62133), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""vn"""))))), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x20__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CanDeclareGlobalVar"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))))).setId(62107), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))).setId(62108), IReturn(ERef(RefId(Id("""__x20__""")))).setId(62109)).setId(62110), ISeq(List()).setId(62017)).setId(62111), ILet(Id("""vnDefinable"""), ERef(RefId(Id("""__x20__""")))).setId(62112), IIf(EBOp(OEq, ERef(RefId(Id("""vnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(62114), IReturn(ERef(RefId(Id("""__x21__""")))).setId(62115))).setId(62116), ISeq(List()).setId(62017)).setId(62117))).setId(62119), ISeq(List()).setId(62017)).setId(62120), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredVarNames"""))), ERef(RefId(Id("""vn"""))))), IAppend(ERef(RefId(Id("""vn"""))), ERef(RefId(Id("""declaredVarNames""")))).setId(62122), ISeq(List()).setId(62017)).setId(62125))).setId(62127), ISeq(List()).setId(62017)).setId(62128), IAssign(RefId(Id("""__x19__""")), EBOp(OPlus, ERef(RefId(Id("""__x19__"""))), EINum(1L))).setId(62134))).setId(62135)).setId(62136))).setId(62139), ISeq(List()).setId(62017)).setId(62140), IAssign(RefId(Id("""__x16__""")), EBOp(OPlus, ERef(RefId(Id("""__x16__"""))), EINum(1L))).setId(62146))).setId(62147)).setId(62148), IAccess(Id("""__x22__"""), ERef(RefId(Id("""body"""))), EStr("""LexicallyScopedDeclarations""")).setId(62151), ILet(Id("""lexDeclarations"""), ERef(RefId(Id("""__x22__""")))).setId(62152), ILet(Id("""__x23__"""), ERef(RefId(Id("""lexDeclarations""")))).setId(62184), ILet(Id("""__x24__"""), EINum(0L)).setId(62185), IWhile(EBOp(OLt, ERef(RefId(Id("""__x24__"""))), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x23__""")), ERef(RefId(Id("""__x24__""")))))).setId(62186), IAccess(Id("""__x25__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(62154), ILet(Id("""__x26__"""), ERef(RefId(Id("""__x25__""")))).setId(62175), ILet(Id("""__x27__"""), EINum(0L)).setId(62176), IWhile(EBOp(OLt, ERef(RefId(Id("""__x27__"""))), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x26__""")), ERef(RefId(Id("""__x27__""")))))).setId(62177), IAccess(Id("""__x28__"""), ERef(RefId(Id("""d"""))), EStr("""IsConstantDeclaration""")).setId(62155), IIf(EBOp(OEq, ERef(RefId(Id("""__x28__"""))), EBool(true)), ISeq(List(IApp(Id("""__x29__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))).setId(62156), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))).setId(62157), IReturn(ERef(RefId(Id("""__x29__""")))).setId(62158)).setId(62159), ISeq(List()).setId(62017)).setId(62160), IExpr(ERef(RefId(Id("""__x29__""")))).setId(62161))).setId(62163), ISeq(List(IApp(Id("""__x30__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))).setId(62164), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x30__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x30__""")), ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Value""")))).setId(62165), IReturn(ERef(RefId(Id("""__x30__""")))).setId(62166)).setId(62167), ISeq(List()).setId(62017)).setId(62168), IExpr(ERef(RefId(Id("""__x30__""")))).setId(62169))).setId(62171)).setId(62172), IAssign(RefId(Id("""__x27__""")), EBOp(OPlus, ERef(RefId(Id("""__x27__"""))), EINum(1L))).setId(62178))).setId(62179)).setId(62180), IAssign(RefId(Id("""__x24__""")), EBOp(OPlus, ERef(RefId(Id("""__x24__"""))), EINum(1L))).setId(62187))).setId(62188)).setId(62189), ILet(Id("""__x31__"""), ERef(RefId(Id("""functionsToInitialize""")))).setId(62239), ILet(Id("""__x32__"""), EINum(0L)).setId(62240), IWhile(EBOp(OLt, ERef(RefId(Id("""__x32__"""))), ERef(RefProp(RefId(Id("""__x31__""")), EStr("""length""")))), ISeq(List(ILet(Id("""f"""), ERef(RefProp(RefId(Id("""__x31__""")), ERef(RefId(Id("""__x32__""")))))).setId(62241), IAccess(Id("""__x33__"""), ERef(RefId(Id("""f"""))), EStr("""BoundNames""")).setId(62192), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x33__""")), EINum(0L)))).setId(62193), IAccess(Id("""__x34__"""), ERef(RefId(Id("""f"""))), EStr("""InstantiateFunctionObject""")).setId(62195), IApp(Id("""__x35__"""), ERef(RefId(Id("""__x34__"""))), List(ERef(RefId(Id("""lexEnv"""))))).setId(62196), ILet(Id("""fo"""), ERef(RefId(Id("""__x35__""")))).setId(62197), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x36__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateGlobalFunctionBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(true))).setId(62199), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x36__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x36__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x36__""")), ERef(RefProp(RefId(Id("""__x36__""")), EStr("""Value""")))).setId(62200), IReturn(ERef(RefId(Id("""__x36__""")))).setId(62201)).setId(62202), ISeq(List()).setId(62017)).setId(62203), IExpr(ERef(RefId(Id("""__x36__""")))).setId(62204))).setId(62206), ISeq(List(IApp(Id("""__x37__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))))).setId(62207), ILet(Id("""bindingExists"""), ERef(RefId(Id("""__x37__""")))).setId(62208), IIf(EBOp(OEq, ERef(RefId(Id("""bindingExists"""))), EBool(false)), ISeq(List(IApp(Id("""__x38__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), EBool(true))).setId(62210), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x38__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x38__""")), ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Value""")))).setId(62211), IReturn(ERef(RefId(Id("""__x38__""")))).setId(62212)).setId(62213), ISeq(List()).setId(62017)).setId(62214), ILet(Id("""status"""), ERef(RefId(Id("""__x38__""")))).setId(62215), IApp(Id("""__x39__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))))).setId(62217), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x39__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x39__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x39__""")), ERef(RefProp(RefId(Id("""__x39__""")), EStr("""Value""")))).setId(62218), IReturn(ERef(RefId(Id("""__x39__""")))).setId(62219)).setId(62220), ISeq(List()).setId(62017)).setId(62221), IExpr(ERef(RefId(Id("""__x39__""")))).setId(62222))).setId(62224), ISeq(List(IApp(Id("""__x40__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(false))).setId(62225), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x40__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x40__""")), ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Value""")))).setId(62226), IReturn(ERef(RefId(Id("""__x40__""")))).setId(62227)).setId(62228), ISeq(List()).setId(62017)).setId(62229), IExpr(ERef(RefId(Id("""__x40__""")))).setId(62230))).setId(62232)).setId(62233))).setId(62235)).setId(62236), IAssign(RefId(Id("""__x32__""")), EBOp(OPlus, ERef(RefId(Id("""__x32__"""))), EINum(1L))).setId(62242))).setId(62243)).setId(62244), ILet(Id("""__x41__"""), ERef(RefId(Id("""declaredVarNames""")))).setId(62279), ILet(Id("""__x42__"""), EINum(0L)).setId(62280), IWhile(EBOp(OLt, ERef(RefId(Id("""__x42__"""))), ERef(RefProp(RefId(Id("""__x41__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x41__""")), ERef(RefId(Id("""__x42__""")))))).setId(62281), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varEnvRec""")))), EStr("""GlobalEnvironmentRecord""")), ISeq(List(IApp(Id("""__x43__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateGlobalVarBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))), EBool(true))).setId(62247), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x43__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x43__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x43__""")), ERef(RefProp(RefId(Id("""__x43__""")), EStr("""Value""")))).setId(62248), IReturn(ERef(RefId(Id("""__x43__""")))).setId(62249)).setId(62250), ISeq(List()).setId(62017)).setId(62251), IExpr(ERef(RefId(Id("""__x43__""")))).setId(62252))).setId(62254), ISeq(List(IApp(Id("""__x44__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))))).setId(62255), ILet(Id("""bindingExists"""), ERef(RefId(Id("""__x44__""")))).setId(62256), IIf(EBOp(OEq, ERef(RefId(Id("""bindingExists"""))), EBool(false)), ISeq(List(IApp(Id("""__x45__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))), EBool(true))).setId(62258), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x45__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x45__""")), ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Value""")))).setId(62259), IReturn(ERef(RefId(Id("""__x45__""")))).setId(62260)).setId(62261), ISeq(List()).setId(62017)).setId(62262), ILet(Id("""status"""), ERef(RefId(Id("""__x45__""")))).setId(62263), IApp(Id("""__x46__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""vn"""))), EUndef)).setId(62265), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x46__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x46__""")), ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Value""")))).setId(62266), IReturn(ERef(RefId(Id("""__x46__""")))).setId(62267)).setId(62268), ISeq(List()).setId(62017)).setId(62269), IExpr(ERef(RefId(Id("""__x46__""")))).setId(62270))).setId(62272), ISeq(List()).setId(62017)).setId(62273))).setId(62275)).setId(62276), IAssign(RefId(Id("""__x42__""")), EBOp(OPlus, ERef(RefId(Id("""__x42__"""))), EINum(1L))).setId(62282))).setId(62283)).setId(62284), IApp(Id("""__x47__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(62287), IApp(Id("""__x48__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x47__"""))))).setId(62288), IReturn(ERef(RefId(Id("""__x48__""")))).setId(62289))).setId(-1))
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
