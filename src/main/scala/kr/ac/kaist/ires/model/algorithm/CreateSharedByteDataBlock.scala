package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateSharedByteDataBlock {
  val length: Int = 1
  val func: Func = Func("""CreateSharedByteDataBlock""", List(Id("""size""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(1983), IExpr(ENotSupported("""Etc""")).setId(1983), IExpr(ENotSupported("""Etc""")).setId(1983), ILet(Id("""zero"""), EList(List(EINum(0L)))).setId(1984), ILet(Id("""__x0__"""), ERef(RefId(Id("""db""")))).setId(1989), ILet(Id("""__x1__"""), EINum(0L)).setId(1990), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""i"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))).setId(1991), IAppend(EMap(Ty("""WriteSharedMemory"""), List((EStr("""Order"""), EStr("""Init""")), (EStr("""NoTear"""), EBool(true)), (EStr("""Block"""), ERef(RefId(Id("""db""")))), (EStr("""ByteIndex"""), ERef(RefId(Id("""i""")))), (EStr("""ElementSize"""), EINum(1L)), (EStr("""Payload"""), ERef(RefId(Id("""zero""")))))), ERef(RefId(Id("""eventList""")))).setId(1986), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L))).setId(1992))).setId(1993)).setId(1994), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""db"""))))).setId(1997), IReturn(ERef(RefId(Id("""__x2__""")))).setId(1998))).setId(-1))
  /* Beautified form:
  "CreateSharedByteDataBlock" (size) => {
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    let zero = (new [0i])
    let __x0__ = db
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let i = __x0__[__x1__]
      append (new WriteSharedMemory("Order" -> "Init", "NoTear" -> true, "Block" -> db, "ByteIndex" -> i, "ElementSize" -> 1i, "Payload" -> zero)) -> eventList
      __x1__ = (+ __x1__ 1i)
    }
    app __x2__ = (WrapCompletion db)
    return __x2__
  }
  */
}
