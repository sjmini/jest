package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_SetIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_SetIteratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(86384), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(86386), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(86387), IReturn(ERef(RefId(Id("""__x1__""")))).setId(86388))).setId(86389), ISeq(List()).setId(86390)).setId(86391), IExpr(ENotSupported("""Etc""")).setId(86393), ILet(Id("""s"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedSet""")))).setId(86394), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""SetNextIndex""")))).setId(86396), ILet(Id("""itemKind"""), ERef(RefProp(RefId(Id("""O""")), EStr("""SetIterationKind""")))).setId(86398), IIf(EBOp(OEq, ERef(RefId(Id("""s"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(86400), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(86401), IReturn(ERef(RefId(Id("""__x3__""")))).setId(86402))).setId(86403), ISeq(List()).setId(86390)).setId(86404), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""s""")), EStr("""SetData""")))).setId(86406), ILet(Id("""numEntries"""), ERef(RefProp(RefId(Id("""entries""")), EStr("""length""")))).setId(86408), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""numEntries""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""entries""")), ERef(RefId(Id("""index""")))))).setId(86410), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(86412), IAssign(RefProp(RefId(Id("""O""")), EStr("""SetNextIndex""")), ERef(RefId(Id("""index""")))).setId(86414), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""key+value""")), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(EList(List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""e"""))))))).setId(86416), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""__x4__"""))), EBool(false))).setId(86417), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(86418), IReturn(ERef(RefId(Id("""__x6__""")))).setId(86419))).setId(86421), ISeq(List()).setId(86390)).setId(86422), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""e"""))), EBool(false))).setId(86424), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(86425), IReturn(ERef(RefId(Id("""__x8__""")))).setId(86426))).setId(86428), ISeq(List()).setId(86390)).setId(86429))).setId(86431)).setId(86432), IAssign(RefProp(RefId(Id("""O""")), EStr("""IteratedSet""")), EUndef).setId(86434), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(86436), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(86437), IReturn(ERef(RefId(Id("""__x10__""")))).setId(86438))).setId(-1))
  /* Beautified form:
  "GLOBAL.INTRINSIC_SetIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    !!! "Etc"
    let s = O["IteratedSet"]
    let index = O["SetNextIndex"]
    let itemKind = O["SetIterationKind"]
    if (= s undefined) {
      app __x2__ = (CreateIterResultObject undefined true)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    let entries = s["SetData"]
    let numEntries = entries["length"]
    while (< index numEntries) {
      let e = entries[index]
      index = (+ index 1i)
      O["SetNextIndex"] = index
      if (! (= e CONST_empty)) {
        if (= itemKind "key+value") {
          app __x4__ = (CreateArrayFromList (new [e, e]))
          app __x5__ = (CreateIterResultObject __x4__ false)
          app __x6__ = (WrapCompletion __x5__)
          return __x6__
        } else {}
        app __x7__ = (CreateIterResultObject e false)
        app __x8__ = (WrapCompletion __x7__)
        return __x8__
      } else {}
    }
    O["IteratedSet"] = undefined
    app __x9__ = (CreateIterResultObject undefined true)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }
  */
}
