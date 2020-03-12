package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncGeneratorReject {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.AsyncGeneratorReject""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89894), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(89895), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(89897), ILet(Id("""exception"""), ERef(RefId(Id("""__x1__""")))).setId(89898), ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(89901), ILet(Id("""next"""), EPop(ERef(RefId(Id("""queue"""))), EINum(0L))).setId(89903), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Capability""")))).setId(89904), IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""exception"""))))))).setId(89906), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(89907), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89908)).setId(89909), ISeq(List()).setId(89935)).setId(89910), IExpr(ERef(RefId(Id("""__x2__""")))).setId(89911), IApp(Id("""__x3__"""), ERef(RefId(Id("""AsyncGeneratorResumeNext"""))), List(ERef(RefId(Id("""generator"""))))).setId(89913), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(89914), IReturn(ERef(RefId(Id("""__x3__""")))).setId(89915)).setId(89916), ISeq(List()).setId(89942)).setId(89917), IExpr(ERef(RefId(Id("""__x3__""")))).setId(89918), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(89920), IReturn(ERef(RefId(Id("""__x4__""")))).setId(89921))).setId(89947))
  val instToStepMap: Map[Int, Int] = HashMap(89910 -> 7, 89913 -> 8, 89906 -> 7, 89918 -> 8, 89894 -> 0, 89898 -> 1, 89922 -> 9, 89900 -> 4, 89912 -> 7, 89897 -> 1, 89911 -> 7, 89895 -> 0, 89917 -> 8, 89902 -> 3, 89920 -> 9, 89899 -> 1, 89905 -> 6, 89904 -> 6, 89903 -> 5, 89921 -> 9, 89919 -> 8, 89896 -> 0, 89901 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(89895, 89894, 89896), 5 -> HashSet(89903), 1 -> HashSet(89899, 89898, 89897), 6 -> HashSet(89905, 89904), 9 -> HashSet(89920, 89922, 89921), 2 -> HashSet(89900), 7 -> HashSet(89910, 89906, 89912, 89911), 3 -> HashSet(89902, 89901), 8 -> HashSet(89917, 89913, 89918, 89919), 4 -> HashSet(89900))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorReject" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let exception = __x1__
    let queue = generator["AsyncGeneratorQueue"]
    let next = (pop queue 0i)
    let promiseCapability = next["Capability"]
    app __x2__ = (Call promiseCapability["Reject"] undefined (new [exception]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (AsyncGeneratorResumeNext generator)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }
  */
}
