package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryHasProperty {
  val length: Int = 2
  val func: Func = Func("""OrdinaryHasProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(50233), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50234), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50235)).setId(50236), ISeq(List()).setId(50232)).setId(50237), ILet(Id("""hasOwn"""), ERef(RefId(Id("""__x0__""")))).setId(50238), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""hasOwn"""))), EUndef)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(50240), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50241))).setId(50242), ISeq(List()).setId(50232)).setId(50243), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))).setId(50245), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(50246), IReturn(ERef(RefId(Id("""__x2__""")))).setId(50247)).setId(50248), ISeq(List()).setId(50232)).setId(50249), ILet(Id("""parent"""), ERef(RefId(Id("""__x2__""")))).setId(50250), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""parent"""))), ENull)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""parent""")), EStr("""HasProperty"""))), List(ERef(RefId(Id("""parent"""))), ERef(RefId(Id("""P"""))))).setId(50252), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(50253), IReturn(ERef(RefId(Id("""__x3__""")))).setId(50254)).setId(50255), ISeq(List()).setId(50232)).setId(50256), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(50257), IReturn(ERef(RefId(Id("""__x4__""")))).setId(50258))).setId(50260), ISeq(List()).setId(50232)).setId(50261), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50263), IReturn(ERef(RefId(Id("""__x5__""")))).setId(50264))).setId(-1))
  /* Beautified form:
  "OrdinaryHasProperty" (O, P) => {
    app __x0__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let hasOwn = __x0__
    if (! (= hasOwn undefined)) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    app __x2__ = (O["GetPrototypeOf"] O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let parent = __x2__
    if (! (= parent null)) {
      app __x3__ = (parent["HasProperty"] parent P)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion false)
    return __x5__
  }
  */
}
