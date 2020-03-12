package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement1LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement1LabelledEvaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""V"""), EUndef).setId(30915), IWhile(EBool(true), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(30918), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(30919), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(30921), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(30922), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30923)).setId(30924), ISeq(List()).setId(30966)).setId(30926), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x1__""")))).setId(30927), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""exprValue"""))))).setId(30929), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(30930), IReturn(ERef(RefId(Id("""__x2__""")))).setId(30931)).setId(30932), ISeq(List()).setId(30973)).setId(30933), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(30934), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(30935), IReturn(ERef(RefId(Id("""__x4__""")))).setId(30936))).setId(30978), ISeq(List()).setId(30979)).setId(30938), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Statement"""))), EStr("""Evaluation""")).setId(30941), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x5__""")))).setId(30942), IApp(Id("""__x6__"""), ERef(RefId(Id("""LoopContinues"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""labelSet"""))))).setId(30944), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""V"""))))).setId(30945), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(30946), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(30947), IReturn(ERef(RefId(Id("""__x9__""")))).setId(30948))).setId(30988), ISeq(List()).setId(30989)).setId(30950), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value""")))).setId(30952), ISeq(List()).setId(30992)).setId(30954))).setId(30994)).setId(30957))).setId(30996))
  val instToStepMap: Map[Int, Int] = HashMap(30927 -> 10, 30934 -> 5, 30955 -> 10, 30933 -> 10, 30956 -> 10, 30957 -> 10, 30935 -> 5, 30947 -> 8, 30950 -> 10, 30945 -> 8, 30942 -> 10, 30952 -> 10, 30920 -> 10, 30937 -> 5, 30943 -> 10, 30928 -> 10, 30919 -> 10, 30936 -> 5, 30951 -> 10, 30929 -> 10, 30948 -> 8, 30916 -> 0, 30921 -> 10, 30944 -> 10, 30938 -> 10, 30953 -> 10, 30915 -> 0, 30918 -> 10, 30939 -> 10, 30941 -> 10, 30954 -> 10, 30926 -> 10, 30949 -> 8, 30946 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(30916, 30915), 5 -> HashSet(30934, 30937, 30936, 30935), 10 -> HashSet(30927, 30955, 30942, 30933, 30956, 30919, 30957, 30918, 30950, 30952, 30920, 30943, 30928, 30951, 30929, 30921, 30944, 30938, 30953, 30939, 30941, 30954, 30926), 6 -> HashSet(30933, 30929, 30938, 30939), 9 -> HashSet(30951, 30944, 30950), 7 -> HashSet(30942, 30943, 30941), 3 -> HashSet(30920, 30919, 30918), 8 -> HashSet(30945, 30948, 30947, 30949, 30946), 4 -> HashSet(30927, 30928, 30921, 30926))
  /* Beautified form:
  "IterationStatement1LabelledEvaluation0" (this, Expression, Statement, labelSet) => {
    let V = undefined
    while true {
      access __x0__ = (Expression "Evaluation")
      let exprRef = __x0__
      app __x1__ = (GetValue exprRef)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let exprValue = __x1__
      app __x2__ = (ToBoolean exprValue)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      if (= __x2__ false) {
        app __x3__ = (NormalCompletion V)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      access __x5__ = (Statement "Evaluation")
      let stmtResult = __x5__
      app __x6__ = (LoopContinues stmtResult labelSet)
      if (= __x6__ false) {
        app __x7__ = (UpdateEmpty stmtResult V)
        app __x8__ = (Completion __x7__)
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
      if (! (= stmtResult["Value"] CONST_empty)) V = stmtResult["Value"] else {}
    }
  }
  */
}
