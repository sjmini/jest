package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTpush {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.push""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(80133), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(80134), IReturn(ERef(RefId(Id("""__x0__""")))).setId(80135)).setId(80136), ISeq(List()).setId(80190)).setId(80138), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(80139), IApp(Id("""__x1__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(80141), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(80142), IReturn(ERef(RefId(Id("""__x1__""")))).setId(80143)).setId(80144), ISeq(List()).setId(80197)).setId(80145), ILet(Id("""len"""), ERef(RefId(Id("""__x1__""")))).setId(80146), ILet(Id("""items"""), ERef(RefId(Id("""argumentsList""")))).setId(80148), ILet(Id("""argCount"""), ERef(RefProp(RefId(Id("""items""")), EStr("""length""")))).setId(80150), IIf(EBOp(OLt, EBOp(OSub, EINum(9007199254740992L), EINum(1L)), EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""argCount"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(80152), IReturn(ERef(RefId(Id("""__x2__""")))).setId(80153))).setId(80204), ISeq(List()).setId(80205)).setId(80155), IWhile(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""items""")), EStr("""length""")))), ISeq(List(ILet(Id("""E"""), EPop(ERef(RefId(Id("""items"""))), EINum(0L))).setId(80157), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""len"""))))).setId(80158), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(80159), IReturn(ERef(RefId(Id("""__x3__""")))).setId(80160)).setId(80161), ISeq(List()).setId(80212)).setId(80162), IApp(Id("""__x4__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""E"""))), EBool(true))).setId(80163), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(80164), IReturn(ERef(RefId(Id("""__x4__""")))).setId(80165)).setId(80166), ISeq(List()).setId(80218)).setId(80167), IExpr(ERef(RefId(Id("""__x4__""")))).setId(80168), IAssign(RefId(Id("""len""")), EBOp(OPlus, ERef(RefId(Id("""len"""))), EINum(1L))).setId(80170))).setId(80222)).setId(80173), IApp(Id("""__x5__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), ERef(RefId(Id("""len"""))), EBool(true))).setId(80175), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(80176), IReturn(ERef(RefId(Id("""__x5__""")))).setId(80177)).setId(80178), ISeq(List()).setId(80228)).setId(80179), IExpr(ERef(RefId(Id("""__x5__""")))).setId(80180), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""len"""))))).setId(80182), IReturn(ERef(RefId(Id("""__x6__""")))).setId(80183))).setId(80233))
  val instToStepMap: Map[Int, Int] = HashMap(80147 -> 1, 80174 -> 7, 80149 -> 2, 80169 -> 7, 80141 -> 1, 80145 -> 1, 80157 -> 7, 80182 -> 9, 80140 -> 0, 80167 -> 7, 80151 -> 3, 80175 -> 8, 80183 -> 9, 80133 -> 0, 80170 -> 7, 80138 -> 0, 80153 -> 0, 80179 -> 8, 80152 -> 0, 80184 -> 9, 80148 -> 2, 80173 -> 7, 80158 -> 7, 80180 -> 8, 80181 -> 8, 80156 -> 1, 80150 -> 3, 80172 -> 7, 80155 -> 1, 80162 -> 7, 80171 -> 7, 80168 -> 7, 80146 -> 1, 80163 -> 7, 80139 -> 0, 80154 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(80133, 80152, 80140, 80138, 80153, 80139, 80154), 5 -> HashSet(80157), 1 -> HashSet(80147, 80156, 80141, 80145, 80155, 80146), 6 -> HashSet(80158, 80169, 80167, 80162, 80168, 80163), 9 -> HashSet(80184, 80182, 80183), 2 -> HashSet(80148, 80149), 7 -> HashSet(80174, 80170, 80169, 80157, 80172, 80167, 80162, 80163, 80173, 80158, 80171, 80168), 3 -> HashSet(80150, 80151), 8 -> HashSet(80179, 80175, 80180, 80181))
  /* Beautified form:
  "GLOBAL.Array.prototype.push" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (LengthOfArrayLike O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let len = __x1__
    let items = argumentsList
    let argCount = items["length"]
    if (< (- 9007199254740992i 1i) (+ len argCount)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x3__ = (ToString len)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (Set O __x3__ E true)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      len = (+ len 1i)
    }
    app __x5__ = (Set O "length" len true)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion len)
    return __x6__
  }
  */
}
