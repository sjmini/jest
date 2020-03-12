package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTCreateAsyncFromSyncIterator {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.CreateAsyncFromSyncIterator""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87775), ILet(Id("""syncIteratorRecord"""), ERef(RefId(Id("""__x0__""")))).setId(87776), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncFromSyncIteratorPrototype"""))), EList(List(EStr("""SyncIteratorRecord"""))))).setId(87778), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(87779), IReturn(ERef(RefId(Id("""__x1__""")))).setId(87780)).setId(87781), ISeq(List()).setId(87807)).setId(87783), ILet(Id("""asyncIterator"""), ERef(RefId(Id("""__x1__""")))).setId(87784), IAssign(RefProp(RefId(Id("""asyncIterator""")), EStr("""SyncIteratorRecord""")), ERef(RefId(Id("""syncIteratorRecord""")))).setId(87786), IApp(Id("""__x2__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""asyncIterator"""))), EStr("""next"""))).setId(87788), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(87789), IReturn(ERef(RefId(Id("""__x2__""")))).setId(87790)).setId(87791), ISeq(List()).setId(87815)).setId(87792), ILet(Id("""nextMethod"""), ERef(RefId(Id("""__x2__""")))).setId(87793), ILet(Id("""iteratorRecord"""), EMap(Ty("""Record"""), List((EStr("""Iterator"""), ERef(RefId(Id("""asyncIterator""")))), (EStr("""NextMethod"""), ERef(RefId(Id("""nextMethod""")))), (EStr("""Done"""), EBool(false))))).setId(87795), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(87797), IReturn(ERef(RefId(Id("""__x3__""")))).setId(87798))).setId(87821))
  val instToStepMap: Map[Int, Int] = HashMap(87775 -> 0, 87797 -> 5, 87785 -> 1, 87776 -> 0, 87778 -> 1, 87793 -> 3, 87792 -> 3, 87777 -> 0, 87784 -> 1, 87799 -> 5, 87794 -> 3, 87796 -> 4, 87786 -> 2, 87788 -> 3, 87787 -> 2, 87795 -> 4, 87798 -> 5, 87783 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(87775, 87776, 87777), 5 -> HashSet(87797, 87799, 87798), 1 -> HashSet(87785, 87778, 87784, 87783), 2 -> HashSet(87786, 87787), 3 -> HashSet(87793, 87792, 87788, 87794), 4 -> HashSet(87796, 87795))
  /* Beautified form:
  "GLOBAL.CreateAsyncFromSyncIterator" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let syncIteratorRecord = __x0__
    app __x1__ = (ObjectCreate INTRINSIC_AsyncFromSyncIteratorPrototype (new ["SyncIteratorRecord"]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let asyncIterator = __x1__
    asyncIterator["SyncIteratorRecord"] = syncIteratorRecord
    app __x2__ = (Get asyncIterator "next")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let nextMethod = __x2__
    let iteratorRecord = (new Record("Iterator" -> asyncIterator, "NextMethod" -> nextMethod, "Done" -> false))
    app __x3__ = (WrapCompletion iteratorRecord)
    return __x3__
  }
  */
}
