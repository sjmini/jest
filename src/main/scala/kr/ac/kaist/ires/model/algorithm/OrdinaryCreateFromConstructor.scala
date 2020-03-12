package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryCreateFromConstructor {
  val length: Int = 2
  val func: Func = Func("""OrdinaryCreateFromConstructor""", List(Id("""constructor"""), Id("""intrinsicDefaultProto"""), Id("""internalSlotsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""constructor"""))), ERef(RefId(Id("""intrinsicDefaultProto"""))))).setId(51183), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(51184), IReturn(ERef(RefId(Id("""__x0__""")))).setId(51185)).setId(51186), ISeq(List()).setId(51199)).setId(51187), ILet(Id("""proto"""), ERef(RefId(Id("""__x0__""")))).setId(51188), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""proto"""))), ERef(RefId(Id("""internalSlotsList"""))))).setId(51190), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(51191), IReturn(ERef(RefId(Id("""__x2__""")))).setId(51192))).setId(51205))
  val instToStepMap: Map[Int, Int] = HashMap(51182 -> 0, 51191 -> 2, 51188 -> 1, 51183 -> 1, 51189 -> 1, 51190 -> 2, 51187 -> 1, 51192 -> 2, 51193 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(51182), 1 -> HashSet(51187, 51188, 51183, 51189), 2 -> HashSet(51190, 51191, 51192, 51193))
  /* Beautified form:
  "OrdinaryCreateFromConstructor" (constructor, intrinsicDefaultProto, internalSlotsList) => {
    app __x0__ = (GetPrototypeFromConstructor constructor intrinsicDefaultProto)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let proto = __x0__
    app __x1__ = (ObjectCreate proto internalSlotsList)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
