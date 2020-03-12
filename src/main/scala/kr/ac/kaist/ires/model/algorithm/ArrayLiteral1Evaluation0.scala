package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayLiteral1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArrayLiteral1Evaluation0""", List(Id("""this"""), Id("""ElementList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(14237), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(14238), IReturn(ERef(RefId(Id("""__x0__""")))).setId(14239)).setId(14240), ISeq(List()).setId(14265)).setId(14242), ILet(Id("""array"""), ERef(RefId(Id("""__x0__""")))).setId(14243), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ElementList"""))), EStr("""ArrayAccumulation""")).setId(14245), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""array"""))), EINum(0L))).setId(14246), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(14247), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14248)).setId(14249), ISeq(List()).setId(14273)).setId(14250), ILet(Id("""len"""), ERef(RefId(Id("""__x2__""")))).setId(14251), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""len"""))))).setId(14253), IApp(Id("""__x4__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""array"""))), EStr("""length"""), ERef(RefId(Id("""__x3__"""))), EBool(false))).setId(14254), IExpr(ERef(RefId(Id("""__x4__""")))).setId(14255), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""array"""))))).setId(14257), IReturn(ERef(RefId(Id("""__x5__""")))).setId(14258))).setId(14281))
  val instToStepMap: Map[Int, Int] = HashMap(14241 -> 3, 14245 -> 1, 14253 -> 2, 14259 -> 4, 14244 -> 0, 14254 -> 2, 14258 -> 4, 14243 -> 0, 14255 -> 2, 14250 -> 1, 14252 -> 1, 14246 -> 1, 14237 -> 0, 14242 -> 0, 14257 -> 4, 14256 -> 2, 14251 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(14244, 14243, 14242, 14237), 1 -> HashSet(14245, 14250, 14252, 14246, 14251), 2 -> HashSet(14253, 14254, 14255, 14256), 3 -> HashSet(14241), 4 -> HashSet(14259, 14258, 14257))
  /* Beautified form:
  "ArrayLiteral1Evaluation0" (this, ElementList) => {
    app __x0__ = (ArrayCreate 0i)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    access __x1__ = (ElementList "ArrayAccumulation")
    app __x2__ = (__x1__ array 0i)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let len = __x2__
    app __x3__ = (ToUint32 len)
    app __x4__ = (Set array "length" __x3__ false)
    __x4__
    app __x5__ = (WrapCompletion array)
    return __x5__
  }
  */
}
