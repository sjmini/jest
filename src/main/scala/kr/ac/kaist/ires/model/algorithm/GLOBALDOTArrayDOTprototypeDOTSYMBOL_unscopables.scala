package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTSYMBOL_unscopables {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.SYMBOL_unscopables""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ENull)).setId(83649), ILet(Id("""unscopableList"""), ERef(RefId(Id("""__x0__""")))).setId(83650), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""copyWithin"""), EBool(true))).setId(83652), IExpr(ERef(RefId(Id("""__x1__""")))).setId(83653), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""entries"""), EBool(true))).setId(83655), IExpr(ERef(RefId(Id("""__x2__""")))).setId(83656), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""fill"""), EBool(true))).setId(83658), IExpr(ERef(RefId(Id("""__x3__""")))).setId(83659), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""find"""), EBool(true))).setId(83661), IExpr(ERef(RefId(Id("""__x4__""")))).setId(83662), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""findIndex"""), EBool(true))).setId(83664), IExpr(ERef(RefId(Id("""__x5__""")))).setId(83665), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""flat"""), EBool(true))).setId(83667), IExpr(ERef(RefId(Id("""__x6__""")))).setId(83668), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""flatMap"""), EBool(true))).setId(83670), IExpr(ERef(RefId(Id("""__x7__""")))).setId(83671), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""includes"""), EBool(true))).setId(83673), IExpr(ERef(RefId(Id("""__x8__""")))).setId(83674), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""keys"""), EBool(true))).setId(83676), IExpr(ERef(RefId(Id("""__x9__""")))).setId(83677), IApp(Id("""__x10__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""unscopableList"""))), EStr("""values"""), EBool(true))).setId(83679), IExpr(ERef(RefId(Id("""__x10__""")))).setId(83680), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""unscopableList"""))))).setId(83683), IReturn(ERef(RefId(Id("""__x11__""")))).setId(83684))).setId(-1))
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
