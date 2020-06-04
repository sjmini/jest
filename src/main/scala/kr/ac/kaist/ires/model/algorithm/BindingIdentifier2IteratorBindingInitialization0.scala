package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingIdentifier2IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier2IteratorBindingInitialization0""", List(Id("""BindingIdentifier"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(39074), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(39075), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(39077), IIf(ERef(RefId(Id("""__x1__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(39078), ISeq(List()).setId(39073)).setId(39080), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(39082), IReturn(ERef(RefId(Id("""next""")))).setId(39083)).setId(39084), ISeq(List()).setId(39073)).setId(39085), IExpr(ERef(RefId(Id("""next""")))).setId(39086), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(39088), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(39090), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(39091), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))).setId(39093), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(39094), ISeq(List()).setId(39073)).setId(39096), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""v""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""v""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""v""")), ERef(RefProp(RefId(Id("""v""")), EStr("""Value""")))).setId(39098), IReturn(ERef(RefId(Id("""v""")))).setId(39099)).setId(39100), ISeq(List()).setId(39073)).setId(39101), IExpr(ERef(RefId(Id("""v""")))).setId(39102))).setId(39104)).setId(39105), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""v"""), EUndef).setId(39107), ISeq(List()).setId(39073)).setId(39109), IAccess(Id("""__x4__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BindingInitialization""")).setId(39111), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""v"""))), ERef(RefId(Id("""environment"""))))).setId(39112), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(39113), IReturn(ERef(RefId(Id("""__x6__""")))).setId(39114))).setId(-1))
  /* Beautified form:
  "BindingIdentifier2IteratorBindingInitialization0" (BindingIdentifier, iteratorRecord, environment) => {
    app __x0__ = (IteratorStep iteratorRecord)
    let next = __x0__
    app __x1__ = (IsAbruptCompletion next)
    if __x1__ iteratorRecord["Done"] = true else {}
    if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    if (= next false) iteratorRecord["Done"] = true else {
      app __x2__ = (IteratorValue next)
      let v = __x2__
      app __x3__ = (IsAbruptCompletion v)
      if __x3__ iteratorRecord["Done"] = true else {}
      if (= (typeof v) "Completion") if (= v["Type"] CONST_normal) v = v["Value"] else return v else {}
      v
    }
    if (= iteratorRecord["Done"] true) let v = undefined else {}
    access __x4__ = (BindingIdentifier "BindingInitialization")
    app __x5__ = (__x4__ v environment)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
