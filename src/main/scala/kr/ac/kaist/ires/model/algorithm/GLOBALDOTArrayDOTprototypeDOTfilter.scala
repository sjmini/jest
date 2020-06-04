package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTfilter {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.filter""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(77219), ILet(Id("""callbackfn"""), ERef(RefId(Id("""__x0__""")))).setId(77220), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(77222), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(77223), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(77225), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(77226), IReturn(ERef(RefId(Id("""__x2__""")))).setId(77227)).setId(77228), ISeq(List()).setId(77229)).setId(77230), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(77231), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(77233), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(77234), IReturn(ERef(RefId(Id("""__x3__""")))).setId(77235)).setId(77236), ISeq(List()).setId(77229)).setId(77237), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(77238), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""callbackfn"""))))).setId(77240), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(77241), IReturn(ERef(RefId(Id("""__x5__""")))).setId(77242))).setId(77243), ISeq(List()).setId(77229)).setId(77244), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(77246), ILet(Id("""T"""), EUndef).setId(77248)).setId(77250), IApp(Id("""__x6__"""), ERef(RefId(Id("""ArraySpeciesCreate"""))), List(ERef(RefId(Id("""O"""))), EINum(0L))).setId(77252), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(77253), IReturn(ERef(RefId(Id("""__x6__""")))).setId(77254)).setId(77255), ISeq(List()).setId(77229)).setId(77256), ILet(Id("""A"""), ERef(RefId(Id("""__x6__""")))).setId(77257), ILet(Id("""k"""), EINum(0L)).setId(77259), ILet(Id("""to"""), EINum(0L)).setId(77261), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(77263), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(77264), IReturn(ERef(RefId(Id("""__x7__""")))).setId(77265)).setId(77266), ISeq(List()).setId(77229)).setId(77267), ILet(Id("""Pk"""), ERef(RefId(Id("""__x7__""")))).setId(77268), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(77270), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(77271), IReturn(ERef(RefId(Id("""__x8__""")))).setId(77272)).setId(77273), ISeq(List()).setId(77229)).setId(77274), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x8__""")))).setId(77275), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(77277), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(77278), IReturn(ERef(RefId(Id("""__x9__""")))).setId(77279)).setId(77280), ISeq(List()).setId(77229)).setId(77281), ILet(Id("""kValue"""), ERef(RefId(Id("""__x9__""")))).setId(77282), IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""callbackfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""O"""))))))).setId(77284), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(77285), IReturn(ERef(RefId(Id("""__x10__""")))).setId(77286)).setId(77287), ISeq(List()).setId(77229)).setId(77288), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(77289), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(77290), IReturn(ERef(RefId(Id("""__x11__""")))).setId(77291)).setId(77292), ISeq(List()).setId(77229)).setId(77293), ILet(Id("""selected"""), ERef(RefId(Id("""__x11__""")))).setId(77294), IIf(EBOp(OEq, ERef(RefId(Id("""selected"""))), EBool(true)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""to"""))))).setId(77296), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(77297), IReturn(ERef(RefId(Id("""__x12__""")))).setId(77298)).setId(77299), ISeq(List()).setId(77229)).setId(77300), IApp(Id("""__x13__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x12__"""))), ERef(RefId(Id("""kValue"""))))).setId(77301), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(77302), IReturn(ERef(RefId(Id("""__x13__""")))).setId(77303)).setId(77304), ISeq(List()).setId(77229)).setId(77305), IExpr(ERef(RefId(Id("""__x13__""")))).setId(77306), IAssign(RefId(Id("""to""")), EBOp(OPlus, ERef(RefId(Id("""to"""))), EINum(1L))).setId(77308))).setId(77310), ISeq(List()).setId(77229)).setId(77311))).setId(77313), ISeq(List()).setId(77229)).setId(77314), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(77316))).setId(77318)).setId(77319), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(77321), IReturn(ERef(RefId(Id("""__x14__""")))).setId(77322))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.filter" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (IsCallable callbackfn)
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    app __x6__ = (ArraySpeciesCreate O 0i)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let A = __x6__
    let k = 0i
    let to = 0i
    while (< k len) {
      app __x7__ = (ToString k)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let Pk = __x7__
      app __x8__ = (HasProperty O Pk)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let kPresent = __x8__
      if (= kPresent true) {
        app __x9__ = (Get O Pk)
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        let kValue = __x9__
        app __x10__ = (Call callbackfn T (new [kValue, k, O]))
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        app __x11__ = (ToBoolean __x10__)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        let selected = __x11__
        if (= selected true) {
          app __x12__ = (ToString to)
          if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
          app __x13__ = (CreateDataPropertyOrThrow A __x12__ kValue)
          if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
          __x13__
          to = (+ to 1i)
        } else {}
      } else {}
      k = (+ k 1i)
    }
    app __x14__ = (WrapCompletion A)
    return __x14__
  }
  */
}
