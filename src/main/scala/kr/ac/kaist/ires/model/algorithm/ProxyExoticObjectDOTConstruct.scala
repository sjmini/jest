package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTConstruct {
  val length: Int = 2
  val func: Func = Func("""ProxyExoticObject.Construct""", List(Id("""O"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(61007), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61009), IReturn(ERef(RefId(Id("""__x0__""")))).setId(61010))).setId(61062), ISeq(List()).setId(61063)).setId(61013), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(61015), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""construct"""))).setId(61017), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(61018), IReturn(ERef(RefId(Id("""__x1__""")))).setId(61019)).setId(61020), ISeq(List()).setId(61070)).setId(61021), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(61022), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""argumentsList"""))), ERef(RefId(Id("""newTarget"""))))).setId(61024), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(61025), IReturn(ERef(RefId(Id("""__x2__""")))).setId(61026)).setId(61027), ISeq(List()).setId(61077)).setId(61028), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(61029), IReturn(ERef(RefId(Id("""__x3__""")))).setId(61030))).setId(61081), ISeq(List()).setId(61082)).setId(61033), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""argumentsList"""))))).setId(61035), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(61036), IReturn(ERef(RefId(Id("""__x4__""")))).setId(61037)).setId(61038), ISeq(List()).setId(61088)).setId(61039), ILet(Id("""argArray"""), ERef(RefId(Id("""__x4__""")))).setId(61040), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""argArray"""))), ERef(RefId(Id("""newTarget"""))))))).setId(61042), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(61043), IReturn(ERef(RefId(Id("""__x5__""")))).setId(61044)).setId(61045), ISeq(List()).setId(61095)).setId(61046), ILet(Id("""newObj"""), ERef(RefId(Id("""__x5__""")))).setId(61047), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""newObj"""))))).setId(61049), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61050), IReturn(ERef(RefId(Id("""__x7__""")))).setId(61051))).setId(61101), ISeq(List()).setId(61102)).setId(61053), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""newObj"""))))).setId(61055), IReturn(ERef(RefId(Id("""__x8__""")))).setId(61056))).setId(61106))
  val instToStepMap: Map[Int, Int] = HashMap(61051 -> 13, 61007 -> 0, 61048 -> 12, 61012 -> 5, 61052 -> 13, 61034 -> 10, 61024 -> 9, 61053 -> 14, 61033 -> 10, 61040 -> 11, 61042 -> 12, 61050 -> 13, 61014 -> 2, 61039 -> 11, 61022 -> 6, 61035 -> 11, 61015 -> 4, 61055 -> 15, 61047 -> 12, 61030 -> 9, 61021 -> 6, 61057 -> 15, 61017 -> 6, 61031 -> 9, 61041 -> 11, 61028 -> 9, 61009 -> 1, 61056 -> 15, 61049 -> 14, 61032 -> 9, 61008 -> 0, 61013 -> 2, 61010 -> 1, 61023 -> 6, 61016 -> 4, 61011 -> 1, 61054 -> 14, 61046 -> 12, 61029 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(61007, 61008), 5 -> HashSet(61012), 10 -> HashSet(61034, 61033), 14 -> HashSet(61049, 61053, 61054), 1 -> HashSet(61009, 61010, 61011), 6 -> HashSet(61022, 61021, 61017, 61023), 9 -> HashSet(61030, 61031, 61024, 61028, 61032, 61029), 13 -> HashSet(61051, 61052, 61050), 2 -> HashSet(61013, 61014), 12 -> HashSet(61048, 61047, 61042, 61046), 3 -> HashSet(61012), 11 -> HashSet(61039, 61035, 61041, 61040), 4 -> HashSet(61015, 61016), 15 -> HashSet(61055, 61057, 61056))
  /* Beautified form:
  "ProxyExoticObject.Construct" (O, argumentsList, newTarget) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "construct")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (Construct target argumentsList newTarget)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (CreateArrayFromList argumentsList)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let argArray = __x4__
    app __x5__ = (Call trap handler (new [target, argArray, newTarget]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let newObj = __x5__
    app __x6__ = (Type newObj)
    if (! (= __x6__ Object)) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion newObj)
    return __x8__
  }
  */
}
