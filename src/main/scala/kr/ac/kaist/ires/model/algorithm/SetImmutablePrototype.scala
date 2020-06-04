package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetImmutablePrototype {
  val length: Int = 2
  val func: Func = Func("""SetImmutablePrototype""", List(Id("""O"""), Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))).setId(58287), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(58288), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58289)).setId(58290), ISeq(List()).setId(58286)).setId(58291), ILet(Id("""current"""), ERef(RefId(Id("""__x0__""")))).setId(58292), IApp(Id("""__x1__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""V"""))), ERef(RefId(Id("""current"""))))).setId(58294), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(58295), IReturn(ERef(RefId(Id("""__x2__""")))).setId(58296))).setId(58297), ISeq(List()).setId(58286)).setId(58298), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(58300), IReturn(ERef(RefId(Id("""__x3__""")))).setId(58301))).setId(-1))
  /* Beautified form:
  "SetImmutablePrototype" (O, V) => {
    app __x0__ = (O["GetPrototypeOf"] O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let current = __x0__
    app __x1__ = (SameValue V current)
    if (= __x1__ true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }
  */
}
