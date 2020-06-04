package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CopyDataBlockBytes {
  val length: Int = 5
  val func: Func = Func("""CopyDataBlockBytes""", List(Id("""toBlock"""), Id("""toIndex"""), Id("""fromBlock"""), Id("""fromIndex"""), Id("""count""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(2030), IExpr(ENotSupported("""Etc""")).setId(2030), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""count""")))), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""fromBlock""")))), EStr("""SharedDataBlock""")), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(2030), IExpr(ENotSupported("""Etc""")).setId(2030), IExpr(ENotSupported("""Etc""")).setId(2030), ILet(Id("""readEvent"""), EMap(Ty("""ReadSharedMemory"""), List((EStr("""Order"""), EStr("""Unordered""")), (EStr("""NoTear"""), EBool(true)), (EStr("""Block"""), ERef(RefId(Id("""fromBlock""")))), (EStr("""ByteIndex"""), ERef(RefId(Id("""fromIndex""")))), (EStr("""ElementSize"""), EINum(1L))))).setId(2031), IAppend(ERef(RefId(Id("""readEvent"""))), ERef(RefId(Id("""eventList""")))).setId(2033), IAppend(EMap(Ty("""ChosenValueRecord"""), List((EStr("""Event"""), ERef(RefId(Id("""readEvent""")))), (EStr("""ChosenValue"""), ERef(RefId(Id("""bytes""")))))), ERef(RefProp(RefId(Id("""execution""")), EStr("""ChosenValues""")))).setId(2035), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""toBlock""")))), EStr("""SharedDataBlock""")), IAppend(EMap(Ty("""WriteSharedMemory"""), List((EStr("""Order"""), EStr("""Unordered""")), (EStr("""NoTear"""), EBool(true)), (EStr("""Block"""), ERef(RefId(Id("""toBlock""")))), (EStr("""ByteIndex"""), ERef(RefId(Id("""toIndex""")))), (EStr("""ElementSize"""), EINum(1L)), (EStr("""Payload"""), ERef(RefId(Id("""bytes""")))))), ERef(RefId(Id("""eventList""")))).setId(2037), IAssign(RefProp(RefId(Id("""toBlock""")), ERef(RefId(Id("""toIndex""")))), ERef(RefProp(RefId(Id("""bytes""")), EINum(0L)))).setId(2040)).setId(2043))).setId(2045), IAssign(RefProp(RefId(Id("""toBlock""")), ERef(RefId(Id("""toIndex""")))), ERef(RefProp(RefId(Id("""fromBlock""")), ERef(RefId(Id("""fromIndex""")))))).setId(2046)).setId(2049), IAssign(RefId(Id("""toIndex""")), EBOp(OPlus, ERef(RefId(Id("""toIndex"""))), EINum(1L))).setId(2051), IAssign(RefId(Id("""fromIndex""")), EBOp(OPlus, ERef(RefId(Id("""fromIndex"""))), EINum(1L))).setId(2053), IAssign(RefId(Id("""count""")), EBOp(OSub, ERef(RefId(Id("""count"""))), EINum(1L))).setId(2055))).setId(2057)).setId(2058), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(2060), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(2061), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2062))).setId(-1))
  /* Beautified form:
  "CopyDataBlockBytes" (toBlock, toIndex, fromBlock, fromIndex, count) => {
    !!! "Etc"
    !!! "Etc"
    while (< 0i count) {
      if (= (typeof fromBlock) "SharedDataBlock") {
        !!! "Etc"
        !!! "Etc"
        !!! "Etc"
        let readEvent = (new ReadSharedMemory("Order" -> "Unordered", "NoTear" -> true, "Block" -> fromBlock, "ByteIndex" -> fromIndex, "ElementSize" -> 1i))
        append readEvent -> eventList
        append (new ChosenValueRecord("Event" -> readEvent, "ChosenValue" -> bytes)) -> execution["ChosenValues"]
        if (= (typeof toBlock) "SharedDataBlock") append (new WriteSharedMemory("Order" -> "Unordered", "NoTear" -> true, "Block" -> toBlock, "ByteIndex" -> toIndex, "ElementSize" -> 1i, "Payload" -> bytes)) -> eventList else toBlock[toIndex] = bytes[0i]
      } else toBlock[toIndex] = fromBlock[fromIndex]
      toIndex = (+ toIndex 1i)
      fromIndex = (+ fromIndex 1i)
      count = (- count 1i)
    }
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
