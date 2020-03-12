package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression4Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression4Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(18942), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(18943), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""expr"""))))).setId(18945), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(18946), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18947)).setId(18948), ISeq(List()).setId(18977)).setId(18950), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(18951), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(18952), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18953)).setId(18954), ISeq(List()).setId(18983)).setId(18955), ILet(Id("""oldValue"""), ERef(RefId(Id("""__x2__""")))).setId(18956), ILet(Id("""newValue"""), EBOp(OSub, ERef(RefId(Id("""oldValue"""))), ENum(1.0))).setId(18958), IApp(Id("""__x3__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""expr"""))), ERef(RefId(Id("""newValue"""))))).setId(18960), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(18961), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18962)).setId(18963), ISeq(List()).setId(18991)).setId(18964), IExpr(ERef(RefId(Id("""__x3__""")))).setId(18965), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""newValue"""))))).setId(18967), IReturn(ERef(RefId(Id("""__x4__""")))).setId(18968))).setId(18996))
  val instToStepMap: Map[Int, Int] = HashMap(18955 -> 1, 18965 -> 3, 18958 -> 2, 18968 -> 4, 18944 -> 0, 18966 -> 3, 18957 -> 1, 18969 -> 4, 18950 -> 1, 18960 -> 3, 18942 -> 0, 18951 -> 1, 18945 -> 1, 18964 -> 3, 18959 -> 2, 18956 -> 1, 18943 -> 0, 18967 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(18942, 18944, 18943), 1 -> HashSet(18951, 18955, 18945, 18957, 18956, 18950), 2 -> HashSet(18959, 18958), 3 -> HashSet(18964, 18965, 18966, 18960), 4 -> HashSet(18968, 18969, 18967))
  /* Beautified form:
  "UpdateExpression4Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumber __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    let newValue = (- oldValue 1.0)
    app __x3__ = (PutValue expr newValue)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion newValue)
    return __x4__
  }
  */
}
