package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElementList0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingElementList0IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingElisionElement"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElisionElement"""))), EStr("""IteratorBindingInitialization""")).setId(28959), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(28960), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(28961), IReturn(ERef(RefId(Id("""__x2__""")))).setId(28962))).setId(-1))
  /* Beautified form:
  "BindingElementList0IteratorBindingInitialization0" (this, BindingElisionElement, iteratorRecord, environment) => {
    access __x0__ = (BindingElisionElement "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
