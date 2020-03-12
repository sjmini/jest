package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ReturnStatement1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ReturnStatement1Evaluation0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(34038), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(34039), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(34041), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(34042), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34043)).setId(34044), ISeq(List()).setId(34073)).setId(34046), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x1__""")))).setId(34047), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()).setId(34049), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(34050), IReturn(ERef(RefId(Id("""__x2__""")))).setId(34051)).setId(34052), ISeq(List()).setId(34080)).setId(34053), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""exprValue"""))))).setId(34054), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(34055), IReturn(ERef(RefId(Id("""__x3__""")))).setId(34056)).setId(34057), ISeq(List()).setId(34086)).setId(34058), IAssign(RefId(Id("""exprValue""")), ERef(RefId(Id("""__x3__""")))).setId(34059))).setId(34089), ISeq(List()).setId(34090)).setId(34061), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""exprValue""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(34063), IReturn(ERef(RefId(Id("""__x4__""")))).setId(34064))).setId(34094))
  val instToStepMap: Map[Int, Int] = HashMap(34061 -> 3, 34039 -> 0, 34062 -> 3, 34040 -> 0, 34048 -> 1, 34053 -> 3, 34060 -> 2, 34064 -> 4, 34047 -> 1, 34038 -> 0, 34041 -> 1, 34046 -> 1, 34065 -> 4, 34054 -> 2, 34049 -> 3, 34059 -> 2, 34058 -> 2, 34063 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(34039, 34040, 34038), 1 -> HashSet(34048, 34047, 34041, 34046), 2 -> HashSet(34054, 34060, 34059, 34058), 3 -> HashSet(34061, 34062, 34053, 34049), 4 -> HashSet(34065, 34064, 34063))
  /* Beautified form:
  "ReturnStatement1Evaluation0" (this, Expression) => {
    access __x0__ = (Expression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let exprValue = __x1__
    app __x2__ = (GetGeneratorKind )
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    if (= __x2__ CONST_async) {
      app __x3__ = (Await exprValue)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      exprValue = __x3__
    } else {}
    app __x4__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> exprValue, "Target" -> CONST_empty)))
    return __x4__
  }
  */
}
