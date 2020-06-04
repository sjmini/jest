package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinarySetPrototypeOf {
  val length: Int = 2
  val func: Func = Func("""OrdinarySetPrototypeOf""", List(Id("""O"""), Id("""V""")), None, ISeq(List(ILet(Id("""current"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Prototype""")))).setId(49238), IApp(Id("""__x0__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""V"""))), ERef(RefId(Id("""current"""))))).setId(49240), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49241), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49242))).setId(49243), ISeq(List()).setId(49237)).setId(49244), ILet(Id("""extensible"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Extensible""")))).setId(49246), IIf(EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49248), IReturn(ERef(RefId(Id("""__x2__""")))).setId(49249))).setId(49250), ISeq(List()).setId(49237)).setId(49251), ILet(Id("""p"""), ERef(RefId(Id("""V""")))).setId(49253), ILet(Id("""done"""), EBool(false)).setId(49255), IWhile(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(false)), IIf(EBOp(OEq, ERef(RefId(Id("""p"""))), ENull), IAssign(RefId(Id("""done""")), EBool(true)).setId(49257), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""p"""))), ERef(RefId(Id("""O"""))))).setId(49259), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49260), IReturn(ERef(RefId(Id("""__x4__""")))).setId(49261))).setId(49262), IIf(EBool(false), IAssign(RefId(Id("""done""")), EBool(true)).setId(49263), IAssign(RefId(Id("""p""")), ERef(RefProp(RefId(Id("""p""")), EStr("""Prototype""")))).setId(49265)).setId(49267)).setId(49270))).setId(49271)).setId(49272)).setId(49275), IAssign(RefProp(RefId(Id("""O""")), EStr("""Prototype""")), ERef(RefId(Id("""V""")))).setId(49277), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49279), IReturn(ERef(RefId(Id("""__x5__""")))).setId(49280))).setId(-1))
  /* Beautified form:
  "OrdinarySetPrototypeOf" (O, V) => {
    let current = O["Prototype"]
    app __x0__ = (SameValue V current)
    if (= __x0__ true) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    let extensible = O["Extensible"]
    if (= extensible false) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    let p = V
    let done = false
    while (= done false) if (= p null) done = true else {
      app __x3__ = (SameValue p O)
      if (= __x3__ true) {
        app __x4__ = (WrapCompletion false)
        return __x4__
      } else if false done = true else p = p["Prototype"]
    }
    O["Prototype"] = V
    app __x5__ = (WrapCompletion true)
    return __x5__
  }
  */
}
