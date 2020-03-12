package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SpreadElement0ArrayAccumulation0 {
  val length: Int = 0
  val func: Func = Func("""SpreadElement0ArrayAccumulation0""", List(Id("""this"""), Id("""AssignmentExpression"""), Id("""array"""), Id("""nextIndex""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(14045), ILet(Id("""spreadRef"""), ERef(RefId(Id("""__x0__""")))).setId(14046), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""spreadRef"""))))).setId(14048), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(14049), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14050)).setId(14051), ISeq(List()).setId(14098)).setId(14053), ILet(Id("""spreadObj"""), ERef(RefId(Id("""__x1__""")))).setId(14054), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""spreadObj"""))))).setId(14056), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(14057), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14058)).setId(14059), ISeq(List()).setId(14105)).setId(14060), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x2__""")))).setId(14061), IWhile(EBool(true), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(14063), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(14064), IReturn(ERef(RefId(Id("""__x3__""")))).setId(14065)).setId(14066), ISeq(List()).setId(14112)).setId(14067), ILet(Id("""next"""), ERef(RefId(Id("""__x3__""")))).setId(14068), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""nextIndex"""))))).setId(14070), IReturn(ERef(RefId(Id("""__x4__""")))).setId(14071))).setId(14117), ISeq(List()).setId(14118)).setId(14073), IApp(Id("""__x5__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(14075), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(14076), IReturn(ERef(RefId(Id("""__x5__""")))).setId(14077)).setId(14078), ISeq(List()).setId(14124)).setId(14079), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x5__""")))).setId(14080), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""nextIndex"""))))).setId(14082), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(14083), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""nextValue"""))))).setId(14084), ILet(Id("""status"""), ERef(RefId(Id("""__x8__""")))).setId(14085), IAssign(RefId(Id("""nextIndex""")), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L))).setId(14087))).setId(14132)).setId(14090))).setId(14134))
  val instToStepMap: Map[Int, Int] = HashMap(14084 -> 11, 14089 -> 11, 14088 -> 11, 14060 -> 2, 14075 -> 11, 14052 -> 11, 14067 -> 11, 14085 -> 11, 14063 -> 11, 14068 -> 11, 14073 -> 11, 14070 -> 6, 14056 -> 2, 14061 -> 2, 14071 -> 6, 14046 -> 0, 14045 -> 0, 14072 -> 6, 14074 -> 11, 14082 -> 11, 14048 -> 1, 14080 -> 11, 14053 -> 1, 14081 -> 11, 14086 -> 11, 14083 -> 11, 14079 -> 11, 14069 -> 11, 14054 -> 1, 14047 -> 0, 14090 -> 11, 14087 -> 11, 14062 -> 2, 14055 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(14046, 14045, 14047), 5 -> HashSet(14067, 14063, 14068, 14069), 10 -> HashSet(14052), 1 -> HashSet(14054, 14055, 14048, 14053), 6 -> HashSet(14071, 14072, 14070), 9 -> HashSet(14084, 14085, 14082, 14086, 14083), 2 -> HashSet(14060, 14062, 14056, 14061), 7 -> HashSet(14074, 14073), 11 -> HashSet(14084, 14089, 14088, 14075, 14052, 14067, 14085, 14080, 14063, 14068, 14073, 14074, 14082, 14081, 14086, 14083, 14079, 14069, 14090, 14087), 8 -> HashSet(14075, 14080, 14081, 14079))
  /* Beautified form:
  "SpreadElement0ArrayAccumulation0" (this, AssignmentExpression, array, nextIndex) => {
    access __x0__ = (AssignmentExpression "Evaluation")
    let spreadRef = __x0__
    app __x1__ = (GetValue spreadRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let spreadObj = __x1__
    app __x2__ = (GetIterator spreadObj)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let iteratorRecord = __x2__
    while true {
      app __x3__ = (IteratorStep iteratorRecord)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let next = __x3__
      if (= next false) {
        app __x4__ = (WrapCompletion nextIndex)
        return __x4__
      } else {}
      app __x5__ = (IteratorValue next)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let nextValue = __x5__
      app __x6__ = (ToUint32 nextIndex)
      app __x7__ = (ToString __x6__)
      app __x8__ = (CreateDataProperty array __x7__ nextValue)
      let status = __x8__
      nextIndex = (+ nextIndex 1i)
    }
  }
  */
}
