package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression6Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression6Evaluation0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(21280), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(21281), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(21283), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(21284), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21285)).setId(21286), ISeq(List()).setId(21324)).setId(21288), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(21289), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ShiftExpression"""))), EStr("""Evaluation""")).setId(21292), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(21293), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(21295), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21296), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21297)).setId(21298), ISeq(List()).setId(21333)).setId(21299), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(21300), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""rval"""))))).setId(21302), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(21303), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21304))).setId(21339), ISeq(List()).setId(21340)).setId(21306), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""lval"""))))).setId(21308), IApp(Id("""__x7__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""rval"""))), ERef(RefId(Id("""__x6__"""))))).setId(21309), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(21310), IReturn(ERef(RefId(Id("""__x7__""")))).setId(21311)).setId(21312), ISeq(List()).setId(21347)).setId(21313), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(21314), IReturn(ERef(RefId(Id("""__x8__""")))).setId(21315))).setId(21351))
  val instToStepMap: Map[Int, Int] = HashMap(21299 -> 3, 21294 -> 2, 21316 -> 6, 21303 -> 4, 21293 -> 2, 21300 -> 3, 21309 -> 6, 21280 -> 0, 21314 -> 6, 21301 -> 3, 21292 -> 2, 21315 -> 6, 21295 -> 3, 21282 -> 0, 21302 -> 5, 21308 -> 6, 21307 -> 5, 21281 -> 0, 21288 -> 1, 21290 -> 1, 21313 -> 6, 21306 -> 5, 21304 -> 4, 21289 -> 1, 21305 -> 4, 21283 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(21281, 21280, 21282), 5 -> HashSet(21307, 21306, 21302), 1 -> HashSet(21289, 21283, 21288, 21290), 6 -> HashSet(21316, 21313, 21309, 21314, 21315, 21308), 2 -> HashSet(21294, 21293, 21292), 3 -> HashSet(21299, 21300, 21301, 21295), 4 -> HashSet(21303, 21304, 21305))
  /* Beautified form:
  "RelationalExpression6Evaluation0" (this, RelationalExpression, ShiftExpression) => {
    access __x0__ = (RelationalExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (ShiftExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (Type rval)
    if (! (= __x4__ Object)) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    app __x6__ = (ToPropertyKey lval)
    app __x7__ = (HasProperty rval __x6__)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
