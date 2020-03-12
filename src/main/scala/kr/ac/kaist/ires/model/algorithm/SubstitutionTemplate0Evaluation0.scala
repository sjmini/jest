package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SubstitutionTemplate0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""SubstitutionTemplate0Evaluation0""", List(Id("""this"""), Id("""TemplateHead"""), Id("""Expression"""), Id("""TemplateSpans""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateHead"""))), EStr("""TV""")).setId(15771), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(15773), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(15776), ILet(Id("""subRef"""), ERef(RefId(Id("""__x1__""")))).setId(15777), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""subRef"""))))).setId(15779), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(15780), IReturn(ERef(RefId(Id("""__x2__""")))).setId(15781)).setId(15782), ISeq(List()).setId(15816)).setId(15784), ILet(Id("""sub"""), ERef(RefId(Id("""__x2__""")))).setId(15785), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""sub"""))))).setId(15787), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(15788), IReturn(ERef(RefId(Id("""__x3__""")))).setId(15789)).setId(15790), ISeq(List()).setId(15823)).setId(15791), ILet(Id("""middle"""), ERef(RefId(Id("""__x3__""")))).setId(15792), IAccess(Id("""__x4__"""), ERef(RefId(Id("""TemplateSpans"""))), EStr("""Evaluation""")).setId(15795), ILet(Id("""tail"""), ERef(RefId(Id("""__x4__""")))).setId(15796), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""tail""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""tail""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""tail""")), ERef(RefProp(RefId(Id("""tail""")), EStr("""Value""")))).setId(15798), IReturn(ERef(RefId(Id("""tail""")))).setId(15799)).setId(15800), ISeq(List()).setId(15831)).setId(15801), IExpr(ERef(RefId(Id("""tail""")))).setId(15802), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""head"""))), ERef(RefId(Id("""middle""")))), ERef(RefId(Id("""tail""")))))).setId(15804), IReturn(ERef(RefId(Id("""__x5__""")))).setId(15805))).setId(15836))
  val instToStepMap: Map[Int, Int] = HashMap(15806 -> 6, 15795 -> 4, 15791 -> 3, 15776 -> 1, 15787 -> 3, 15802 -> 5, 15779 -> 2, 15771 -> 0, 15792 -> 3, 15778 -> 1, 15785 -> 2, 15777 -> 1, 15773 -> 0, 15786 -> 2, 15801 -> 5, 15784 -> 2, 15774 -> 0, 15793 -> 3, 15803 -> 5, 15804 -> 6, 15797 -> 4, 15805 -> 6, 15796 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(15774, 15771, 15773), 5 -> HashSet(15802, 15803, 15801), 1 -> HashSet(15776, 15778, 15777), 6 -> HashSet(15806, 15804, 15805), 2 -> HashSet(15784, 15779, 15785, 15786), 3 -> HashSet(15791, 15787, 15792, 15793), 4 -> HashSet(15795, 15797, 15796))
  /* Beautified form:
  "SubstitutionTemplate0Evaluation0" (this, TemplateHead, Expression, TemplateSpans) => {
    access __x0__ = (TemplateHead "TV")
    let head = __x0__
    access __x1__ = (Expression "Evaluation")
    let subRef = __x1__
    app __x2__ = (GetValue subRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let sub = __x2__
    app __x3__ = (ToString sub)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let middle = __x3__
    access __x4__ = (TemplateSpans "Evaluation")
    let tail = __x4__
    if (= (typeof tail) "Completion") if (= tail["Type"] CONST_normal) tail = tail["Value"] else return tail else {}
    tail
    app __x5__ = (WrapCompletion (+ (+ head middle) tail))
    return __x5__
  }
  */
}
