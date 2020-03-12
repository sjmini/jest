package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorYield {
  val length: Int = 1
  val func: Func = Func("""GeneratorYield""", List(Id("""iterNextObj""")), None, ISeq(List(ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(10764), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))).setId(10766), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""suspendedYield""")).setId(10768), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x0__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(10770), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x0__"""))))).setId(10771))).setId(10797), ISeq(List()).setId(10798)).setId(10774), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(10775), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(Id("""resumptionValue""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""resumptionValue"""))))).setId(10781), IReturn(ERef(RefId(Id("""__x1__""")))).setId(10782))).setId(10803))).setId(10786), IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""iterNextObj"""))))).setId(10787), IApp(Id("""__x3__"""), EPop(ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EINum(0L)), List(ERef(RefId(Id("""__x2__"""))))).setId(10788))).setId(10807))
  val instToStepMap: Map[Int, Int] = HashMap(10790 -> 11, 10780 -> 10, 10775 -> 6, 10764 -> 1, 10786 -> 10, 10779 -> 10, 10765 -> 1, 10776 -> 6, 10787 -> 11, 10766 -> 3, 10778 -> 10, 10788 -> 11, 10769 -> 5, 10789 -> 11, 10777 -> 10, 10767 -> 3, 10774 -> 6, 10763 -> 12, 10768 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(10763), 5 -> HashSet(10769, 10768), 10 -> HashSet(10780, 10786, 10779, 10778, 10777, 10763), 1 -> HashSet(10764, 10765), 6 -> HashSet(10775, 10776, 10774), 9 -> HashSet(10779, 10778, 10777), 2 -> HashSet(10763), 12 -> HashSet(10763), 3 -> HashSet(10766, 10767), 11 -> HashSet(10790, 10787, 10788, 10789), 4 -> HashSet(10763))
  /* Beautified form:
  "GeneratorYield" (iterNextObj) => {
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    generator["GeneratorState"] = "suspendedYield"
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x0__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x0__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      app __x1__ = (WrapCompletion resumptionValue)
      return __x1__
    }
    app __x2__ = (NormalCompletion iterNextObj)
    app __x3__ = ((pop genContext["ReturnCont"] 0i) __x2__)
  }
  */
}
