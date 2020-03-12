package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTseal {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.seal""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65314), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(65315), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(65317), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(65318), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65319))).setId(65345), ISeq(List()).setId(65346)).setId(65322), IApp(Id("""__x3__"""), ERef(RefId(Id("""SetIntegrityLevel"""))), List(ERef(RefId(Id("""O"""))), EStr("""sealed"""))).setId(65324), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(65325), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65326)).setId(65327), ISeq(List()).setId(65352)).setId(65328), ILet(Id("""status"""), ERef(RefId(Id("""__x3__""")))).setId(65329), IIf(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(65331), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65332))).setId(65357), ISeq(List()).setId(65358)).setId(65334), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(65336), IReturn(ERef(RefId(Id("""__x5__""")))).setId(65337))).setId(65362))
  val instToStepMap: Map[Int, Int] = HashMap(65334 -> 5, 65316 -> 0, 65338 -> 6, 65320 -> 1, 65332 -> 4, 65322 -> 2, 65329 -> 3, 65336 -> 6, 65323 -> 2, 65319 -> 1, 65315 -> 0, 65337 -> 6, 65318 -> 1, 65328 -> 3, 65335 -> 5, 65324 -> 3, 65331 -> 4, 65314 -> 0, 65317 -> 2, 65330 -> 3, 65333 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(65314, 65316, 65315), 5 -> HashSet(65335, 65334), 1 -> HashSet(65318, 65320, 65319), 6 -> HashSet(65337, 65338, 65336), 2 -> HashSet(65317, 65322, 65323), 3 -> HashSet(65328, 65324, 65330, 65329), 4 -> HashSet(65331, 65333, 65332))
  /* Beautified form:
  "GLOBAL.Object.seal" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (Type O)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion O)
      return __x2__
    } else {}
    app __x3__ = (SetIntegrityLevel O "sealed")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let status = __x3__
    if (= status false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion O)
    return __x5__
  }
  */
}
