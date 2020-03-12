package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateAsyncFromSyncIterator {
  val length: Int = 1
  val func: Func = Func("""CreateAsyncFromSyncIterator""", List(Id("""syncIteratorRecord""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncFromSyncIteratorPrototype"""))), EList(List(EStr("""SyncIteratorRecord"""))))).setId(9499), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(9500), IReturn(ERef(RefId(Id("""__x0__""")))).setId(9501)).setId(9502), ISeq(List()).setId(9526)).setId(9504), ILet(Id("""asyncIterator"""), ERef(RefId(Id("""__x0__""")))).setId(9505), IAssign(RefProp(RefId(Id("""asyncIterator""")), EStr("""SyncIteratorRecord""")), ERef(RefId(Id("""syncIteratorRecord""")))).setId(9507), IApp(Id("""__x1__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""asyncIterator"""))), EStr("""next"""))).setId(9509), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(9510), IReturn(ERef(RefId(Id("""__x1__""")))).setId(9511)).setId(9512), ISeq(List()).setId(9534)).setId(9513), ILet(Id("""nextMethod"""), ERef(RefId(Id("""__x1__""")))).setId(9514), ILet(Id("""iteratorRecord"""), EMap(Ty("""Record"""), List((EStr("""Iterator"""), ERef(RefId(Id("""asyncIterator""")))), (EStr("""NextMethod"""), ERef(RefId(Id("""nextMethod""")))), (EStr("""Done"""), EBool(false))))).setId(9516), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(9518), IReturn(ERef(RefId(Id("""__x2__""")))).setId(9519))).setId(9540))
  val instToStepMap: Map[Int, Int] = HashMap(9516 -> 3, 9509 -> 2, 9520 -> 4, 9517 -> 3, 9506 -> 0, 9499 -> 0, 9518 -> 4, 9505 -> 0, 9515 -> 2, 9504 -> 0, 9519 -> 4, 9508 -> 1, 9513 -> 2, 9514 -> 2, 9507 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(9506, 9499, 9505, 9504), 1 -> HashSet(9508, 9507), 2 -> HashSet(9509, 9513, 9514, 9515), 3 -> HashSet(9516, 9517), 4 -> HashSet(9520, 9518, 9519))
  /* Beautified form:
  "CreateAsyncFromSyncIterator" (syncIteratorRecord) => {
    app __x0__ = (ObjectCreate INTRINSIC_AsyncFromSyncIteratorPrototype (new ["SyncIteratorRecord"]))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let asyncIterator = __x0__
    asyncIterator["SyncIteratorRecord"] = syncIteratorRecord
    app __x1__ = (Get asyncIterator "next")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let nextMethod = __x1__
    let iteratorRecord = (new Record("Iterator" -> asyncIterator, "NextMethod" -> nextMethod, "Done" -> false))
    app __x2__ = (WrapCompletion iteratorRecord)
    return __x2__
  }
  */
}
