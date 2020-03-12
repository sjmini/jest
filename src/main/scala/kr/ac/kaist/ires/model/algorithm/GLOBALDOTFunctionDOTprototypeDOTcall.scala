package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTFunctionDOTprototypeDOTcall {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Function.prototype.call""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67091), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x0__""")))).setId(67092), ILet(Id("""func"""), ERef(RefId(Id("""this""")))).setId(67094), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""func"""))))).setId(67096), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(67097), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67098))).setId(67128), ISeq(List()).setId(67129)).setId(67101), ILet(Id("""argList"""), EList(List())).setId(67103), IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), IExpr(EPop(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67105), ISeq(List()).setId(67133)).setId(67107), IAssign(RefId(Id("""argList""")), ERef(RefId(Id("""argumentsList""")))).setId(67108), IApp(Id("""__x3__"""), ERef(RefId(Id("""PrepareForTailCall"""))), List()).setId(67110), IExpr(ERef(RefId(Id("""__x3__""")))).setId(67111), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""thisArg"""))), ERef(RefId(Id("""argList"""))))).setId(67113), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(67114), IReturn(ERef(RefId(Id("""__x4__""")))).setId(67115)).setId(67116), ISeq(List()).setId(67142)).setId(67117), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(67118), IReturn(ERef(RefId(Id("""__x5__""")))).setId(67119))).setId(67146))
  val instToStepMap: Map[Int, Int] = HashMap(67118 -> 7, 67101 -> 3, 67097 -> 2, 67094 -> 1, 67111 -> 6, 67102 -> 3, 67098 -> 2, 67093 -> 0, 67099 -> 2, 67103 -> 4, 67109 -> 5, 67091 -> 0, 67117 -> 7, 67113 -> 7, 67108 -> 5, 67112 -> 6, 67095 -> 1, 67104 -> 4, 67096 -> 3, 67119 -> 7, 67107 -> 5, 67110 -> 6, 67120 -> 7, 67092 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(67093, 67092, 67091), 5 -> HashSet(67107, 67109, 67108), 1 -> HashSet(67094, 67095), 6 -> HashSet(67111, 67110, 67112), 2 -> HashSet(67097, 67098, 67099), 7 -> HashSet(67118, 67119, 67120, 67117, 67113), 3 -> HashSet(67101, 67102, 67096), 4 -> HashSet(67103, 67104))
  /* Beautified form:
  "GLOBAL.Function.prototype.call" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let thisArg = __x0__
    let func = this
    app __x1__ = (IsCallable func)
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let argList = (new [])
    if (< 0i argumentsList["length"]) (pop argumentsList 0i) else {}
    argList = argumentsList
    app __x3__ = (PrepareForTailCall )
    __x3__
    app __x4__ = (Call func thisArg argList)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
