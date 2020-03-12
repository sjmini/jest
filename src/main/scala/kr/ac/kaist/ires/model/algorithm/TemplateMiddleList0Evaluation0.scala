package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateMiddleList0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList0Evaluation0""", List(Id("""this"""), Id("""TemplateMiddle"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TV""")).setId(15929), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(15931), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(15934), ILet(Id("""subRef"""), ERef(RefId(Id("""__x1__""")))).setId(15935), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""subRef"""))))).setId(15937), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(15938), IReturn(ERef(RefId(Id("""__x2__""")))).setId(15939)).setId(15940), ISeq(List()).setId(15964)).setId(15942), ILet(Id("""sub"""), ERef(RefId(Id("""__x2__""")))).setId(15943), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""sub"""))))).setId(15945), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(15946), IReturn(ERef(RefId(Id("""__x3__""")))).setId(15947)).setId(15948), ISeq(List()).setId(15971)).setId(15949), ILet(Id("""middle"""), ERef(RefId(Id("""__x3__""")))).setId(15950), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""head"""))), ERef(RefId(Id("""middle""")))))).setId(15952), IReturn(ERef(RefId(Id("""__x4__""")))).setId(15953))).setId(15976))
  val instToStepMap: Map[Int, Int] = HashMap(15931 -> 0, 15943 -> 2, 15954 -> 4, 15952 -> 4, 15935 -> 1, 15944 -> 2, 15934 -> 1, 15951 -> 3, 15936 -> 1, 15929 -> 0, 15937 -> 2, 15932 -> 0, 15953 -> 4, 15949 -> 3, 15942 -> 2, 15950 -> 3, 15945 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(15931, 15929, 15932), 1 -> HashSet(15935, 15934, 15936), 2 -> HashSet(15943, 15944, 15937, 15942), 3 -> HashSet(15951, 15949, 15950, 15945), 4 -> HashSet(15954, 15952, 15953))
  /* Beautified form:
  "TemplateMiddleList0Evaluation0" (this, TemplateMiddle, Expression) => {
    access __x0__ = (TemplateMiddle "TV")
    let head = __x0__
    access __x1__ = (Expression "Evaluation")
    let subRef = __x1__
    app __x2__ = (GetValue subRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let sub = __x2__
    app __x3__ = (ToString sub)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let middle = __x3__
    app __x4__ = (WrapCompletion (+ head middle))
    return __x4__
  }
  */
}
