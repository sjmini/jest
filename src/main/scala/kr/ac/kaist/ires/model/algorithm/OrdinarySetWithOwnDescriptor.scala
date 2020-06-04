package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinarySetWithOwnDescriptor {
  val length: Int = 5
  val func: Func = Func("""OrdinarySetWithOwnDescriptor""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Receiver"""), Id("""ownDesc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""ownDesc"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))).setId(50580), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50581), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50582)).setId(50583), ISeq(List()).setId(50579)).setId(50584), ILet(Id("""parent"""), ERef(RefId(Id("""__x0__""")))).setId(50585), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""parent"""))), ENull)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""parent""")), EStr("""Set"""))), List(ERef(RefId(Id("""parent"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))))).setId(50587), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(50588), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50589)).setId(50590), ISeq(List()).setId(50579)).setId(50591), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(50592), IReturn(ERef(RefId(Id("""__x2__""")))).setId(50593))).setId(50595), IAssign(RefId(Id("""ownDesc""")), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), EUndef), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(true))))).setId(50596)).setId(50599))).setId(50601), ISeq(List()).setId(50579)).setId(50602), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""ownDesc"""))))).setId(50604), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ownDesc""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50605), IReturn(ERef(RefId(Id("""__x4__""")))).setId(50606))).setId(50607), ISeq(List()).setId(50579)).setId(50608), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""Receiver"""))))).setId(50610), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50611), IReturn(ERef(RefId(Id("""__x6__""")))).setId(50612))).setId(50613), ISeq(List()).setId(50579)).setId(50614), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""Receiver""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""P"""))))).setId(50616), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(50617), IReturn(ERef(RefId(Id("""__x7__""")))).setId(50618)).setId(50619), ISeq(List()).setId(50579)).setId(50620), ILet(Id("""existingDescriptor"""), ERef(RefId(Id("""__x7__""")))).setId(50621), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""existingDescriptor"""))), EUndef)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""existingDescriptor"""))))).setId(50623), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50624), IReturn(ERef(RefId(Id("""__x9__""")))).setId(50625))).setId(50626), ISeq(List()).setId(50579)).setId(50627), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""existingDescriptor""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50629), IReturn(ERef(RefId(Id("""__x10__""")))).setId(50630))).setId(50631), ISeq(List()).setId(50579)).setId(50632), ILet(Id("""valueDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""V"""))))))).setId(50634), IApp(Id("""__x11__"""), ERef(RefProp(RefId(Id("""Receiver""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""valueDesc"""))))).setId(50636), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(50637), IReturn(ERef(RefId(Id("""__x11__""")))).setId(50638)).setId(50639), ISeq(List()).setId(50579)).setId(50640), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(50641), IReturn(ERef(RefId(Id("""__x12__""")))).setId(50642))).setId(50644), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))))).setId(50645), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(50646), IReturn(ERef(RefId(Id("""__x13__""")))).setId(50647)).setId(50648), ISeq(List()).setId(50579)).setId(50649), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(50650), IReturn(ERef(RefId(Id("""__x14__""")))).setId(50651))).setId(50653)).setId(50654))).setId(50656), ISeq(List()).setId(50579)).setId(50657), ILet(Id("""setter"""), ERef(RefProp(RefId(Id("""ownDesc""")), EStr("""Set""")))).setId(50659), IIf(EBOp(OEq, ERef(RefId(Id("""setter"""))), EUndef), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50661), IReturn(ERef(RefId(Id("""__x15__""")))).setId(50662))).setId(50663), ISeq(List()).setId(50579)).setId(50664), IApp(Id("""__x16__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""setter"""))), ERef(RefId(Id("""Receiver"""))), EList(List(ERef(RefId(Id("""V"""))))))).setId(50666), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(50667), IReturn(ERef(RefId(Id("""__x16__""")))).setId(50668)).setId(50669), ISeq(List()).setId(50579)).setId(50670), IExpr(ERef(RefId(Id("""__x16__""")))).setId(50671), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(50673), IReturn(ERef(RefId(Id("""__x17__""")))).setId(50674))).setId(-1))
  /* Beautified form:
  "OrdinarySetWithOwnDescriptor" (O, P, V, Receiver, ownDesc) => {
    if (= ownDesc undefined) {
      app __x0__ = (O["GetPrototypeOf"] O)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let parent = __x0__
      if (! (= parent null)) {
        app __x1__ = (parent["Set"] parent P V Receiver)
        if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
        app __x2__ = (WrapCompletion __x1__)
        return __x2__
      } else ownDesc = (new PropertyDescriptor("Value" -> undefined, "Writable" -> true, "Enumerable" -> true, "Configurable" -> true))
    } else {}
    app __x3__ = (IsDataDescriptor ownDesc)
    if (= __x3__ true) {
      if (= ownDesc["Writable"] false) {
        app __x4__ = (WrapCompletion false)
        return __x4__
      } else {}
      app __x5__ = (Type Receiver)
      if (! (= __x5__ Object)) {
        app __x6__ = (WrapCompletion false)
        return __x6__
      } else {}
      app __x7__ = (Receiver["GetOwnProperty"] Receiver P)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let existingDescriptor = __x7__
      if (! (= existingDescriptor undefined)) {
        app __x8__ = (IsAccessorDescriptor existingDescriptor)
        if (= __x8__ true) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {}
        if (= existingDescriptor["Writable"] false) {
          app __x10__ = (WrapCompletion false)
          return __x10__
        } else {}
        let valueDesc = (new PropertyDescriptor("Value" -> V))
        app __x11__ = (Receiver["DefineOwnProperty"] Receiver P valueDesc)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        app __x12__ = (WrapCompletion __x11__)
        return __x12__
      } else {
        app __x13__ = (CreateDataProperty Receiver P V)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        app __x14__ = (WrapCompletion __x13__)
        return __x14__
      }
    } else {}
    let setter = ownDesc["Set"]
    if (= setter undefined) {
      app __x15__ = (WrapCompletion false)
      return __x15__
    } else {}
    app __x16__ = (Call setter Receiver (new [V]))
    if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
    __x16__
    app __x17__ = (WrapCompletion true)
    return __x17__
  }
  */
}
