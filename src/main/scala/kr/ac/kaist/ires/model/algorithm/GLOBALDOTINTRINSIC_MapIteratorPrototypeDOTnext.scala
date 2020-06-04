package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_MapIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_MapIteratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(85262), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(85264), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(85265), IReturn(ERef(RefId(Id("""__x1__""")))).setId(85266))).setId(85267), ISeq(List()).setId(85268)).setId(85269), IExpr(ENotSupported("""Etc""")).setId(85271), ILet(Id("""m"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Map""")))).setId(85272), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""MapNextIndex""")))).setId(85274), ILet(Id("""itemKind"""), ERef(RefProp(RefId(Id("""O""")), EStr("""MapIterationKind""")))).setId(85276), IIf(EBOp(OEq, ERef(RefId(Id("""m"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(85278), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(85279), IReturn(ERef(RefId(Id("""__x3__""")))).setId(85280))).setId(85281), ISeq(List()).setId(85268)).setId(85282), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""m""")), EStr("""MapData""")))).setId(85284), ILet(Id("""numEntries"""), ERef(RefProp(RefId(Id("""entries""")), EStr("""length""")))).setId(85286), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""numEntries""")))), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(85271), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(85288), IAssign(RefProp(RefId(Id("""O""")), EStr("""MapNextIndex""")), ERef(RefId(Id("""index""")))).setId(85290), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""e""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""key""")), ILet(Id("""result"""), ERef(RefProp(RefId(Id("""e""")), EStr("""Key""")))).setId(85292), IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""value""")), ILet(Id("""result"""), ERef(RefProp(RefId(Id("""e""")), EStr("""Value""")))).setId(85294), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(EList(List(ERef(RefProp(RefId(Id("""e""")), EStr("""Key"""))), ERef(RefProp(RefId(Id("""e""")), EStr("""Value"""))))))).setId(85296), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(85297), IReturn(ERef(RefId(Id("""__x4__""")))).setId(85298)).setId(85299), ISeq(List()).setId(85268)).setId(85300), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))).setId(85301))).setId(85303)).setId(85304)).setId(85306), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""result"""))), EBool(false))).setId(85308), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(85309), IReturn(ERef(RefId(Id("""__x6__""")))).setId(85310))).setId(85312), ISeq(List()).setId(85268)).setId(85313))).setId(85315)).setId(85316), IAssign(RefProp(RefId(Id("""O""")), EStr("""Map""")), EUndef).setId(85318), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(85320), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(85321), IReturn(ERef(RefId(Id("""__x8__""")))).setId(85322))).setId(-1))
  /* Beautified form:
  "GLOBAL.INTRINSIC_MapIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    !!! "Etc"
    let m = O["Map"]
    let index = O["MapNextIndex"]
    let itemKind = O["MapIterationKind"]
    if (= m undefined) {
      app __x2__ = (CreateIterResultObject undefined true)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    let entries = m["MapData"]
    let numEntries = entries["length"]
    while (< index numEntries) {
      !!! "Etc"
      index = (+ index 1i)
      O["MapNextIndex"] = index
      if (! (= e["Key"] CONST_empty)) {
        if (= itemKind "key") let result = e["Key"] else if (= itemKind "value") let result = e["Value"] else {
          app __x4__ = (CreateArrayFromList (new [e["Key"], e["Value"]]))
          if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
          let result = __x4__
        }
        app __x5__ = (CreateIterResultObject result false)
        app __x6__ = (WrapCompletion __x5__)
        return __x6__
      } else {}
    }
    O["Map"] = undefined
    app __x7__ = (CreateIterResultObject undefined true)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
