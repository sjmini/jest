package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetOwnPropertyKeys {
  val length: Int = 2
  val func: Func = Func("""GetOwnPropertyKeys""", List(Id("""O"""), Id("""type""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""O"""))))).setId(64842), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(64843), IReturn(ERef(RefId(Id("""__x0__""")))).setId(64844)).setId(64845), ISeq(List()).setId(64846)).setId(64847), ILet(Id("""obj"""), ERef(RefId(Id("""__x0__""")))).setId(64848), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""obj"""))))).setId(64850), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(64851), IReturn(ERef(RefId(Id("""__x1__""")))).setId(64852)).setId(64853), ISeq(List()).setId(64846)).setId(64854), ILet(Id("""keys"""), ERef(RefId(Id("""__x1__""")))).setId(64855), ILet(Id("""nameList"""), EList(List())).setId(64857), ILet(Id("""__x2__"""), ERef(RefId(Id("""keys""")))).setId(64866), ILet(Id("""__x3__"""), EINum(0L)).setId(64867), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""nextKey"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(64868), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""nextKey"""))))).setId(64859), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""type""")))), IAppend(ERef(RefId(Id("""nextKey"""))), ERef(RefId(Id("""nameList""")))).setId(64860), ISeq(List()).setId(64846)).setId(64863), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(64869))).setId(64870)).setId(64871), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""nameList"""))))).setId(64874), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(64875), IReturn(ERef(RefId(Id("""__x6__""")))).setId(64876))).setId(-1))
  /* Beautified form:
  "GetOwnPropertyKeys" (O, type) => {
    app __x0__ = (ToObject O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let obj = __x0__
    app __x1__ = (obj["OwnPropertyKeys"] obj)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let keys = __x1__
    let nameList = (new [])
    let __x2__ = keys
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let nextKey = __x2__[__x3__]
      app __x4__ = (Type nextKey)
      if (= __x4__ type) append nextKey -> nameList else {}
      __x3__ = (+ __x3__ 1i)
    }
    app __x5__ = (CreateArrayFromList nameList)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
