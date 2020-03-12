package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CopyDataBlockBytes {
  val length: Int = 5
  val func: Func = Func("""CopyDataBlockBytes""", List(Id("""toBlock"""), Id("""toIndex"""), Id("""fromBlock"""), Id("""fromIndex"""), Id("""count""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(2030), IExpr(ENotSupported("""Etc""")).setId(2030), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""count""")))), ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""fromBlock""")))), EStr("""SharedDataBlock""")), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(2030), IExpr(ENotSupported("""Etc""")).setId(2030), IExpr(ENotSupported("""Etc""")).setId(2030), ILet(Id("""readEvent"""), EMap(Ty("""ReadSharedMemory"""), List((EStr("""Order"""), EStr("""Unordered""")), (EStr("""NoTear"""), EBool(true)), (EStr("""Block"""), ERef(RefId(Id("""fromBlock""")))), (EStr("""ByteIndex"""), ERef(RefId(Id("""fromIndex""")))), (EStr("""ElementSize"""), EINum(1L))))).setId(2031), IAppend(ERef(RefId(Id("""readEvent"""))), ERef(RefId(Id("""eventList""")))).setId(2033), IAppend(EMap(Ty("""ChosenValueRecord"""), List((EStr("""Event"""), ERef(RefId(Id("""readEvent""")))), (EStr("""ChosenValue"""), ERef(RefId(Id("""bytes""")))))), ERef(RefProp(RefId(Id("""execution""")), EStr("""ChosenValues""")))).setId(2035), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""toBlock""")))), EStr("""SharedDataBlock""")), IAppend(EMap(Ty("""WriteSharedMemory"""), List((EStr("""Order"""), EStr("""Unordered""")), (EStr("""NoTear"""), EBool(true)), (EStr("""Block"""), ERef(RefId(Id("""toBlock""")))), (EStr("""ByteIndex"""), ERef(RefId(Id("""toIndex""")))), (EStr("""ElementSize"""), EINum(1L)), (EStr("""Payload"""), ERef(RefId(Id("""bytes""")))))), ERef(RefId(Id("""eventList""")))).setId(2037), IAssign(RefProp(RefId(Id("""toBlock""")), ERef(RefId(Id("""toIndex""")))), ERef(RefProp(RefId(Id("""bytes""")), EINum(0L)))).setId(2040)).setId(2043))).setId(2076), IAssign(RefProp(RefId(Id("""toBlock""")), ERef(RefId(Id("""toIndex""")))), ERef(RefProp(RefId(Id("""fromBlock""")), ERef(RefId(Id("""fromIndex""")))))).setId(2046)).setId(2049), IAssign(RefId(Id("""toIndex""")), EBOp(OPlus, ERef(RefId(Id("""toIndex"""))), EINum(1L))).setId(2051), IAssign(RefId(Id("""fromIndex""")), EBOp(OPlus, ERef(RefId(Id("""fromIndex"""))), EINum(1L))).setId(2053), IAssign(RefId(Id("""count""")), EBOp(OSub, ERef(RefId(Id("""count"""))), EINum(1L))).setId(2055))).setId(2082)).setId(2058), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(2060), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(2061), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2062))).setId(2087))
  val instToStepMap: Map[Int, Int] = HashMap(2031 -> 23, 2062 -> 31, 2046 -> 27, 2039 -> 20, 2049 -> 30, 2034 -> 23, 2058 -> 30, 2032 -> 23, 2052 -> 30, 2033 -> 23, 2048 -> 27, 2051 -> 30, 2060 -> 31, 2044 -> 23, 2045 -> 23, 2050 -> 30, 2059 -> 30, 2035 -> 23, 2042 -> 23, 2047 -> 27, 2061 -> 31, 2053 -> 30, 2038 -> 20, 2043 -> 23, 2057 -> 30, 2029 -> 27, 2055 -> 30, 2054 -> 30, 2037 -> 20, 2056 -> 30, 2030 -> 23, 2041 -> 23, 2036 -> 23, 2040 -> 23, 2063 -> 31)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(2029), 5 -> HashSet(2029), 14 -> HashSet(2029), 1 -> HashSet(2029), 28 -> HashSet(2052, 2051), 13 -> HashSet(2030), 2 -> HashSet(2030), 17 -> HashSet(2035, 2036), 27 -> HashSet(2046, 2049, 2047, 2048, 2029, 2050), 12 -> HashSet(2030), 3 -> HashSet(2029), 11 -> HashSet(2030), 30 -> HashSet(2049, 2058, 2053, 2052, 2057, 2055, 2051, 2054, 2056, 2050, 2059), 4 -> HashSet(2030), 15 -> HashSet(2031, 2032), 20 -> HashSet(2039, 2038, 2037), 29 -> HashSet(2053, 2054), 16 -> HashSet(2034, 2033), 31 -> HashSet(2062, 2061, 2060, 2063), 26 -> HashSet(2029), 23 -> HashSet(2031, 2034, 2032, 2043, 2033, 2029, 2044, 2030, 2045, 2040, 2035, 2042, 2041, 2036))
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
