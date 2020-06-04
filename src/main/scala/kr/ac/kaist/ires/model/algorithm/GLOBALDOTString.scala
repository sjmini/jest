package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTString {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(70094), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(70095), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(0L)), ILet(Id("""s"""), EStr("""""")).setId(70097), ISeq(List(ILet(Id("""__x1__"""), EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef)).setId(70105), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(70099), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Symbol"""))))).setId(70102))).setId(70103), ISeq(List()).setId(70104)).setId(70106), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""SymbolDescriptiveString"""))), List(ERef(RefId(Id("""value"""))))).setId(70107), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(70108), IReturn(ERef(RefId(Id("""__x4__""")))).setId(70109))).setId(70110), ISeq(List()).setId(70104)).setId(70111), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""value"""))))).setId(70113), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(70114), IReturn(ERef(RefId(Id("""__x5__""")))).setId(70115)).setId(70116), ISeq(List()).setId(70104)).setId(70117), ILet(Id("""s"""), ERef(RefId(Id("""__x5__""")))).setId(70118))).setId(70120)).setId(70121), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""s"""))))).setId(70123), IReturn(ERef(RefId(Id("""__x6__""")))).setId(70124))).setId(70125), ISeq(List()).setId(70104)).setId(70126), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%StringPrototype%"""))).setId(70128), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(70129), IReturn(ERef(RefId(Id("""__x7__""")))).setId(70130)).setId(70131), ISeq(List()).setId(70104)).setId(70132), IApp(Id("""__x8__"""), ERef(RefId(Id("""StringCreate"""))), List(ERef(RefId(Id("""s"""))), ERef(RefId(Id("""__x7__"""))))).setId(70133), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(70134), IReturn(ERef(RefId(Id("""__x8__""")))).setId(70135)).setId(70136), ISeq(List()).setId(70104)).setId(70137), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(70138), IReturn(ERef(RefId(Id("""__x9__""")))).setId(70139))).setId(-1))
  /* Beautified form:
  "GLOBAL.String" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    if (= argumentsList["length"] 0i) let s = "" else {
      let __x1__ = (= NewTarget undefined)
      if __x1__ {
        app __x2__ = (Type value)
        __x1__ = (= __x2__ Symbol)
      } else {}
      if __x1__ {
        app __x3__ = (SymbolDescriptiveString value)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      app __x5__ = (ToString value)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let s = __x5__
    }
    if (= NewTarget undefined) {
      app __x6__ = (WrapCompletion s)
      return __x6__
    } else {}
    app __x7__ = (GetPrototypeFromConstructor NewTarget "%StringPrototype%")
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (StringCreate s __x7__)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
