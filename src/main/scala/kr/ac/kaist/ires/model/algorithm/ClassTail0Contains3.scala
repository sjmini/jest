package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassTail0Contains3 {
  val length: Int = 0
  val func: Func = Func("""ClassTail0Contains3""", List(Id("""this"""), Id("""ClassHeritage"""), Id("""ClassBody"""), Id("""symbol""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ClassBody"""), IReturn(EBool(true)).setId(42318), ISeq(List()).setId(42320)).setId(42321), IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ClassHeritage"""), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""ClassHeritage"""))), EAbsent)), IReturn(EBool(true)).setId(42323), IReturn(EBool(false)).setId(42325)).setId(42327), ISeq(List()).setId(42320)).setId(42330), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassHeritage"""))), EStr("""Contains""")).setId(42332), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(42333), ILet(Id("""inHeritage"""), ERef(RefId(Id("""__x1__""")))).setId(42334), IIf(EBOp(OEq, ERef(RefId(Id("""inHeritage"""))), EBool(true)), IReturn(EBool(true)).setId(42336), ISeq(List()).setId(42320)).setId(42338), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassBody"""))), EStr("""ComputedPropertyContains""")).setId(42342), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(42343), IReturn(ERef(RefId(Id("""__x3__""")))).setId(42344))).setId(-1))
  /* Beautified form:
  "ClassTail0Contains3" (this, ClassHeritage, ClassBody, symbol) => {
    if (is-instance-of symbol ClassBody) return true else {}
    if (is-instance-of symbol ClassHeritage) if (! (= ClassHeritage absent)) return true else return false else {}
    access __x0__ = (ClassHeritage "Contains")
    app __x1__ = (__x0__ symbol)
    let inHeritage = __x1__
    if (= inHeritage true) return true else {}
    access __x2__ = (ClassBody "ComputedPropertyContains")
    app __x3__ = (__x2__ symbol)
    return __x3__
  }
  */
}
