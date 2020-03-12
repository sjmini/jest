package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EvaluateCall {
  val length: Int = 4
  val func: Func = Func("""EvaluateCall""", List(Id("""func"""), Id("""ref"""), Id("""arguments"""), Id("""tailPosition""")), None, ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""ref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""ref""")), ERef(RefProp(RefId(Id("""ref""")), EStr("""Value""")))).setId(17410), IReturn(ERef(RefId(Id("""ref""")))).setId(17411)).setId(17412), ISeq(List()).setId(17472)).setId(17414), IExpr(ERef(RefId(Id("""ref""")))).setId(17415), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""ref"""))))).setId(17417), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""ref"""))))).setId(17418), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""GetThisValue"""))), List(ERef(RefId(Id("""ref"""))))).setId(17419), ILet(Id("""thisValue"""), ERef(RefId(Id("""__x2__""")))).setId(17420))).setId(17479), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""ref"""))))).setId(17423), ILet(Id("""refEnv"""), ERef(RefId(Id("""__x3__""")))).setId(17424), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""refEnv""")), EStr("""WithBaseObject"""))), List(ERef(RefId(Id("""refEnv"""))))).setId(17426), ILet(Id("""thisValue"""), ERef(RefId(Id("""__x4__""")))).setId(17427))).setId(17484)).setId(17430))).setId(17486), ILet(Id("""thisValue"""), EUndef).setId(17433)).setId(17436), IAccess(Id("""__x5__"""), ERef(RefId(Id("""arguments"""))), EStr("""ArgumentListEvaluation""")).setId(17438), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(17439), IReturn(ERef(RefId(Id("""__x5__""")))).setId(17440)).setId(17441), ISeq(List()).setId(17493)).setId(17442), ILet(Id("""argList"""), ERef(RefId(Id("""__x5__""")))).setId(17443), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""func"""))))).setId(17445), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(17446), IReturn(ERef(RefId(Id("""__x7__""")))).setId(17447))).setId(17499), ISeq(List()).setId(17500)).setId(17449), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""func"""))))).setId(17451), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(17452), IReturn(ERef(RefId(Id("""__x9__""")))).setId(17453))).setId(17505), ISeq(List()).setId(17506)).setId(17455), IIf(EBOp(OEq, ERef(RefId(Id("""tailPosition"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""PrepareForTailCall"""))), List()).setId(17457), IExpr(ERef(RefId(Id("""__x10__""")))).setId(17458))).setId(17510), ISeq(List()).setId(17511)).setId(17460), IApp(Id("""__x11__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""thisValue"""))), ERef(RefId(Id("""argList"""))))).setId(17462), ILet(Id("""result"""), ERef(RefId(Id("""__x11__""")))).setId(17463), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(17465), IReturn(ERef(RefId(Id("""__x12__""")))).setId(17466))).setId(17517))
  val instToStepMap: Map[Int, Int] = HashMap(17453 -> 17, 17423 -> 10, 17467 -> 24, 17445 -> 16, 17462 -> 21, 17422 -> 5, 17413 -> 23, 17435 -> 13, 17455 -> 18, 17421 -> 5, 17443 -> 14, 17456 -> 18, 17437 -> 13, 17424 -> 10, 17446 -> 15, 17433 -> 13, 17428 -> 10, 17463 -> 21, 17415 -> 0, 17449 -> 16, 17466 -> 24, 17459 -> 19, 17432 -> 10, 17425 -> 10, 17420 -> 5, 17442 -> 14, 17450 -> 16, 17429 -> 10, 17416 -> 0, 17419 -> 5, 17426 -> 10, 17454 -> 17, 17436 -> 13, 17458 -> 19, 17451 -> 18, 17448 -> 15, 17418 -> 10, 17461 -> 20, 17444 -> 14, 17430 -> 10, 17452 -> 17, 17438 -> 14, 17457 -> 19, 17427 -> 10, 17464 -> 21, 17434 -> 13, 17417 -> 13, 17447 -> 15, 17460 -> 20, 17431 -> 10, 17414 -> 0, 17465 -> 24)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(17415, 17416, 17414), 5 -> HashSet(17420, 17419, 17422, 17421), 10 -> HashSet(17424, 17428, 17432, 17425, 17423, 17429, 17426, 17418, 17430, 17413, 17427, 17431), 24 -> HashSet(17466, 17467, 17465), 14 -> HashSet(17442, 17444, 17438, 17443), 20 -> HashSet(17461, 17460), 21 -> HashSet(17463, 17462, 17464), 9 -> HashSet(17424, 17425, 17423), 13 -> HashSet(17437, 17433, 17436, 17435, 17434, 17417), 17 -> HashSet(17453, 17454, 17452), 22 -> HashSet(17413), 18 -> HashSet(17451, 17455, 17456), 16 -> HashSet(17449, 17445, 17450), 23 -> HashSet(17413), 8 -> HashSet(17413), 19 -> HashSet(17459, 17458, 17457), 15 -> HashSet(17446, 17448, 17447))
  /* Beautified form:
  "EvaluateCall" (func, ref, arguments, tailPosition) => {
    if (= (typeof ref) "Completion") if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x0__ = (Type ref)
    if (= __x0__ Reference) {
      app __x1__ = (IsPropertyReference ref)
      if (= __x1__ true) {
        app __x2__ = (GetThisValue ref)
        let thisValue = __x2__
      } else {
        app __x3__ = (GetBase ref)
        let refEnv = __x3__
        app __x4__ = (refEnv["WithBaseObject"] refEnv)
        let thisValue = __x4__
      }
    } else let thisValue = undefined
    access __x5__ = (arguments "ArgumentListEvaluation")
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let argList = __x5__
    app __x6__ = (Type func)
    if (! (= __x6__ Object)) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    app __x8__ = (IsCallable func)
    if (= __x8__ false) {
      app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x9__
    } else {}
    if (= tailPosition true) {
      app __x10__ = (PrepareForTailCall )
      __x10__
    } else {}
    app __x11__ = (Call func thisValue argList)
    let result = __x11__
    app __x12__ = (WrapCompletion result)
    return __x12__
  }
  */
}
