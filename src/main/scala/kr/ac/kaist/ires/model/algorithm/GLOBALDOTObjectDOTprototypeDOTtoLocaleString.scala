package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTprototypeDOTtoLocaleString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Object.prototype.toLocaleString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65850), ILet(Id("""reserved1"""), ERef(RefId(Id("""__x0__""")))).setId(65851), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(65853), ILet(Id("""reserved2"""), ERef(RefId(Id("""__x1__""")))).setId(65854), ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(65856), IApp(Id("""__x2__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""O"""))), EStr("""toString"""))).setId(65858), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(65859), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65860)).setId(65861), ISeq(List()).setId(65877)).setId(65863), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(65864), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65865))).setId(65881))
  val instToStepMap: Map[Int, Int] = HashMap(65866 -> 3, 65864 -> 3, 65865 -> 3, 65852 -> 0, 65857 -> 2, 65856 -> 2, 65854 -> 1, 65851 -> 0, 65855 -> 1, 65858 -> 3, 65853 -> 1, 65850 -> 0, 65863 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(65852, 65851, 65850), 1 -> HashSet(65854, 65855, 65853), 2 -> HashSet(65857, 65856), 3 -> HashSet(65866, 65864, 65865, 65858, 65863))
  /* Beautified form:
  "GLOBAL.Object.prototype.toLocaleString" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reserved1 = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let reserved2 = __x1__
    let O = this
    app __x2__ = (Invoke O "toString")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
