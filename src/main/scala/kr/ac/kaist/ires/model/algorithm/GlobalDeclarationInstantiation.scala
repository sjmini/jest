package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalDeclarationInstantiation {
  val length: Int = 2
  val func: Func = Func("""GlobalDeclarationInstantiation""", List(Id("""script"""), Id("""env""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")))).setId(46449), IAccess(Id("""__x0__"""), ERef(RefId(Id("""script"""))), EStr("""LexicallyDeclaredNames""")).setId(46452), ILet(Id("""lexNames"""), ERef(RefId(Id("""__x0__""")))).setId(46453), IAccess(Id("""__x1__"""), ERef(RefId(Id("""script"""))), EStr("""VarDeclaredNames""")).setId(46455), ILet(Id("""varNames"""), ERef(RefId(Id("""__x1__""")))).setId(46456), ILet(Id("""__x2__"""), ERef(RefId(Id("""lexNames""")))).setId(46483), ILet(Id("""__x3__"""), EINum(0L)).setId(46484), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(46485), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasVarDeclaration"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(46458), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46459), IReturn(ERef(RefId(Id("""__x5__""")))).setId(46460))).setId(46687), ISeq(List()).setId(46688)).setId(46462), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasLexicalDeclaration"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(46464), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46465), IReturn(ERef(RefId(Id("""__x7__""")))).setId(46466))).setId(46693), ISeq(List()).setId(46694)).setId(46468), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasRestrictedGlobalProperty"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(46470), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(46471), IReturn(ERef(RefId(Id("""__x8__""")))).setId(46472)).setId(46473), ISeq(List()).setId(46700)).setId(46474), ILet(Id("""hasRestrictedGlobal"""), ERef(RefId(Id("""__x8__""")))).setId(46475), IIf(EBOp(OEq, ERef(RefId(Id("""hasRestrictedGlobal"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46477), IReturn(ERef(RefId(Id("""__x9__""")))).setId(46478))).setId(46705), ISeq(List()).setId(46706)).setId(46480), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(46486))).setId(46709)).setId(46488), ILet(Id("""__x10__"""), ERef(RefId(Id("""varNames""")))).setId(46498), ILet(Id("""__x11__"""), EINum(0L)).setId(46499), IWhile(EBOp(OLt, ERef(RefId(Id("""__x11__"""))), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x10__""")), ERef(RefId(Id("""__x11__""")))))).setId(46500), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasLexicalDeclaration"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(46491), IIf(EBOp(OEq, ERef(RefId(Id("""__x12__"""))), EBool(true)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46492), IReturn(ERef(RefId(Id("""__x13__""")))).setId(46493))).setId(46717), ISeq(List()).setId(46718)).setId(46495), IAssign(RefId(Id("""__x11__""")), EBOp(OPlus, ERef(RefId(Id("""__x11__"""))), EINum(1L))).setId(46501))).setId(46721)).setId(46503), IAccess(Id("""__x14__"""), ERef(RefId(Id("""script"""))), EStr("""VarScopedDeclarations""")).setId(46506), ILet(Id("""varDeclarations"""), ERef(RefId(Id("""__x14__""")))).setId(46507), ILet(Id("""functionsToInitialize"""), EList(List())).setId(46509), ILet(Id("""declaredFunctionNames"""), EList(List())).setId(46511), ILet(Id("""__x15__"""), ERef(RefId(Id("""varDeclarations""")))).setId(46539), ILet(Id("""__x16__"""), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""length""")))).setId(46540), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""__x16__""")))), ISeq(List(IAssign(RefId(Id("""__x16__""")), EBOp(OSub, ERef(RefId(Id("""__x16__"""))), EINum(1L))).setId(46541), ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x15__""")), ERef(RefId(Id("""__x16__""")))))).setId(46542), IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier"""))), ISeq(List(IAccess(Id("""__x17__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(46513), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x17__""")), EINum(0L)))).setId(46514), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""fn"""))))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CanDeclareGlobalFunction"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""fn"""))))).setId(46516), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))).setId(46517), IReturn(ERef(RefId(Id("""__x18__""")))).setId(46518)).setId(46519), ISeq(List()).setId(46737)).setId(46520), ILet(Id("""fnDefinable"""), ERef(RefId(Id("""__x18__""")))).setId(46521), IIf(EBOp(OEq, ERef(RefId(Id("""fnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46523), IReturn(ERef(RefId(Id("""__x19__""")))).setId(46524))).setId(46742), ISeq(List()).setId(46743)).setId(46526), IAppend(ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""declaredFunctionNames""")))).setId(46528), IPrepend(ERef(RefId(Id("""d"""))), ERef(RefId(Id("""functionsToInitialize""")))).setId(46530))).setId(46747), ISeq(List()).setId(46748)).setId(46533))).setId(46750), ISeq(List()).setId(46751)).setId(46536))).setId(46753)).setId(46544), ILet(Id("""declaredVarNames"""), EList(List())).setId(46547), ILet(Id("""__x20__"""), ERef(RefId(Id("""varDeclarations""")))).setId(46583), ILet(Id("""__x21__"""), EINum(0L)).setId(46584), IWhile(EBOp(OLt, ERef(RefId(Id("""__x21__"""))), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x20__""")), ERef(RefId(Id("""__x21__""")))))).setId(46585), IIf(EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier""")), ISeq(List(IAccess(Id("""__x22__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(46549), ILet(Id("""__x23__"""), ERef(RefId(Id("""__x22__""")))).setId(46571), ILet(Id("""__x24__"""), EINum(0L)).setId(46572), IWhile(EBOp(OLt, ERef(RefId(Id("""__x24__"""))), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x23__""")), ERef(RefId(Id("""__x24__""")))))).setId(46573), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""vn"""))))), ISeq(List(IApp(Id("""__x25__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CanDeclareGlobalVar"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""vn"""))))).setId(46550), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x25__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x25__""")), ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Value""")))).setId(46551), IReturn(ERef(RefId(Id("""__x25__""")))).setId(46552)).setId(46553), ISeq(List()).setId(46767)).setId(46554), ILet(Id("""vnDefinable"""), ERef(RefId(Id("""__x25__""")))).setId(46555), IIf(EBOp(OEq, ERef(RefId(Id("""vnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x26__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46557), IReturn(ERef(RefId(Id("""__x26__""")))).setId(46558))).setId(46772), ISeq(List()).setId(46773)).setId(46560), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredVarNames"""))), ERef(RefId(Id("""vn"""))))), IAppend(ERef(RefId(Id("""vn"""))), ERef(RefId(Id("""declaredVarNames""")))).setId(46562), ISeq(List()).setId(46776)).setId(46565))).setId(46778), ISeq(List()).setId(46779)).setId(46568), IAssign(RefId(Id("""__x24__""")), EBOp(OPlus, ERef(RefId(Id("""__x24__"""))), EINum(1L))).setId(46574))).setId(46782)).setId(46576))).setId(46784), ISeq(List()).setId(46785)).setId(46580), IAssign(RefId(Id("""__x21__""")), EBOp(OPlus, ERef(RefId(Id("""__x21__"""))), EINum(1L))).setId(46586))).setId(46788)).setId(46588), IAccess(Id("""__x27__"""), ERef(RefId(Id("""script"""))), EStr("""LexicallyScopedDeclarations""")).setId(46591), ILet(Id("""lexDeclarations"""), ERef(RefId(Id("""__x27__""")))).setId(46592), ILet(Id("""__x28__"""), ERef(RefId(Id("""lexDeclarations""")))).setId(46624), ILet(Id("""__x29__"""), EINum(0L)).setId(46625), IWhile(EBOp(OLt, ERef(RefId(Id("""__x29__"""))), ERef(RefProp(RefId(Id("""__x28__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x28__""")), ERef(RefId(Id("""__x29__""")))))).setId(46626), IAccess(Id("""__x30__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(46594), ILet(Id("""__x31__"""), ERef(RefId(Id("""__x30__""")))).setId(46615), ILet(Id("""__x32__"""), EINum(0L)).setId(46616), IWhile(EBOp(OLt, ERef(RefId(Id("""__x32__"""))), ERef(RefProp(RefId(Id("""__x31__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x31__""")), ERef(RefId(Id("""__x32__""")))))).setId(46617), IAccess(Id("""__x33__"""), ERef(RefId(Id("""d"""))), EStr("""IsConstantDeclaration""")).setId(46595), IIf(EBOp(OEq, ERef(RefId(Id("""__x33__"""))), EBool(true)), ISeq(List(IApp(Id("""__x34__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))).setId(46596), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x34__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))).setId(46597), IReturn(ERef(RefId(Id("""__x34__""")))).setId(46598)).setId(46599), ISeq(List()).setId(46804)).setId(46600), IExpr(ERef(RefId(Id("""__x34__""")))).setId(46601))).setId(46807), ISeq(List(IApp(Id("""__x35__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))).setId(46604), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x35__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x35__""")), ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Value""")))).setId(46605), IReturn(ERef(RefId(Id("""__x35__""")))).setId(46606)).setId(46607), ISeq(List()).setId(46812)).setId(46608), IExpr(ERef(RefId(Id("""__x35__""")))).setId(46609))).setId(46815)).setId(46612), IAssign(RefId(Id("""__x32__""")), EBOp(OPlus, ERef(RefId(Id("""__x32__"""))), EINum(1L))).setId(46618))).setId(46818)).setId(46620), IAssign(RefId(Id("""__x29__""")), EBOp(OPlus, ERef(RefId(Id("""__x29__"""))), EINum(1L))).setId(46627))).setId(46821)).setId(46629), ILet(Id("""__x36__"""), ERef(RefId(Id("""functionsToInitialize""")))).setId(46647), ILet(Id("""__x37__"""), EINum(0L)).setId(46648), IWhile(EBOp(OLt, ERef(RefId(Id("""__x37__"""))), ERef(RefProp(RefId(Id("""__x36__""")), EStr("""length""")))), ISeq(List(ILet(Id("""f"""), ERef(RefProp(RefId(Id("""__x36__""")), ERef(RefId(Id("""__x37__""")))))).setId(46649), IAccess(Id("""__x38__"""), ERef(RefId(Id("""f"""))), EStr("""BoundNames""")).setId(46632), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x38__""")), EINum(0L)))).setId(46633), IAccess(Id("""__x39__"""), ERef(RefId(Id("""f"""))), EStr("""InstantiateFunctionObject""")).setId(46635), IApp(Id("""__x40__"""), ERef(RefId(Id("""__x39__"""))), List(ERef(RefId(Id("""env"""))))).setId(46636), ILet(Id("""fo"""), ERef(RefId(Id("""__x40__""")))).setId(46637), IApp(Id("""__x41__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateGlobalFunctionBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(false))).setId(46639), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x41__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x41__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x41__""")), ERef(RefProp(RefId(Id("""__x41__""")), EStr("""Value""")))).setId(46640), IReturn(ERef(RefId(Id("""__x41__""")))).setId(46641)).setId(46642), ISeq(List()).setId(46835)).setId(46643), IExpr(ERef(RefId(Id("""__x41__""")))).setId(46644), IAssign(RefId(Id("""__x37__""")), EBOp(OPlus, ERef(RefId(Id("""__x37__"""))), EINum(1L))).setId(46650))).setId(46839)).setId(46652), ILet(Id("""__x42__"""), ERef(RefId(Id("""declaredVarNames""")))).setId(46663), ILet(Id("""__x43__"""), EINum(0L)).setId(46664), IWhile(EBOp(OLt, ERef(RefId(Id("""__x43__"""))), ERef(RefProp(RefId(Id("""__x42__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x42__""")), ERef(RefId(Id("""__x43__""")))))).setId(46665), IApp(Id("""__x44__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateGlobalVarBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""vn"""))), EBool(false))).setId(46655), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x44__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x44__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x44__""")), ERef(RefProp(RefId(Id("""__x44__""")), EStr("""Value""")))).setId(46656), IReturn(ERef(RefId(Id("""__x44__""")))).setId(46657)).setId(46658), ISeq(List()).setId(46848)).setId(46659), IExpr(ERef(RefId(Id("""__x44__""")))).setId(46660), IAssign(RefId(Id("""__x43__""")), EBOp(OPlus, ERef(RefId(Id("""__x43__"""))), EINum(1L))).setId(46666))).setId(46852)).setId(46668), IApp(Id("""__x45__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(46671), IApp(Id("""__x46__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x45__"""))))).setId(46672), IReturn(ERef(RefId(Id("""__x46__""")))).setId(46673))).setId(46857))
  val instToStepMap: Map[Int, Int] = HashMap(46590 -> 46, 46664 -> 68, 46537 -> 31, 46510 -> 16, 46615 -> 60, 46527 -> 31, 46647 -> 65, 46636 -> 65, 46495 -> 14, 46608 -> 60, 46558 -> 42, 46549 -> 46, 46668 -> 68, 46534 -> 31, 46453 -> 2, 46577 -> 46, 46604 -> 60, 46478 -> 11, 46562 -> 46, 46611 -> 60, 46505 -> 14, 46530 -> 31, 46545 -> 31, 46581 -> 46, 46672 -> 69, 46559 -> 42, 46477 -> 11, 46566 -> 46, 46616 -> 60, 46466 -> 8, 46660 -> 68, 46498 -> 14, 46648 -> 65, 46591 -> 49, 46462 -> 11, 46569 -> 46, 46653 -> 65, 46513 -> 31, 46491 -> 14, 46481 -> 11, 46596 -> 57, 46470 -> 11, 46523 -> 28, 46643 -> 65, 46621 -> 60, 46603 -> 57, 46538 -> 31, 46511 -> 17, 46556 -> 46, 46659 -> 68, 46610 -> 60, 46484 -> 11, 46633 -> 65, 46528 -> 31, 46469 -> 11, 46588 -> 46, 46459 -> 6, 46631 -> 60, 46646 -> 65, 46474 -> 11, 46571 -> 46, 46464 -> 11, 46496 -> 14, 46479 -> 11, 46601 -> 57, 46561 -> 46, 46663 -> 68, 46533 -> 31, 46506 -> 15, 46584 -> 46, 46614 -> 60, 46521 -> 31, 46489 -> 11, 46674 -> 69, 46595 -> 60, 46516 -> 31, 46475 -> 11, 46529 -> 31, 46580 -> 46, 46565 -> 46, 46456 -> 3, 46654 -> 65, 46457 -> 3, 46548 -> 32, 46669 -> 68, 46520 -> 31, 46622 -> 60, 46600 -> 57, 46507 -> 15, 46524 -> 28, 46560 -> 46, 46637 -> 65, 46452 -> 2, 46632 -> 65, 46555 -> 46, 46488 -> 11, 46465 -> 8, 46497 -> 14, 46492 -> 14, 46592 -> 49, 46570 -> 46, 46463 -> 11, 46525 -> 28, 46613 -> 60, 46583 -> 46, 46572 -> 46, 46483 -> 11, 46554 -> 46, 46594 -> 60, 46468 -> 11, 46544 -> 31, 46662 -> 68, 46539 -> 31, 46490 -> 11, 46630 -> 60, 46450 -> 0, 46512 -> 17, 46645 -> 65, 46568 -> 46, 46515 -> 31, 46579 -> 46, 46455 -> 3, 46480 -> 11, 46522 -> 31, 46532 -> 31, 46460 -> 6, 46673 -> 69, 46564 -> 46, 46451 -> 60, 46655 -> 68, 46476 -> 11, 46670 -> 68, 46536 -> 31, 46504 -> 14, 46458 -> 11, 46547 -> 32, 46638 -> 65, 46623 -> 60, 46576 -> 46, 46609 -> 60, 46540 -> 31, 46508 -> 15, 46467 -> 8, 46620 -> 60, 46494 -> 14, 46589 -> 46, 46526 -> 31, 46557 -> 42, 46509 -> 16, 46449 -> 0, 46652 -> 65, 46661 -> 68, 46624 -> 60, 46629 -> 60, 46499 -> 14, 46550 -> 46, 46635 -> 65, 46454 -> 2, 46567 -> 46, 46578 -> 46, 46625 -> 60, 46644 -> 65, 46602 -> 57, 46503 -> 14, 46582 -> 46, 46639 -> 65, 46546 -> 31, 46563 -> 46, 46482 -> 11, 46531 -> 31, 46593 -> 49, 46461 -> 6, 46493 -> 14, 46671 -> 69, 46514 -> 31, 46535 -> 31, 46634 -> 65, 46612 -> 60)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(10 -> HashSet(46470, 46474, 46475, 46476), 1 -> HashSet(46451), 28 -> HashSet(46523, 46524, 46525), 65 -> HashSet(46648, 46633, 46646, 46654, 46645, 46638, 46652, 46635, 46644, 46639, 46634, 46647, 46636, 46643, 46653, 46637, 46632), 9 -> HashSet(46468, 46469, 46464), 41 -> HashSet(46556, 46555, 46554, 46550), 2 -> HashSet(46453, 46452, 46454), 49 -> HashSet(46591, 46592, 46593), 7 -> HashSet(46462, 46463, 46458), 3 -> HashSet(46455, 46457, 46456), 23 -> HashSet(46451), 8 -> HashSet(46466, 46465, 46467), 30 -> HashSet(46528, 46529), 69 -> HashSet(46672, 46674, 46673, 46671), 0 -> HashSet(46450, 46449), 42 -> HashSet(46558, 46559, 46557), 24 -> HashSet(46513, 46515, 46514), 52 -> HashSet(46451), 14 -> HashSet(46495, 46505, 46498, 46491, 46496, 46504, 46494, 46499, 46503, 46493, 46497, 46492), 46 -> HashSet(46590, 46549, 46581, 46566, 46569, 46556, 46570, 46564, 46576, 46589, 46577, 46562, 46588, 46571, 46561, 46584, 46580, 46565, 46560, 46555, 46583, 46572, 46554, 46568, 46579, 46550, 46567, 46578, 46582, 46563), 57 -> HashSet(46601, 46600, 46602, 46603, 46596), 29 -> HashSet(46527, 46526), 6 -> HashSet(46459, 46460, 46461), 60 -> HashSet(46616, 46621, 46610, 46631, 46614, 46595, 46622, 46630, 46451, 46620, 46625, 46612, 46615, 46608, 46611, 46604, 46613, 46594, 46623, 46609, 46624, 46629), 32 -> HashSet(46548, 46547), 64 -> HashSet(46636, 46637, 46638, 46635), 17 -> HashSet(46511, 46512), 22 -> HashSet(46451), 27 -> HashSet(46520, 46522, 46521, 46516), 48 -> HashSet(46451), 63 -> HashSet(46633, 46632, 46634), 16 -> HashSet(46510, 46509), 31 -> HashSet(46537, 46527, 46534, 46513, 46533, 46529, 46520, 46532, 46451, 46536, 46540, 46526, 46514, 46535, 46530, 46545, 46538, 46528, 46521, 46516, 46544, 46539, 46515, 46522, 46546, 46531), 11 -> HashSet(46478, 46477, 46462, 46484, 46479, 46489, 46475, 46490, 46480, 46476, 46458, 46482, 46481, 46470, 46469, 46474, 46464, 46488, 46463, 46483, 46468), 43 -> HashSet(46561, 46560), 47 -> HashSet(46451), 15 -> HashSet(46506, 46507, 46508), 68 -> HashSet(46664, 46668, 46660, 46659, 46663, 46669, 46662, 46655, 46670, 46661))
  /* Beautified form:
  "GlobalDeclarationInstantiation" (script, env) => {
    let envRec = env["EnvironmentRecord"]
    access __x0__ = (script "LexicallyDeclaredNames")
    let lexNames = __x0__
    access __x1__ = (script "VarDeclaredNames")
    let varNames = __x1__
    let __x2__ = lexNames
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let name = __x2__[__x3__]
      app __x4__ = (envRec["HasVarDeclaration"] envRec name)
      if (= __x4__ true) {
        app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x5__
      } else {}
      app __x6__ = (envRec["HasLexicalDeclaration"] envRec name)
      if (= __x6__ true) {
        app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x7__
      } else {}
      app __x8__ = (envRec["HasRestrictedGlobalProperty"] envRec name)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let hasRestrictedGlobal = __x8__
      if (= hasRestrictedGlobal true) {
        app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x9__
      } else {}
      __x3__ = (+ __x3__ 1i)
    }
    let __x10__ = varNames
    let __x11__ = 0i
    while (< __x11__ __x10__["length"]) {
      let name = __x10__[__x11__]
      app __x12__ = (envRec["HasLexicalDeclaration"] envRec name)
      if (= __x12__ true) {
        app __x13__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x13__
      } else {}
      __x11__ = (+ __x11__ 1i)
    }
    access __x14__ = (script "VarScopedDeclarations")
    let varDeclarations = __x14__
    let functionsToInitialize = (new [])
    let declaredFunctionNames = (new [])
    let __x15__ = varDeclarations
    let __x16__ = __x15__["length"]
    while (< 0i __x16__) {
      __x16__ = (- __x16__ 1i)
      let d = __x15__[__x16__]
      if (! (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier))) {
        access __x17__ = (d "BoundNames")
        let fn = __x17__[0i]
        if (! (contains declaredFunctionNames fn)) {
          app __x18__ = (envRec["CanDeclareGlobalFunction"] envRec fn)
          if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
          let fnDefinable = __x18__
          if (= fnDefinable false) {
            app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x19__
          } else {}
          append fn -> declaredFunctionNames
          prepend d -> functionsToInitialize
        } else {}
      } else {}
    }
    let declaredVarNames = (new [])
    let __x20__ = varDeclarations
    let __x21__ = 0i
    while (< __x21__ __x20__["length"]) {
      let d = __x20__[__x21__]
      if (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier)) {
        access __x22__ = (d "BoundNames")
        let __x23__ = __x22__
        let __x24__ = 0i
        while (< __x24__ __x23__["length"]) {
          let vn = __x23__[__x24__]
          if (! (contains declaredFunctionNames vn)) {
            app __x25__ = (envRec["CanDeclareGlobalVar"] envRec vn)
            if (= (typeof __x25__) "Completion") if (= __x25__["Type"] CONST_normal) __x25__ = __x25__["Value"] else return __x25__ else {}
            let vnDefinable = __x25__
            if (= vnDefinable false) {
              app __x26__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
              return __x26__
            } else {}
            if (! (contains declaredVarNames vn)) append vn -> declaredVarNames else {}
          } else {}
          __x24__ = (+ __x24__ 1i)
        }
      } else {}
      __x21__ = (+ __x21__ 1i)
    }
    access __x27__ = (script "LexicallyScopedDeclarations")
    let lexDeclarations = __x27__
    let __x28__ = lexDeclarations
    let __x29__ = 0i
    while (< __x29__ __x28__["length"]) {
      let d = __x28__[__x29__]
      access __x30__ = (d "BoundNames")
      let __x31__ = __x30__
      let __x32__ = 0i
      while (< __x32__ __x31__["length"]) {
        let dn = __x31__[__x32__]
        access __x33__ = (d "IsConstantDeclaration")
        if (= __x33__ true) {
          app __x34__ = (envRec["CreateImmutableBinding"] envRec dn true)
          if (= (typeof __x34__) "Completion") if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
          __x34__
        } else {
          app __x35__ = (envRec["CreateMutableBinding"] envRec dn false)
          if (= (typeof __x35__) "Completion") if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
          __x35__
        }
        __x32__ = (+ __x32__ 1i)
      }
      __x29__ = (+ __x29__ 1i)
    }
    let __x36__ = functionsToInitialize
    let __x37__ = 0i
    while (< __x37__ __x36__["length"]) {
      let f = __x36__[__x37__]
      access __x38__ = (f "BoundNames")
      let fn = __x38__[0i]
      access __x39__ = (f "InstantiateFunctionObject")
      app __x40__ = (__x39__ env)
      let fo = __x40__
      app __x41__ = (envRec["CreateGlobalFunctionBinding"] envRec fn fo false)
      if (= (typeof __x41__) "Completion") if (= __x41__["Type"] CONST_normal) __x41__ = __x41__["Value"] else return __x41__ else {}
      __x41__
      __x37__ = (+ __x37__ 1i)
    }
    let __x42__ = declaredVarNames
    let __x43__ = 0i
    while (< __x43__ __x42__["length"]) {
      let vn = __x42__[__x43__]
      app __x44__ = (envRec["CreateGlobalVarBinding"] envRec vn false)
      if (= (typeof __x44__) "Completion") if (= __x44__["Type"] CONST_normal) __x44__ = __x44__["Value"] else return __x44__ else {}
      __x44__
      __x43__ = (+ __x43__ 1i)
    }
    app __x45__ = (NormalCompletion CONST_empty)
    app __x46__ = (WrapCompletion __x45__)
    return __x46__
  }
  */
}
