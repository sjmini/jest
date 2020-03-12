package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTisSealed {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.isSealed""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65126), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(65127), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(65129), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(65130), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65131))).setId(65150), ISeq(List()).setId(65151)).setId(65134), IApp(Id("""__x3__"""), ERef(RefId(Id("""TestIntegrityLevel"""))), List(ERef(RefId(Id("""O"""))), EStr("""sealed"""))).setId(65136), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(65137), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65138)).setId(65139), ISeq(List()).setId(65157)).setId(65140), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(65141), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65142))).setId(65161))
  val instToStepMap: Map[Int, Int] = HashMap(65127 -> 0, 65131 -> 1, 65134 -> 2, 65142 -> 3, 65130 -> 1, 65126 -> 0, 65132 -> 1, 65136 -> 3, 65143 -> 3, 65129 -> 2, 65135 -> 2, 65140 -> 3, 65128 -> 0, 65141 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(65127, 65128, 65126), 1 -> HashSet(65131, 65130, 65132), 2 -> HashSet(65135, 65134, 65129), 3 -> HashSet(65140, 65141, 65142, 65136, 65143))
  /* Beautified form:
  "GLOBAL.Object.isSealed" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (Type O)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (TestIntegrityLevel O "sealed")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
