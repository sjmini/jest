package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateSharedByteDataBlock {
  val length: Int = 1
  val func: Func = Func("""CreateSharedByteDataBlock""", List(Id("""size""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(1983), IExpr(ENotSupported("""Etc""")).setId(1983), IExpr(ENotSupported("""Etc""")).setId(1983), ILet(Id("""zero"""), EList(List(EINum(0L)))).setId(1984), ILet(Id("""__x0__"""), ERef(RefId(Id("""db""")))).setId(1989), ILet(Id("""__x1__"""), EINum(0L)).setId(1990), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""i"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))).setId(1991), IAppend(EMap(Ty("""WriteSharedMemory"""), List((EStr("""Order"""), EStr("""Init""")), (EStr("""NoTear"""), EBool(true)), (EStr("""Block"""), ERef(RefId(Id("""db""")))), (EStr("""ByteIndex"""), ERef(RefId(Id("""i""")))), (EStr("""ElementSize"""), EINum(1L)), (EStr("""Payload"""), ERef(RefId(Id("""zero""")))))), ERef(RefId(Id("""eventList""")))).setId(1986), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L))).setId(1992))).setId(2010)).setId(1994), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""db"""))))).setId(1997), IReturn(ERef(RefId(Id("""__x2__""")))).setId(1998))).setId(2014))
  val instToStepMap: Map[Int, Int] = HashMap(1985 -> 4, 1983 -> 3, 1984 -> 4, 1996 -> 7, 1997 -> 8, 1990 -> 7, 1987 -> 7, 1998 -> 8, 1994 -> 7, 1986 -> 7, 1989 -> 7, 1995 -> 7, 1982 -> 0, 1999 -> 8, 1988 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(1982), 1 -> HashSet(1983), 2 -> HashSet(1983), 7 -> HashSet(1995, 1988, 1996, 1990, 1987, 1994, 1986, 1989), 3 -> HashSet(1983), 8 -> HashSet(1999, 1997, 1998), 4 -> HashSet(1985, 1984))
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
