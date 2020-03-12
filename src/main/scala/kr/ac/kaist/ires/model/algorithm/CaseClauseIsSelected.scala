package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClauseIsSelected {
  val length: Int = 2
  val func: Func = Func("""CaseClauseIsSelected""", List(Id("""C"""), Id("""input""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""C"""))), EStr("""Expression""")).setId(35966), IAccess(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), EStr("""Evaluation""")).setId(35968), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x1__""")))).setId(35969), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(35971), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(35972), IReturn(ERef(RefId(Id("""__x2__""")))).setId(35973)).setId(35974), ISeq(List()).setId(35991)).setId(35975), ILet(Id("""clauseSelector"""), ERef(RefId(Id("""__x2__""")))).setId(35976), IApp(Id("""__x3__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""input"""))), ERef(RefId(Id("""clauseSelector"""))))).setId(35979), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(35980), IReturn(ERef(RefId(Id("""__x4__""")))).setId(35981))).setId(35997))
  val instToStepMap: Map[Int, Int] = HashMap(35965 -> 0, 35977 -> 2, 35976 -> 2, 35970 -> 1, 35981 -> 3, 35968 -> 1, 35971 -> 2, 35979 -> 3, 35980 -> 3, 35966 -> 1, 35982 -> 3, 35969 -> 1, 35975 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35965), 1 -> HashSet(35970, 35968, 35966, 35969), 2 -> HashSet(35977, 35976, 35971, 35975), 3 -> HashSet(35981, 35979, 35980, 35982))
  /* Beautified form:
  "CaseClauseIsSelected" (C, input) => {
    access __x0__ = (C "Expression")
    access __x1__ = (__x0__ "Evaluation")
    let exprRef = __x1__
    app __x2__ = (GetValue exprRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let clauseSelector = __x2__
    app __x3__ = (StrictEqualityComparison input clauseSelector)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
