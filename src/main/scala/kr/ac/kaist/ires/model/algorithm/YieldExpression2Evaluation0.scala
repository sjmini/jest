package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object YieldExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""YieldExpression2Evaluation0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()).setId(40651), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(40652), IReturn(ERef(RefId(Id("""__x0__""")))).setId(40653)).setId(40654), ISeq(List()).setId(40655)).setId(40656), ILet(Id("""generatorKind"""), ERef(RefId(Id("""__x0__""")))).setId(40657), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(40660), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x1__""")))).setId(40661), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(40663), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(40664), IReturn(ERef(RefId(Id("""__x2__""")))).setId(40665)).setId(40666), ISeq(List()).setId(40655)).setId(40667), ILet(Id("""value"""), ERef(RefId(Id("""__x2__""")))).setId(40668), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""generatorKind"""))))).setId(40670), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(40671), IReturn(ERef(RefId(Id("""__x3__""")))).setId(40672)).setId(40673), ISeq(List()).setId(40655)).setId(40674), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x3__""")))).setId(40675), ILet(Id("""iterator"""), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator""")))).setId(40677), IApp(Id("""__x4__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(40679), ILet(Id("""received"""), ERef(RefId(Id("""__x4__""")))).setId(40680), IWhile(EBool(true), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""received""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""NextMethod"""))), ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Iterator"""))), EList(List(ERef(RefProp(RefId(Id("""received""")), EStr("""Value"""))))))).setId(40682), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(40683), IReturn(ERef(RefId(Id("""__x5__""")))).setId(40684)).setId(40685), ISeq(List()).setId(40655)).setId(40686), ILet(Id("""innerResult"""), ERef(RefId(Id("""__x5__""")))).setId(40687), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40689), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(40690), IReturn(ERef(RefId(Id("""__x6__""")))).setId(40691)).setId(40692), ISeq(List()).setId(40655)).setId(40693), IAssign(RefId(Id("""innerResult""")), ERef(RefId(Id("""__x6__""")))).setId(40694))).setId(40695), ISeq(List()).setId(40655)).setId(40696), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40698), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(40699), IReturn(ERef(RefId(Id("""__x8__""")))).setId(40700))).setId(40701), ISeq(List()).setId(40655)).setId(40702), IApp(Id("""__x9__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40704), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(40705), IReturn(ERef(RefId(Id("""__x9__""")))).setId(40706)).setId(40707), ISeq(List()).setId(40655)).setId(40708), ILet(Id("""done"""), ERef(RefId(Id("""__x9__""")))).setId(40709), IIf(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40711), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(40712), IReturn(ERef(RefId(Id("""__x10__""")))).setId(40713)).setId(40714), ISeq(List()).setId(40655)).setId(40715), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(40716), IReturn(ERef(RefId(Id("""__x11__""")))).setId(40717))).setId(40719), ISeq(List()).setId(40655)).setId(40720), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40722), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(40723), IReturn(ERef(RefId(Id("""__x12__""")))).setId(40724)).setId(40725), ISeq(List()).setId(40655)).setId(40726), IApp(Id("""__x13__"""), ERef(RefId(Id("""AsyncGeneratorYield"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(40727), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x13__""")))).setId(40728))).setId(40729), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""GeneratorYield"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40730), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x14__""")))).setId(40731))).setId(40732)).setId(40733))).setId(40735), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""received""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""throw"""))).setId(40736), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(40737), IReturn(ERef(RefId(Id("""__x15__""")))).setId(40738)).setId(40739), ISeq(List()).setId(40655)).setId(40740), ILet(Id("""throw"""), ERef(RefId(Id("""__x15__""")))).setId(40741), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""throw"""))), EUndef)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""throw"""))), ERef(RefId(Id("""iterator"""))), EList(List(ERef(RefProp(RefId(Id("""received""")), EStr("""Value"""))))))).setId(40743), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(40744), IReturn(ERef(RefId(Id("""__x16__""")))).setId(40745)).setId(40746), ISeq(List()).setId(40655)).setId(40747), ILet(Id("""innerResult"""), ERef(RefId(Id("""__x16__""")))).setId(40748), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40750), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))).setId(40751), IReturn(ERef(RefId(Id("""__x17__""")))).setId(40752)).setId(40753), ISeq(List()).setId(40655)).setId(40754), IAssign(RefId(Id("""innerResult""")), ERef(RefId(Id("""__x17__""")))).setId(40755))).setId(40756), ISeq(List()).setId(40655)).setId(40757), IApp(Id("""__x18__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40759), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x18__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(40760), IReturn(ERef(RefId(Id("""__x19__""")))).setId(40761))).setId(40762), ISeq(List()).setId(40655)).setId(40763), IApp(Id("""__x20__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40765), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))).setId(40766), IReturn(ERef(RefId(Id("""__x20__""")))).setId(40767)).setId(40768), ISeq(List()).setId(40655)).setId(40769), ILet(Id("""done"""), ERef(RefId(Id("""__x20__""")))).setId(40770), IIf(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(true)), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40772), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x21__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x21__""")), ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Value""")))).setId(40773), IReturn(ERef(RefId(Id("""__x21__""")))).setId(40774)).setId(40775), ISeq(List()).setId(40655)).setId(40776), IApp(Id("""__x22__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x21__"""))))).setId(40777), IReturn(ERef(RefId(Id("""__x22__""")))).setId(40778))).setId(40780), ISeq(List()).setId(40655)).setId(40781), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40783), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x23__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x23__""")), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Value""")))).setId(40784), IReturn(ERef(RefId(Id("""__x23__""")))).setId(40785)).setId(40786), ISeq(List()).setId(40655)).setId(40787), IApp(Id("""__x24__"""), ERef(RefId(Id("""AsyncGeneratorYield"""))), List(ERef(RefId(Id("""__x23__"""))))).setId(40788), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x24__""")))).setId(40789))).setId(40790), ISeq(List(IApp(Id("""__x25__"""), ERef(RefId(Id("""GeneratorYield"""))), List(ERef(RefId(Id("""innerResult"""))))).setId(40791), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x25__""")))).setId(40792))).setId(40793)).setId(40794))).setId(40796), ISeq(List(ILet(Id("""closeCompletion"""), EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_normal""")))), (EStr("""Value"""), ERef(RefId(Id("""CONST_empty""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty"""))))))).setId(40797), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x26__"""), ERef(RefId(Id("""AsyncIteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""closeCompletion"""))))).setId(40799), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x26__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))).setId(40800), IReturn(ERef(RefId(Id("""__x26__""")))).setId(40801)).setId(40802), ISeq(List()).setId(40655)).setId(40803), IExpr(ERef(RefId(Id("""__x26__""")))).setId(40804))).setId(40805), ISeq(List(IApp(Id("""__x27__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""closeCompletion"""))))).setId(40806), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x27__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x27__""")), ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Value""")))).setId(40807), IReturn(ERef(RefId(Id("""__x27__""")))).setId(40808)).setId(40809), ISeq(List()).setId(40655)).setId(40810), IExpr(ERef(RefId(Id("""__x27__""")))).setId(40811))).setId(40812)).setId(40813), IApp(Id("""__x28__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(40815), IReturn(ERef(RefId(Id("""__x28__""")))).setId(40816))).setId(40818)).setId(40819))).setId(40821), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""return"""))).setId(40822), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))).setId(40823), IReturn(ERef(RefId(Id("""__x29__""")))).setId(40824)).setId(40825), ISeq(List()).setId(40655)).setId(40826), ILet(Id("""return"""), ERef(RefId(Id("""__x29__""")))).setId(40827), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x30__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefProp(RefId(Id("""received""")), EStr("""Value"""))))).setId(40829), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x30__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x30__""")), ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Value""")))).setId(40830), IReturn(ERef(RefId(Id("""__x30__""")))).setId(40831)).setId(40832), ISeq(List()).setId(40655)).setId(40833), IAssign(RefProp(RefId(Id("""received""")), EStr("""Value""")), ERef(RefId(Id("""__x30__""")))).setId(40834))).setId(40835), ISeq(List()).setId(40655)).setId(40836), IApp(Id("""__x31__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""received"""))))).setId(40838), IApp(Id("""__x32__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x31__"""))))).setId(40839), IReturn(ERef(RefId(Id("""__x32__""")))).setId(40840))).setId(40842), ISeq(List()).setId(40655)).setId(40843), IApp(Id("""__x33__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""iterator"""))), EList(List(ERef(RefProp(RefId(Id("""received""")), EStr("""Value"""))))))).setId(40845), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x33__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x33__""")), ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Value""")))).setId(40846), IReturn(ERef(RefId(Id("""__x33__""")))).setId(40847)).setId(40848), ISeq(List()).setId(40655)).setId(40849), ILet(Id("""innerReturnResult"""), ERef(RefId(Id("""__x33__""")))).setId(40850), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x34__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""innerReturnResult"""))))).setId(40852), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x34__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))).setId(40853), IReturn(ERef(RefId(Id("""__x34__""")))).setId(40854)).setId(40855), ISeq(List()).setId(40655)).setId(40856), IAssign(RefId(Id("""innerReturnResult""")), ERef(RefId(Id("""__x34__""")))).setId(40857))).setId(40858), ISeq(List()).setId(40655)).setId(40859), IApp(Id("""__x35__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""innerReturnResult"""))))).setId(40861), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x35__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x36__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(40862), IReturn(ERef(RefId(Id("""__x36__""")))).setId(40863))).setId(40864), ISeq(List()).setId(40655)).setId(40865), IApp(Id("""__x37__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""innerReturnResult"""))))).setId(40867), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x37__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x37__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x37__""")), ERef(RefProp(RefId(Id("""__x37__""")), EStr("""Value""")))).setId(40868), IReturn(ERef(RefId(Id("""__x37__""")))).setId(40869)).setId(40870), ISeq(List()).setId(40655)).setId(40871), ILet(Id("""done"""), ERef(RefId(Id("""__x37__""")))).setId(40872), IIf(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(true)), ISeq(List(IApp(Id("""__x38__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerReturnResult"""))))).setId(40874), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x38__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x38__""")), ERef(RefProp(RefId(Id("""__x38__""")), EStr("""Value""")))).setId(40875), IReturn(ERef(RefId(Id("""__x38__""")))).setId(40876)).setId(40877), ISeq(List()).setId(40655)).setId(40878), ILet(Id("""value"""), ERef(RefId(Id("""__x38__""")))).setId(40879), IApp(Id("""__x39__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(40881), IReturn(ERef(RefId(Id("""__x39__""")))).setId(40882))).setId(40884), ISeq(List()).setId(40655)).setId(40885), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x40__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""innerReturnResult"""))))).setId(40887), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x40__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x40__""")), ERef(RefProp(RefId(Id("""__x40__""")), EStr("""Value""")))).setId(40888), IReturn(ERef(RefId(Id("""__x40__""")))).setId(40889)).setId(40890), ISeq(List()).setId(40655)).setId(40891), IApp(Id("""__x41__"""), ERef(RefId(Id("""AsyncGeneratorYield"""))), List(ERef(RefId(Id("""__x40__"""))))).setId(40892), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x41__""")))).setId(40893))).setId(40894), ISeq(List(IApp(Id("""__x42__"""), ERef(RefId(Id("""GeneratorYield"""))), List(ERef(RefId(Id("""innerReturnResult"""))))).setId(40895), IAssign(RefId(Id("""received""")), ERef(RefId(Id("""__x42__""")))).setId(40896))).setId(40897)).setId(40898))).setId(40900)).setId(40901)).setId(40903)).setId(40906))).setId(-1))
  /* Beautified form:
  "YieldExpression2Evaluation0" (this, AssignmentExpression) => {
    app __x0__ = (GetGeneratorKind )
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let generatorKind = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let exprRef = __x1__
    app __x2__ = (GetValue exprRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    app __x3__ = (GetIterator value generatorKind)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let iteratorRecord = __x3__
    let iterator = iteratorRecord["Iterator"]
    app __x4__ = (NormalCompletion undefined)
    let received = __x4__
    while true if (= received["Type"] CONST_normal) {
      app __x5__ = (Call iteratorRecord["NextMethod"] iteratorRecord["Iterator"] (new [received["Value"]]))
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let innerResult = __x5__
      if (= generatorKind CONST_async) {
        app __x6__ = (Await innerResult)
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        innerResult = __x6__
      } else {}
      app __x7__ = (Type innerResult)
      if (! (= __x7__ Object)) {
        app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x8__
      } else {}
      app __x9__ = (IteratorComplete innerResult)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let done = __x9__
      if (= done true) {
        app __x10__ = (IteratorValue innerResult)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        app __x11__ = (WrapCompletion __x10__)
        return __x11__
      } else {}
      if (= generatorKind CONST_async) {
        app __x12__ = (IteratorValue innerResult)
        if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (AsyncGeneratorYield __x12__)
        received = __x13__
      } else {
        app __x14__ = (GeneratorYield innerResult)
        received = __x14__
      }
    } else if (= received["Type"] CONST_throw) {
      app __x15__ = (GetMethod iterator "throw")
      if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      let throw = __x15__
      if (! (= throw undefined)) {
        app __x16__ = (Call throw iterator (new [received["Value"]]))
        if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        let innerResult = __x16__
        if (= generatorKind CONST_async) {
          app __x17__ = (Await innerResult)
          if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
          innerResult = __x17__
        } else {}
        app __x18__ = (Type innerResult)
        if (! (= __x18__ Object)) {
          app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x19__
        } else {}
        app __x20__ = (IteratorComplete innerResult)
        if (= (typeof __x20__) "Completion") if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        let done = __x20__
        if (= done true) {
          app __x21__ = (IteratorValue innerResult)
          if (= (typeof __x21__) "Completion") if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
          app __x22__ = (WrapCompletion __x21__)
          return __x22__
        } else {}
        if (= generatorKind CONST_async) {
          app __x23__ = (IteratorValue innerResult)
          if (= (typeof __x23__) "Completion") if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
          app __x24__ = (AsyncGeneratorYield __x23__)
          received = __x24__
        } else {
          app __x25__ = (GeneratorYield innerResult)
          received = __x25__
        }
      } else {
        let closeCompletion = (new Completion("Type" -> CONST_normal, "Value" -> CONST_empty, "Target" -> CONST_empty))
        if (= generatorKind CONST_async) {
          app __x26__ = (AsyncIteratorClose iteratorRecord closeCompletion)
          if (= (typeof __x26__) "Completion") if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
          __x26__
        } else {
          app __x27__ = (IteratorClose iteratorRecord closeCompletion)
          if (= (typeof __x27__) "Completion") if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
          __x27__
        }
        app __x28__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x28__
      }
    } else {
      app __x29__ = (GetMethod iterator "return")
      if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      let return = __x29__
      if (= return undefined) {
        if (= generatorKind CONST_async) {
          app __x30__ = (Await received["Value"])
          if (= (typeof __x30__) "Completion") if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          received["Value"] = __x30__
        } else {}
        app __x31__ = (Completion received)
        app __x32__ = (WrapCompletion __x31__)
        return __x32__
      } else {}
      app __x33__ = (Call return iterator (new [received["Value"]]))
      if (= (typeof __x33__) "Completion") if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
      let innerReturnResult = __x33__
      if (= generatorKind CONST_async) {
        app __x34__ = (Await innerReturnResult)
        if (= (typeof __x34__) "Completion") if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
        innerReturnResult = __x34__
      } else {}
      app __x35__ = (Type innerReturnResult)
      if (! (= __x35__ Object)) {
        app __x36__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x36__
      } else {}
      app __x37__ = (IteratorComplete innerReturnResult)
      if (= (typeof __x37__) "Completion") if (= __x37__["Type"] CONST_normal) __x37__ = __x37__["Value"] else return __x37__ else {}
      let done = __x37__
      if (= done true) {
        app __x38__ = (IteratorValue innerReturnResult)
        if (= (typeof __x38__) "Completion") if (= __x38__["Type"] CONST_normal) __x38__ = __x38__["Value"] else return __x38__ else {}
        let value = __x38__
        app __x39__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> value, "Target" -> CONST_empty)))
        return __x39__
      } else {}
      if (= generatorKind CONST_async) {
        app __x40__ = (IteratorValue innerReturnResult)
        if (= (typeof __x40__) "Completion") if (= __x40__["Type"] CONST_normal) __x40__ = __x40__["Value"] else return __x40__ else {}
        app __x41__ = (AsyncGeneratorYield __x40__)
        received = __x41__
      } else {
        app __x42__ = (GeneratorYield innerReturnResult)
        received = __x42__
      }
    }
  }
  */
}
