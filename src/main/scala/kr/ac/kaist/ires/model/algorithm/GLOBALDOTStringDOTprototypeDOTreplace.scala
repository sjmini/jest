package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTreplace {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.String.prototype.replace""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(72674), ILet(Id("""searchValue"""), ERef(RefId(Id("""__x0__""")))).setId(72675), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(72677), ILet(Id("""replaceValue"""), ERef(RefId(Id("""__x1__""")))).setId(72678), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(72680), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(72681), IReturn(ERef(RefId(Id("""__x2__""")))).setId(72682)).setId(72683), ISeq(List()).setId(72684)).setId(72685), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(72686), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""searchValue"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""searchValue"""))), ENull))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""searchValue"""))), ERef(RefId(Id("""SYMBOL_replace"""))))).setId(72688), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(72689), IReturn(ERef(RefId(Id("""__x3__""")))).setId(72690)).setId(72691), ISeq(List()).setId(72684)).setId(72692), ILet(Id("""replacer"""), ERef(RefId(Id("""__x3__""")))).setId(72693), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""replacer"""))), EUndef)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""replacer"""))), ERef(RefId(Id("""searchValue"""))), EList(List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""replaceValue"""))))))).setId(72695), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(72696), IReturn(ERef(RefId(Id("""__x4__""")))).setId(72697)).setId(72698), ISeq(List()).setId(72684)).setId(72699), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(72700), IReturn(ERef(RefId(Id("""__x5__""")))).setId(72701))).setId(72703), ISeq(List()).setId(72684)).setId(72704))).setId(72706), ISeq(List()).setId(72684)).setId(72707), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(72709), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(72710), IReturn(ERef(RefId(Id("""__x6__""")))).setId(72711)).setId(72712), ISeq(List()).setId(72684)).setId(72713), ILet(Id("""string"""), ERef(RefId(Id("""__x6__""")))).setId(72714), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchValue"""))))).setId(72716), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(72717), IReturn(ERef(RefId(Id("""__x7__""")))).setId(72718)).setId(72719), ISeq(List()).setId(72684)).setId(72720), ILet(Id("""searchString"""), ERef(RefId(Id("""__x7__""")))).setId(72721), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""replaceValue"""))))).setId(72723), ILet(Id("""functionalReplace"""), ERef(RefId(Id("""__x8__""")))).setId(72724), IIf(EBOp(OEq, ERef(RefId(Id("""functionalReplace"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""replaceValue"""))))).setId(72726), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(72727), IReturn(ERef(RefId(Id("""__x9__""")))).setId(72728)).setId(72729), ISeq(List()).setId(72684)).setId(72730), IAssign(RefId(Id("""replaceValue""")), ERef(RefId(Id("""__x9__""")))).setId(72731))).setId(72733), ISeq(List()).setId(72684)).setId(72734), IExpr(ENotSupported("""Etc""")).setId(72736), IIf(EBOp(OEq, ERef(RefId(Id("""functionalReplace"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""replaceValue"""))), EUndef, EList(List(ERef(RefId(Id("""matched"""))), ERef(RefId(Id("""pos"""))), ERef(RefId(Id("""string"""))))))).setId(72737), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(72738), IReturn(ERef(RefId(Id("""__x10__""")))).setId(72739)).setId(72740), ISeq(List()).setId(72684)).setId(72741), ILet(Id("""replValue"""), ERef(RefId(Id("""__x10__""")))).setId(72742), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""replValue"""))))).setId(72744), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(72745), IReturn(ERef(RefId(Id("""__x11__""")))).setId(72746)).setId(72747), ISeq(List()).setId(72684)).setId(72748), ILet(Id("""replStr"""), ERef(RefId(Id("""__x11__""")))).setId(72749))).setId(72751), ISeq(List(ILet(Id("""captures"""), EList(List())).setId(72752), IApp(Id("""__x12__"""), ERef(RefId(Id("""GetSubstitution"""))), List(ERef(RefId(Id("""matched"""))), ERef(RefId(Id("""string"""))), ERef(RefId(Id("""pos"""))), ERef(RefId(Id("""captures"""))), EUndef, ERef(RefId(Id("""replaceValue"""))))).setId(72754), ILet(Id("""replStr"""), ERef(RefId(Id("""__x12__""")))).setId(72755))).setId(72757)).setId(72758), ILet(Id("""tailPos"""), EBOp(OPlus, ERef(RefId(Id("""pos"""))), ERef(RefProp(RefId(Id("""matched""")), EStr("""length"""))))).setId(72760), IExpr(ENotSupported("""Etc""")).setId(72736), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""newString"""))))).setId(72762), IReturn(ERef(RefId(Id("""__x13__""")))).setId(72763))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.replace" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchValue = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let replaceValue = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    if (! (|| (= searchValue undefined) (= searchValue null))) {
      app __x3__ = (GetMethod searchValue SYMBOL_replace)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let replacer = __x3__
      if (! (= replacer undefined)) {
        app __x4__ = (Call replacer searchValue (new [O, replaceValue]))
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
    } else {}
    app __x6__ = (ToString O)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let string = __x6__
    app __x7__ = (ToString searchValue)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let searchString = __x7__
    app __x8__ = (IsCallable replaceValue)
    let functionalReplace = __x8__
    if (= functionalReplace false) {
      app __x9__ = (ToString replaceValue)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      replaceValue = __x9__
    } else {}
    !!! "Etc"
    if (= functionalReplace true) {
      app __x10__ = (Call replaceValue undefined (new [matched, pos, string]))
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let replValue = __x10__
      app __x11__ = (ToString replValue)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let replStr = __x11__
    } else {
      let captures = (new [])
      app __x12__ = (GetSubstitution matched string pos captures undefined replaceValue)
      let replStr = __x12__
    }
    let tailPos = (+ pos matched["length"])
    !!! "Etc"
    app __x13__ = (WrapCompletion newString)
    return __x13__
  }
  */
}
