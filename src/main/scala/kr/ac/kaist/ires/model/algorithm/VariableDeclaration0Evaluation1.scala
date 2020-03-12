package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object VariableDeclaration0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclaration0Evaluation1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(27618), ILet(Id("""bindingId"""), ERef(RefId(Id("""__x0__""")))).setId(27619), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""bindingId"""))))).setId(27621), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(27622), IReturn(ERef(RefId(Id("""__x1__""")))).setId(27623)).setId(27624), ISeq(List()).setId(27664)).setId(27626), ILet(Id("""lhs"""), ERef(RefId(Id("""__x1__""")))).setId(27627), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(27629), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(27630), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""bindingId"""))))).setId(27631), ILet(Id("""value"""), ERef(RefId(Id("""__x4__""")))).setId(27632))).setId(27671), ISeq(List(IAccess(Id("""__x5__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(27636), ILet(Id("""rhs"""), ERef(RefId(Id("""__x5__""")))).setId(27637), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rhs"""))))).setId(27639), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(27640), IReturn(ERef(RefId(Id("""__x6__""")))).setId(27641)).setId(27642), ISeq(List()).setId(27678)).setId(27643), ILet(Id("""value"""), ERef(RefId(Id("""__x6__""")))).setId(27644))).setId(27681)).setId(27647), IApp(Id("""__x7__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""value"""))))).setId(27649), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(27650), IReturn(ERef(RefId(Id("""__x7__""")))).setId(27651)).setId(27652), ISeq(List()).setId(27687)).setId(27653), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(27654), IReturn(ERef(RefId(Id("""__x8__""")))).setId(27655))).setId(27691))
  val instToStepMap: Map[Int, Int] = HashMap(27633 -> 4, 27628 -> 1, 27655 -> 9, 27620 -> 0, 27621 -> 1, 27631 -> 4, 27646 -> 8, 27634 -> 4, 27618 -> 0, 27649 -> 9, 27638 -> 8, 27629 -> 8, 27639 -> 8, 27637 -> 8, 27632 -> 4, 27647 -> 8, 27643 -> 8, 27656 -> 9, 27630 -> 4, 27645 -> 8, 27653 -> 9, 27627 -> 1, 27619 -> 0, 27644 -> 8, 27636 -> 8, 27626 -> 1, 27648 -> 8, 27654 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(27620, 27618, 27619), 1 -> HashSet(27628, 27621, 27627, 27626), 9 -> HashSet(27655, 27656, 27649, 27653, 27654), 7 -> HashSet(27637, 27638, 27636), 8 -> HashSet(27647, 27643, 27646, 27645, 27638, 27644, 27636, 27648, 27629, 27639, 27637), 4 -> HashSet(27633, 27632, 27631, 27634, 27630))
  /* Beautified form:
  "VariableDeclaration0Evaluation1" (this, BindingIdentifier, Initializer) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let bindingId = __x0__
    app __x1__ = (ResolveBinding bindingId)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    app __x2__ = (IsAnonymousFunctionDefinition Initializer)
    if (= __x2__ true) {
      access __x3__ = (Initializer "NamedEvaluation")
      app __x4__ = (__x3__ bindingId)
      let value = __x4__
    } else {
      access __x5__ = (Initializer "Evaluation")
      let rhs = __x5__
      app __x6__ = (GetValue rhs)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let value = __x6__
    }
    app __x7__ = (PutValue lhs value)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
