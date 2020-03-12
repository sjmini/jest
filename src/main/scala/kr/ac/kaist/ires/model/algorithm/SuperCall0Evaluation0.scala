package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SuperCall0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""SuperCall0Evaluation0""", List(Id("""this"""), Id("""Arguments""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetNewTarget"""))), List()).setId(17760), ILet(Id("""newTarget"""), ERef(RefId(Id("""__x0__""")))).setId(17761), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetSuperConstructor"""))), List()).setId(17764), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(17765), IReturn(ERef(RefId(Id("""__x1__""")))).setId(17766)).setId(17767), ISeq(List()).setId(17803)).setId(17768), ILet(Id("""func"""), ERef(RefId(Id("""__x1__""")))).setId(17769), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Arguments"""))), EStr("""ArgumentListEvaluation""")).setId(17771), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(17772), IReturn(ERef(RefId(Id("""__x2__""")))).setId(17773)).setId(17774), ISeq(List()).setId(17810)).setId(17775), ILet(Id("""argList"""), ERef(RefId(Id("""__x2__""")))).setId(17776), IApp(Id("""__x3__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""argList"""))), ERef(RefId(Id("""newTarget"""))))).setId(17778), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(17779), IReturn(ERef(RefId(Id("""__x3__""")))).setId(17780)).setId(17781), ISeq(List()).setId(17817)).setId(17782), ILet(Id("""result"""), ERef(RefId(Id("""__x3__""")))).setId(17783), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()).setId(17785), ILet(Id("""thisER"""), ERef(RefId(Id("""__x4__""")))).setId(17786), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""thisER""")), EStr("""BindThisValue"""))), List(ERef(RefId(Id("""thisER"""))), ERef(RefId(Id("""result"""))))).setId(17788), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(17789), IReturn(ERef(RefId(Id("""__x5__""")))).setId(17790)).setId(17791), ISeq(List()).setId(17826)).setId(17792), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(17793), IReturn(ERef(RefId(Id("""__x6__""")))).setId(17794))).setId(17830))
  val instToStepMap: Map[Int, Int] = HashMap(17783 -> 4, 17787 -> 5, 17770 -> 2, 17793 -> 6, 17784 -> 4, 17795 -> 6, 17786 -> 5, 17794 -> 6, 17768 -> 2, 17777 -> 3, 17760 -> 0, 17778 -> 4, 17771 -> 3, 17788 -> 6, 17763 -> 1, 17761 -> 0, 17776 -> 3, 17769 -> 2, 17764 -> 2, 17762 -> 0, 17775 -> 3, 17792 -> 6, 17785 -> 5, 17782 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(17761, 17762, 17760), 5 -> HashSet(17787, 17786, 17785), 1 -> HashSet(17763), 6 -> HashSet(17788, 17793, 17795, 17794, 17792), 2 -> HashSet(17770, 17769, 17764, 17768), 3 -> HashSet(17771, 17776, 17777, 17775), 4 -> HashSet(17783, 17784, 17782, 17778))
  /* Beautified form:
  "SuperCall0Evaluation0" (this, Arguments) => {
    app __x0__ = (GetNewTarget )
    let newTarget = __x0__
    app __x1__ = (GetSuperConstructor )
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let func = __x1__
    access __x2__ = (Arguments "ArgumentListEvaluation")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let argList = __x2__
    app __x3__ = (Construct func argList newTarget)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let result = __x3__
    app __x4__ = (GetThisEnvironment )
    let thisER = __x4__
    app __x5__ = (thisER["BindThisValue"] thisER result)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
