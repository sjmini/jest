package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTCanDeclareGlobalVar {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.CanDeclareGlobalVar""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48666), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48668), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))).setId(48670), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))).setId(48672), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(48673), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48674)).setId(48675), ISeq(List()).setId(48701)).setId(48677), ILet(Id("""hasProperty"""), ERef(RefId(Id("""__x0__""")))).setId(48678), IIf(EBOp(OEq, ERef(RefId(Id("""hasProperty"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48680), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48681))).setId(48706), ISeq(List()).setId(48707)).setId(48683), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""globalObject"""))))).setId(48685), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(48686), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48687)).setId(48688), ISeq(List()).setId(48713)).setId(48689), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(48690), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48691))).setId(48717))
  val instToStepMap: Map[Int, Int] = HashMap(48670 -> 2, 48691 -> 6, 48680 -> 4, 48683 -> 5, 48666 -> 0, 48690 -> 6, 48671 -> 2, 48689 -> 6, 48681 -> 4, 48682 -> 4, 48672 -> 3, 48667 -> 0, 48679 -> 3, 48685 -> 6, 48684 -> 5, 48668 -> 1, 48678 -> 3, 48669 -> 1, 48677 -> 3, 48692 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48666, 48667), 5 -> HashSet(48683, 48684), 1 -> HashSet(48668, 48669), 6 -> HashSet(48691, 48690, 48685, 48689, 48692), 2 -> HashSet(48670, 48671), 3 -> HashSet(48679, 48678, 48677, 48672), 4 -> HashSet(48680, 48681, 48682))
  /* Beautified form:
  "GlobalEnvironmentRecord.CanDeclareGlobalVar" (this, N) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (HasOwnProperty globalObject N)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let hasProperty = __x0__
    if (= hasProperty true) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    app __x2__ = (IsExtensible globalObject)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
