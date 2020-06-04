package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassTail0ClassDefinitionEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""ClassTail0ClassDefinitionEvaluation3""", List(Id("""this"""), Id("""ClassHeritage"""), Id("""ClassBody"""), Id("""classBinding"""), Id("""className""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(42697), ILet(Id("""lex"""), ERef(RefId(Id("""__x0__""")))).setId(42698), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""lex"""))))).setId(42700), ILet(Id("""classScope"""), ERef(RefId(Id("""__x1__""")))).setId(42701), ILet(Id("""classScopeEnvRec"""), ERef(RefProp(RefId(Id("""classScope""")), EStr("""EnvironmentRecord""")))).setId(42703), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""classBinding"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""classScopeEnvRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""classScopeEnvRec"""))), ERef(RefId(Id("""classBinding"""))), EBool(true))).setId(42705), IExpr(ERef(RefId(Id("""__x2__""")))).setId(42706))).setId(42708), ISeq(List()).setId(42709)).setId(42710), IIf(EBOp(OEq, ERef(RefId(Id("""ClassHeritage"""))), EAbsent), ISeq(List(ILet(Id("""protoParent"""), ERef(RefId(Id("""INTRINSIC_ObjectPrototype""")))).setId(42712), ILet(Id("""constructorParent"""), ERef(RefId(Id("""INTRINSIC_FunctionPrototype""")))).setId(42714))).setId(42716), ISeq(List(IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""classScope""")))).setId(42717), IAccess(Id("""__x3__"""), ERef(RefId(Id("""ClassHeritage"""))), EStr("""Evaluation""")).setId(42720), ILet(Id("""superclassRef"""), ERef(RefId(Id("""__x3__""")))).setId(42721), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lex""")))).setId(42723), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""superclassRef"""))))).setId(42725), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(42726), IReturn(ERef(RefId(Id("""__x4__""")))).setId(42727)).setId(42728), ISeq(List()).setId(42709)).setId(42729), ILet(Id("""superclass"""), ERef(RefId(Id("""__x4__""")))).setId(42730), IIf(EBOp(OEq, ERef(RefId(Id("""superclass"""))), ENull), ISeq(List(ILet(Id("""protoParent"""), ENull).setId(42732), ILet(Id("""constructorParent"""), ERef(RefId(Id("""INTRINSIC_FunctionPrototype""")))).setId(42734))).setId(42736), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""superclass"""))))).setId(42737), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(42738), IReturn(ERef(RefId(Id("""__x6__""")))).setId(42739))).setId(42740), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""superclass"""))), EStr("""prototype"""))).setId(42741), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(42742), IReturn(ERef(RefId(Id("""__x7__""")))).setId(42743)).setId(42744), ISeq(List()).setId(42709)).setId(42745), ILet(Id("""protoParent"""), ERef(RefId(Id("""__x7__""")))).setId(42746), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""protoParent"""))))).setId(42748), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Object""")))), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Null""")))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(42749), IReturn(ERef(RefId(Id("""__x9__""")))).setId(42750))).setId(42751), ISeq(List()).setId(42709)).setId(42752), ILet(Id("""constructorParent"""), ERef(RefId(Id("""superclass""")))).setId(42754))).setId(42756)).setId(42757))).setId(42758)).setId(42759))).setId(42761)).setId(42762), IApp(Id("""__x10__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""protoParent"""))))).setId(42764), ILet(Id("""proto"""), ERef(RefId(Id("""__x10__""")))).setId(42765), IIf(EBOp(OEq, ERef(RefId(Id("""ClassBody"""))), EAbsent), ILet(Id("""constructor"""), ERef(RefId(Id("""CONST_empty""")))).setId(42767), ISeq(List(IAccess(Id("""__x11__"""), ERef(RefId(Id("""ClassBody"""))), EStr("""ConstructorMethod""")).setId(42769), ILet(Id("""constructor"""), ERef(RefId(Id("""__x11__""")))).setId(42770))).setId(42771)).setId(42772), IIf(EBOp(OEq, ERef(RefId(Id("""constructor"""))), ERef(RefId(Id("""CONST_empty""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""ClassHeritage"""))), EAbsent)), IAssign(RefId(Id("""constructor""")), EParseSyntax(EStr("""constructor(...args) { super(...args); }"""), EStr("""MethodDefinition"""), List(EBool(false), EBool(false)))).setId(42774), IAssign(RefId(Id("""constructor""")), EParseSyntax(EStr("""constructor() {}"""), EStr("""MethodDefinition"""), List(EBool(false), EBool(false)))).setId(42777)).setId(42780), ISeq(List()).setId(42709)).setId(42783), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""classScope""")))).setId(42785), IAccess(Id("""__x12__"""), ERef(RefId(Id("""constructor"""))), EStr("""DefineMethod""")).setId(42787), IApp(Id("""__x13__"""), ERef(RefId(Id("""__x12__"""))), List(ERef(RefId(Id("""proto"""))), ERef(RefId(Id("""constructorParent"""))))).setId(42788), ILet(Id("""constructorInfo"""), ERef(RefId(Id("""__x13__""")))).setId(42789), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""constructorInfo""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""constructorInfo""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""constructorInfo""")), ERef(RefProp(RefId(Id("""constructorInfo""")), EStr("""Value""")))).setId(42791), IReturn(ERef(RefId(Id("""constructorInfo""")))).setId(42792)).setId(42793), ISeq(List()).setId(42709)).setId(42794), IExpr(ERef(RefId(Id("""constructorInfo""")))).setId(42795), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""constructorInfo""")), EStr("""Closure""")))).setId(42797), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""ClassHeritage"""))), EAbsent)), IAssign(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind""")), EStr("""derived""")).setId(42799), ISeq(List()).setId(42709)).setId(42801), IApp(Id("""__x14__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""F"""))), EBool(false), ERef(RefId(Id("""proto"""))))).setId(42803), IExpr(ERef(RefId(Id("""__x14__""")))).setId(42804), IApp(Id("""__x15__"""), ERef(RefId(Id("""MakeClassConstructor"""))), List(ERef(RefId(Id("""F"""))))).setId(42806), IExpr(ERef(RefId(Id("""__x15__""")))).setId(42807), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""className"""))), EUndef)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""className"""))))).setId(42809), IExpr(ERef(RefId(Id("""__x16__""")))).setId(42810))).setId(42812), ISeq(List()).setId(42709)).setId(42813), IApp(Id("""__x17__"""), ERef(RefId(Id("""CreateMethodProperty"""))), List(ERef(RefId(Id("""proto"""))), EStr("""constructor"""), ERef(RefId(Id("""F"""))))).setId(42815), IExpr(ERef(RefId(Id("""__x17__""")))).setId(42816), IIf(EBOp(OEq, ERef(RefId(Id("""ClassBody"""))), EAbsent), ILet(Id("""methods"""), EList(List())).setId(42818), ISeq(List(IAccess(Id("""__x18__"""), ERef(RefId(Id("""ClassBody"""))), EStr("""NonConstructorMethodDefinitions""")).setId(42820), ILet(Id("""methods"""), ERef(RefId(Id("""__x18__""")))).setId(42821))).setId(42822)).setId(42823), ILet(Id("""__x19__"""), ERef(RefId(Id("""methods""")))).setId(42849), ILet(Id("""__x20__"""), EINum(0L)).setId(42850), IWhile(EBOp(OLt, ERef(RefId(Id("""__x20__"""))), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""length""")))), ISeq(List(ILet(Id("""m"""), ERef(RefProp(RefId(Id("""__x19__""")), ERef(RefId(Id("""__x20__""")))))).setId(42851), IAccess(Id("""__x21__"""), ERef(RefId(Id("""m"""))), EStr("""IsStatic""")).setId(42825), IIf(EBOp(OEq, ERef(RefId(Id("""__x21__"""))), EBool(false)), ISeq(List(IAccess(Id("""__x22__"""), ERef(RefId(Id("""m"""))), EStr("""PropertyDefinitionEvaluation""")).setId(42826), IApp(Id("""__x23__"""), ERef(RefId(Id("""__x22__"""))), List(ERef(RefId(Id("""proto"""))), EBool(false))).setId(42827), ILet(Id("""status"""), ERef(RefId(Id("""__x23__""")))).setId(42828))).setId(42830), ISeq(List(IAccess(Id("""__x24__"""), ERef(RefId(Id("""m"""))), EStr("""PropertyDefinitionEvaluation""")).setId(42831), IApp(Id("""__x25__"""), ERef(RefId(Id("""__x24__"""))), List(ERef(RefId(Id("""F"""))), EBool(false))).setId(42832), ILet(Id("""status"""), ERef(RefId(Id("""__x25__""")))).setId(42833))).setId(42835)).setId(42836), IApp(Id("""__x26__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(42838), IIf(ERef(RefId(Id("""__x26__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lex""")))).setId(42839), IApp(Id("""__x27__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(42841), IApp(Id("""__x28__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x27__"""))))).setId(42842), IReturn(ERef(RefId(Id("""__x28__""")))).setId(42843))).setId(42845), ISeq(List()).setId(42709)).setId(42846), IAssign(RefId(Id("""__x20__""")), EBOp(OPlus, ERef(RefId(Id("""__x20__"""))), EINum(1L))).setId(42852))).setId(42853)).setId(42854), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lex""")))).setId(42857), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""classBinding"""))), EUndef)), ISeq(List(IApp(Id("""__x29__"""), ERef(RefProp(RefId(Id("""classScopeEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""classScopeEnvRec"""))), ERef(RefId(Id("""classBinding"""))), ERef(RefId(Id("""F"""))))).setId(42859), IExpr(ERef(RefId(Id("""__x29__""")))).setId(42860))).setId(42862), ISeq(List()).setId(42709)).setId(42863), IApp(Id("""__x30__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(42865), IReturn(ERef(RefId(Id("""__x30__""")))).setId(42866))).setId(-1))
  /* Beautified form:
  "ClassTail0ClassDefinitionEvaluation3" (this, ClassHeritage, ClassBody, classBinding, className) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let lex = __x0__
    app __x1__ = (NewDeclarativeEnvironment lex)
    let classScope = __x1__
    let classScopeEnvRec = classScope["EnvironmentRecord"]
    if (! (= classBinding undefined)) {
      app __x2__ = (classScopeEnvRec["CreateImmutableBinding"] classScopeEnvRec classBinding true)
      __x2__
    } else {}
    if (= ClassHeritage absent) {
      let protoParent = INTRINSIC_ObjectPrototype
      let constructorParent = INTRINSIC_FunctionPrototype
    } else {
      GLOBAL_context["LexicalEnvironment"] = classScope
      access __x3__ = (ClassHeritage "Evaluation")
      let superclassRef = __x3__
      GLOBAL_context["LexicalEnvironment"] = lex
      app __x4__ = (GetValue superclassRef)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let superclass = __x4__
      if (= superclass null) {
        let protoParent = null
        let constructorParent = INTRINSIC_FunctionPrototype
      } else {
        app __x5__ = (IsConstructor superclass)
        if (= __x5__ false) {
          app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x6__
        } else {
          app __x7__ = (Get superclass "prototype")
          if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          let protoParent = __x7__
          app __x8__ = (Type protoParent)
          if (! (|| (= __x8__ Object) (= __x8__ Null))) {
            app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x9__
          } else {}
          let constructorParent = superclass
        }
      }
    }
    app __x10__ = (ObjectCreate protoParent)
    let proto = __x10__
    if (= ClassBody absent) let constructor = CONST_empty else {
      access __x11__ = (ClassBody "ConstructorMethod")
      let constructor = __x11__
    }
    if (= constructor CONST_empty) if (! (= ClassHeritage absent)) constructor = (parse-syntax "constructor(...args) { super(...args); }" "MethodDefinition" false false) else constructor = (parse-syntax "constructor() {}" "MethodDefinition" false false) else {}
    GLOBAL_context["LexicalEnvironment"] = classScope
    access __x12__ = (constructor "DefineMethod")
    app __x13__ = (__x12__ proto constructorParent)
    let constructorInfo = __x13__
    if (= (typeof constructorInfo) "Completion") if (= constructorInfo["Type"] CONST_normal) constructorInfo = constructorInfo["Value"] else return constructorInfo else {}
    constructorInfo
    let F = constructorInfo["Closure"]
    if (! (= ClassHeritage absent)) F["ConstructorKind"] = "derived" else {}
    app __x14__ = (MakeConstructor F false proto)
    __x14__
    app __x15__ = (MakeClassConstructor F)
    __x15__
    if (! (= className undefined)) {
      app __x16__ = (SetFunctionName F className)
      __x16__
    } else {}
    app __x17__ = (CreateMethodProperty proto "constructor" F)
    __x17__
    if (= ClassBody absent) let methods = (new []) else {
      access __x18__ = (ClassBody "NonConstructorMethodDefinitions")
      let methods = __x18__
    }
    let __x19__ = methods
    let __x20__ = 0i
    while (< __x20__ __x19__["length"]) {
      let m = __x19__[__x20__]
      access __x21__ = (m "IsStatic")
      if (= __x21__ false) {
        access __x22__ = (m "PropertyDefinitionEvaluation")
        app __x23__ = (__x22__ proto false)
        let status = __x23__
      } else {
        access __x24__ = (m "PropertyDefinitionEvaluation")
        app __x25__ = (__x24__ F false)
        let status = __x25__
      }
      app __x26__ = (IsAbruptCompletion status)
      if __x26__ {
        GLOBAL_context["LexicalEnvironment"] = lex
        app __x27__ = (Completion status)
        app __x28__ = (WrapCompletion __x27__)
        return __x28__
      } else {}
      __x20__ = (+ __x20__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = lex
    if (! (= classBinding undefined)) {
      app __x29__ = (classScopeEnvRec["InitializeBinding"] classScopeEnvRec classBinding F)
      __x29__
    } else {}
    app __x30__ = (WrapCompletion F)
    return __x30__
  }
  */
}
