package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncGeneratorResolve {
  val length: Int = 3
  val func: Func = Func("""GLOBAL.AsyncGeneratorResolve""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89788), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(89789), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(89791), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))).setId(89792), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(89794), ILet(Id("""done"""), ERef(RefId(Id("""__x2__""")))).setId(89795), ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(89798), ILet(Id("""next"""), EPop(ERef(RefId(Id("""queue"""))), EINum(0L))).setId(89800), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Capability""")))).setId(89801), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""done"""))))).setId(89803), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(89804), IReturn(ERef(RefId(Id("""__x3__""")))).setId(89805)).setId(89806), ISeq(List()).setId(89841)).setId(89807), ILet(Id("""iteratorResult"""), ERef(RefId(Id("""__x3__""")))).setId(89808), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""iteratorResult"""))))))).setId(89810), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(89811), IReturn(ERef(RefId(Id("""__x4__""")))).setId(89812)).setId(89813), ISeq(List()).setId(89848)).setId(89814), IExpr(ERef(RefId(Id("""__x4__""")))).setId(89815), IApp(Id("""__x5__"""), ERef(RefId(Id("""AsyncGeneratorResumeNext"""))), List(ERef(RefId(Id("""generator"""))))).setId(89817), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(89818), IReturn(ERef(RefId(Id("""__x5__""")))).setId(89819)).setId(89820), ISeq(List()).setId(89855)).setId(89821), IExpr(ERef(RefId(Id("""__x5__""")))).setId(89822), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(89824), IReturn(ERef(RefId(Id("""__x6__""")))).setId(89825))).setId(89860))
  val instToStepMap: Map[Int, Int] = HashMap(89801 -> 7, 89798 -> 4, 89826 -> 11, 89794 -> 2, 89789 -> 0, 89825 -> 11, 89793 -> 1, 89816 -> 9, 89803 -> 8, 89807 -> 8, 89799 -> 4, 89814 -> 9, 89791 -> 1, 89795 -> 2, 89809 -> 8, 89788 -> 0, 89802 -> 7, 89792 -> 1, 89821 -> 10, 89824 -> 11, 89817 -> 10, 89815 -> 9, 89808 -> 8, 89796 -> 2, 89797 -> 5, 89822 -> 10, 89800 -> 6, 89790 -> 0, 89810 -> 9, 89823 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(89788, 89789, 89790), 5 -> HashSet(89797), 10 -> HashSet(89821, 89817, 89822, 89823), 1 -> HashSet(89792, 89793, 89791), 6 -> HashSet(89800), 9 -> HashSet(89816, 89815, 89814, 89810), 2 -> HashSet(89794, 89796, 89795), 7 -> HashSet(89801, 89802), 3 -> HashSet(89797), 11 -> HashSet(89826, 89824, 89825), 8 -> HashSet(89809, 89808, 89803, 89807), 4 -> HashSet(89798, 89799))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorResolve" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let done = __x2__
    let queue = generator["AsyncGeneratorQueue"]
    let next = (pop queue 0i)
    let promiseCapability = next["Capability"]
    app __x3__ = (CreateIterResultObject value done)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let iteratorResult = __x3__
    app __x4__ = (Call promiseCapability["Resolve"] undefined (new [iteratorResult]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    app __x5__ = (AsyncGeneratorResumeNext generator)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion undefined)
    return __x6__
  }
  */
}
