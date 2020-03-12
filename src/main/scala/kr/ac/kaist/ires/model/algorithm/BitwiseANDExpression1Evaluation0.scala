package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseANDExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseANDExpression1Evaluation0""", List(Id("""this"""), Id("""A"""), Id("""B""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""A"""))), EStr("""Evaluation""")).setId(21940), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(21941), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(21943), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(21944), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21945)).setId(21946), ISeq(List()).setId(21986)).setId(21948), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(21949), IAccess(Id("""__x2__"""), ERef(RefId(Id("""B"""))), EStr("""Evaluation""")).setId(21952), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(21953), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(21955), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21956), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21957)).setId(21958), ISeq(List()).setId(21995)).setId(21959), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(21960), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))).setId(21962), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(21963), IReturn(ERef(RefId(Id("""__x4__""")))).setId(21964)).setId(21965), ISeq(List()).setId(22002)).setId(21966), ILet(Id("""lnum"""), ERef(RefId(Id("""__x4__""")))).setId(21967), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""rval"""))))).setId(21969), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(21970), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21971)).setId(21972), ISeq(List()).setId(22009)).setId(21973), ILet(Id("""rnum"""), ERef(RefId(Id("""__x5__""")))).setId(21974), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OBAnd, ERef(RefId(Id("""lnum"""))), ERef(RefId(Id("""rnum""")))))).setId(21976), IReturn(ERef(RefId(Id("""__x6__""")))).setId(21977))).setId(22014))
  val instToStepMap: Map[Int, Int] = HashMap(21948 -> 1, 21953 -> 2, 21973 -> 5, 21966 -> 4, 21976 -> 6, 21974 -> 5, 21941 -> 0, 21955 -> 3, 21968 -> 4, 21949 -> 1, 21959 -> 3, 21942 -> 0, 21952 -> 2, 21961 -> 3, 21967 -> 4, 21975 -> 5, 21960 -> 3, 21940 -> 0, 21943 -> 1, 21969 -> 5, 21954 -> 2, 21950 -> 1, 21978 -> 6, 21977 -> 6, 21962 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(21940, 21941, 21942), 5 -> HashSet(21975, 21973, 21969, 21974), 1 -> HashSet(21948, 21943, 21950, 21949), 6 -> HashSet(21976, 21978, 21977), 2 -> HashSet(21952, 21953, 21954), 3 -> HashSet(21961, 21960, 21955, 21959), 4 -> HashSet(21967, 21966, 21968, 21962))
  /* Beautified form:
  "BitwiseANDExpression1Evaluation0" (this, A, B) => {
    access __x0__ = (A "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (B "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (ToInt32 lval)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let lnum = __x4__
    app __x5__ = (ToInt32 rval)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let rnum = __x5__
    app __x6__ = (WrapCompletion (& lnum rnum))
    return __x6__
  }
  */
}
