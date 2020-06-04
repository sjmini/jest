package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EnumerateObjectProperties {
  val length: Int = 1
  val func: Func = Func("""EnumerateObjectProperties""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""EnumerateObjectPropertiesHelper"""))), List(ERef(RefId(Id("""O"""))), EList(List()), EList(List()))).setId(33905), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateListIteratorRecord"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(33906), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(33907), IReturn(ERef(RefId(Id("""__x2__""")))).setId(33908))).setId(-1))
  /* Beautified form:
  "EnumerateObjectProperties" (O) => {
    app __x0__ = (EnumerateObjectPropertiesHelper O (new []) (new []))
    app __x1__ = (CreateListIteratorRecord __x0__)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
