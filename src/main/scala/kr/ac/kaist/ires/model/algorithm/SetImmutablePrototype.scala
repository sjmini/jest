package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SetImmutablePrototype {
  val length: Int = 2
  val func: Func = Func("""SetImmutablePrototype""", List(Id("""O"""), Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))).setId(58287), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(58288), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58289)).setId(58290), ISeq(List()).setId(58308)).setId(58291), ILet(Id("""current"""), ERef(RefId(Id("""__x0__""")))).setId(58292), IApp(Id("""__x1__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""V"""))), ERef(RefId(Id("""current"""))))).setId(58294), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(58295), IReturn(ERef(RefId(Id("""__x2__""")))).setId(58296))).setId(58314), ISeq(List()).setId(58315)).setId(58298), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(58300), IReturn(ERef(RefId(Id("""__x3__""")))).setId(58301))).setId(58319))
  val instToStepMap: Map[Int, Int] = HashMap(58301 -> 4, 58296 -> 2, 58293 -> 1, 58286 -> 0, 58297 -> 2, 58300 -> 4, 58299 -> 3, 58292 -> 1, 58295 -> 2, 58287 -> 1, 58302 -> 4, 58298 -> 3, 58294 -> 3, 58291 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(58286), 1 -> HashSet(58293, 58291, 58292, 58287), 2 -> HashSet(58296, 58297, 58295), 3 -> HashSet(58294, 58299, 58298), 4 -> HashSet(58301, 58300, 58302))
  /* Beautified form:
  "SetImmutablePrototype" (O, V) => {
    app __x0__ = (O["GetPrototypeOf"] O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let current = __x0__
    app __x1__ = (SameValue V current)
    if (= __x1__ true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }
  */
}
