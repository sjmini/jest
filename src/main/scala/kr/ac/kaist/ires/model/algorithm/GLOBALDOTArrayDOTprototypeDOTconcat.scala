package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTconcat {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.concat""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(75878), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(75879), IReturn(ERef(RefId(Id("""__x0__""")))).setId(75880)).setId(75881), ISeq(List()).setId(75882)).setId(75883), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(75884), IApp(Id("""__x1__"""), ERef(RefId(Id("""ArraySpeciesCreate"""))), List(ERef(RefId(Id("""O"""))), EINum(0L))).setId(75886), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(75887), IReturn(ERef(RefId(Id("""__x1__""")))).setId(75888)).setId(75889), ISeq(List()).setId(75882)).setId(75890), ILet(Id("""A"""), ERef(RefId(Id("""__x1__""")))).setId(75891), ILet(Id("""n"""), EINum(0L)).setId(75893), IPrepend(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""argumentsList""")))).setId(75895), ILet(Id("""items"""), ERef(RefId(Id("""argumentsList""")))).setId(75896), IWhile(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""items""")), EStr("""length""")))), ISeq(List(ILet(Id("""E"""), EPop(ERef(RefId(Id("""items"""))), EINum(0L))).setId(75898), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsConcatSpreadable"""))), List(ERef(RefId(Id("""E"""))))).setId(75899), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(75900), IReturn(ERef(RefId(Id("""__x2__""")))).setId(75901)).setId(75902), ISeq(List()).setId(75882)).setId(75903), ILet(Id("""spreadable"""), ERef(RefId(Id("""__x2__""")))).setId(75904), IIf(EBOp(OEq, ERef(RefId(Id("""spreadable"""))), EBool(true)), ISeq(List(ILet(Id("""k"""), EINum(0L)).setId(75906), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""E"""))))).setId(75908), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(75909), IReturn(ERef(RefId(Id("""__x3__""")))).setId(75910)).setId(75911), ISeq(List()).setId(75882)).setId(75912), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(75913), IIf(EBOp(OLt, EBOp(OSub, EINum(9007199254740992L), EINum(1L)), EBOp(OPlus, ERef(RefId(Id("""n"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(75915), IReturn(ERef(RefId(Id("""__x4__""")))).setId(75916))).setId(75917), ISeq(List()).setId(75882)).setId(75918), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(75920), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(75921), IReturn(ERef(RefId(Id("""__x5__""")))).setId(75922)).setId(75923), ISeq(List()).setId(75882)).setId(75924), ILet(Id("""P"""), ERef(RefId(Id("""__x5__""")))).setId(75925), IApp(Id("""__x6__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""E"""))), ERef(RefId(Id("""P"""))))).setId(75927), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(75928), IReturn(ERef(RefId(Id("""__x6__""")))).setId(75929)).setId(75930), ISeq(List()).setId(75882)).setId(75931), ILet(Id("""exists"""), ERef(RefId(Id("""__x6__""")))).setId(75932), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""E"""))), ERef(RefId(Id("""P"""))))).setId(75934), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(75935), IReturn(ERef(RefId(Id("""__x7__""")))).setId(75936)).setId(75937), ISeq(List()).setId(75882)).setId(75938), ILet(Id("""subElement"""), ERef(RefId(Id("""__x7__""")))).setId(75939), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(75941), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(75942), IReturn(ERef(RefId(Id("""__x8__""")))).setId(75943)).setId(75944), ISeq(List()).setId(75882)).setId(75945), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""subElement"""))))).setId(75946), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(75947), IReturn(ERef(RefId(Id("""__x9__""")))).setId(75948)).setId(75949), ISeq(List()).setId(75882)).setId(75950), IExpr(ERef(RefId(Id("""__x9__""")))).setId(75951))).setId(75953), ISeq(List()).setId(75882)).setId(75954), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(75956), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(75958))).setId(75960)).setId(75961))).setId(75963), ISeq(List(IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""n"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(75964), IReturn(ERef(RefId(Id("""__x10__""")))).setId(75965))).setId(75966), ISeq(List()).setId(75882)).setId(75967), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(75969), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(75970), IReturn(ERef(RefId(Id("""__x11__""")))).setId(75971)).setId(75972), ISeq(List()).setId(75882)).setId(75973), IApp(Id("""__x12__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x11__"""))), ERef(RefId(Id("""E"""))))).setId(75974), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(75975), IReturn(ERef(RefId(Id("""__x12__""")))).setId(75976)).setId(75977), ISeq(List()).setId(75882)).setId(75978), IExpr(ERef(RefId(Id("""__x12__""")))).setId(75979), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(75981))).setId(75983)).setId(75984))).setId(75986)).setId(75987), IApp(Id("""__x13__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""n"""))), EBool(true))).setId(75989), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(75990), IReturn(ERef(RefId(Id("""__x13__""")))).setId(75991)).setId(75992), ISeq(List()).setId(75882)).setId(75993), IExpr(ERef(RefId(Id("""__x13__""")))).setId(75994), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(75996), IReturn(ERef(RefId(Id("""__x14__""")))).setId(75997))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.concat" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ArraySpeciesCreate O 0i)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let A = __x1__
    let n = 0i
    prepend O -> argumentsList
    let items = argumentsList
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x2__ = (IsConcatSpreadable E)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let spreadable = __x2__
      if (= spreadable true) {
        let k = 0i
        app __x3__ = (LengthOfArrayLike E)
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        let len = __x3__
        if (< (- 9007199254740992i 1i) (+ n len)) {
          app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x4__
        } else {}
        while (< k len) {
          app __x5__ = (ToString k)
          if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          let P = __x5__
          app __x6__ = (HasProperty E P)
          if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let exists = __x6__
          if (= exists true) {
            app __x7__ = (Get E P)
            if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
            let subElement = __x7__
            app __x8__ = (ToString n)
            if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
            app __x9__ = (CreateDataPropertyOrThrow A __x8__ subElement)
            if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
            __x9__
          } else {}
          n = (+ n 1i)
          k = (+ k 1i)
        }
      } else {
        if (! (< n (- 9007199254740992i 1i))) {
          app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x10__
        } else {}
        app __x11__ = (ToString n)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        app __x12__ = (CreateDataPropertyOrThrow A __x11__ E)
        if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        __x12__
        n = (+ n 1i)
      }
    }
    app __x13__ = (Set A "length" n true)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    __x13__
    app __x14__ = (WrapCompletion A)
    return __x14__
  }
  */
}
