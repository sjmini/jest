package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateMapIterator {
  val length: Int = 2
  val func: Func = Func("""CreateMapIterator""", List(Id("""map"""), Id("""kind""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""map"""))), EStr("""MapData"""))).setId(85211), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(85212), IReturn(ERef(RefId(Id("""__x0__""")))).setId(85213)).setId(85214), ISeq(List()).setId(85215)).setId(85216), IExpr(ERef(RefId(Id("""__x0__""")))).setId(85217), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_MapIteratorPrototype"""))), EList(List(EStr("""Map"""), EStr("""MapNextIndex"""), EStr("""MapIterationKind"""))))).setId(85219), ILet(Id("""iterator"""), ERef(RefId(Id("""__x1__""")))).setId(85220), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""Map""")), ERef(RefId(Id("""map""")))).setId(85222), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""MapNextIndex""")), EINum(0L)).setId(85224), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""MapIterationKind""")), ERef(RefId(Id("""kind""")))).setId(85226), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iterator"""))))).setId(85228), IReturn(ERef(RefId(Id("""__x2__""")))).setId(85229))).setId(-1))
  /* Beautified form:
  "CreateMapIterator" (map, kind) => {
    app __x0__ = (RequireInternalSlot map "MapData")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (ObjectCreate INTRINSIC_MapIteratorPrototype (new ["Map", "MapNextIndex", "MapIterationKind"]))
    let iterator = __x1__
    iterator["Map"] = map
    iterator["MapNextIndex"] = 0i
    iterator["MapIterationKind"] = kind
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }
  */
}
