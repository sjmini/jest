package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateUnmappedArgumentsObject {
  val length: Int = 1
  val func: Func = Func("""CreateUnmappedArgumentsObject""", List(Id("""argumentsList""")), None, ISeq(List(ILet(Id("""len"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))).setId(55854), IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))), EList(List(EStr("""ParameterMap"""))))).setId(55856), ILet(Id("""obj"""), ERef(RefId(Id("""__x0__""")))).setId(55857), IAssign(RefProp(RefId(Id("""obj""")), EStr("""ParameterMap""")), EUndef).setId(55859), IApp(Id("""__x1__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""obj"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""len""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(55861), IExpr(ERef(RefId(Id("""__x1__""")))).setId(55862), ILet(Id("""index"""), EINum(0L)).setId(55864), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len""")))), ISeq(List(ILet(Id("""val"""), ERef(RefProp(RefId(Id("""argumentsList""")), ERef(RefId(Id("""index""")))))).setId(55866), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))).setId(55868), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(55869), IReturn(ERef(RefId(Id("""__x2__""")))).setId(55870)).setId(55871), ISeq(List()).setId(55912)).setId(55873), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""val"""))))).setId(55874), IExpr(ERef(RefId(Id("""__x3__""")))).setId(55875), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(55877))).setId(55917)).setId(55880), IApp(Id("""__x4__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_iterator"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""INTRINSIC_ArrayProto_values""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(55882), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(55883), IReturn(ERef(RefId(Id("""__x4__""")))).setId(55884)).setId(55885), ISeq(List()).setId(55923)).setId(55886), IExpr(ERef(RefId(Id("""__x4__""")))).setId(55887), IApp(Id("""__x5__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""obj"""))), EStr("""callee"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Get"""), ERef(RefId(Id("""INTRINSIC_ThrowTypeError""")))), (EStr("""Set"""), ERef(RefId(Id("""INTRINSIC_ThrowTypeError""")))), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(55889), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(55890), IReturn(ERef(RefId(Id("""__x5__""")))).setId(55891)).setId(55892), ISeq(List()).setId(55930)).setId(55893), IExpr(ERef(RefId(Id("""__x5__""")))).setId(55894), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(55896), IReturn(ERef(RefId(Id("""__x6__""")))).setId(55897))).setId(55935))
  val instToStepMap: Map[Int, Int] = HashMap(55867 -> 9, 55862 -> 3, 55894 -> 11, 55876 -> 9, 55866 -> 9, 55863 -> 3, 55873 -> 9, 55864 -> 4, 55868 -> 9, 55855 -> 0, 55881 -> 9, 55886 -> 10, 55854 -> 0, 55875 -> 9, 55879 -> 9, 55859 -> 2, 55880 -> 9, 55895 -> 11, 55860 -> 2, 55898 -> 12, 55897 -> 12, 55888 -> 10, 55865 -> 4, 55893 -> 11, 55856 -> 1, 55861 -> 3, 55882 -> 10, 55857 -> 1, 55889 -> 11, 55877 -> 9, 55896 -> 12, 55874 -> 9, 55887 -> 10, 55878 -> 9, 55858 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(55854, 55855), 10 -> HashSet(55886, 55888, 55882, 55887), 1 -> HashSet(55856, 55857, 55858), 9 -> HashSet(55867, 55875, 55879, 55876, 55866, 55880, 55873, 55877, 55868, 55874, 55881, 55878), 2 -> HashSet(55859, 55860), 12 -> HashSet(55898, 55897, 55896), 7 -> HashSet(55867, 55866), 3 -> HashSet(55862, 55863, 55861), 11 -> HashSet(55894, 55895, 55893, 55889), 8 -> HashSet(55875, 55876, 55873, 55868, 55874), 4 -> HashSet(55865, 55864))
  /* Beautified form:
  "CreateUnmappedArgumentsObject" (argumentsList) => {
    let len = argumentsList["length"]
    app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype (new ["ParameterMap"]))
    let obj = __x0__
    obj["ParameterMap"] = undefined
    app __x1__ = (DefinePropertyOrThrow obj "length" (new PropertyDescriptor("Value" -> len, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    __x1__
    let index = 0i
    while (< index len) {
      let val = argumentsList[index]
      app __x2__ = (ToString index)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (CreateDataProperty obj __x2__ val)
      __x3__
      index = (+ index 1i)
    }
    app __x4__ = (DefinePropertyOrThrow obj SYMBOL_iterator (new PropertyDescriptor("Value" -> INTRINSIC_ArrayProto_values, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    app __x5__ = (DefinePropertyOrThrow obj "callee" (new PropertyDescriptor("Get" -> INTRINSIC_ThrowTypeError, "Set" -> INTRINSIC_ThrowTypeError, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion obj)
    return __x6__
  }
  */
}
