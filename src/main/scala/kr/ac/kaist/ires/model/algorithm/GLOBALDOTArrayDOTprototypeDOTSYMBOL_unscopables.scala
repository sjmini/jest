package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTSYMBOL_unscopables {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.SYMBOL_unscopables""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ENull)).setId(83649), ILet(Id("""unscopableList"""), ERef(RefId(Id("""__x0__""")))).setId(83650), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""copyWithin"""), EBool(true))).setId(83652), IExpr(ERef(RefId(Id("""__x1__""")))).setId(83653), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""entries"""), EBool(true))).setId(83655), IExpr(ERef(RefId(Id("""__x2__""")))).setId(83656), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""fill"""), EBool(true))).setId(83658), IExpr(ERef(RefId(Id("""__x3__""")))).setId(83659), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""find"""), EBool(true))).setId(83661), IExpr(ERef(RefId(Id("""__x4__""")))).setId(83662), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""findIndex"""), EBool(true))).setId(83664), IExpr(ERef(RefId(Id("""__x5__""")))).setId(83665), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""flat"""), EBool(true))).setId(83667), IExpr(ERef(RefId(Id("""__x6__""")))).setId(83668), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""flatMap"""), EBool(true))).setId(83670), IExpr(ERef(RefId(Id("""__x7__""")))).setId(83671), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""includes"""), EBool(true))).setId(83673), IExpr(ERef(RefId(Id("""__x8__""")))).setId(83674), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""keys"""), EBool(true))).setId(83676), IExpr(ERef(RefId(Id("""__x9__""")))).setId(83677), IApp(Id("""__x10__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""values"""), EBool(true))).setId(83679), IExpr(ERef(RefId(Id("""__x10__""")))).setId(83680), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""unscopableList"""))))).setId(83683), IReturn(ERef(RefId(Id("""__x11__""")))).setId(83684))).setId(83711))
  val instToStepMap: Map[Int, Int] = HashMap(83662 -> 4, 83669 -> 6, 83665 -> 5, 83650 -> 0, 83680 -> 10, 83663 -> 4, 83672 -> 7, 83676 -> 9, 83677 -> 9, 83657 -> 2, 83670 -> 7, 83654 -> 1, 83667 -> 6, 83661 -> 4, 83675 -> 8, 83658 -> 3, 83684 -> 12, 83659 -> 3, 83679 -> 10, 83652 -> 1, 83656 -> 2, 83682 -> 11, 83668 -> 6, 83673 -> 8, 83655 -> 2, 83649 -> 0, 83681 -> 10, 83674 -> 8, 83664 -> 5, 83660 -> 3, 83671 -> 7, 83653 -> 1, 83651 -> 0, 83666 -> 5, 83683 -> 12, 83685 -> 12, 83678 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(83650, 83649, 83651), 5 -> HashSet(83665, 83664, 83666), 10 -> HashSet(83679, 83680, 83681), 1 -> HashSet(83652, 83654, 83653), 6 -> HashSet(83669, 83668, 83667), 9 -> HashSet(83676, 83677, 83678), 2 -> HashSet(83656, 83655, 83657), 12 -> HashSet(83684, 83683, 83685), 7 -> HashSet(83672, 83670, 83671), 3 -> HashSet(83659, 83660, 83658), 11 -> HashSet(83682), 8 -> HashSet(83673, 83674, 83675), 4 -> HashSet(83662, 83663, 83661))
  /* Beautified form:
  "GLOBAL.Array.prototype.SYMBOL_unscopables" (this, argumentsList, NewTarget) => {
    app __x0__ = (ObjectCreate null)
    let unscopableList = __x0__
    app __x1__ = (CreateDataProperty unscopableList "copyWithin" true)
    __x1__
    app __x2__ = (CreateDataProperty unscopableList "entries" true)
    __x2__
    app __x3__ = (CreateDataProperty unscopableList "fill" true)
    __x3__
    app __x4__ = (CreateDataProperty unscopableList "find" true)
    __x4__
    app __x5__ = (CreateDataProperty unscopableList "findIndex" true)
    __x5__
    app __x6__ = (CreateDataProperty unscopableList "flat" true)
    __x6__
    app __x7__ = (CreateDataProperty unscopableList "flatMap" true)
    __x7__
    app __x8__ = (CreateDataProperty unscopableList "includes" true)
    __x8__
    app __x9__ = (CreateDataProperty unscopableList "keys" true)
    __x9__
    app __x10__ = (CreateDataProperty unscopableList "values" true)
    __x10__
    app __x11__ = (WrapCompletion unscopableList)
    return __x11__
  }
  */
}
