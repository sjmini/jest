package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AdditiveExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AdditiveExpression2Evaluation0""", List(Id("""this"""), Id("""AdditiveExpression"""), Id("""MultiplicativeExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AdditiveExpression"""))), EStr("""Evaluation""")).setId(20208), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(20209), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(20211), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(20212), IReturn(ERef(RefId(Id("""__x1__""")))).setId(20213)).setId(20214), ISeq(List()).setId(20254)).setId(20216), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(20217), IAccess(Id("""__x2__"""), ERef(RefId(Id("""MultiplicativeExpression"""))), EStr("""Evaluation""")).setId(20220), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(20221), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(20223), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(20224), IReturn(ERef(RefId(Id("""__x3__""")))).setId(20225)).setId(20226), ISeq(List()).setId(20263)).setId(20227), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(20228), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""lval"""))))).setId(20230), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(20231), IReturn(ERef(RefId(Id("""__x4__""")))).setId(20232)).setId(20233), ISeq(List()).setId(20270)).setId(20234), ILet(Id("""lnum"""), ERef(RefId(Id("""__x4__""")))).setId(20235), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rval"""))))).setId(20237), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(20238), IReturn(ERef(RefId(Id("""__x5__""")))).setId(20239)).setId(20240), ISeq(List()).setId(20277)).setId(20241), ILet(Id("""rnum"""), ERef(RefId(Id("""__x5__""")))).setId(20242), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OSub, ERef(RefId(Id("""lnum"""))), ERef(RefId(Id("""rnum""")))))).setId(20244), IReturn(ERef(RefId(Id("""__x6__""")))).setId(20245))).setId(20282))
  val instToStepMap: Map[Int, Int] = HashMap(20235 -> 4, 20209 -> 0, 20230 -> 4, 20223 -> 3, 20216 -> 1, 20229 -> 3, 20241 -> 5, 20228 -> 3, 20208 -> 0, 20221 -> 2, 20218 -> 1, 20242 -> 5, 20234 -> 4, 20210 -> 0, 20246 -> 6, 20245 -> 6, 20227 -> 3, 20220 -> 2, 20244 -> 6, 20236 -> 4, 20217 -> 1, 20237 -> 5, 20211 -> 1, 20222 -> 2, 20243 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(20209, 20208, 20210), 5 -> HashSet(20241, 20237, 20242, 20243), 1 -> HashSet(20216, 20217, 20211, 20218), 6 -> HashSet(20245, 20244, 20246), 2 -> HashSet(20220, 20221, 20222), 3 -> HashSet(20227, 20223, 20229, 20228), 4 -> HashSet(20235, 20230, 20236, 20234))
  /* Beautified form:
  "AdditiveExpression2Evaluation0" (this, AdditiveExpression, MultiplicativeExpression) => {
    access __x0__ = (AdditiveExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (MultiplicativeExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (ToNumber lval)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let lnum = __x4__
    app __x5__ = (ToNumber rval)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let rnum = __x5__
    app __x6__ = (WrapCompletion (- lnum rnum))
    return __x6__
  }
  */
}
