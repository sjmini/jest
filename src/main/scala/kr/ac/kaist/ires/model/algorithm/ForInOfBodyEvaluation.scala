package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ForInOfBodyEvaluation {
  val length: Int = 6
  val func: Func = Func("""ForInOfBodyEvaluation""", List(Id("""lhs"""), Id("""stmt"""), Id("""iteratorRecord"""), Id("""iterationKind"""), Id("""lhsKind"""), Id("""labelSet"""), Id("""iteratorKind""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""iteratorKind"""))), EAbsent), IAssign(RefId(Id("""iteratorKind""")), ERef(RefId(Id("""CONST_sync""")))).setId(33314), ISeq(List()).setId(33316)).setId(33317), ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(33319), ILet(Id("""V"""), EUndef).setId(33321), IAccess(Id("""__x0__"""), ERef(RefId(Id("""lhs"""))), EStr("""IsDestructuring""")).setId(33323), ILet(Id("""destructuring"""), ERef(RefId(Id("""__x0__""")))).setId(33324), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""destructuring"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""lhsKind"""))), ERef(RefId(Id("""CONST_assignment"""))))), ILet(Id("""assignmentPattern"""), EParseSyntax(ERef(RefId(Id("""lhs"""))), EStr("""AssignmentPattern"""), List())).setId(33326), ISeq(List()).setId(33316)).setId(33329), IWhile(EBool(true), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""NextMethod"""))), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator"""))))).setId(33331), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(33332), IReturn(ERef(RefId(Id("""__x1__""")))).setId(33333)).setId(33334), ISeq(List()).setId(33316)).setId(33335), ILet(Id("""nextResult"""), ERef(RefId(Id("""__x1__""")))).setId(33336), IIf(EBOp(OEq, ERef(RefId(Id("""iteratorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""nextResult"""))))).setId(33338), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(33339), IReturn(ERef(RefId(Id("""__x2__""")))).setId(33340)).setId(33341), ISeq(List()).setId(33316)).setId(33342), IAssign(RefId(Id("""nextResult""")), ERef(RefId(Id("""__x2__""")))).setId(33343))).setId(33344), ISeq(List()).setId(33316)).setId(33345), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""nextResult"""))))).setId(33347), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(33348), IReturn(ERef(RefId(Id("""__x4__""")))).setId(33349))).setId(33350), ISeq(List()).setId(33316)).setId(33351), IApp(Id("""__x5__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""nextResult"""))))).setId(33353), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(33354), IReturn(ERef(RefId(Id("""__x5__""")))).setId(33355)).setId(33356), ISeq(List()).setId(33316)).setId(33357), ILet(Id("""done"""), ERef(RefId(Id("""__x5__""")))).setId(33358), IIf(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(33360), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(33361), IReturn(ERef(RefId(Id("""__x7__""")))).setId(33362))).setId(33363), ISeq(List()).setId(33316)).setId(33364), IApp(Id("""__x8__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""nextResult"""))))).setId(33366), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(33367), IReturn(ERef(RefId(Id("""__x8__""")))).setId(33368)).setId(33369), ISeq(List()).setId(33316)).setId(33370), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x8__""")))).setId(33371), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""lhsKind"""))), ERef(RefId(Id("""CONST_assignment""")))), EBOp(OEq, ERef(RefId(Id("""lhsKind"""))), ERef(RefId(Id("""CONST_varBinding"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""destructuring"""))), EBool(false)), ISeq(List(IAccess(Id("""__x9__"""), ERef(RefId(Id("""lhs"""))), EStr("""Evaluation""")).setId(33374), ILet(Id("""lhsRef"""), ERef(RefId(Id("""__x9__""")))).setId(33375))).setId(33377), ISeq(List()).setId(33316)).setId(33378), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""oldEnv"""))))).setId(33381), ILet(Id("""iterationEnv"""), ERef(RefId(Id("""__x10__""")))).setId(33382), IAccess(Id("""__x11__"""), ERef(RefId(Id("""lhs"""))), EStr("""BindingInstantiation""")).setId(33384), IApp(Id("""__x12__"""), ERef(RefId(Id("""__x11__"""))), List(ERef(RefId(Id("""iterationEnv"""))))).setId(33385), IExpr(ERef(RefId(Id("""__x12__""")))).setId(33386), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""iterationEnv""")))).setId(33388), IIf(EBOp(OEq, ERef(RefId(Id("""destructuring"""))), EBool(false)), ISeq(List(IAccess(Id("""__x13__"""), ERef(RefId(Id("""lhs"""))), EStr("""BoundNames""")).setId(33390), ILet(Id("""lhsName"""), ERef(RefProp(RefId(Id("""__x13__""")), EINum(0L)))).setId(33391), IApp(Id("""__x14__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""lhsName"""))))).setId(33393), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(33394), IReturn(ERef(RefId(Id("""__x14__""")))).setId(33395)).setId(33396), ISeq(List()).setId(33316)).setId(33397), ILet(Id("""lhsRef"""), ERef(RefId(Id("""__x14__""")))).setId(33398))).setId(33400), ISeq(List()).setId(33316)).setId(33401))).setId(33403)).setId(33404), IIf(EBOp(OEq, ERef(RefId(Id("""destructuring"""))), EBool(false)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""lhsRef"""))))).setId(33406), IIf(ERef(RefId(Id("""__x15__"""))), ILet(Id("""status"""), ERef(RefId(Id("""lhsRef""")))).setId(33407), IIf(EBOp(OEq, ERef(RefId(Id("""lhsKind"""))), ERef(RefId(Id("""CONST_lexicalBinding""")))), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""InitializeReferencedBinding"""))), List(ERef(RefId(Id("""lhsRef"""))), ERef(RefId(Id("""nextValue"""))))).setId(33410), ILet(Id("""status"""), ERef(RefId(Id("""__x16__""")))).setId(33411))).setId(33413), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhsRef"""))), ERef(RefId(Id("""nextValue"""))))).setId(33414), ILet(Id("""status"""), ERef(RefId(Id("""__x17__""")))).setId(33415))).setId(33417)).setId(33418)).setId(33420))).setId(33422), IIf(EBOp(OEq, ERef(RefId(Id("""lhsKind"""))), ERef(RefId(Id("""CONST_assignment""")))), ISeq(List(IAccess(Id("""__x18__"""), ERef(RefId(Id("""assignmentPattern"""))), EStr("""DestructuringAssignmentEvaluation""")).setId(33423), IApp(Id("""__x19__"""), ERef(RefId(Id("""__x18__"""))), List(ERef(RefId(Id("""nextValue"""))))).setId(33424), ILet(Id("""status"""), ERef(RefId(Id("""__x19__""")))).setId(33425))).setId(33427), IIf(EBOp(OEq, ERef(RefId(Id("""lhsKind"""))), ERef(RefId(Id("""CONST_varBinding""")))), ISeq(List(IAccess(Id("""__x20__"""), ERef(RefId(Id("""lhs"""))), EStr("""BindingInitialization""")).setId(33428), IApp(Id("""__x21__"""), ERef(RefId(Id("""__x20__"""))), List(ERef(RefId(Id("""nextValue"""))), EUndef)).setId(33429), ILet(Id("""status"""), ERef(RefId(Id("""__x21__""")))).setId(33430))).setId(33432), ISeq(List(IAccess(Id("""__x22__"""), ERef(RefId(Id("""lhs"""))), EStr("""BindingInitialization""")).setId(33433), IApp(Id("""__x23__"""), ERef(RefId(Id("""__x22__"""))), List(ERef(RefId(Id("""nextValue"""))), ERef(RefId(Id("""iterationEnv"""))))).setId(33434), ILet(Id("""status"""), ERef(RefId(Id("""__x23__""")))).setId(33435))).setId(33437)).setId(33438)).setId(33440)).setId(33443), IApp(Id("""__x24__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(33445), IIf(ERef(RefId(Id("""__x24__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))).setId(33446), IIf(EBOp(OEq, ERef(RefId(Id("""iteratorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x25__"""), ERef(RefId(Id("""AsyncIteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(33448), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x25__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x25__""")), ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Value""")))).setId(33449), IReturn(ERef(RefId(Id("""__x25__""")))).setId(33450)).setId(33451), ISeq(List()).setId(33316)).setId(33452), IApp(Id("""__x26__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x25__"""))))).setId(33453), IReturn(ERef(RefId(Id("""__x26__""")))).setId(33454))).setId(33455), ISeq(List()).setId(33316)).setId(33456), IIf(EBOp(OEq, ERef(RefId(Id("""iterationKind"""))), ERef(RefId(Id("""CONST_enumerate""")))), ISeq(List(IApp(Id("""__x27__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(33458), IReturn(ERef(RefId(Id("""__x27__""")))).setId(33459))).setId(33461), ISeq(List(IApp(Id("""__x28__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(33462), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x28__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x28__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x28__""")), ERef(RefProp(RefId(Id("""__x28__""")), EStr("""Value""")))).setId(33463), IReturn(ERef(RefId(Id("""__x28__""")))).setId(33464)).setId(33465), ISeq(List()).setId(33316)).setId(33466), IApp(Id("""__x29__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x28__"""))))).setId(33467), IReturn(ERef(RefId(Id("""__x29__""")))).setId(33468))).setId(33470)).setId(33471))).setId(33473), ISeq(List()).setId(33316)).setId(33474), IAccess(Id("""__x30__"""), ERef(RefId(Id("""stmt"""))), EStr("""Evaluation""")).setId(33477), ILet(Id("""result"""), ERef(RefId(Id("""__x30__""")))).setId(33478), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))).setId(33480), IApp(Id("""__x31__"""), ERef(RefId(Id("""LoopContinues"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""labelSet"""))))).setId(33482), IIf(EBOp(OEq, ERef(RefId(Id("""__x31__"""))), EBool(false)), IIf(EBOp(OEq, ERef(RefId(Id("""iterationKind"""))), ERef(RefId(Id("""CONST_enumerate""")))), ISeq(List(IApp(Id("""__x32__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""V"""))))).setId(33483), IApp(Id("""__x33__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x32__"""))))).setId(33484), IApp(Id("""__x34__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x33__"""))))).setId(33485), IReturn(ERef(RefId(Id("""__x34__""")))).setId(33486))).setId(33488), ISeq(List(IApp(Id("""__x35__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""V"""))))).setId(33489), IAssign(RefId(Id("""status""")), ERef(RefId(Id("""__x35__""")))).setId(33490), IIf(EBOp(OEq, ERef(RefId(Id("""iteratorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x36__"""), ERef(RefId(Id("""AsyncIteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(33492), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x36__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x36__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x36__""")), ERef(RefProp(RefId(Id("""__x36__""")), EStr("""Value""")))).setId(33493), IReturn(ERef(RefId(Id("""__x36__""")))).setId(33494)).setId(33495), ISeq(List()).setId(33316)).setId(33496), IApp(Id("""__x37__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x36__"""))))).setId(33497), IReturn(ERef(RefId(Id("""__x37__""")))).setId(33498))).setId(33499), ISeq(List()).setId(33316)).setId(33500), IApp(Id("""__x38__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(33502), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x38__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x38__""")), ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Value""")))).setId(33503), IReturn(ERef(RefId(Id("""__x38__""")))).setId(33504)).setId(33505), ISeq(List()).setId(33316)).setId(33506), IApp(Id("""__x39__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x38__"""))))).setId(33507), IReturn(ERef(RefId(Id("""__x39__""")))).setId(33508))).setId(33510)).setId(33511), ISeq(List()).setId(33316)).setId(33514), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(33516), ISeq(List()).setId(33316)).setId(33518))).setId(33520)).setId(33521))).setId(-1))
  /* Beautified form:
  "ForInOfBodyEvaluation" (lhs, stmt, iteratorRecord, iterationKind, lhsKind, labelSet, iteratorKind) => {
    if (= iteratorKind absent) iteratorKind = CONST_sync else {}
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    let V = undefined
    access __x0__ = (lhs "IsDestructuring")
    let destructuring = __x0__
    if (&& (= destructuring true) (= lhsKind CONST_assignment)) let assignmentPattern = (parse-syntax lhs "AssignmentPattern" ) else {}
    while true {
      app __x1__ = (Call iteratorRecord["NextMethod"] iteratorRecord["Iterator"])
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let nextResult = __x1__
      if (= iteratorKind CONST_async) {
        app __x2__ = (Await nextResult)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        nextResult = __x2__
      } else {}
      app __x3__ = (Type nextResult)
      if (! (= __x3__ Object)) {
        app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x4__
      } else {}
      app __x5__ = (IteratorComplete nextResult)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let done = __x5__
      if (= done true) {
        app __x6__ = (NormalCompletion V)
        app __x7__ = (WrapCompletion __x6__)
        return __x7__
      } else {}
      app __x8__ = (IteratorValue nextResult)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let nextValue = __x8__
      if (|| (= lhsKind CONST_assignment) (= lhsKind CONST_varBinding)) if (= destructuring false) {
        access __x9__ = (lhs "Evaluation")
        let lhsRef = __x9__
      } else {} else {
        app __x10__ = (NewDeclarativeEnvironment oldEnv)
        let iterationEnv = __x10__
        access __x11__ = (lhs "BindingInstantiation")
        app __x12__ = (__x11__ iterationEnv)
        __x12__
        GLOBAL_context["LexicalEnvironment"] = iterationEnv
        if (= destructuring false) {
          access __x13__ = (lhs "BoundNames")
          let lhsName = __x13__[0i]
          app __x14__ = (ResolveBinding lhsName)
          if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
          let lhsRef = __x14__
        } else {}
      }
      if (= destructuring false) {
        app __x15__ = (IsAbruptCompletion lhsRef)
        if __x15__ let status = lhsRef else if (= lhsKind CONST_lexicalBinding) {
          app __x16__ = (InitializeReferencedBinding lhsRef nextValue)
          let status = __x16__
        } else {
          app __x17__ = (PutValue lhsRef nextValue)
          let status = __x17__
        }
      } else if (= lhsKind CONST_assignment) {
        access __x18__ = (assignmentPattern "DestructuringAssignmentEvaluation")
        app __x19__ = (__x18__ nextValue)
        let status = __x19__
      } else if (= lhsKind CONST_varBinding) {
        access __x20__ = (lhs "BindingInitialization")
        app __x21__ = (__x20__ nextValue undefined)
        let status = __x21__
      } else {
        access __x22__ = (lhs "BindingInitialization")
        app __x23__ = (__x22__ nextValue iterationEnv)
        let status = __x23__
      }
      app __x24__ = (IsAbruptCompletion status)
      if __x24__ {
        GLOBAL_context["LexicalEnvironment"] = oldEnv
        if (= iteratorKind CONST_async) {
          app __x25__ = (AsyncIteratorClose iteratorRecord status)
          if (= (typeof __x25__) "Completion") if (= __x25__["Type"] CONST_normal) __x25__ = __x25__["Value"] else return __x25__ else {}
          app __x26__ = (WrapCompletion __x25__)
          return __x26__
        } else {}
        if (= iterationKind CONST_enumerate) {
          app __x27__ = (WrapCompletion status)
          return __x27__
        } else {
          app __x28__ = (IteratorClose iteratorRecord status)
          if (= (typeof __x28__) "Completion") if (= __x28__["Type"] CONST_normal) __x28__ = __x28__["Value"] else return __x28__ else {}
          app __x29__ = (WrapCompletion __x28__)
          return __x29__
        }
      } else {}
      access __x30__ = (stmt "Evaluation")
      let result = __x30__
      GLOBAL_context["LexicalEnvironment"] = oldEnv
      app __x31__ = (LoopContinues result labelSet)
      if (= __x31__ false) if (= iterationKind CONST_enumerate) {
        app __x32__ = (UpdateEmpty result V)
        app __x33__ = (Completion __x32__)
        app __x34__ = (WrapCompletion __x33__)
        return __x34__
      } else {
        app __x35__ = (UpdateEmpty result V)
        status = __x35__
        if (= iteratorKind CONST_async) {
          app __x36__ = (AsyncIteratorClose iteratorRecord status)
          if (= (typeof __x36__) "Completion") if (= __x36__["Type"] CONST_normal) __x36__ = __x36__["Value"] else return __x36__ else {}
          app __x37__ = (WrapCompletion __x36__)
          return __x37__
        } else {}
        app __x38__ = (IteratorClose iteratorRecord status)
        if (= (typeof __x38__) "Completion") if (= __x38__["Type"] CONST_normal) __x38__ = __x38__["Value"] else return __x38__ else {}
        app __x39__ = (WrapCompletion __x38__)
        return __x39__
      } else {}
      if (! (= result["Value"] CONST_empty)) V = result["Value"] else {}
    }
  }
  */
}
