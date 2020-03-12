package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTgetOwnPropertyDescriptor {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Object.getOwnPropertyDescriptor""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(64508), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(64509), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(64511), ILet(Id("""P"""), ERef(RefId(Id("""__x1__""")))).setId(64512), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""O"""))))).setId(64514), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(64515), IReturn(ERef(RefId(Id("""__x2__""")))).setId(64516)).setId(64517), ISeq(List()).setId(64549)).setId(64519), ILet(Id("""obj"""), ERef(RefId(Id("""__x2__""")))).setId(64520), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""P"""))))).setId(64522), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(64523), IReturn(ERef(RefId(Id("""__x3__""")))).setId(64524)).setId(64525), ISeq(List()).setId(64556)).setId(64526), ILet(Id("""key"""), ERef(RefId(Id("""__x3__""")))).setId(64527), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""key"""))))).setId(64529), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(64530), IReturn(ERef(RefId(Id("""__x4__""")))).setId(64531)).setId(64532), ISeq(List()).setId(64563)).setId(64533), ILet(Id("""desc"""), ERef(RefId(Id("""__x4__""")))).setId(64534), IApp(Id("""__x5__"""), ERef(RefId(Id("""FromPropertyDescriptor"""))), List(ERef(RefId(Id("""desc"""))))).setId(64536), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(64537), IReturn(ERef(RefId(Id("""__x6__""")))).setId(64538))).setId(64569))
  val instToStepMap: Map[Int, Int] = HashMap(64514 -> 2, 64535 -> 4, 64526 -> 3, 64536 -> 5, 64519 -> 2, 64512 -> 1, 64522 -> 3, 64520 -> 2, 64529 -> 4, 64533 -> 4, 64513 -> 1, 64534 -> 4, 64509 -> 0, 64537 -> 5, 64539 -> 5, 64508 -> 0, 64511 -> 1, 64528 -> 3, 64538 -> 5, 64521 -> 2, 64510 -> 0, 64527 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(64508, 64509, 64510), 5 -> HashSet(64539, 64536, 64538, 64537), 1 -> HashSet(64512, 64511, 64513), 2 -> HashSet(64514, 64519, 64520, 64521), 3 -> HashSet(64526, 64522, 64528, 64527), 4 -> HashSet(64535, 64529, 64533, 64534))
  /* Beautified form:
  "GLOBAL.Object.getOwnPropertyDescriptor" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let P = __x1__
    app __x2__ = (ToObject O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let obj = __x2__
    app __x3__ = (ToPropertyKey P)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let key = __x3__
    app __x4__ = (obj["GetOwnProperty"] obj key)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let desc = __x4__
    app __x5__ = (FromPropertyDescriptor desc)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
