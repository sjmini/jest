package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateMappedArgumentsObject {
  val length: Int = 4
  val func: Func = Func("""CreateMappedArgumentsObject""", List(Id("""func"""), Id("""formals"""), Id("""argumentsList"""), Id("""env""")), None, ISeq(List(ILet(Id("""len"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))).setId(55973), ILet(Id("""obj"""), EMap(Ty("""ArgumentsExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""ParameterMap"""), EUndef)))).setId(55975), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(55977), ISeq(List()).setId(55978)).setId(55979), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(55980), ISeq(List()).setId(55981)).setId(55982), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(55983), ISeq(List()).setId(55984)).setId(55985), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(55986), ISeq(List()).setId(55987)).setId(55988), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(55989), ISeq(List()).setId(55990)).setId(55991), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(55992), ISeq(List()).setId(55993)).setId(55994), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(55995), ISeq(List()).setId(55996)).setId(55997), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(55998), ISeq(List()).setId(55999)).setId(56000), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(56001), ISeq(List()).setId(56002)).setId(56003), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(56004), ISeq(List()).setId(56005)).setId(56006), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""obj""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(56007), ISeq(List()).setId(56008)).setId(56009), IAssign(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTGetOwnProperty""")))).setId(56011), IAssign(RefProp(RefId(Id("""obj""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTDefineOwnProperty""")))).setId(56013), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Get""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTGet""")))).setId(56015), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Set""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTSet""")))).setId(56017), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Delete""")), ERef(RefId(Id("""ArgumentsExoticObjectDOTDelete""")))).setId(56019), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Prototype""")), ERef(RefId(Id("""INTRINSIC_ObjectPrototype""")))).setId(56021), IAssign(RefProp(RefId(Id("""obj""")), EStr("""Extensible""")), EBool(true)).setId(56023), IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ENull)).setId(56025), ILet(Id("""map"""), ERef(RefId(Id("""__x0__""")))).setId(56026), IAssign(RefProp(RefId(Id("""obj""")), EStr("""ParameterMap""")), ERef(RefId(Id("""map""")))).setId(56028), IAccess(Id("""__x1__"""), ERef(RefId(Id("""formals"""))), EStr("""BoundNames""")).setId(56030), ILet(Id("""parameterNames"""), ERef(RefId(Id("""__x1__""")))).setId(56031), ILet(Id("""numberOfParameters"""), ERef(RefProp(RefId(Id("""parameterNames""")), EStr("""length""")))).setId(56033), ILet(Id("""index"""), EINum(0L)).setId(56035), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len""")))), ISeq(List(ILet(Id("""val"""), ERef(RefProp(RefId(Id("""argumentsList""")), ERef(RefId(Id("""index""")))))).setId(56037), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))).setId(56039), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(56040), IReturn(ERef(RefId(Id("""__x2__""")))).setId(56041)).setId(56042), ISeq(List()).setId(55972)).setId(56043), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""val"""))))).setId(56044), IExpr(ERef(RefId(Id("""__x3__""")))).setId(56045), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(56047))).setId(56049)).setId(56050), IApp(Id("""__x4__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""obj"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""len""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(56052), IExpr(ERef(RefId(Id("""__x4__""")))).setId(56053), ILet(Id("""mappedNames"""), EList(List())).setId(56055), ILet(Id("""index"""), EBOp(OSub, ERef(RefId(Id("""numberOfParameters"""))), EINum(1L))).setId(56057), IWhile(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""parameterNames""")), ERef(RefId(Id("""index""")))))).setId(56059), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""mappedNames"""))), ERef(RefId(Id("""name"""))))), ISeq(List(IAppend(ERef(RefId(Id("""name"""))), ERef(RefId(Id("""mappedNames""")))).setId(56061), IIf(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""MakeArgGetter"""))), List(ERef(RefId(Id("""name"""))), ERef(RefId(Id("""env"""))))).setId(56063), ILet(Id("""g"""), ERef(RefId(Id("""__x5__""")))).setId(56064), IApp(Id("""__x6__"""), ERef(RefId(Id("""MakeArgSetter"""))), List(ERef(RefId(Id("""name"""))), ERef(RefId(Id("""env"""))))).setId(56066), ILet(Id("""p"""), ERef(RefId(Id("""__x6__""")))).setId(56067), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))).setId(56069), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(56070), IReturn(ERef(RefId(Id("""__x7__""")))).setId(56071)).setId(56072), ISeq(List()).setId(55972)).setId(56073), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""map""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""__x7__"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Set"""), ERef(RefId(Id("""p""")))), (EStr("""Get"""), ERef(RefId(Id("""g""")))), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(56074), IExpr(ERef(RefId(Id("""__x8__""")))).setId(56075))).setId(56077), ISeq(List()).setId(55972)).setId(56078))).setId(56080), ISeq(List()).setId(55972)).setId(56081), IAssign(RefId(Id("""index""")), EBOp(OSub, ERef(RefId(Id("""index"""))), EINum(1L))).setId(56083))).setId(56085)).setId(56086), IApp(Id("""__x9__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_iterator"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""INTRINSIC_ArrayProto_values""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(56088), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(56089), IReturn(ERef(RefId(Id("""__x9__""")))).setId(56090)).setId(56091), ISeq(List()).setId(55972)).setId(56092), IExpr(ERef(RefId(Id("""__x9__""")))).setId(56093), IApp(Id("""__x10__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""obj"""))), EStr("""callee"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""func""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(56095), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(56096), IReturn(ERef(RefId(Id("""__x10__""")))).setId(56097)).setId(56098), ISeq(List()).setId(55972)).setId(56099), IExpr(ERef(RefId(Id("""__x10__""")))).setId(56100), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(56102), IReturn(ERef(RefId(Id("""__x11__""")))).setId(56103))).setId(-1))
  /* Beautified form:
  "CreateMappedArgumentsObject" (func, formals, argumentsList, env) => {
    let len = argumentsList["length"]
    let obj = (new ArgumentsExoticObject("SubMap" -> (new SubMap()), "ParameterMap" -> undefined))
    if (= obj["HasProperty"] absent) obj["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= obj["DefineOwnProperty"] absent) obj["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= obj["Set"] absent) obj["Set"] = OrdinaryObjectDOTSet else {}
    if (= obj["SetPrototypeOf"] absent) obj["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= obj["Get"] absent) obj["Get"] = OrdinaryObjectDOTGet else {}
    if (= obj["PreventExtensions"] absent) obj["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= obj["Delete"] absent) obj["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= obj["GetOwnProperty"] absent) obj["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= obj["OwnPropertyKeys"] absent) obj["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= obj["GetPrototypeOf"] absent) obj["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= obj["IsExtensible"] absent) obj["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    obj["GetOwnProperty"] = ArgumentsExoticObjectDOTGetOwnProperty
    obj["DefineOwnProperty"] = ArgumentsExoticObjectDOTDefineOwnProperty
    obj["Get"] = ArgumentsExoticObjectDOTGet
    obj["Set"] = ArgumentsExoticObjectDOTSet
    obj["Delete"] = ArgumentsExoticObjectDOTDelete
    obj["Prototype"] = INTRINSIC_ObjectPrototype
    obj["Extensible"] = true
    app __x0__ = (ObjectCreate null)
    let map = __x0__
    obj["ParameterMap"] = map
    access __x1__ = (formals "BoundNames")
    let parameterNames = __x1__
    let numberOfParameters = parameterNames["length"]
    let index = 0i
    while (< index len) {
      let val = argumentsList[index]
      app __x2__ = (ToString index)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (CreateDataProperty obj __x2__ val)
      __x3__
      index = (+ index 1i)
    }
    app __x4__ = (DefinePropertyOrThrow obj "length" (new PropertyDescriptor("Value" -> len, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    __x4__
    let mappedNames = (new [])
    let index = (- numberOfParameters 1i)
    while (! (< index 0i)) {
      let name = parameterNames[index]
      if (! (contains mappedNames name)) {
        append name -> mappedNames
        if (< index len) {
          app __x5__ = (MakeArgGetter name env)
          let g = __x5__
          app __x6__ = (MakeArgSetter name env)
          let p = __x6__
          app __x7__ = (ToString index)
          if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          app __x8__ = (map["DefineOwnProperty"] map __x7__ (new PropertyDescriptor("Set" -> p, "Get" -> g, "Enumerable" -> false, "Configurable" -> true)))
          __x8__
        } else {}
      } else {}
      index = (- index 1i)
    }
    app __x9__ = (DefinePropertyOrThrow obj SYMBOL_iterator (new PropertyDescriptor("Value" -> INTRINSIC_ArrayProto_values, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (DefinePropertyOrThrow obj "callee" (new PropertyDescriptor("Value" -> func, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true)))
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    __x10__
    app __x11__ = (WrapCompletion obj)
    return __x11__
  }
  */
}
