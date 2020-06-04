package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FlattenIntoArray {
  val length: Int = 5
  val func: Func = Func("""FlattenIntoArray""", List(Id("""target"""), Id("""source"""), Id("""sourceLen"""), Id("""start"""), Id("""depth"""), Id("""mapperFunction"""), Id("""thisArg""")), None, ISeq(List(ILet(Id("""targetIndex"""), ERef(RefId(Id("""start""")))).setId(8950), ILet(Id("""sourceIndex"""), EINum(0L)).setId(8952), IWhile(EBOp(OLt, ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""sourceLen""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""sourceIndex"""))))).setId(8954), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(8955), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8956)).setId(8957), ISeq(List()).setId(8949)).setId(8958), ILet(Id("""P"""), ERef(RefId(Id("""__x0__""")))).setId(8959), IApp(Id("""__x1__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))).setId(8961), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(8962), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8963)).setId(8964), ISeq(List()).setId(8949)).setId(8965), ILet(Id("""exists"""), ERef(RefId(Id("""__x1__""")))).setId(8966), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))).setId(8968), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(8969), IReturn(ERef(RefId(Id("""__x2__""")))).setId(8970)).setId(8971), ISeq(List()).setId(8949)).setId(8972), ILet(Id("""element"""), ERef(RefId(Id("""__x2__""")))).setId(8973), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""mapperFunction"""))), EAbsent)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""mapperFunction"""))), ERef(RefId(Id("""thisArg"""))), EList(List(ERef(RefId(Id("""element"""))), ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""source"""))))))).setId(8975), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(8976), IReturn(ERef(RefId(Id("""__x3__""")))).setId(8977)).setId(8978), ISeq(List()).setId(8949)).setId(8979), IAssign(RefId(Id("""element""")), ERef(RefId(Id("""__x3__""")))).setId(8980))).setId(8982), ISeq(List()).setId(8949)).setId(8983), ILet(Id("""shouldFlatten"""), EBool(false)).setId(8985), IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""depth""")))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""element"""))))).setId(8987), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(8988), IReturn(ERef(RefId(Id("""__x4__""")))).setId(8989)).setId(8990), ISeq(List()).setId(8949)).setId(8991), IAssign(RefId(Id("""shouldFlatten""")), ERef(RefId(Id("""__x4__""")))).setId(8992))).setId(8994), ISeq(List()).setId(8949)).setId(8995), IIf(EBOp(OEq, ERef(RefId(Id("""shouldFlatten"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""element"""))))).setId(8997), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(8998), IReturn(ERef(RefId(Id("""__x5__""")))).setId(8999)).setId(9000), ISeq(List()).setId(8949)).setId(9001), ILet(Id("""elementLen"""), ERef(RefId(Id("""__x5__""")))).setId(9002), IApp(Id("""__x6__"""), ERef(RefId(Id("""FlattenIntoArray"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""element"""))), ERef(RefId(Id("""elementLen"""))), ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, ERef(RefId(Id("""depth"""))), EINum(1L)))).setId(9004), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(9005), IReturn(ERef(RefId(Id("""__x6__""")))).setId(9006)).setId(9007), ISeq(List()).setId(8949)).setId(9008), IAssign(RefId(Id("""targetIndex""")), ERef(RefId(Id("""__x6__""")))).setId(9009))).setId(9011), ISeq(List(IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(9012), IReturn(ERef(RefId(Id("""__x7__""")))).setId(9013))).setId(9014), ISeq(List()).setId(8949)).setId(9015), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""targetIndex"""))))).setId(9017), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(9018), IReturn(ERef(RefId(Id("""__x8__""")))).setId(9019)).setId(9020), ISeq(List()).setId(8949)).setId(9021), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""element"""))))).setId(9022), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(9023), IReturn(ERef(RefId(Id("""__x9__""")))).setId(9024)).setId(9025), ISeq(List()).setId(8949)).setId(9026), IExpr(ERef(RefId(Id("""__x9__""")))).setId(9027), IAssign(RefId(Id("""targetIndex""")), EBOp(OPlus, ERef(RefId(Id("""targetIndex"""))), EINum(1L))).setId(9029))).setId(9031)).setId(9032))).setId(9034), ISeq(List()).setId(8949)).setId(9035), IAssign(RefId(Id("""sourceIndex""")), EBOp(OPlus, ERef(RefId(Id("""sourceIndex"""))), EINum(1L))).setId(9037))).setId(9039)).setId(9040), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""targetIndex"""))))).setId(9042), IReturn(ERef(RefId(Id("""__x10__""")))).setId(9043))).setId(-1))
  /* Beautified form:
  "FlattenIntoArray" (target, source, sourceLen, start, depth, mapperFunction, thisArg) => {
    let targetIndex = start
    let sourceIndex = 0i
    while (< sourceIndex sourceLen) {
      app __x0__ = (ToString sourceIndex)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let P = __x0__
      app __x1__ = (HasProperty source P)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let exists = __x1__
      if (= exists true) {
        app __x2__ = (Get source P)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let element = __x2__
        if (! (= mapperFunction absent)) {
          app __x3__ = (Call mapperFunction thisArg (new [element, sourceIndex, source]))
          if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
          element = __x3__
        } else {}
        let shouldFlatten = false
        if (< 0i depth) {
          app __x4__ = (IsArray element)
          if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
          shouldFlatten = __x4__
        } else {}
        if (= shouldFlatten true) {
          app __x5__ = (LengthOfArrayLike element)
          if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          let elementLen = __x5__
          app __x6__ = (FlattenIntoArray target element elementLen targetIndex (- depth 1i))
          if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          targetIndex = __x6__
        } else {
          if (! (< targetIndex (- 9007199254740992i 1i))) {
            app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x7__
          } else {}
          app __x8__ = (ToString targetIndex)
          if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
          app __x9__ = (CreateDataPropertyOrThrow target __x8__ element)
          if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
          __x9__
          targetIndex = (+ targetIndex 1i)
        }
      } else {}
      sourceIndex = (+ sourceIndex 1i)
    }
    app __x10__ = (WrapCompletion targetIndex)
    return __x10__
  }
  */
}
