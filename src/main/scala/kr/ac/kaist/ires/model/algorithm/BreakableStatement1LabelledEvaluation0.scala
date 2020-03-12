package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BreakableStatement1LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""BreakableStatement1LabelledEvaluation0""", List(Id("""this"""), Id("""SwitchStatement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""SwitchStatement"""))), EStr("""Evaluation""")).setId(25960), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x0__""")))).setId(25961), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_break""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Target"""))), ERef(RefId(Id("""CONST_empty""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(25963), IAssign(RefId(Id("""stmtResult""")), ERef(RefId(Id("""__x1__""")))).setId(25964))).setId(25987), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))))).setId(25966), IAssign(RefId(Id("""stmtResult""")), ERef(RefId(Id("""__x2__""")))).setId(25967))).setId(25990)).setId(25969), ISeq(List()).setId(25992)).setId(25973), ISeq(List()).setId(25994)).setId(25976), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""stmtResult"""))))).setId(25978), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(25979), IReturn(ERef(RefId(Id("""__x4__""")))).setId(25980))).setId(25999))
  val instToStepMap: Map[Int, Int] = HashMap(25960 -> 0, 25970 -> 6, 25975 -> 6, 25961 -> 0, 25980 -> 8, 25965 -> 5, 25976 -> 7, 25964 -> 5, 25973 -> 6, 25967 -> 6, 25978 -> 8, 25979 -> 8, 25968 -> 6, 25963 -> 5, 25974 -> 6, 25969 -> 6, 25971 -> 6, 25981 -> 8, 25962 -> 0, 25977 -> 7, 25966 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(25960, 25961, 25962), 5 -> HashSet(25965, 25964, 25963), 6 -> HashSet(25970, 25975, 25968, 25973, 25967, 25974, 25966, 25969, 25971), 7 -> HashSet(25976, 25977), 8 -> HashSet(25980, 25979, 25978, 25981))
  /* Beautified form:
  "BreakableStatement1LabelledEvaluation0" (this, SwitchStatement, labelSet) => {
    access __x0__ = (SwitchStatement "Evaluation")
    let stmtResult = __x0__
    if (= stmtResult["Type"] CONST_break) if (= stmtResult["Target"] CONST_empty) if (= stmtResult["Value"] CONST_empty) {
      app __x1__ = (NormalCompletion undefined)
      stmtResult = __x1__
    } else {
      app __x2__ = (NormalCompletion stmtResult["Value"])
      stmtResult = __x2__
    } else {} else {}
    app __x3__ = (Completion stmtResult)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
