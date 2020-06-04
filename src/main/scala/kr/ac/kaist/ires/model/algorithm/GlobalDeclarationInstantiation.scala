package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalDeclarationInstantiation {
  val length: Int = 2
  val func: Func = Func("""GlobalDeclarationInstantiation""", List(Id("""script"""), Id("""env""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")))).setId(46449), IAccess(Id("""__x0__"""), ERef(RefId(Id("""script"""))), EStr("""LexicallyDeclaredNames""")).setId(46452), ILet(Id("""lexNames"""), ERef(RefId(Id("""__x0__""")))).setId(46453), IAccess(Id("""__x1__"""), ERef(RefId(Id("""script"""))), EStr("""VarDeclaredNames""")).setId(46455), ILet(Id("""varNames"""), ERef(RefId(Id("""__x1__""")))).setId(46456), ILet(Id("""__x2__"""), ERef(RefId(Id("""lexNames""")))).setId(46483), ILet(Id("""__x3__"""), EINum(0L)).setId(46484), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(46485), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasVarDeclaration"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(46458), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46459), IReturn(ERef(RefId(Id("""__x5__""")))).setId(46460))).setId(46461), ISeq(List()).setId(46451)).setId(46462), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasLexicalDeclaration"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(46464), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46465), IReturn(ERef(RefId(Id("""__x7__""")))).setId(46466))).setId(46467), ISeq(List()).setId(46451)).setId(46468), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasRestrictedGlobalProperty"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(46470), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(46471), IReturn(ERef(RefId(Id("""__x8__""")))).setId(46472)).setId(46473), ISeq(List()).setId(46451)).setId(46474), ILet(Id("""hasRestrictedGlobal"""), ERef(RefId(Id("""__x8__""")))).setId(46475), IIf(EBOp(OEq, ERef(RefId(Id("""hasRestrictedGlobal"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46477), IReturn(ERef(RefId(Id("""__x9__""")))).setId(46478))).setId(46479), ISeq(List()).setId(46451)).setId(46480), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(46486))).setId(46487)).setId(46488), ILet(Id("""__x10__"""), ERef(RefId(Id("""varNames""")))).setId(46498), ILet(Id("""__x11__"""), EINum(0L)).setId(46499), IWhile(EBOp(OLt, ERef(RefId(Id("""__x11__"""))), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x10__""")), ERef(RefId(Id("""__x11__""")))))).setId(46500), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasLexicalDeclaration"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(46491), IIf(EBOp(OEq, ERef(RefId(Id("""__x12__"""))), EBool(true)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46492), IReturn(ERef(RefId(Id("""__x13__""")))).setId(46493))).setId(46494), ISeq(List()).setId(46451)).setId(46495), IAssign(RefId(Id("""__x11__""")), EBOp(OPlus, ERef(RefId(Id("""__x11__"""))), EINum(1L))).setId(46501))).setId(46502)).setId(46503), IAccess(Id("""__x14__"""), ERef(RefId(Id("""script"""))), EStr("""VarScopedDeclarations""")).setId(46506), ILet(Id("""varDeclarations"""), ERef(RefId(Id("""__x14__""")))).setId(46507), ILet(Id("""functionsToInitialize"""), EList(List())).setId(46509), ILet(Id("""declaredFunctionNames"""), EList(List())).setId(46511), ILet(Id("""__x15__"""), ERef(RefId(Id("""varDeclarations""")))).setId(46539), ILet(Id("""__x16__"""), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""length""")))).setId(46540), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""__x16__""")))), ISeq(List(IAssign(RefId(Id("""__x16__""")), EBOp(OSub, ERef(RefId(Id("""__x16__"""))), EINum(1L))).setId(46541), ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x15__""")), ERef(RefId(Id("""__x16__""")))))).setId(46542), IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier"""))), ISeq(List(IAccess(Id("""__x17__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(46513), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x17__""")), EINum(0L)))).setId(46514), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""fn"""))))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CanDeclareGlobalFunction"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""fn"""))))).setId(46516), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))).setId(46517), IReturn(ERef(RefId(Id("""__x18__""")))).setId(46518)).setId(46519), ISeq(List()).setId(46451)).setId(46520), ILet(Id("""fnDefinable"""), ERef(RefId(Id("""__x18__""")))).setId(46521), IIf(EBOp(OEq, ERef(RefId(Id("""fnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46523), IReturn(ERef(RefId(Id("""__x19__""")))).setId(46524))).setId(46525), ISeq(List()).setId(46451)).setId(46526), IAppend(ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""declaredFunctionNames""")))).setId(46528), IPrepend(ERef(RefId(Id("""d"""))), ERef(RefId(Id("""functionsToInitialize""")))).setId(46530))).setId(46532), ISeq(List()).setId(46451)).setId(46533))).setId(46535), ISeq(List()).setId(46451)).setId(46536))).setId(46543)).setId(46544), ILet(Id("""declaredVarNames"""), EList(List())).setId(46547), ILet(Id("""__x20__"""), ERef(RefId(Id("""varDeclarations""")))).setId(46583), ILet(Id("""__x21__"""), EINum(0L)).setId(46584), IWhile(EBOp(OLt, ERef(RefId(Id("""__x21__"""))), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x20__""")), ERef(RefId(Id("""__x21__""")))))).setId(46585), IIf(EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """VariableDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """ForBinding""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """BindingIdentifier""")), ISeq(List(IAccess(Id("""__x22__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(46549), ILet(Id("""__x23__"""), ERef(RefId(Id("""__x22__""")))).setId(46571), ILet(Id("""__x24__"""), EINum(0L)).setId(46572), IWhile(EBOp(OLt, ERef(RefId(Id("""__x24__"""))), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x23__""")), ERef(RefId(Id("""__x24__""")))))).setId(46573), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredFunctionNames"""))), ERef(RefId(Id("""vn"""))))), ISeq(List(IApp(Id("""__x25__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CanDeclareGlobalVar"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""vn"""))))).setId(46550), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x25__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x25__""")), ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Value""")))).setId(46551), IReturn(ERef(RefId(Id("""__x25__""")))).setId(46552)).setId(46553), ISeq(List()).setId(46451)).setId(46554), ILet(Id("""vnDefinable"""), ERef(RefId(Id("""__x25__""")))).setId(46555), IIf(EBOp(OEq, ERef(RefId(Id("""vnDefinable"""))), EBool(false)), ISeq(List(IApp(Id("""__x26__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(46557), IReturn(ERef(RefId(Id("""__x26__""")))).setId(46558))).setId(46559), ISeq(List()).setId(46451)).setId(46560), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""declaredVarNames"""))), ERef(RefId(Id("""vn"""))))), IAppend(ERef(RefId(Id("""vn"""))), ERef(RefId(Id("""declaredVarNames""")))).setId(46562), ISeq(List()).setId(46451)).setId(46565))).setId(46567), ISeq(List()).setId(46451)).setId(46568), IAssign(RefId(Id("""__x24__""")), EBOp(OPlus, ERef(RefId(Id("""__x24__"""))), EINum(1L))).setId(46574))).setId(46575)).setId(46576))).setId(46579), ISeq(List()).setId(46451)).setId(46580), IAssign(RefId(Id("""__x21__""")), EBOp(OPlus, ERef(RefId(Id("""__x21__"""))), EINum(1L))).setId(46586))).setId(46587)).setId(46588), IAccess(Id("""__x27__"""), ERef(RefId(Id("""script"""))), EStr("""LexicallyScopedDeclarations""")).setId(46591), ILet(Id("""lexDeclarations"""), ERef(RefId(Id("""__x27__""")))).setId(46592), ILet(Id("""__x28__"""), ERef(RefId(Id("""lexDeclarations""")))).setId(46624), ILet(Id("""__x29__"""), EINum(0L)).setId(46625), IWhile(EBOp(OLt, ERef(RefId(Id("""__x29__"""))), ERef(RefProp(RefId(Id("""__x28__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x28__""")), ERef(RefId(Id("""__x29__""")))))).setId(46626), IAccess(Id("""__x30__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(46594), ILet(Id("""__x31__"""), ERef(RefId(Id("""__x30__""")))).setId(46615), ILet(Id("""__x32__"""), EINum(0L)).setId(46616), IWhile(EBOp(OLt, ERef(RefId(Id("""__x32__"""))), ERef(RefProp(RefId(Id("""__x31__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x31__""")), ERef(RefId(Id("""__x32__""")))))).setId(46617), IAccess(Id("""__x33__"""), ERef(RefId(Id("""d"""))), EStr("""IsConstantDeclaration""")).setId(46595), IIf(EBOp(OEq, ERef(RefId(Id("""__x33__"""))), EBool(true)), ISeq(List(IApp(Id("""__x34__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))).setId(46596), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x34__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))).setId(46597), IReturn(ERef(RefId(Id("""__x34__""")))).setId(46598)).setId(46599), ISeq(List()).setId(46451)).setId(46600), IExpr(ERef(RefId(Id("""__x34__""")))).setId(46601))).setId(46603), ISeq(List(IApp(Id("""__x35__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))).setId(46604), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x35__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x35__""")), ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Value""")))).setId(46605), IReturn(ERef(RefId(Id("""__x35__""")))).setId(46606)).setId(46607), ISeq(List()).setId(46451)).setId(46608), IExpr(ERef(RefId(Id("""__x35__""")))).setId(46609))).setId(46611)).setId(46612), IAssign(RefId(Id("""__x32__""")), EBOp(OPlus, ERef(RefId(Id("""__x32__"""))), EINum(1L))).setId(46618))).setId(46619)).setId(46620), IAssign(RefId(Id("""__x29__""")), EBOp(OPlus, ERef(RefId(Id("""__x29__"""))), EINum(1L))).setId(46627))).setId(46628)).setId(46629), ILet(Id("""__x36__"""), ERef(RefId(Id("""functionsToInitialize""")))).setId(46647), ILet(Id("""__x37__"""), EINum(0L)).setId(46648), IWhile(EBOp(OLt, ERef(RefId(Id("""__x37__"""))), ERef(RefProp(RefId(Id("""__x36__""")), EStr("""length""")))), ISeq(List(ILet(Id("""f"""), ERef(RefProp(RefId(Id("""__x36__""")), ERef(RefId(Id("""__x37__""")))))).setId(46649), IAccess(Id("""__x38__"""), ERef(RefId(Id("""f"""))), EStr("""BoundNames""")).setId(46632), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x38__""")), EINum(0L)))).setId(46633), IAccess(Id("""__x39__"""), ERef(RefId(Id("""f"""))), EStr("""InstantiateFunctionObject""")).setId(46635), IApp(Id("""__x40__"""), ERef(RefId(Id("""__x39__"""))), List(ERef(RefId(Id("""env"""))))).setId(46636), ILet(Id("""fo"""), ERef(RefId(Id("""__x40__""")))).setId(46637), IApp(Id("""__x41__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateGlobalFunctionBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))), EBool(false))).setId(46639), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x41__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x41__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x41__""")), ERef(RefProp(RefId(Id("""__x41__""")), EStr("""Value""")))).setId(46640), IReturn(ERef(RefId(Id("""__x41__""")))).setId(46641)).setId(46642), ISeq(List()).setId(46451)).setId(46643), IExpr(ERef(RefId(Id("""__x41__""")))).setId(46644), IAssign(RefId(Id("""__x37__""")), EBOp(OPlus, ERef(RefId(Id("""__x37__"""))), EINum(1L))).setId(46650))).setId(46651)).setId(46652), ILet(Id("""__x42__"""), ERef(RefId(Id("""declaredVarNames""")))).setId(46663), ILet(Id("""__x43__"""), EINum(0L)).setId(46664), IWhile(EBOp(OLt, ERef(RefId(Id("""__x43__"""))), ERef(RefProp(RefId(Id("""__x42__""")), EStr("""length""")))), ISeq(List(ILet(Id("""vn"""), ERef(RefProp(RefId(Id("""__x42__""")), ERef(RefId(Id("""__x43__""")))))).setId(46665), IApp(Id("""__x44__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateGlobalVarBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""vn"""))), EBool(false))).setId(46655), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x44__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x44__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x44__""")), ERef(RefProp(RefId(Id("""__x44__""")), EStr("""Value""")))).setId(46656), IReturn(ERef(RefId(Id("""__x44__""")))).setId(46657)).setId(46658), ISeq(List()).setId(46451)).setId(46659), IExpr(ERef(RefId(Id("""__x44__""")))).setId(46660), IAssign(RefId(Id("""__x43__""")), EBOp(OPlus, ERef(RefId(Id("""__x43__"""))), EINum(1L))).setId(46666))).setId(46667)).setId(46668), IApp(Id("""__x45__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(46671), IApp(Id("""__x46__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x45__"""))))).setId(46672), IReturn(ERef(RefId(Id("""__x46__""")))).setId(46673))).setId(-1))
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
