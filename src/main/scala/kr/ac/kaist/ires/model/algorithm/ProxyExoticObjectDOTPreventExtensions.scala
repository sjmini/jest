package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTPreventExtensions {
  val length: Int = 0
  val func: Func = Func("""ProxyExoticObject.PreventExtensions""", List(Id("""O""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(58919), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(58921), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58922))).setId(58981), ISeq(List()).setId(58982)).setId(58925), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(58927), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""preventExtensions"""))).setId(58929), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(58930), IReturn(ERef(RefId(Id("""__x1__""")))).setId(58931)).setId(58932), ISeq(List()).setId(58989)).setId(58933), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(58934), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""PreventExtensions"""))), List(ERef(RefId(Id("""target"""))))).setId(58936), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(58937), IReturn(ERef(RefId(Id("""__x2__""")))).setId(58938)).setId(58939), ISeq(List()).setId(58996)).setId(58940), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(58941), IReturn(ERef(RefId(Id("""__x3__""")))).setId(58942))).setId(59000), ISeq(List()).setId(59001)).setId(58945), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))))))).setId(58947), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(58948), IReturn(ERef(RefId(Id("""__x4__""")))).setId(58949)).setId(58950), ISeq(List()).setId(59007)).setId(58951), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(58952), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(58953), IReturn(ERef(RefId(Id("""__x5__""")))).setId(58954)).setId(58955), ISeq(List()).setId(59013)).setId(58956), ILet(Id("""booleanTrapResult"""), ERef(RefId(Id("""__x5__""")))).setId(58957), IIf(EBOp(OEq, ERef(RefId(Id("""booleanTrapResult"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(58959), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(58960), IReturn(ERef(RefId(Id("""__x6__""")))).setId(58961)).setId(58962), ISeq(List()).setId(59020)).setId(58963), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x6__""")))).setId(58964), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(58966), IReturn(ERef(RefId(Id("""__x7__""")))).setId(58967))).setId(59025), ISeq(List()).setId(59026)).setId(58969))).setId(59028), ISeq(List()).setId(59029)).setId(58972), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""booleanTrapResult"""))))).setId(58974), IReturn(ERef(RefId(Id("""__x8__""")))).setId(58975))).setId(59033))
  val instToStepMap: Map[Int, Int] = HashMap(58946 -> 9, 58923 -> 1, 58976 -> 16, 58952 -> 10, 58921 -> 1, 58928 -> 4, 58936 -> 8, 58968 -> 14, 58971 -> 14, 58933 -> 5, 58959 -> 14, 58963 -> 14, 58974 -> 16, 58970 -> 14, 58941 -> 8, 58926 -> 2, 58965 -> 14, 58934 -> 5, 58919 -> 0, 58973 -> 15, 58958 -> 10, 58947 -> 10, 58940 -> 8, 58969 -> 14, 58922 -> 1, 58944 -> 8, 58951 -> 10, 58966 -> 14, 58925 -> 2, 58929 -> 5, 58924 -> 3, 58956 -> 10, 58920 -> 0, 58957 -> 10, 58967 -> 14, 58935 -> 5, 58972 -> 15, 58975 -> 16, 58945 -> 9, 58964 -> 14, 58943 -> 8, 58942 -> 8, 58927 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(58919, 58920), 5 -> HashSet(58933, 58934, 58929, 58935), 10 -> HashSet(58951, 58952, 58958, 58947, 58956, 58957), 14 -> HashSet(58959, 58963, 58970, 58965, 58969, 58966, 58967, 58964, 58968, 58971), 1 -> HashSet(58923, 58922, 58921), 9 -> HashSet(58946, 58945), 13 -> HashSet(58959, 58963, 58965, 58964), 2 -> HashSet(58926, 58925), 3 -> HashSet(58924), 16 -> HashSet(58974, 58976, 58975), 8 -> HashSet(58941, 58940, 58944, 58943, 58936, 58942), 4 -> HashSet(58928, 58927), 15 -> HashSet(58973, 58972))
  /* Beautified form:
  "ProxyExoticObject.PreventExtensions" (O) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "preventExtensions")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["PreventExtensions"] target)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (ToBoolean __x4__)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let booleanTrapResult = __x5__
    if (= booleanTrapResult true) {
      app __x6__ = (IsExtensible target)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let extensibleTarget = __x6__
      if (= extensibleTarget true) {
        app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x7__
      } else {}
    } else {}
    app __x8__ = (WrapCompletion booleanTrapResult)
    return __x8__
  }
  */
}
