package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateIterResultObject {
  val length: Int = 2
  val func: Func = Func("""CreateIterResultObject""", List(Id("""value"""), Id("""done""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(7731), ILet(Id("""obj"""), ERef(RefId(Id("""__x0__""")))).setId(7732), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""value"""), ERef(RefId(Id("""value"""))))).setId(7734), IExpr(ERef(RefId(Id("""__x1__""")))).setId(7735), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""done"""), ERef(RefId(Id("""done"""))))).setId(7737), IExpr(ERef(RefId(Id("""__x2__""")))).setId(7738), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(7740), IReturn(ERef(RefId(Id("""__x3__""")))).setId(7741))).setId(7752))
  val instToStepMap: Map[Int, Int] = HashMap(7734 -> 2, 7733 -> 1, 7739 -> 3, 7735 -> 2, 7730 -> 0, 7738 -> 3, 7742 -> 4, 7736 -> 2, 7741 -> 4, 7731 -> 1, 7737 -> 3, 7732 -> 1, 7740 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(7730), 1 -> HashSet(7733, 7731, 7732), 2 -> HashSet(7734, 7735, 7736), 3 -> HashSet(7739, 7738, 7737), 4 -> HashSet(7742, 7741, 7740))
  /* Beautified form:
  "CreateIterResultObject" (value, done) => {
    app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x0__
    app __x1__ = (CreateDataProperty obj "value" value)
    __x1__
    app __x2__ = (CreateDataProperty obj "done" done)
    __x2__
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }
  */
}
