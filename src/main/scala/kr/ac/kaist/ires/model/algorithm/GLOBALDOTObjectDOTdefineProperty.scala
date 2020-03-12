package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTdefineProperty {
  val length: Int = 3
  val func: Func = Func("""GLOBAL.Object.defineProperty""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(64115), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(64116), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(64118), ILet(Id("""P"""), ERef(RefId(Id("""__x1__""")))).setId(64119), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(64121), ILet(Id("""Attributes"""), ERef(RefId(Id("""__x2__""")))).setId(64122), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(64124), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(64125), IReturn(ERef(RefId(Id("""__x4__""")))).setId(64126))).setId(64165), ISeq(List()).setId(64166)).setId(64129), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""P"""))))).setId(64131), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(64132), IReturn(ERef(RefId(Id("""__x5__""")))).setId(64133)).setId(64134), ISeq(List()).setId(64172)).setId(64135), ILet(Id("""key"""), ERef(RefId(Id("""__x5__""")))).setId(64136), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToPropertyDescriptor"""))), List(ERef(RefId(Id("""Attributes"""))))).setId(64138), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(64139), IReturn(ERef(RefId(Id("""__x6__""")))).setId(64140)).setId(64141), ISeq(List()).setId(64179)).setId(64142), ILet(Id("""desc"""), ERef(RefId(Id("""__x6__""")))).setId(64143), IApp(Id("""__x7__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""key"""))), ERef(RefId(Id("""desc"""))))).setId(64145), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(64146), IReturn(ERef(RefId(Id("""__x7__""")))).setId(64147)).setId(64148), ISeq(List()).setId(64186)).setId(64149), IExpr(ERef(RefId(Id("""__x7__""")))).setId(64150), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(64152), IReturn(ERef(RefId(Id("""__x8__""")))).setId(64153))).setId(64191))
  val instToStepMap: Map[Int, Int] = HashMap(64122 -> 2, 64118 -> 1, 64136 -> 5, 64151 -> 7, 64143 -> 6, 64152 -> 8, 64137 -> 5, 64121 -> 2, 64123 -> 2, 64129 -> 4, 64117 -> 0, 64145 -> 7, 64138 -> 6, 64142 -> 6, 64149 -> 7, 64131 -> 5, 64126 -> 3, 64153 -> 8, 64119 -> 1, 64135 -> 5, 64115 -> 0, 64116 -> 0, 64130 -> 4, 64150 -> 7, 64120 -> 1, 64144 -> 6, 64125 -> 3, 64127 -> 3, 64154 -> 8, 64124 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(64115, 64116, 64117), 5 -> HashSet(64136, 64131, 64135, 64137), 1 -> HashSet(64118, 64119, 64120), 6 -> HashSet(64138, 64142, 64143, 64144), 2 -> HashSet(64122, 64121, 64123), 7 -> HashSet(64145, 64149, 64151, 64150), 3 -> HashSet(64126, 64125, 64127), 8 -> HashSet(64153, 64152, 64154), 4 -> HashSet(64130, 64124, 64129))
  /* Beautified form:
  "GLOBAL.Object.defineProperty" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let P = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let Attributes = __x2__
    app __x3__ = (Type O)
    if (! (= __x3__ Object)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (ToPropertyKey P)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let key = __x5__
    app __x6__ = (ToPropertyDescriptor Attributes)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let desc = __x6__
    app __x7__ = (DefinePropertyOrThrow O key desc)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    __x7__
    app __x8__ = (WrapCompletion O)
    return __x8__
  }
  */
}
