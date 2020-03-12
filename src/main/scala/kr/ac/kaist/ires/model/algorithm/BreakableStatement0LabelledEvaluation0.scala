package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BreakableStatement0LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""BreakableStatement0LabelledEvaluation0""", List(Id("""this"""), Id("""IterationStatement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IterationStatement"""))), EStr("""LabelledEvaluation""")).setId(25899), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(25900), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x1__""")))).setId(25901), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_break""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Target"""))), ERef(RefId(Id("""CONST_empty""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(25903), IAssign(RefId(Id("""stmtResult""")), ERef(RefId(Id("""__x2__""")))).setId(25904))).setId(25928), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))))).setId(25906), IAssign(RefId(Id("""stmtResult""")), ERef(RefId(Id("""__x3__""")))).setId(25907))).setId(25931)).setId(25909), ISeq(List()).setId(25933)).setId(25913), ISeq(List()).setId(25935)).setId(25916), IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""stmtResult"""))))).setId(25918), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(25919), IReturn(ERef(RefId(Id("""__x5__""")))).setId(25920))).setId(25940))
  val instToStepMap: Map[Int, Int] = HashMap(25916 -> 7, 25911 -> 6, 25907 -> 6, 25920 -> 8, 25900 -> 0, 25908 -> 6, 25906 -> 6, 25919 -> 8, 25902 -> 0, 25909 -> 6, 25914 -> 6, 25903 -> 5, 25910 -> 6, 25913 -> 6, 25904 -> 5, 25921 -> 8, 25901 -> 0, 25915 -> 6, 25918 -> 8, 25905 -> 5, 25899 -> 0, 25917 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(25900, 25901, 25902, 25899), 5 -> HashSet(25904, 25905, 25903), 6 -> HashSet(25911, 25907, 25915, 25908, 25906, 25909, 25914, 25910, 25913), 7 -> HashSet(25916, 25917), 8 -> HashSet(25921, 25920, 25919, 25918))
  /* Beautified form:
  "BreakableStatement0LabelledEvaluation0" (this, IterationStatement, labelSet) => {
    access __x0__ = (IterationStatement "LabelledEvaluation")
    app __x1__ = (__x0__ labelSet)
    let stmtResult = __x1__
    if (= stmtResult["Type"] CONST_break) if (= stmtResult["Target"] CONST_empty) if (= stmtResult["Value"] CONST_empty) {
      app __x2__ = (NormalCompletion undefined)
      stmtResult = __x2__
    } else {
      app __x3__ = (NormalCompletion stmtResult["Value"])
      stmtResult = __x3__
    } else {} else {}
    app __x4__ = (Completion stmtResult)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
