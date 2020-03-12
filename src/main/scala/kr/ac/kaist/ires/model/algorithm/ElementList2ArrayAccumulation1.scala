package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ElementList2ArrayAccumulation1 {
  val length: Int = 0
  val func: Func = Func("""ElementList2ArrayAccumulation1""", List(Id("""this"""), Id("""ElementList"""), Id("""Elision"""), Id("""AssignmentExpression"""), Id("""array"""), Id("""nextIndex""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ElementList"""))), EStr("""ArrayAccumulation""")).setId(13892), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""nextIndex"""))))).setId(13893), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(13894), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13895)).setId(13896), ISeq(List()).setId(13933)).setId(13898), ILet(Id("""postIndex"""), ERef(RefId(Id("""__x1__""")))).setId(13899), IIf(EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent), ILet(Id("""padding"""), EINum(0L)).setId(13902), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""Elision"""))), EStr("""ElisionWidth""")).setId(13901), ILet(Id("""padding"""), ERef(RefId(Id("""__x2__""")))).setId(13904))).setId(13939)).setId(13906), IAccess(Id("""__x3__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(13909), ILet(Id("""initResult"""), ERef(RefId(Id("""__x3__""")))).setId(13910), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""initResult"""))))).setId(13912), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(13913), IReturn(ERef(RefId(Id("""__x4__""")))).setId(13914)).setId(13915), ISeq(List()).setId(13947)).setId(13916), ILet(Id("""initValue"""), ERef(RefId(Id("""__x4__""")))).setId(13917), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToUint32"""))), List(EBOp(OPlus, ERef(RefId(Id("""postIndex"""))), ERef(RefId(Id("""padding""")))))).setId(13919), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(13920), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""initValue"""))))).setId(13921), ILet(Id("""created"""), ERef(RefId(Id("""__x7__""")))).setId(13922), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""postIndex"""))), ERef(RefId(Id("""padding""")))), EINum(1L)))).setId(13924), IReturn(ERef(RefId(Id("""__x8__""")))).setId(13925))).setId(13956))
  val instToStepMap: Map[Int, Int] = HashMap(13918 -> 3, 13923 -> 4, 13906 -> 1, 13910 -> 2, 13924 -> 6, 13899 -> 0, 13907 -> 1, 13925 -> 6, 13912 -> 3, 13897 -> 5, 13919 -> 4, 13926 -> 6, 13909 -> 2, 13922 -> 4, 13917 -> 3, 13892 -> 0, 13900 -> 0, 13911 -> 2, 13898 -> 0, 13920 -> 4, 13921 -> 4, 13916 -> 3, 13893 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(13892, 13899, 13900, 13898, 13893), 5 -> HashSet(13897), 1 -> HashSet(13906, 13907), 6 -> HashSet(13924, 13925, 13926), 2 -> HashSet(13910, 13911, 13909), 3 -> HashSet(13918, 13917, 13916, 13912), 4 -> HashSet(13923, 13920, 13921, 13919, 13922))
  /* Beautified form:
  "ElementList2ArrayAccumulation1" (this, ElementList, Elision, AssignmentExpression, array, nextIndex) => {
    access __x0__ = (ElementList "ArrayAccumulation")
    app __x1__ = (__x0__ array nextIndex)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let postIndex = __x1__
    if (= Elision absent) let padding = 0i else {
      access __x2__ = (Elision "ElisionWidth")
      let padding = __x2__
    }
    access __x3__ = (AssignmentExpression "Evaluation")
    let initResult = __x3__
    app __x4__ = (GetValue initResult)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let initValue = __x4__
    app __x5__ = (ToUint32 (+ postIndex padding))
    app __x6__ = (ToString __x5__)
    app __x7__ = (CreateDataProperty array __x6__ initValue)
    let created = __x7__
    app __x8__ = (WrapCompletion (+ (+ postIndex padding) 1i))
    return __x8__
  }
  */
}
