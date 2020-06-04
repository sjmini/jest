package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTreverse {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.reverse""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(80934), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(80935), IReturn(ERef(RefId(Id("""__x0__""")))).setId(80936)).setId(80937), ISeq(List()).setId(80938)).setId(80939), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(80940), IApp(Id("""__x1__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(80942), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(80943), IReturn(ERef(RefId(Id("""__x1__""")))).setId(80944)).setId(80945), ISeq(List()).setId(80938)).setId(80946), ILet(Id("""len"""), ERef(RefId(Id("""__x1__""")))).setId(80947), IApp(Id("""__x2__"""), ERef(RefId(Id("""floor"""))), List(EBOp(ODiv, ERef(RefId(Id("""len"""))), EINum(2L)))).setId(80949), ILet(Id("""middle"""), ERef(RefId(Id("""__x2__""")))).setId(80950), ILet(Id("""lower"""), EINum(0L)).setId(80952), IWhile(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""lower"""))), ERef(RefId(Id("""middle"""))))), ISeq(List(ILet(Id("""upper"""), EBOp(OSub, EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""lower""")))), EINum(1L))).setId(80954), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""upper"""))))).setId(80956), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(80957), IReturn(ERef(RefId(Id("""__x3__""")))).setId(80958)).setId(80959), ISeq(List()).setId(80938)).setId(80960), ILet(Id("""upperP"""), ERef(RefId(Id("""__x3__""")))).setId(80961), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""lower"""))))).setId(80963), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(80964), IReturn(ERef(RefId(Id("""__x4__""")))).setId(80965)).setId(80966), ISeq(List()).setId(80938)).setId(80967), ILet(Id("""lowerP"""), ERef(RefId(Id("""__x4__""")))).setId(80968), IApp(Id("""__x5__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""lowerP"""))))).setId(80970), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(80971), IReturn(ERef(RefId(Id("""__x5__""")))).setId(80972)).setId(80973), ISeq(List()).setId(80938)).setId(80974), ILet(Id("""lowerExists"""), ERef(RefId(Id("""__x5__""")))).setId(80975), IIf(EBOp(OEq, ERef(RefId(Id("""lowerExists"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""lowerP"""))))).setId(80977), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(80978), IReturn(ERef(RefId(Id("""__x6__""")))).setId(80979)).setId(80980), ISeq(List()).setId(80938)).setId(80981), ILet(Id("""lowerValue"""), ERef(RefId(Id("""__x6__""")))).setId(80982))).setId(80984), ISeq(List()).setId(80938)).setId(80985), IApp(Id("""__x7__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""upperP"""))))).setId(80987), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(80988), IReturn(ERef(RefId(Id("""__x7__""")))).setId(80989)).setId(80990), ISeq(List()).setId(80938)).setId(80991), ILet(Id("""upperExists"""), ERef(RefId(Id("""__x7__""")))).setId(80992), IIf(EBOp(OEq, ERef(RefId(Id("""upperExists"""))), EBool(true)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""upperP"""))))).setId(80994), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(80995), IReturn(ERef(RefId(Id("""__x8__""")))).setId(80996)).setId(80997), ISeq(List()).setId(80938)).setId(80998), ILet(Id("""upperValue"""), ERef(RefId(Id("""__x8__""")))).setId(80999))).setId(81001), ISeq(List()).setId(80938)).setId(81002), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""lowerExists"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""upperExists"""))), EBool(true))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""lowerP"""))), ERef(RefId(Id("""upperValue"""))), EBool(true))).setId(81004), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(81005), IReturn(ERef(RefId(Id("""__x9__""")))).setId(81006)).setId(81007), ISeq(List()).setId(80938)).setId(81008), IExpr(ERef(RefId(Id("""__x9__""")))).setId(81009), IApp(Id("""__x10__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""upperP"""))), ERef(RefId(Id("""lowerValue"""))), EBool(true))).setId(81011), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(81012), IReturn(ERef(RefId(Id("""__x10__""")))).setId(81013)).setId(81014), ISeq(List()).setId(80938)).setId(81015), IExpr(ERef(RefId(Id("""__x10__""")))).setId(81016))).setId(81018), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""lowerExists"""))), EBool(false)), EBOp(OEq, ERef(RefId(Id("""upperExists"""))), EBool(true))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""lowerP"""))), ERef(RefId(Id("""upperValue"""))), EBool(true))).setId(81019), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(81020), IReturn(ERef(RefId(Id("""__x11__""")))).setId(81021)).setId(81022), ISeq(List()).setId(80938)).setId(81023), IExpr(ERef(RefId(Id("""__x11__""")))).setId(81024), IApp(Id("""__x12__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""upperP"""))))).setId(81026), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(81027), IReturn(ERef(RefId(Id("""__x12__""")))).setId(81028)).setId(81029), ISeq(List()).setId(80938)).setId(81030), IExpr(ERef(RefId(Id("""__x12__""")))).setId(81031))).setId(81033), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""lowerExists"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""upperExists"""))), EBool(false))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""lowerP"""))))).setId(81034), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(81035), IReturn(ERef(RefId(Id("""__x13__""")))).setId(81036)).setId(81037), ISeq(List()).setId(80938)).setId(81038), IExpr(ERef(RefId(Id("""__x13__""")))).setId(81039), IApp(Id("""__x14__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""upperP"""))), ERef(RefId(Id("""lowerValue"""))), EBool(true))).setId(81041), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(81042), IReturn(ERef(RefId(Id("""__x14__""")))).setId(81043)).setId(81044), ISeq(List()).setId(80938)).setId(81045), IExpr(ERef(RefId(Id("""__x14__""")))).setId(81046))).setId(81048), IExpr(ENotSupported("""Etc""")).setId(81049)).setId(81051)).setId(81053)).setId(81055), IAssign(RefId(Id("""lower""")), EBOp(OPlus, ERef(RefId(Id("""lower"""))), EINum(1L))).setId(81057))).setId(81059)).setId(81060), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(81062), IReturn(ERef(RefId(Id("""__x15__""")))).setId(81063))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.reverse" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (LengthOfArrayLike O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let len = __x1__
    app __x2__ = (floor (/ len 2i))
    let middle = __x2__
    let lower = 0i
    while (! (= lower middle)) {
      let upper = (- (- len lower) 1i)
      app __x3__ = (ToString upper)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let upperP = __x3__
      app __x4__ = (ToString lower)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let lowerP = __x4__
      app __x5__ = (HasProperty O lowerP)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let lowerExists = __x5__
      if (= lowerExists true) {
        app __x6__ = (Get O lowerP)
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        let lowerValue = __x6__
      } else {}
      app __x7__ = (HasProperty O upperP)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let upperExists = __x7__
      if (= upperExists true) {
        app __x8__ = (Get O upperP)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let upperValue = __x8__
      } else {}
      if (&& (= lowerExists true) (= upperExists true)) {
        app __x9__ = (Set O lowerP upperValue true)
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        __x9__
        app __x10__ = (Set O upperP lowerValue true)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        __x10__
      } else if (&& (= lowerExists false) (= upperExists true)) {
        app __x11__ = (Set O lowerP upperValue true)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        __x11__
        app __x12__ = (DeletePropertyOrThrow O upperP)
        if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        __x12__
      } else if (&& (= lowerExists true) (= upperExists false)) {
        app __x13__ = (DeletePropertyOrThrow O lowerP)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
        app __x14__ = (Set O upperP lowerValue true)
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        __x14__
      } else !!! "Etc"
      lower = (+ lower 1i)
    }
    app __x15__ = (WrapCompletion O)
    return __x15__
  }
  */
}
