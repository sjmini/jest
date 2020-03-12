package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayLiteral2Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""ArrayLiteral2Evaluation1""", List(Id("""this"""), Id("""ElementList"""), Id("""Elision""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(14303), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(14304), IReturn(ERef(RefId(Id("""__x0__""")))).setId(14305)).setId(14306), ISeq(List()).setId(14338)).setId(14308), ILet(Id("""array"""), ERef(RefId(Id("""__x0__""")))).setId(14309), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ElementList"""))), EStr("""ArrayAccumulation""")).setId(14311), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""array"""))), EINum(0L))).setId(14312), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(14313), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14314)).setId(14315), ISeq(List()).setId(14346)).setId(14316), ILet(Id("""len"""), ERef(RefId(Id("""__x2__""")))).setId(14317), IIf(EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent), ILet(Id("""padding"""), EINum(0L)).setId(14320), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""Elision"""))), EStr("""ElisionWidth""")).setId(14319), ILet(Id("""padding"""), ERef(RefId(Id("""__x3__""")))).setId(14322))).setId(14352)).setId(14324), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToUint32"""))), List(EBOp(OPlus, ERef(RefId(Id("""padding"""))), ERef(RefId(Id("""len""")))))).setId(14326), IApp(Id("""__x5__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""array"""))), EStr("""length"""), ERef(RefId(Id("""__x4__"""))), EBool(false))).setId(14327), IExpr(ERef(RefId(Id("""__x5__""")))).setId(14328), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""array"""))))).setId(14330), IReturn(ERef(RefId(Id("""__x6__""")))).setId(14331))).setId(14359))
  val instToStepMap: Map[Int, Int] = HashMap(14324 -> 2, 14328 -> 3, 14309 -> 0, 14308 -> 0, 14317 -> 1, 14318 -> 1, 14303 -> 0, 14326 -> 3, 14307 -> 4, 14311 -> 1, 14329 -> 3, 14332 -> 5, 14310 -> 0, 14331 -> 5, 14316 -> 1, 14327 -> 3, 14312 -> 1, 14325 -> 2, 14330 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(14309, 14308, 14303, 14310), 5 -> HashSet(14331, 14332, 14330), 1 -> HashSet(14316, 14317, 14312, 14318, 14311), 2 -> HashSet(14324, 14325), 3 -> HashSet(14328, 14327, 14326, 14329), 4 -> HashSet(14307))
  /* Beautified form:
  "ArrayLiteral2Evaluation1" (this, ElementList, Elision) => {
    app __x0__ = (ArrayCreate 0i)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    access __x1__ = (ElementList "ArrayAccumulation")
    app __x2__ = (__x1__ array 0i)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let len = __x2__
    if (= Elision absent) let padding = 0i else {
      access __x3__ = (Elision "ElisionWidth")
      let padding = __x3__
    }
    app __x4__ = (ToUint32 (+ padding len))
    app __x5__ = (Set array "length" __x4__ false)
    __x5__
    app __x6__ = (WrapCompletion array)
    return __x6__
  }
  */
}
