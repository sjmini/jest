package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclarationInstantiation {
  val length: Int = 2
  val func: Func = Func("""FunctionDeclarationInstantiation""", List(Id("""func"""), Id("""argumentsList""")), None, ISeq(List(ILet(Id("""calleeContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(52554), IAccess(Id("""__x0__"""), ERef(RefId(Id("""calleeContext"""))), EStr("""LexicalEnvironment""")).setId(52556), ILet(Id("""env"""), ERef(RefId(Id("""__x0__""")))).setId(52557), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")))).setId(52559), ILet(Id("""code"""), ERef(RefProp(RefId(Id("""func""")), EStr("""ECMAScriptCode""")))).setId(52561), ILet(Id("""strict"""), ERef(RefProp(RefId(Id("""func""")), EStr("""Strict""")))).setId(52563), ILet(Id("""formals"""), ERef(RefProp(RefId(Id("""func""")), EStr("""FormalParameters""")))).setId(52565), IAccess(Id("""__x1__"""), ERef(RefId(Id("""formals"""))), EStr("""BoundNames""")).setId(52567), ILet(Id("""parameterNames"""), ERef(RefId(Id("""__x1__""")))).setId(52568), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDuplicate"""))), List(ERef(RefId(Id("""parameterNames"""))))).setId(52570), IIf(ERef(RefId(Id("""__x2__"""))), ILet(Id("""hasDuplicates"""), EBool(true)).setId(52571), ILet(Id("""hasDuplicates"""), EBool(false)).setId(52573)).setId(52575), IAccess(Id("""__x3__"""), ERef(RefId(Id("""formals"""))), EStr("""IsSimpleParameterList""")).setId(52577), ILet(Id("""simpleParameterList"""), ERef(RefId(Id("""__x3__""")))).setId(52578), IAccess(Id("""__x4__"""), ERef(RefId(Id("""formals"""))), EStr("""ContainsExpression""")).setId(52580), ILet(Id("""hasParameterExpressions"""), ERef(RefId(Id("""__x4__""")))).setId(52581), IAccess(Id("""__x5__"""), ERef(RefId(Id("""code"""))), EStr("""VarDeclaredNames""")).setId(52583), ILet(Id("""varNames"""), ERef(RefId(Id("""__x5__""")))).setId(52584), IAccess(Id("""__x6__"""), ERef(RefId(Id("""code"""))), EStr("""VarScopedDeclarations""")).setId(52586), ILet(Id("""varDeclarations"""), ERef(RefId(Id("""__x6__""")))).setId(52587), IAccess(Id("""__x7__"""), ERef(RefId(Id("""code"""))), EStr("""LexicallyDeclaredNames""")).setId(52589), ILet(Id("""lexicalNames"""), ERef(RefId(Id("""__x7__""")))).setId(52590), ILet(Id("""functionNames"""), EList(List())).setId(52592), ILet(Id("""functionsToInitialize"""), EList(List())).setId(52594), ILet(Id("""__x8__"""), ERef(RefId(Id("""varDeclarations""")))).setId(52611), ILet(Id("""__x9__"""), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""length""")))).setId(52612), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""__x9__""")))), ISeq(List(IAssign(RefId(Id("""__x9__""")), EBOp(OSub, ERef(RefId(Id("""__x9__"""))), EINum(1L))).setId(52613), ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x8__""")), ERef(RefId(Id("""__x9__""")))))).setId(52614), IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier"""))), ISeq(List(IAccess(Id("""__x10__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(52597), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x10__""")), EINum(0L)))).setId(52598), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""functionNames"""))), ERef(RefId(Id("""fn"""))))), ISeq(List(IPrepend(ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""functionNames""")))).setId(52600), IPrepend(ERef(RefId(Id("""d"""))), ERef(RefId(Id("""functionsToInitialize""")))).setId(52602))).setId(52928), ISeq(List()).setId(52929)).setId(52605))).setId(52931), ISeq(List()).setId(52932)).setId(52608))).setId(52934)).setId(52616), ILet(Id("""argumentsObjectNeeded"""), EBool(true)).setId(52619), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""func""")), EStr("""ThisMode"""))), ERef(RefId(Id("""CONST_lexical""")))), IAssign(RefId(Id("""argumentsObjectNeeded""")), EBool(false)).setId(52621), IIf(EContains(ERef(RefId(Id("""parameterNames"""))), EStr("""arguments""")), IAssign(RefId(Id("""argumentsObjectNeeded""")), EBool(false)).setId(52624), IIf(EBOp(OEq, ERef(RefId(Id("""hasParameterExpressions"""))), EBool(false)), IIf(EBOp(OOr, EContains(ERef(RefId(Id("""functionNames"""))), EStr("""arguments""")), EContains(ERef(RefId(Id("""lexicalNames"""))), EStr("""arguments"""))), IAssign(RefId(Id("""argumentsObjectNeeded""")), EBool(false)).setId(52627), ISeq(List()).setId(52940)).setId(52630), ISeq(List()).setId(52942)).setId(52633)).setId(52635)).setId(52637), ILet(Id("""__x11__"""), ERef(RefId(Id("""parameterNames""")))).setId(52663), ILet(Id("""__x12__"""), EINum(0L)).setId(52664), IWhile(EBOp(OLt, ERef(RefId(Id("""__x12__"""))), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""length""")))), ISeq(List(ILet(Id("""paramName"""), ERef(RefProp(RefId(Id("""__x11__""")), ERef(RefId(Id("""__x12__""")))))).setId(52665), IApp(Id("""__x13__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""paramName"""))))).setId(52639), ILet(Id("""alreadyDeclared"""), ERef(RefId(Id("""__x13__""")))).setId(52640), IIf(EBOp(OEq, ERef(RefId(Id("""alreadyDeclared"""))), EBool(false)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""paramName"""))), EBool(false))).setId(52642), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(52643), IReturn(ERef(RefId(Id("""__x14__""")))).setId(52644)).setId(52645), ISeq(List()).setId(52955)).setId(52646), IExpr(ERef(RefId(Id("""__x14__""")))).setId(52647), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""paramName"""))), EUndef)).setId(52649), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(52650), IReturn(ERef(RefId(Id("""__x15__""")))).setId(52651)).setId(52652), ISeq(List()).setId(52962)).setId(52653), IExpr(ERef(RefId(Id("""__x15__""")))).setId(52654))).setId(52965), ISeq(List()).setId(52966)).setId(52657))).setId(52968), ISeq(List()).setId(52969)).setId(52660), IAssign(RefId(Id("""__x12__""")), EBOp(OPlus, ERef(RefId(Id("""__x12__"""))), EINum(1L))).setId(52666))).setId(52972)).setId(52668), IIf(EBOp(OEq, ERef(RefId(Id("""argumentsObjectNeeded"""))), EBool(true)), ISeq(List(IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""simpleParameterList"""))), EBool(false))), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""CreateUnmappedArgumentsObject"""))), List(ERef(RefId(Id("""argumentsList"""))))).setId(52671), ILet(Id("""ao"""), ERef(RefId(Id("""__x16__""")))).setId(52672))).setId(52976), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""CreateMappedArgumentsObject"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""formals"""))), ERef(RefId(Id("""argumentsList"""))), ERef(RefId(Id("""envRec"""))))).setId(52675), ILet(Id("""ao"""), ERef(RefId(Id("""__x17__""")))).setId(52676))).setId(52979)).setId(52679), IIf(EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(true)), ISeq(List(IApp(Id("""__x18__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), EStr("""arguments"""), EBool(false))).setId(52681), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))).setId(52682), IReturn(ERef(RefId(Id("""__x18__""")))).setId(52683)).setId(52684), ISeq(List()).setId(52985)).setId(52685), IExpr(ERef(RefId(Id("""__x18__""")))).setId(52686))).setId(52988), ISeq(List(IApp(Id("""__x19__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), EStr("""arguments"""), EBool(false))).setId(52689), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x19__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))).setId(52690), IReturn(ERef(RefId(Id("""__x19__""")))).setId(52691)).setId(52692), ISeq(List()).setId(52993)).setId(52693), IExpr(ERef(RefId(Id("""__x19__""")))).setId(52694))).setId(52996)).setId(52697), IApp(Id("""__x20__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), EStr("""arguments"""), ERef(RefId(Id("""ao"""))))).setId(52699), IExpr(ERef(RefId(Id("""__x20__""")))).setId(52700), ILet(Id("""__x21__"""), ECopy(ERef(RefId(Id("""parameterNames"""))))).setId(52702), IAppend(EStr("""arguments"""), ERef(RefId(Id("""__x21__""")))).setId(52703), ILet(Id("""parameterBindings"""), ERef(RefId(Id("""__x21__""")))).setId(52704))).setId(53003), ILet(Id("""parameterBindings"""), ERef(RefId(Id("""parameterNames""")))).setId(52707)).setId(52710), IApp(Id("""__x22__"""), ERef(RefId(Id("""CreateListIteratorRecord"""))), List(ERef(RefId(Id("""argumentsList"""))))).setId(52712), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x22__""")))).setId(52713), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), ISeq(List(IAccess(Id("""__x23__"""), ERef(RefId(Id("""formals"""))), EStr("""IteratorBindingInitialization""")).setId(52715), IApp(Id("""__x24__"""), ERef(RefId(Id("""__x23__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), EUndef)).setId(52716), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x24__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x24__""")), ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Value""")))).setId(52717), IReturn(ERef(RefId(Id("""__x24__""")))).setId(52718)).setId(52719), ISeq(List()).setId(53013)).setId(52720), IExpr(ERef(RefId(Id("""__x24__""")))).setId(52721))).setId(53016), ISeq(List(IAccess(Id("""__x25__"""), ERef(RefId(Id("""formals"""))), EStr("""IteratorBindingInitialization""")).setId(52724), IApp(Id("""__x26__"""), ERef(RefId(Id("""__x25__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""env"""))))).setId(52725), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x26__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))).setId(52726), IReturn(ERef(RefId(Id("""__x26__""")))).setId(52727)).setId(52728), ISeq(List()).setId(53022)).setId(52729), IExpr(ERef(RefId(Id("""__x26__""")))).setId(52730))).setId(53025)).setId(52733), IIf(EBOp(OEq, ERef(RefId(Id("""hasParameterExpressions"""))), EBool(false)), ISeq(List(ILet(Id("""instantiatedVarNames"""), ECopy(ERef(RefId(Id("""parameterBindings"""))))).setId(52735), ILet(Id("""__x27__"""), ERef(RefId(Id("""varNames""")))).setId(52753), ILet(Id("""__x28__"""), EINum(0L)).setId(52754), IWhile(EBOp(OLt, ERef(RefId(Id("""__x28__"""))), ERef(RefProp(RefId(Id("""__x27__""")), EStr("""length""")))), ISeq(List(ILet(Id("""n"""), ERef(RefProp(RefId(Id("""__x27__""")), ERef(RefId(Id("""__x28__""")))))).setId(52755), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""instantiatedVarNames"""))), ERef(RefId(Id("""n"""))))), ISeq(List(IAppend(ERef(RefId(Id("""n"""))), ERef(RefId(Id("""instantiatedVarNames""")))).setId(52737), IApp(Id("""__x29__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""n"""))), EBool(false))).setId(52739), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))).setId(52740), IReturn(ERef(RefId(Id("""__x29__""")))).setId(52741)).setId(52742), ISeq(List()).setId(53036)).setId(52743), IExpr(ERef(RefId(Id("""__x29__""")))).setId(52744), IApp(Id("""__x30__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""n"""))), EUndef)).setId(52746), IExpr(ERef(RefId(Id("""__x30__""")))).setId(52747))).setId(53041), ISeq(List()).setId(53042)).setId(52750), IAssign(RefId(Id("""__x28__""")), EBOp(OPlus, ERef(RefId(Id("""__x28__"""))), EINum(1L))).setId(52756))).setId(53045)).setId(52758), ILet(Id("""varEnv"""), ERef(RefId(Id("""env""")))).setId(52761), ILet(Id("""varEnvRec"""), ERef(RefId(Id("""envRec""")))).setId(52763))).setId(53049), ISeq(List(IApp(Id("""__x31__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""env"""))))).setId(52766), ILet(Id("""varEnv"""), ERef(RefId(Id("""__x31__""")))).setId(52767), ILet(Id("""varEnvRec"""), ERef(RefProp(RefId(Id("""varEnv""")), EStr("""EnvironmentRecord""")))).setId(52769), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""varEnv""")))).setId(52771), ILet(Id("""instantiatedVarNames"""), EList(List())).setId(52773), ILet(Id("""__x32__"""), ERef(RefId(Id("""varNames""")))).setId(52803), ILet(Id("""__x33__"""), EINum(0L)).setId(52804), IWhile(EBOp(OLt, ERef(RefId(Id("""__x33__"""))), ERef(RefProp(RefId(Id("""__x32__""")), EStr("""length""")))), ISeq(List(ILet(Id("""n"""), ERef(RefProp(RefId(Id("""__x32__""")), ERef(RefId(Id("""__x33__""")))))).setId(52805), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""instantiatedVarNames"""))), ERef(RefId(Id("""n"""))))), ISeq(List(IAppend(ERef(RefId(Id("""n"""))), ERef(RefId(Id("""instantiatedVarNames""")))).setId(52775), IApp(Id("""__x34__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""n"""))), EBool(false))).setId(52777), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x34__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))).setId(52778), IReturn(ERef(RefId(Id("""__x34__""")))).setId(52779)).setId(52780), ISeq(List()).setId(53063)).setId(52781), IExpr(ERef(RefId(Id("""__x34__""")))).setId(52782), IIf(EBOp(OOr, EUOp(ONot, EContains(ERef(RefId(Id("""parameterBindings"""))), ERef(RefId(Id("""n"""))))), EContains(ERef(RefId(Id("""functionNames"""))), ERef(RefId(Id("""n"""))))), ILet(Id("""initialValue"""), EUndef).setId(52784), ISeq(List(IApp(Id("""__x35__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""n"""))), EBool(false))).setId(52786), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x35__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x35__""")), ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Value""")))).setId(52787), IReturn(ERef(RefId(Id("""__x35__""")))).setId(52788)).setId(52789), ISeq(List()).setId(53071)).setId(52790), ILet(Id("""initialValue"""), ERef(RefId(Id("""__x35__""")))).setId(52791))).setId(53074)).setId(52794), IApp(Id("""__x36__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""n"""))), ERef(RefId(Id("""initialValue"""))))).setId(52796), IExpr(ERef(RefId(Id("""__x36__""")))).setId(52797))).setId(53078), ISeq(List()).setId(53079)).setId(52800), IAssign(RefId(Id("""__x33__""")), EBOp(OPlus, ERef(RefId(Id("""__x33__"""))), EINum(1L))).setId(52806))).setId(53082)).setId(52808))).setId(53084)).setId(52812), IIf(EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(false)), ISeq(List(IApp(Id("""__x37__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""varEnv"""))))).setId(52814), ILet(Id("""lexEnv"""), ERef(RefId(Id("""__x37__""")))).setId(52815))).setId(53088), ILet(Id("""lexEnv"""), ERef(RefId(Id("""varEnv""")))).setId(52818)).setId(52820), ILet(Id("""lexEnvRec"""), ERef(RefProp(RefId(Id("""lexEnv""")), EStr("""EnvironmentRecord""")))).setId(52822), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lexEnv""")))).setId(52824), IAccess(Id("""__x38__"""), ERef(RefId(Id("""code"""))), EStr("""LexicallyScopedDeclarations""")).setId(52826), ILet(Id("""lexDeclarations"""), ERef(RefId(Id("""__x38__""")))).setId(52827), ILet(Id("""__x39__"""), ERef(RefId(Id("""lexDeclarations""")))).setId(52859), ILet(Id("""__x40__"""), EINum(0L)).setId(52860), IWhile(EBOp(OLt, ERef(RefId(Id("""__x40__"""))), ERef(RefProp(RefId(Id("""__x39__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x39__""")), ERef(RefId(Id("""__x40__""")))))).setId(52861), IAccess(Id("""__x41__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(52829), ILet(Id("""__x42__"""), ERef(RefId(Id("""__x41__""")))).setId(52850), ILet(Id("""__x43__"""), EINum(0L)).setId(52851), IWhile(EBOp(OLt, ERef(RefId(Id("""__x43__"""))), ERef(RefProp(RefId(Id("""__x42__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x42__""")), ERef(RefId(Id("""__x43__""")))))).setId(52852), IAccess(Id("""__x44__"""), ERef(RefId(Id("""d"""))), EStr("""IsConstantDeclaration""")).setId(52830), IIf(EBOp(OEq, ERef(RefId(Id("""__x44__"""))), EBool(true)), ISeq(List(IApp(Id("""__x45__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))).setId(52831), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x45__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x45__""")), ERef(RefProp(RefId(Id("""__x45__""")), EStr("""Value""")))).setId(52832), IReturn(ERef(RefId(Id("""__x45__""")))).setId(52833)).setId(52834), ISeq(List()).setId(53107)).setId(52835), IExpr(ERef(RefId(Id("""__x45__""")))).setId(52836))).setId(53110), ISeq(List(IApp(Id("""__x46__"""), ERef(RefProp(RefId(Id("""lexEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""lexEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))).setId(52839), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x46__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x46__""")), ERef(RefProp(RefId(Id("""__x46__""")), EStr("""Value""")))).setId(52840), IReturn(ERef(RefId(Id("""__x46__""")))).setId(52841)).setId(52842), ISeq(List()).setId(53115)).setId(52843), IExpr(ERef(RefId(Id("""__x46__""")))).setId(52844))).setId(53118)).setId(52847), IAssign(RefId(Id("""__x43__""")), EBOp(OPlus, ERef(RefId(Id("""__x43__"""))), EINum(1L))).setId(52853))).setId(53121)).setId(52855), IAssign(RefId(Id("""__x40__""")), EBOp(OPlus, ERef(RefId(Id("""__x40__"""))), EINum(1L))).setId(52862))).setId(53124)).setId(52864), ILet(Id("""__x47__"""), ERef(RefId(Id("""functionsToInitialize""")))).setId(52882), ILet(Id("""__x48__"""), EINum(0L)).setId(52883), IWhile(EBOp(OLt, ERef(RefId(Id("""__x48__"""))), ERef(RefProp(RefId(Id("""__x47__""")), EStr("""length""")))), ISeq(List(ILet(Id("""f"""), ERef(RefProp(RefId(Id("""__x47__""")), ERef(RefId(Id("""__x48__""")))))).setId(52884), IAccess(Id("""__x49__"""), ERef(RefId(Id("""f"""))), EStr("""BoundNames""")).setId(52867), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x49__""")), EINum(0L)))).setId(52868), IAccess(Id("""__x50__"""), ERef(RefId(Id("""f"""))), EStr("""InstantiateFunctionObject""")).setId(52870), IApp(Id("""__x51__"""), ERef(RefId(Id("""__x50__"""))), List(ERef(RefId(Id("""lexEnv"""))))).setId(52871), ILet(Id("""fo"""), ERef(RefId(Id("""__x51__""")))).setId(52872), IApp(Id("""__x52__"""), ERef(RefProp(RefId(Id("""varEnvRec""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""varEnvRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(false))).setId(52874), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x52__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x52__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x52__""")), ERef(RefProp(RefId(Id("""__x52__""")), EStr("""Value""")))).setId(52875), IReturn(ERef(RefId(Id("""__x52__""")))).setId(52876)).setId(52877), ISeq(List()).setId(53138)).setId(52878), IExpr(ERef(RefId(Id("""__x52__""")))).setId(52879), IAssign(RefId(Id("""__x48__""")), EBOp(OPlus, ERef(RefId(Id("""__x48__"""))), EINum(1L))).setId(52885))).setId(53142)).setId(52887), IApp(Id("""__x53__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(52890), IApp(Id("""__x54__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x53__"""))))).setId(52891), IReturn(ERef(RefId(Id("""__x54__""")))).setId(52892))).setId(53147))
  val instToStepMap: Map[Int, Int] = HashMap(52737 -> 87, 52621 -> 30, 52658 -> 49, 52828 -> 117, 52880 -> 133, 52773 -> 108, 52796 -> 108, 52616 -> 25, 52597 -> 25, 52680 -> 66, 52851 -> 128, 52592 -> 13, 52573 -> 7, 52594 -> 14, 52638 -> 39, 52713 -> 70, 52768 -> 108, 52579 -> 8, 52760 -> 89, 52890 -> 134, 52702 -> 66, 52611 -> 25, 52653 -> 49, 52800 -> 108, 52670 -> 49, 52887 -> 133, 52873 -> 133, 52837 -> 125, 52648 -> 49, 52730 -> 76, 52626 -> 33, 52685 -> 61, 52585 -> 10, 52764 -> 89, 52569 -> 6, 52698 -> 66, 52566 -> 5, 52584 -> 10, 52883 -> 133, 52649 -> 49, 52751 -> 87, 52734 -> 76, 52761 -> 89, 52848 -> 128, 52602 -> 25, 52801 -> 108, 52820 -> 114, 52556 -> 1, 52630 -> 38, 52589 -> 12, 52681 -> 61, 52694 -> 64, 52617 -> 25, 52783 -> 108, 52857 -> 128, 52662 -> 49, 52712 -> 70, 52769 -> 108, 52576 -> 7, 52559 -> 2, 52606 -> 25, 52855 -> 128, 52844 -> 128, 52815 -> 113, 52868 -> 133, 52725 -> 76, 52634 -> 39, 52722 -> 73, 52593 -> 13, 52574 -> 7, 52845 -> 128, 52608 -> 25, 52770 -> 108, 52637 -> 39, 52591 -> 12, 52891 -> 134, 52810 -> 108, 52578 -> 8, 52738 -> 87, 52753 -> 89, 52729 -> 76, 52570 -> 7, 52557 -> 1, 52821 -> 114, 52774 -> 108, 52669 -> 49, 52850 -> 128, 52785 -> 103, 52588 -> 11, 52627 -> 38, 52871 -> 133, 52720 -> 73, 52874 -> 133, 52838 -> 125, 52598 -> 25, 52701 -> 66, 52601 -> 25, 52612 -> 25, 52733 -> 76, 52802 -> 108, 52817 -> 113, 52767 -> 108, 52716 -> 73, 52624 -> 33, 52867 -> 133, 52878 -> 133, 52697 -> 66, 52688 -> 61, 52811 -> 108, 52605 -> 25, 52565 -> 5, 52782 -> 108, 52799 -> 108, 52882 -> 133, 52824 -> 116, 52562 -> 3, 52620 -> 26, 52858 -> 128, 52633 -> 39, 52747 -> 87, 52792 -> 106, 52750 -> 87, 52656 -> 49, 52707 -> 69, 52814 -> 113, 52582 -> 9, 52560 -> 2, 52831 -> 125, 52675 -> 58, 52839 -> 128, 52809 -> 108, 52558 -> 1, 52607 -> 25, 52870 -> 133, 52803 -> 108, 52673 -> 54, 52723 -> 73, 52846 -> 128, 52577 -> 8, 52695 -> 64, 52663 -> 49, 52743 -> 87, 52754 -> 89, 52631 -> 38, 52564 -> 4, 52790 -> 106, 52826 -> 117, 52660 -> 49, 52777 -> 108, 52775 -> 108, 52856 -> 128, 52705 -> 66, 52818 -> 114, 52628 -> 38, 52587 -> 11, 52604 -> 25, 52554 -> 0, 52736 -> 89, 52849 -> 128, 52739 -> 87, 52700 -> 66, 52822 -> 115, 52786 -> 106, 52609 -> 25, 52641 -> 49, 52771 -> 108, 52568 -> 6, 52758 -> 89, 52795 -> 108, 52732 -> 76, 52872 -> 133, 52599 -> 25, 52687 -> 61, 52746 -> 87, 52571 -> 7, 52640 -> 49, 52715 -> 73, 52859 -> 128, 52798 -> 108, 52827 -> 117, 52668 -> 49, 52623 -> 30, 52704 -> 66, 52655 -> 49, 52744 -> 87, 52879 -> 133, 52808 -> 108, 52835 -> 125, 52676 -> 58, 52763 -> 89, 52813 -> 108, 52776 -> 108, 52636 -> 39, 52581 -> 9, 52595 -> 14, 52866 -> 128, 52766 -> 108, 52677 -> 58, 52749 -> 87, 52659 -> 49, 52619 -> 26, 52830 -> 128, 52781 -> 108, 52708 -> 69, 52672 -> 54, 52881 -> 133, 52561 -> 3, 52724 -> 76, 52709 -> 69, 52706 -> 66, 52759 -> 89, 52632 -> 38, 52679 -> 66, 52869 -> 133, 52812 -> 108, 52714 -> 70, 52580 -> 9, 52657 -> 49, 52563 -> 4, 52847 -> 128, 52825 -> 116, 52793 -> 106, 52819 -> 114, 52696 -> 64, 52674 -> 54, 52752 -> 87, 52689 -> 64, 52647 -> 49, 52622 -> 30, 52791 -> 106, 52654 -> 49, 52816 -> 113, 52625 -> 33, 52686 -> 61, 52586 -> 11, 52699 -> 66, 52567 -> 6, 52610 -> 25, 52735 -> 89, 52784 -> 103, 52603 -> 25, 52642 -> 49, 52748 -> 87, 52664 -> 49, 52823 -> 115, 52889 -> 133, 52629 -> 38, 52600 -> 25, 52590 -> 12, 52731 -> 76, 52836 -> 125, 52703 -> 66, 52583 -> 10, 52555 -> 0, 52762 -> 89, 52843 -> 128, 52671 -> 54, 52892 -> 134, 52639 -> 49, 52864 -> 128, 52721 -> 73, 52893 -> 134, 52804 -> 108, 52646 -> 49, 52572 -> 7, 52745 -> 87, 52711 -> 69, 52661 -> 49, 52865 -> 128, 52710 -> 69, 52575 -> 7, 52596 -> 128, 52829 -> 128, 52618 -> 25, 52797 -> 108, 52635 -> 39, 52678 -> 58, 52765 -> 89, 52794 -> 108, 52693 -> 64, 52860 -> 128, 52888 -> 133, 52772 -> 108)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(10 -> HashSet(52585, 52584, 52583), 106 -> HashSet(52792, 52790, 52786, 52795, 52793, 52791, 52794), 9 -> HashSet(52582, 52581, 52580), 13 -> HashSet(52592, 52593), 64 -> HashSet(52698, 52694, 52697, 52695, 52693, 52696, 52689), 112 -> HashSet(52815, 52814, 52816), 95 -> HashSet(52771, 52772), 87 -> HashSet(52737, 52760, 52751, 52746, 52744, 52749, 52759, 52752, 52748, 52745, 52738, 52753, 52747, 52750, 52743, 52754, 52739, 52758), 131 -> HashSet(52868, 52867, 52869), 69 -> HashSet(52707, 52708, 52709, 52711, 52710), 101 -> HashSet(52775, 52776), 0 -> HashSet(52554, 52555), 88 -> HashSet(52761, 52762), 115 -> HashSet(52822, 52823), 5 -> HashSet(52566, 52565), 120 -> HashSet(52596), 42 -> HashSet(52641, 52640, 52639), 24 -> HashSet(52596), 25 -> HashSet(52616, 52597, 52611, 52602, 52617, 52606, 52608, 52605, 52607, 52604, 52609, 52599, 52600, 52596, 52618, 52598, 52612, 52601, 52610, 52603), 14 -> HashSet(52594, 52595), 125 -> HashSet(52837, 52838, 52831, 52835, 52836), 20 -> HashSet(52597, 52598, 52599), 46 -> HashSet(52648, 52647, 52642, 52646), 93 -> HashSet(52768, 52767, 52766), 57 -> HashSet(52596), 29 -> HashSet(52596), 61 -> HashSet(52685, 52681, 52688, 52687, 52686), 132 -> HashSet(52873, 52871, 52870, 52872), 116 -> HashSet(52824, 52825), 1 -> HashSet(52556, 52557, 52558), 89 -> HashSet(52760, 52764, 52761, 52753, 52754, 52736, 52758, 52763, 52759, 52735, 52762, 52596, 52765), 133 -> HashSet(52880, 52887, 52873, 52883, 52868, 52882, 52870, 52872, 52879, 52881, 52869, 52889, 52888, 52871, 52874, 52867, 52878), 6 -> HashSet(52569, 52568, 52567), 117 -> HashSet(52828, 52826, 52827), 85 -> HashSet(52737, 52738), 102 -> HashSet(52783, 52782, 52777, 52781), 38 -> HashSet(52630, 52627, 52631, 52628, 52632, 52629), 70 -> HashSet(52713, 52712, 52714), 33 -> HashSet(52626, 52624, 52625), 92 -> HashSet(52596), 65 -> HashSet(52701, 52700, 52699), 109 -> HashSet(52596), 96 -> HashSet(52773, 52774), 134 -> HashSet(52890, 52891, 52892, 52893), 73 -> HashSet(52722, 52720, 52716, 52723, 52715, 52721), 128 -> HashSet(52851, 52848, 52857, 52845, 52850, 52858, 52856, 52849, 52859, 52866, 52830, 52847, 52860, 52855, 52844, 52839, 52846, 52843, 52864, 52865, 52596, 52829), 2 -> HashSet(52559, 52560), 12 -> HashSet(52589, 52591, 52590), 54 -> HashSet(52673, 52672, 52674, 52671), 49 -> HashSet(52658, 52648, 52649, 52662, 52669, 52656, 52641, 52640, 52659, 52657, 52647, 52654, 52653, 52670, 52663, 52660, 52655, 52668, 52642, 52664, 52646, 52639, 52661, 52596), 86 -> HashSet(52743, 52739, 52744, 52745), 113 -> HashSet(52815, 52817, 52814, 52816, 52596), 76 -> HashSet(52730, 52734, 52725, 52729, 52733, 52732, 52724, 52731), 7 -> HashSet(52573, 52576, 52574, 52570, 52571, 52572, 52575), 39 -> HashSet(52638, 52634, 52637, 52633, 52636, 52635), 103 -> HashSet(52785, 52784), 66 -> HashSet(52680, 52702, 52698, 52701, 52697, 52705, 52700, 52704, 52699, 52703, 52706, 52679), 108 -> HashSet(52768, 52800, 52801, 52770, 52810, 52774, 52799, 52771, 52795, 52798, 52781, 52812, 52804, 52596, 52773, 52796, 52783, 52769, 52802, 52767, 52782, 52811, 52809, 52803, 52777, 52775, 52808, 52813, 52776, 52766, 52797, 52772, 52794), 3 -> HashSet(52562, 52561), 80 -> HashSet(52736, 52735), 11 -> HashSet(52588, 52587, 52586), 43 -> HashSet(52596), 26 -> HashSet(52620, 52619), 114 -> HashSet(52820, 52821, 52818, 52819), 23 -> HashSet(52601, 52600), 8 -> HashSet(52579, 52578, 52577), 58 -> HashSet(52680, 52675, 52679, 52596, 52678, 52676, 52677), 30 -> HashSet(52621, 52623, 52622, 52596), 19 -> HashSet(52596), 107 -> HashSet(52796, 52798, 52797), 4 -> HashSet(52564, 52563), 79 -> HashSet(52596), 94 -> HashSet(52769, 52770))
  /* Beautified form:
  "FunctionDeclarationInstantiation" (func, argumentsList) => {
    let calleeContext = GLOBAL_context
    access __x0__ = (calleeContext "LexicalEnvironment")
    let env = __x0__
    let envRec = env["EnvironmentRecord"]
    let code = func["ECMAScriptCode"]
    let strict = func["Strict"]
    let formals = func["FormalParameters"]
    access __x1__ = (formals "BoundNames")
    let parameterNames = __x1__
    app __x2__ = (IsDuplicate parameterNames)
    if __x2__ let hasDuplicates = true else let hasDuplicates = false
    access __x3__ = (formals "IsSimpleParameterList")
    let simpleParameterList = __x3__
    access __x4__ = (formals "ContainsExpression")
    let hasParameterExpressions = __x4__
    access __x5__ = (code "VarDeclaredNames")
    let varNames = __x5__
    access __x6__ = (code "VarScopedDeclarations")
    let varDeclarations = __x6__
    access __x7__ = (code "LexicallyDeclaredNames")
    let lexicalNames = __x7__
    let functionNames = (new [])
    let functionsToInitialize = (new [])
    let __x8__ = varDeclarations
    let __x9__ = __x8__["length"]
    while (< 0i __x9__) {
      __x9__ = (- __x9__ 1i)
      let d = __x8__[__x9__]
      if (! (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier))) {
        access __x10__ = (d "BoundNames")
        let fn = __x10__[0i]
        if (! (contains functionNames fn)) {
          prepend fn -> functionNames
          prepend d -> functionsToInitialize
        } else {}
      } else {}
    }
    let argumentsObjectNeeded = true
    if (= func["ThisMode"] CONST_lexical) argumentsObjectNeeded = false else if (contains parameterNames "arguments") argumentsObjectNeeded = false else if (= hasParameterExpressions false) if (|| (contains functionNames "arguments") (contains lexicalNames "arguments")) argumentsObjectNeeded = false else {} else {}
    let __x11__ = parameterNames
    let __x12__ = 0i
    while (< __x12__ __x11__["length"]) {
      let paramName = __x11__[__x12__]
      app __x13__ = (envRec["HasBinding"] envRec paramName)
      let alreadyDeclared = __x13__
      if (= alreadyDeclared false) {
        app __x14__ = (envRec["CreateMutableBinding"] envRec paramName false)
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        __x14__
        if (= hasDuplicates true) {
          app __x15__ = (envRec["InitializeBinding"] envRec paramName undefined)
          if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
          __x15__
        } else {}
      } else {}
      __x12__ = (+ __x12__ 1i)
    }
    if (= argumentsObjectNeeded true) {
      if (|| (= strict true) (= simpleParameterList false)) {
        app __x16__ = (CreateUnmappedArgumentsObject argumentsList)
        let ao = __x16__
      } else {
        app __x17__ = (CreateMappedArgumentsObject func formals argumentsList envRec)
        let ao = __x17__
      }
      if (= strict true) {
        app __x18__ = (envRec["CreateImmutableBinding"] envRec "arguments" false)
        if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        __x18__
      } else {
        app __x19__ = (envRec["CreateMutableBinding"] envRec "arguments" false)
        if (= (typeof __x19__) "Completion") if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        __x19__
      }
      app __x20__ = (envRec["InitializeBinding"] envRec "arguments" ao)
      __x20__
      let __x21__ = (copy-obj parameterNames)
      append "arguments" -> __x21__
      let parameterBindings = __x21__
    } else let parameterBindings = parameterNames
    app __x22__ = (CreateListIteratorRecord argumentsList)
    let iteratorRecord = __x22__
    if (= hasDuplicates true) {
      access __x23__ = (formals "IteratorBindingInitialization")
      app __x24__ = (__x23__ iteratorRecord undefined)
      if (= (typeof __x24__) "Completion") if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
      __x24__
    } else {
      access __x25__ = (formals "IteratorBindingInitialization")
      app __x26__ = (__x25__ iteratorRecord env)
      if (= (typeof __x26__) "Completion") if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
      __x26__
    }
    if (= hasParameterExpressions false) {
      let instantiatedVarNames = (copy-obj parameterBindings)
      let __x27__ = varNames
      let __x28__ = 0i
      while (< __x28__ __x27__["length"]) {
        let n = __x27__[__x28__]
        if (! (contains instantiatedVarNames n)) {
          append n -> instantiatedVarNames
          app __x29__ = (envRec["CreateMutableBinding"] envRec n false)
          if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
          __x29__
          app __x30__ = (envRec["InitializeBinding"] envRec n undefined)
          __x30__
        } else {}
        __x28__ = (+ __x28__ 1i)
      }
      let varEnv = env
      let varEnvRec = envRec
    } else {
      app __x31__ = (NewDeclarativeEnvironment env)
      let varEnv = __x31__
      let varEnvRec = varEnv["EnvironmentRecord"]
      calleeContext["VariableEnvironment"] = varEnv
      let instantiatedVarNames = (new [])
      let __x32__ = varNames
      let __x33__ = 0i
      while (< __x33__ __x32__["length"]) {
        let n = __x32__[__x33__]
        if (! (contains instantiatedVarNames n)) {
          append n -> instantiatedVarNames
          app __x34__ = (varEnvRec["CreateMutableBinding"] varEnvRec n false)
          if (= (typeof __x34__) "Completion") if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
          __x34__
          if (|| (! (contains parameterBindings n)) (contains functionNames n)) let initialValue = undefined else {
            app __x35__ = (envRec["GetBindingValue"] envRec n false)
            if (= (typeof __x35__) "Completion") if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
            let initialValue = __x35__
          }
          app __x36__ = (varEnvRec["InitializeBinding"] varEnvRec n initialValue)
          __x36__
        } else {}
        __x33__ = (+ __x33__ 1i)
      }
    }
    if (= strict false) {
      app __x37__ = (NewDeclarativeEnvironment varEnv)
      let lexEnv = __x37__
    } else let lexEnv = varEnv
    let lexEnvRec = lexEnv["EnvironmentRecord"]
    calleeContext["LexicalEnvironment"] = lexEnv
    access __x38__ = (code "LexicallyScopedDeclarations")
    let lexDeclarations = __x38__
    let __x39__ = lexDeclarations
    let __x40__ = 0i
    while (< __x40__ __x39__["length"]) {
      let d = __x39__[__x40__]
      access __x41__ = (d "BoundNames")
      let __x42__ = __x41__
      let __x43__ = 0i
      while (< __x43__ __x42__["length"]) {
        let dn = __x42__[__x43__]
        access __x44__ = (d "IsConstantDeclaration")
        if (= __x44__ true) {
          app __x45__ = (lexEnvRec["CreateImmutableBinding"] lexEnvRec dn true)
          if (= (typeof __x45__) "Completion") if (= __x45__["Type"] CONST_normal) __x45__ = __x45__["Value"] else return __x45__ else {}
          __x45__
        } else {
          app __x46__ = (lexEnvRec["CreateMutableBinding"] lexEnvRec dn false)
          if (= (typeof __x46__) "Completion") if (= __x46__["Type"] CONST_normal) __x46__ = __x46__["Value"] else return __x46__ else {}
          __x46__
        }
        __x43__ = (+ __x43__ 1i)
      }
      __x40__ = (+ __x40__ 1i)
    }
    let __x47__ = functionsToInitialize
    let __x48__ = 0i
    while (< __x48__ __x47__["length"]) {
      let f = __x47__[__x48__]
      access __x49__ = (f "BoundNames")
      let fn = __x49__[0i]
      access __x50__ = (f "InstantiateFunctionObject")
      app __x51__ = (__x50__ lexEnv)
      let fo = __x51__
      app __x52__ = (varEnvRec["SetMutableBinding"] varEnvRec fn fo false)
      if (= (typeof __x52__) "Completion") if (= __x52__["Type"] CONST_normal) __x52__ = __x52__["Value"] else return __x52__ else {}
      __x52__
      __x48__ = (+ __x48__ 1i)
    }
    app __x53__ = (NormalCompletion CONST_empty)
    app __x54__ = (WrapCompletion __x53__)
    return __x54__
  }
  */
}
