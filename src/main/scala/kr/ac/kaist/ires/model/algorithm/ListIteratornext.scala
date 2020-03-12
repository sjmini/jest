package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ListIteratornext {
  val length: Int = 0
  val func: Func = Func("""ListIteratornext""", List(Id("""this""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(7813), ILet(Id("""list"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedList""")))).setId(7816), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ListIteratorNextIndex""")))).setId(7818), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""list""")), EStr("""length""")))).setId(7820), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(7822), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(7823), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7824))).setId(7843), ISeq(List()).setId(7844)).setId(7827), IAssign(RefProp(RefId(Id("""O""")), EStr("""ListIteratorNextIndex""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(7829), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefProp(RefId(Id("""list""")), ERef(RefId(Id("""index"""))))), EBool(false))).setId(7831), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(7832), IReturn(ERef(RefId(Id("""__x3__""")))).setId(7833))).setId(7850))
  val instToStepMap: Map[Int, Int] = HashMap(7813 -> 0, 7824 -> 8, 7818 -> 4, 7830 -> 10, 7814 -> 0, 7821 -> 5, 7826 -> 8, 7817 -> 3, 7831 -> 11, 7820 -> 5, 7832 -> 11, 7816 -> 3, 7819 -> 4, 7829 -> 10, 7823 -> 8, 7825 -> 8, 7822 -> 8, 7827 -> 9, 7834 -> 11, 7833 -> 11, 7828 -> 9, 7815 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(7813, 7814), 5 -> HashSet(7821, 7820), 10 -> HashSet(7830, 7829), 1 -> HashSet(7815), 9 -> HashSet(7827, 7828), 2 -> HashSet(7815), 3 -> HashSet(7817, 7816), 11 -> HashSet(7834, 7831, 7833, 7832), 8 -> HashSet(7824, 7826, 7823, 7825, 7822), 4 -> HashSet(7818, 7819))
  /* Beautified form:
  "ListIteratornext" (this) => {
    let O = this
    let list = O["IteratedList"]
    let index = O["ListIteratorNextIndex"]
    let len = list["length"]
    if (! (< index len)) {
      app __x0__ = (CreateIterResultObject undefined true)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    O["ListIteratorNextIndex"] = (+ index 1i)
    app __x2__ = (CreateIterResultObject list[index] false)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
