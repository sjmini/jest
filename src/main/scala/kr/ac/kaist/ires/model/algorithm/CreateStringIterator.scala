package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateStringIterator {
  val length: Int = 1
  val func: Func = Func("""CreateStringIterator""", List(Id("""string""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_StringIteratorPrototype"""))), EList(List(EStr("""IteratedString"""), EStr("""StringIteratorNextIndex"""))))).setId(74516), ILet(Id("""iterator"""), ERef(RefId(Id("""__x0__""")))).setId(74517), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""IteratedString""")), ERef(RefId(Id("""string""")))).setId(74519), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""StringIteratorNextIndex""")), EINum(0L)).setId(74521), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iterator"""))))).setId(74523), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74524))).setId(-1))
  /* Beautified form:
  "CreateStringIterator" (string) => {
    app __x0__ = (ObjectCreate INTRINSIC_StringIteratorPrototype (new ["IteratedString", "StringIteratorNextIndex"]))
    let iterator = __x0__
    iterator["IteratedString"] = string
    iterator["StringIteratorNextIndex"] = 0i
    app __x1__ = (WrapCompletion iterator)
    return __x1__
  }
  */
}
