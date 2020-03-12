package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression3Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(19365), ILet(Id("""val"""), ERef(RefId(Id("""__x0__""")))).setId(19366), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""val""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""val""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""val""")), ERef(RefProp(RefId(Id("""val""")), EStr("""Value""")))).setId(19368), IReturn(ERef(RefId(Id("""val""")))).setId(19369)).setId(19370), ISeq(List()).setId(19402)).setId(19372), IExpr(ERef(RefId(Id("""val""")))).setId(19373), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""val"""))))).setId(19375), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Reference""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""val"""))))).setId(19376), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""undefined"""))).setId(19377), IReturn(ERef(RefId(Id("""__x3__""")))).setId(19378))).setId(19409), ISeq(List()).setId(19410)).setId(19380))).setId(19412), ISeq(List()).setId(19413)).setId(19383), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""val"""))))).setId(19385), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(19386), IReturn(ERef(RefId(Id("""__x4__""")))).setId(19387)).setId(19388), ISeq(List()).setId(19419)).setId(19389), IAssign(RefId(Id("""val""")), ERef(RefId(Id("""__x4__""")))).setId(19390), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetTypeOf"""))), List(ERef(RefId(Id("""val"""))))).setId(19392), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(19393), IReturn(ERef(RefId(Id("""__x6__""")))).setId(19394))).setId(19425))
  val instToStepMap: Map[Int, Int] = HashMap(19391 -> 6, 19374 -> 1, 19382 -> 4, 19379 -> 4, 19390 -> 6, 19373 -> 1, 19366 -> 0, 19381 -> 4, 19376 -> 4, 19385 -> 6, 19372 -> 1, 19389 -> 6, 19377 -> 4, 19394 -> 7, 19378 -> 4, 19395 -> 7, 19393 -> 7, 19383 -> 5, 19380 -> 4, 19365 -> 0, 19384 -> 5, 19367 -> 0, 19392 -> 7, 19375 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(19366, 19365, 19367), 5 -> HashSet(19383, 19384, 19375), 1 -> HashSet(19374, 19373, 19372), 6 -> HashSet(19391, 19390, 19385, 19389), 7 -> HashSet(19393, 19392, 19394, 19395), 4 -> HashSet(19382, 19379, 19380, 19381, 19376, 19377, 19378))
  /* Beautified form:
  "UnaryExpression3Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let val = __x0__
    if (= (typeof val) "Completion") if (= val["Type"] CONST_normal) val = val["Value"] else return val else {}
    val
    app __x1__ = (Type val)
    if (= __x1__ Reference) {
      app __x2__ = (IsUnresolvableReference val)
      if (= __x2__ true) {
        app __x3__ = (WrapCompletion "undefined")
        return __x3__
      } else {}
    } else {}
    app __x4__ = (GetValue val)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    val = __x4__
    app __x5__ = (GetTypeOf val)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
