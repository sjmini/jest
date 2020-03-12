package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ElementList3ArrayAccumulation1 {
  val length: Int = 0
  val func: Func = Func("""ElementList3ArrayAccumulation1""", List(Id("""this"""), Id("""ElementList"""), Id("""Elision"""), Id("""SpreadElement"""), Id("""array"""), Id("""nextIndex""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ElementList"""))), EStr("""ArrayAccumulation""")).setId(13986), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""nextIndex"""))))).setId(13987), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(13988), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13989)).setId(13990), ISeq(List()).setId(14013)).setId(13992), ILet(Id("""postIndex"""), ERef(RefId(Id("""__x1__""")))).setId(13993), IIf(EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent), ILet(Id("""padding"""), EINum(0L)).setId(13996), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""Elision"""))), EStr("""ElisionWidth""")).setId(13995), ILet(Id("""padding"""), ERef(RefId(Id("""__x2__""")))).setId(13998))).setId(14019)).setId(14000), IAccess(Id("""__x3__"""), ERef(RefId(Id("""SpreadElement"""))), EStr("""ArrayAccumulation""")).setId(14002), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""array"""))), EBOp(OPlus, ERef(RefId(Id("""postIndex"""))), ERef(RefId(Id("""padding""")))))).setId(14003), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(14004), IReturn(ERef(RefId(Id("""__x5__""")))).setId(14005))).setId(14025))
  val instToStepMap: Map[Int, Int] = HashMap(13993 -> 0, 13987 -> 0, 14004 -> 2, 14000 -> 1, 14003 -> 2, 14005 -> 2, 13994 -> 0, 13986 -> 0, 14001 -> 1, 14006 -> 2, 14002 -> 2, 13992 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13993, 13992, 13987, 13994, 13986), 1 -> HashSet(14000, 14001), 2 -> HashSet(14002, 14004, 14003, 14005, 14006))
  /* Beautified form:
  "ElementList3ArrayAccumulation1" (this, ElementList, Elision, SpreadElement, array, nextIndex) => {
    access __x0__ = (ElementList "ArrayAccumulation")
    app __x1__ = (__x0__ array nextIndex)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let postIndex = __x1__
    if (= Elision absent) let padding = 0i else {
      access __x2__ = (Elision "ElisionWidth")
      let padding = __x2__
    }
    access __x3__ = (SpreadElement "ArrayAccumulation")
    app __x4__ = (__x3__ array (+ postIndex padding))
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
