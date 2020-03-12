package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorResolve {
  val length: Int = 3
  val func: Func = Func("""AsyncGeneratorResolve""", List(Id("""generator"""), Id("""value"""), Id("""done""")), None, ISeq(List(ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(11009), ILet(Id("""next"""), EPop(ERef(RefId(Id("""queue"""))), EINum(0L))).setId(11011), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Capability""")))).setId(11012), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""done"""))))).setId(11014), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(11015), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11016)).setId(11017), ISeq(List()).setId(11046)).setId(11018), ILet(Id("""iteratorResult"""), ERef(RefId(Id("""__x0__""")))).setId(11019), IApp(Id("""__x1__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""iteratorResult"""))))))).setId(11021), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(11022), IReturn(ERef(RefId(Id("""__x1__""")))).setId(11023)).setId(11024), ISeq(List()).setId(11053)).setId(11025), IExpr(ERef(RefId(Id("""__x1__""")))).setId(11026), IApp(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorResumeNext"""))), List(ERef(RefId(Id("""generator"""))))).setId(11028), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(11029), IReturn(ERef(RefId(Id("""__x2__""")))).setId(11030)).setId(11031), ISeq(List()).setId(11060)).setId(11032), IExpr(ERef(RefId(Id("""__x2__""")))).setId(11033), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11035), IReturn(ERef(RefId(Id("""__x3__""")))).setId(11036))).setId(11065))
  val instToStepMap: Map[Int, Int] = HashMap(11008 -> 2, 11036 -> 8, 11032 -> 7, 11037 -> 8, 11019 -> 5, 11026 -> 6, 11018 -> 5, 11012 -> 4, 11013 -> 4, 11028 -> 7, 11021 -> 6, 11014 -> 5, 11020 -> 5, 11025 -> 6, 11010 -> 1, 11033 -> 7, 11011 -> 3, 11027 -> 6, 11034 -> 7, 11035 -> 8, 11009 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(11008), 5 -> HashSet(11019, 11018, 11014, 11020), 1 -> HashSet(11010, 11009), 6 -> HashSet(11025, 11026, 11027, 11021), 2 -> HashSet(11008), 7 -> HashSet(11032, 11033, 11034, 11028), 3 -> HashSet(11011), 8 -> HashSet(11036, 11037, 11035), 4 -> HashSet(11012, 11013))
  /* Beautified form:
  "AsyncGeneratorResolve" (generator, value, done) => {
    let queue = generator["AsyncGeneratorQueue"]
    let next = (pop queue 0i)
    let promiseCapability = next["Capability"]
    app __x0__ = (CreateIterResultObject value done)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorResult = __x0__
    app __x1__ = (Call promiseCapability["Resolve"] undefined (new [iteratorResult]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (AsyncGeneratorResumeNext generator)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }
  */
}
