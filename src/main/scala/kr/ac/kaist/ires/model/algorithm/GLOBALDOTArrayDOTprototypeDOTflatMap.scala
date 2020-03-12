package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTflatMap {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.flatMap""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(78391), ILet(Id("""mapperFunction"""), ERef(RefId(Id("""__x0__""")))).setId(78392), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(78394), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(78395), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(78397), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(78398), IReturn(ERef(RefId(Id("""__x2__""")))).setId(78399)).setId(78400), ISeq(List()).setId(78454)).setId(78402), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(78403), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(78405), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(78406), IReturn(ERef(RefId(Id("""__x3__""")))).setId(78407)).setId(78408), ISeq(List()).setId(78461)).setId(78409), ILet(Id("""sourceLen"""), ERef(RefId(Id("""__x3__""")))).setId(78410), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""mapperFunction"""))))).setId(78412), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(78413), IReturn(ERef(RefId(Id("""__x4__""")))).setId(78414)).setId(78415), ISeq(List()).setId(78468)).setId(78416), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(78417), IReturn(ERef(RefId(Id("""__x5__""")))).setId(78418))).setId(78472), ISeq(List()).setId(78473)).setId(78420), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(78422), ILet(Id("""T"""), EUndef).setId(78424)).setId(78426), IApp(Id("""__x6__"""), ERef(RefId(Id("""ArraySpeciesCreate"""))), List(ERef(RefId(Id("""O"""))), EINum(0L))).setId(78428), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(78429), IReturn(ERef(RefId(Id("""__x6__""")))).setId(78430)).setId(78431), ISeq(List()).setId(78482)).setId(78432), ILet(Id("""A"""), ERef(RefId(Id("""__x6__""")))).setId(78433), IApp(Id("""__x7__"""), ERef(RefId(Id("""FlattenIntoArray"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""O"""))), ERef(RefId(Id("""sourceLen"""))), EINum(0L), EINum(1L), ERef(RefId(Id("""mapperFunction"""))), ERef(RefId(Id("""T"""))))).setId(78435), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(78436), IReturn(ERef(RefId(Id("""__x7__""")))).setId(78437)).setId(78438), ISeq(List()).setId(78489)).setId(78439), IExpr(ERef(RefId(Id("""__x7__""")))).setId(78440), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(78442), IReturn(ERef(RefId(Id("""__x8__""")))).setId(78443))).setId(78494))
  val instToStepMap: Map[Int, Int] = HashMap(78391 -> 0, 78440 -> 8, 78394 -> 1, 78426 -> 6, 78403 -> 2, 78410 -> 3, 78442 -> 9, 78395 -> 1, 78402 -> 2, 78434 -> 7, 78392 -> 0, 78411 -> 3, 78425 -> 6, 78432 -> 7, 78423 -> 6, 78444 -> 9, 78397 -> 2, 78412 -> 5, 78405 -> 3, 78404 -> 2, 78416 -> 5, 78419 -> 4, 78439 -> 8, 78422 -> 6, 78435 -> 8, 78418 -> 4, 78417 -> 4, 78427 -> 6, 78409 -> 3, 78441 -> 8, 78433 -> 7, 78424 -> 6, 78428 -> 7, 78443 -> 9, 78396 -> 1, 78393 -> 0, 78421 -> 5, 78420 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(78391, 78392, 78393), 5 -> HashSet(78412, 78416, 78421, 78420), 1 -> HashSet(78394, 78395, 78396), 6 -> HashSet(78423, 78426, 78422, 78427, 78424, 78425), 9 -> HashSet(78444, 78442, 78443), 2 -> HashSet(78397, 78404, 78403, 78402), 7 -> HashSet(78434, 78433, 78428, 78432), 3 -> HashSet(78405, 78410, 78409, 78411), 8 -> HashSet(78440, 78439, 78435, 78441), 4 -> HashSet(78419, 78418, 78417))
  /* Beautified form:
  "GLOBAL.Array.prototype.flatMap" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let mapperFunction = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let sourceLen = __x3__
    app __x4__ = (IsCallable mapperFunction)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    app __x6__ = (ArraySpeciesCreate O 0i)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let A = __x6__
    app __x7__ = (FlattenIntoArray A O sourceLen 0i 1i mapperFunction T)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    __x7__
    app __x8__ = (WrapCompletion A)
    return __x8__
  }
  */
}
