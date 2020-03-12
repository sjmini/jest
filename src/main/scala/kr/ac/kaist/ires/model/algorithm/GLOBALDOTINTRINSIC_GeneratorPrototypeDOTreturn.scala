package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_GeneratorPrototypeDOTreturn {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_GeneratorPrototype.return""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(88747), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(88748), ILet(Id("""g"""), ERef(RefId(Id("""this""")))).setId(88750), ILet(Id("""C"""), EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty"""))))))).setId(88752), IApp(Id("""__x1__"""), ERef(RefId(Id("""GeneratorResumeAbrupt"""))), List(ERef(RefId(Id("""g"""))), ERef(RefId(Id("""C"""))))).setId(88754), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(88755), IReturn(ERef(RefId(Id("""__x1__""")))).setId(88756)).setId(88757), ISeq(List()).setId(88772)).setId(88759), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(88760), IReturn(ERef(RefId(Id("""__x2__""")))).setId(88761))).setId(88776))
  val instToStepMap: Map[Int, Int] = HashMap(88752 -> 2, 88749 -> 0, 88754 -> 3, 88750 -> 1, 88753 -> 2, 88748 -> 0, 88747 -> 0, 88751 -> 1, 88761 -> 3, 88760 -> 3, 88759 -> 3, 88762 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(88749, 88748, 88747), 1 -> HashSet(88750, 88751), 2 -> HashSet(88752, 88753), 3 -> HashSet(88754, 88761, 88760, 88759, 88762))
  /* Beautified form:
  "GLOBAL.INTRINSIC_GeneratorPrototype.return" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let g = this
    let C = (new Completion("Type" -> CONST_return, "Value" -> value, "Target" -> CONST_empty))
    app __x1__ = (GeneratorResumeAbrupt g C)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
