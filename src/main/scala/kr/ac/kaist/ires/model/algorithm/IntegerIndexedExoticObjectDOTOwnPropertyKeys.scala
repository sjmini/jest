package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""IntegerIndexedExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""keys"""), EList(List())).setId(57151), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayLength""")))).setId(57154), IExpr(ENotSupported("""Etc""")).setId(57156), IExpr(ENotSupported("""Etc""")).setId(57156), IExpr(ENotSupported("""Etc""")).setId(57156), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""keys"""))))).setId(57157), IReturn(ERef(RefId(Id("""__x0__""")))).setId(57158))).setId(-1))
  /* Beautified form:
  "IntegerIndexedExoticObject.OwnPropertyKeys" (O) => {
    let keys = (new [])
    let len = O["ArrayLength"]
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion keys)
    return __x0__
  }
  */
}
