package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingPattern1BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingPattern1BindingInitialization0""", List(Id("""this"""), Id("""ArrayBindingPattern"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""value"""))))).setId(28237), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(28238), IReturn(ERef(RefId(Id("""__x0__""")))).setId(28239)).setId(28240), ISeq(List()).setId(28241)).setId(28242), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x0__""")))).setId(28243), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ArrayBindingPattern"""))), EStr("""IteratorBindingInitialization""")).setId(28245), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(28246), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))).setId(28247), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""result"""))))).setId(28249), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(28250), IReturn(ERef(RefId(Id("""__x3__""")))).setId(28251)).setId(28252), ISeq(List()).setId(28241)).setId(28253), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(28254), IReturn(ERef(RefId(Id("""__x4__""")))).setId(28255))).setId(28256), ISeq(List()).setId(28241)).setId(28257), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(28259), IReturn(ERef(RefId(Id("""__x5__""")))).setId(28260))).setId(-1))
  /* Beautified form:
  "BindingPattern1BindingInitialization0" (this, ArrayBindingPattern, value, environment) => {
    app __x0__ = (GetIterator value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    access __x1__ = (ArrayBindingPattern "IteratorBindingInitialization")
    app __x2__ = (__x1__ iteratorRecord environment)
    let result = __x2__
    if (= iteratorRecord["Done"] false) {
      app __x3__ = (IteratorClose iteratorRecord result)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion result)
    return __x5__
  }
  */
}
