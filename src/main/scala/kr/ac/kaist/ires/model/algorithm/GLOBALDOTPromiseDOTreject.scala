package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPromiseDOTreject {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Promise.reject""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(92682), ILet(Id("""r"""), ERef(RefId(Id("""__x0__""")))).setId(92683), ILet(Id("""C"""), ERef(RefId(Id("""this""")))).setId(92685), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))).setId(92687), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(92688), IReturn(ERef(RefId(Id("""__x1__""")))).setId(92689)).setId(92690), ISeq(List()).setId(92713)).setId(92692), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))).setId(92693), IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""r"""))))))).setId(92695), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(92696), IReturn(ERef(RefId(Id("""__x2__""")))).setId(92697)).setId(92698), ISeq(List()).setId(92720)).setId(92699), IExpr(ERef(RefId(Id("""__x2__""")))).setId(92700), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(92702), IReturn(ERef(RefId(Id("""__x3__""")))).setId(92703))).setId(92725))
  val instToStepMap: Map[Int, Int] = HashMap(92686 -> 1, 92683 -> 0, 92704 -> 4, 92701 -> 3, 92694 -> 2, 92682 -> 0, 92703 -> 4, 92700 -> 3, 92685 -> 1, 92695 -> 3, 92702 -> 4, 92699 -> 3, 92693 -> 2, 92692 -> 2, 92684 -> 0, 92687 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(92683, 92682, 92684), 1 -> HashSet(92686, 92685), 2 -> HashSet(92694, 92687, 92693, 92692), 3 -> HashSet(92701, 92700, 92695, 92699), 4 -> HashSet(92704, 92703, 92702))
  /* Beautified form:
  "GLOBAL.Promise.reject" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let r = __x0__
    let C = this
    app __x1__ = (NewPromiseCapability C)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    app __x2__ = (Call promiseCapability["Reject"] undefined (new [r]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion promiseCapability["Promise"])
    return __x3__
  }
  */
}
