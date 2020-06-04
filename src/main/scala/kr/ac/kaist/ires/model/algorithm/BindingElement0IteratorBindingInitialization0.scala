package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElement0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingElement0IteratorBindingInitialization0""", List(Id("""this"""), Id("""SingleNameBinding"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""SingleNameBinding"""))), EStr("""IteratorBindingInitialization""")).setId(29073), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(29074), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(29075), IReturn(ERef(RefId(Id("""__x2__""")))).setId(29076))).setId(-1))
  /* Beautified form:
  "BindingElement0IteratorBindingInitialization0" (this, SingleNameBinding, iteratorRecord, environment) => {
    access __x0__ = (SingleNameBinding "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
