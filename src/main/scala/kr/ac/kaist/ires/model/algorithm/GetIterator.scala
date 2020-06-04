package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetIterator {
  val length: Int = 1
  val func: Func = Func("""GetIterator""", List(Id("""obj"""), Id("""hint"""), Id("""method""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), EAbsent), IAssign(RefId(Id("""hint""")), ERef(RefId(Id("""CONST_sync""")))).setId(7039), ISeq(List()).setId(7041)).setId(7042), IIf(EBOp(OEq, ERef(RefId(Id("""method"""))), EAbsent), IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_asyncIterator"""))))).setId(7044), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(7045), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7046)).setId(7047), ISeq(List()).setId(7041)).setId(7048), IAssign(RefId(Id("""method""")), ERef(RefId(Id("""__x0__""")))).setId(7049), IIf(EBOp(OEq, ERef(RefId(Id("""method"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_iterator"""))))).setId(7051), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(7052), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7053)).setId(7054), ISeq(List()).setId(7041)).setId(7055), ILet(Id("""syncMethod"""), ERef(RefId(Id("""__x1__""")))).setId(7056), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""CONST_sync"""))), ERef(RefId(Id("""syncMethod"""))))).setId(7058), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(7059), IReturn(ERef(RefId(Id("""__x2__""")))).setId(7060)).setId(7061), ISeq(List()).setId(7041)).setId(7062), ILet(Id("""syncIteratorRecord"""), ERef(RefId(Id("""__x2__""")))).setId(7063), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateAsyncFromSyncIterator"""))), List(ERef(RefId(Id("""syncIteratorRecord"""))))).setId(7065), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(7066), IReturn(ERef(RefId(Id("""__x3__""")))).setId(7067)).setId(7068), ISeq(List()).setId(7041)).setId(7069), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(7070), IReturn(ERef(RefId(Id("""__x4__""")))).setId(7071))).setId(7073), ISeq(List()).setId(7041)).setId(7074))).setId(7076), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_iterator"""))))).setId(7077), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(7078), IReturn(ERef(RefId(Id("""__x5__""")))).setId(7079)).setId(7080), ISeq(List()).setId(7041)).setId(7081), IAssign(RefId(Id("""method""")), ERef(RefId(Id("""__x5__""")))).setId(7082))).setId(7083)).setId(7084), ISeq(List()).setId(7041)).setId(7087), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""method"""))), ERef(RefId(Id("""obj"""))))).setId(7089), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(7090), IReturn(ERef(RefId(Id("""__x6__""")))).setId(7091)).setId(7092), ISeq(List()).setId(7041)).setId(7093), ILet(Id("""iterator"""), ERef(RefId(Id("""__x6__""")))).setId(7094), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""iterator"""))))).setId(7096), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(7097), IReturn(ERef(RefId(Id("""__x8__""")))).setId(7098))).setId(7099), ISeq(List()).setId(7041)).setId(7100), IApp(Id("""__x9__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""next"""))).setId(7102), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(7103), IReturn(ERef(RefId(Id("""__x9__""")))).setId(7104)).setId(7105), ISeq(List()).setId(7041)).setId(7106), ILet(Id("""nextMethod"""), ERef(RefId(Id("""__x9__""")))).setId(7107), ILet(Id("""iteratorRecord"""), EMap(Ty("""Record"""), List((EStr("""Iterator"""), ERef(RefId(Id("""iterator""")))), (EStr("""NextMethod"""), ERef(RefId(Id("""nextMethod""")))), (EStr("""Done"""), EBool(false))))).setId(7109), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(7111), IReturn(ERef(RefId(Id("""__x10__""")))).setId(7112))).setId(-1))
  /* Beautified form:
  "GetIterator" (obj, hint, method) => {
    if (= hint absent) hint = CONST_sync else {}
    if (= method absent) if (= hint CONST_async) {
      app __x0__ = (GetMethod obj SYMBOL_asyncIterator)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      method = __x0__
      if (= method undefined) {
        app __x1__ = (GetMethod obj SYMBOL_iterator)
        if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
        let syncMethod = __x1__
        app __x2__ = (GetIterator obj CONST_sync syncMethod)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let syncIteratorRecord = __x2__
        app __x3__ = (CreateAsyncFromSyncIterator syncIteratorRecord)
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
    } else {
      app __x5__ = (GetMethod obj SYMBOL_iterator)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      method = __x5__
    } else {}
    app __x6__ = (Call method obj)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let iterator = __x6__
    app __x7__ = (Type iterator)
    if (! (= __x7__ Object)) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    app __x9__ = (GetV iterator "next")
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let nextMethod = __x9__
    let iteratorRecord = (new Record("Iterator" -> iterator, "NextMethod" -> nextMethod, "Done" -> false))
    app __x10__ = (WrapCompletion iteratorRecord)
    return __x10__
  }
  */
}
