package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgumentList3ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArgumentList3ArgumentListEvaluation0""", List(Id("""this"""), Id("""ArgumentList"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ArgumentList"""))), EStr("""ArgumentListEvaluation""")).setId(18226), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(18227), IReturn(ERef(RefId(Id("""__x0__""")))).setId(18228)).setId(18229), ISeq(List()).setId(18278)).setId(18231), ILet(Id("""precedingArgs"""), ERef(RefId(Id("""__x0__""")))).setId(18232), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(18235), ILet(Id("""spreadRef"""), ERef(RefId(Id("""__x1__""")))).setId(18236), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""spreadRef"""))))).setId(18238), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(18239), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18240)).setId(18241), ISeq(List()).setId(18287)).setId(18242), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(18243), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(18244), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18245)).setId(18246), ISeq(List()).setId(18293)).setId(18247), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x3__""")))).setId(18248), IWhile(EBool(true), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(18250), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(18251), IReturn(ERef(RefId(Id("""__x4__""")))).setId(18252)).setId(18253), ISeq(List()).setId(18300)).setId(18254), ILet(Id("""next"""), ERef(RefId(Id("""__x4__""")))).setId(18255), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""precedingArgs"""))))).setId(18257), IReturn(ERef(RefId(Id("""__x5__""")))).setId(18258))).setId(18305), ISeq(List()).setId(18306)).setId(18260), IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(18262), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(18263), IReturn(ERef(RefId(Id("""__x6__""")))).setId(18264)).setId(18265), ISeq(List()).setId(18312)).setId(18266), ILet(Id("""nextArg"""), ERef(RefId(Id("""__x6__""")))).setId(18267), IAppend(ERef(RefId(Id("""nextArg"""))), ERef(RefId(Id("""precedingArgs""")))).setId(18269))).setId(18316)).setId(18272))).setId(18318))
  val instToStepMap: Map[Int, Int] = HashMap(18272 -> 9, 18233 -> 0, 18247 -> 2, 18232 -> 0, 18260 -> 9, 18261 -> 9, 18268 -> 9, 18248 -> 2, 18257 -> 6, 18262 -> 9, 18267 -> 9, 18271 -> 9, 18249 -> 2, 18237 -> 1, 18231 -> 0, 18259 -> 6, 18269 -> 9, 18236 -> 1, 18255 -> 9, 18242 -> 2, 18235 -> 1, 18250 -> 9, 18270 -> 9, 18238 -> 2, 18243 -> 2, 18254 -> 9, 18258 -> 6, 18226 -> 0, 18256 -> 9, 18266 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(18233, 18232, 18226, 18231), 5 -> HashSet(18255, 18250, 18254, 18256), 1 -> HashSet(18236, 18235, 18237), 6 -> HashSet(18257, 18258, 18259), 9 -> HashSet(18272, 18269, 18260, 18261, 18268, 18255, 18262, 18267, 18250, 18270, 18254, 18271, 18256, 18266), 2 -> HashSet(18247, 18248, 18242, 18238, 18243, 18249), 7 -> HashSet(18260, 18261), 8 -> HashSet(18268, 18262, 18267, 18266))
  /* Beautified form:
  "ArgumentList3ArgumentListEvaluation0" (this, ArgumentList, AssignmentExpression) => {
    access __x0__ = (ArgumentList "ArgumentListEvaluation")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let precedingArgs = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let spreadRef = __x1__
    app __x2__ = (GetValue spreadRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (GetIterator __x2__)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let iteratorRecord = __x3__
    while true {
      app __x4__ = (IteratorStep iteratorRecord)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let next = __x4__
      if (= next false) {
        app __x5__ = (WrapCompletion precedingArgs)
        return __x5__
      } else {}
      app __x6__ = (IteratorValue next)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let nextArg = __x6__
      append nextArg -> precedingArgs
    }
  }
  */
}
