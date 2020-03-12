package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression3Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(18860), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(18861), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""expr"""))))).setId(18863), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(18864), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18865)).setId(18866), ISeq(List()).setId(18895)).setId(18868), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(18869), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(18870), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18871)).setId(18872), ISeq(List()).setId(18901)).setId(18873), ILet(Id("""oldValue"""), ERef(RefId(Id("""__x2__""")))).setId(18874), ILet(Id("""newValue"""), EBOp(OPlus, ERef(RefId(Id("""oldValue"""))), ENum(1.0))).setId(18876), IApp(Id("""__x3__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""expr"""))), ERef(RefId(Id("""newValue"""))))).setId(18878), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(18879), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18880)).setId(18881), ISeq(List()).setId(18909)).setId(18882), IExpr(ERef(RefId(Id("""__x3__""")))).setId(18883), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""newValue"""))))).setId(18885), IReturn(ERef(RefId(Id("""__x4__""")))).setId(18886))).setId(18914))
  val instToStepMap: Map[Int, Int] = HashMap(18874 -> 1, 18869 -> 1, 18883 -> 3, 18873 -> 1, 18885 -> 4, 18876 -> 2, 18886 -> 4, 18868 -> 1, 18882 -> 3, 18887 -> 4, 18861 -> 0, 18878 -> 3, 18877 -> 2, 18860 -> 0, 18884 -> 3, 18863 -> 1, 18862 -> 0, 18875 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(18861, 18860, 18862), 1 -> HashSet(18874, 18869, 18873, 18863, 18868, 18875), 2 -> HashSet(18877, 18876), 3 -> HashSet(18878, 18883, 18884, 18882), 4 -> HashSet(18885, 18886, 18887))
  /* Beautified form:
  "UpdateExpression3Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumber __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    let newValue = (+ oldValue 1.0)
    app __x3__ = (PutValue expr newValue)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion newValue)
    return __x4__
  }
  */
}
