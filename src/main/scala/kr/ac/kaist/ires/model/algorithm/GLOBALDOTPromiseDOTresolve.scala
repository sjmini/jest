package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPromiseDOTresolve {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Promise.resolve""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(92746), ILet(Id("""x"""), ERef(RefId(Id("""__x0__""")))).setId(92747), ILet(Id("""C"""), ERef(RefId(Id("""this""")))).setId(92749), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""C"""))))).setId(92751), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(92752), IReturn(ERef(RefId(Id("""__x2__""")))).setId(92753))).setId(92773), ISeq(List()).setId(92774)).setId(92756), IApp(Id("""__x3__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""x"""))))).setId(92758), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(92759), IReturn(ERef(RefId(Id("""__x3__""")))).setId(92760)).setId(92761), ISeq(List()).setId(92780)).setId(92762), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(92763), IReturn(ERef(RefId(Id("""__x4__""")))).setId(92764))).setId(92784))
  val instToStepMap: Map[Int, Int] = HashMap(92750 -> 1, 92747 -> 0, 92762 -> 4, 92765 -> 4, 92746 -> 0, 92753 -> 2, 92749 -> 1, 92764 -> 4, 92754 -> 2, 92763 -> 4, 92748 -> 0, 92751 -> 3, 92756 -> 3, 92758 -> 4, 92752 -> 2, 92757 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(92747, 92746, 92748), 1 -> HashSet(92750, 92749), 2 -> HashSet(92753, 92752, 92754), 3 -> HashSet(92756, 92757, 92751), 4 -> HashSet(92762, 92758, 92765, 92764, 92763))
  /* Beautified form:
  "GLOBAL.Promise.resolve" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let x = __x0__
    let C = this
    app __x1__ = (Type C)
    if (! (= __x1__ Object)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (PromiseResolve C x)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
