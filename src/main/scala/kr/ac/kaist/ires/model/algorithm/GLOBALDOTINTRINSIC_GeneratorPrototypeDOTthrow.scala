package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_GeneratorPrototypeDOTthrow {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_GeneratorPrototype.throw""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(88790), ILet(Id("""exception"""), ERef(RefId(Id("""__x0__""")))).setId(88791), ILet(Id("""g"""), ERef(RefId(Id("""this""")))).setId(88793), IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(ERef(RefId(Id("""exception"""))))).setId(88795), ILet(Id("""C"""), ERef(RefId(Id("""__x1__""")))).setId(88796), IApp(Id("""__x2__"""), ERef(RefId(Id("""GeneratorResumeAbrupt"""))), List(ERef(RefId(Id("""g"""))), ERef(RefId(Id("""C"""))))).setId(88798), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(88799), IReturn(ERef(RefId(Id("""__x2__""")))).setId(88800)).setId(88801), ISeq(List()).setId(88817)).setId(88803), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(88804), IReturn(ERef(RefId(Id("""__x3__""")))).setId(88805))).setId(88821))
  val instToStepMap: Map[Int, Int] = HashMap(88794 -> 1, 88804 -> 3, 88791 -> 0, 88795 -> 2, 88798 -> 3, 88790 -> 0, 88796 -> 2, 88803 -> 3, 88806 -> 3, 88793 -> 1, 88805 -> 3, 88792 -> 0, 88797 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(88791, 88790, 88792), 1 -> HashSet(88794, 88793), 2 -> HashSet(88795, 88796, 88797), 3 -> HashSet(88804, 88798, 88803, 88806, 88805))
  /* Beautified form:
  "GLOBAL.INTRINSIC_GeneratorPrototype.throw" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let exception = __x0__
    let g = this
    app __x1__ = (ThrowCompletion exception)
    let C = __x1__
    app __x2__ = (GeneratorResumeAbrupt g C)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
