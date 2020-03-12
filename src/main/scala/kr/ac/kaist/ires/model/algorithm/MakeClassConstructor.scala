package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MakeClassConstructor {
  val length: Int = 1
  val func: Func = Func("""MakeClassConstructor""", List(Id("""F""")), None, ISeq(List(IAssign(RefProp(RefId(Id("""F""")), EStr("""FunctionKind""")), EStr("""classConstructor""")).setId(52424), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(52426), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(52427), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52428))).setId(52435))
  val instToStepMap: Map[Int, Int] = HashMap(52427 -> 3, 52425 -> 2, 52424 -> 2, 52428 -> 3, 52423 -> 1, 52429 -> 3, 52426 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(52423), 1 -> HashSet(52423), 2 -> HashSet(52425, 52424), 3 -> HashSet(52427, 52428, 52429, 52426))
  /* Beautified form:
  "MakeClassConstructor" (F) => {
    F["FunctionKind"] = "classConstructor"
    app __x0__ = (NormalCompletion undefined)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
