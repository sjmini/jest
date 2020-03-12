package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTisExtensible {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.isExtensible""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65020), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(65021), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(65023), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(65024), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65025))).setId(65044), ISeq(List()).setId(65045)).setId(65028), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""O"""))))).setId(65030), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(65031), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65032)).setId(65033), ISeq(List()).setId(65051)).setId(65034), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(65035), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65036))).setId(65055))
  val instToStepMap: Map[Int, Int] = HashMap(65021 -> 0, 65036 -> 3, 65020 -> 0, 65028 -> 2, 65035 -> 3, 65025 -> 1, 65029 -> 2, 65024 -> 1, 65034 -> 3, 65037 -> 3, 65026 -> 1, 65022 -> 0, 65030 -> 3, 65023 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(65021, 65020, 65022), 1 -> HashSet(65025, 65024, 65026), 2 -> HashSet(65028, 65029, 65023), 3 -> HashSet(65036, 65035, 65034, 65037, 65030))
  /* Beautified form:
  "GLOBAL.Object.isExtensible" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (Type O)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (IsExtensible O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
