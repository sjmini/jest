package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectDefineProperties {
  val length: Int = 2
  val func: Func = Func("""ObjectDefineProperties""", List(Id("""O"""), Id("""Properties""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(63893), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(63894), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63895))).setId(63978), ISeq(List()).setId(63979)).setId(63898), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""Properties"""))))).setId(63900), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(63901), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63902)).setId(63903), ISeq(List()).setId(63985)).setId(63904), ILet(Id("""props"""), ERef(RefId(Id("""__x2__""")))).setId(63905), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""props""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""props"""))))).setId(63907), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(63908), IReturn(ERef(RefId(Id("""__x3__""")))).setId(63909)).setId(63910), ISeq(List()).setId(63992)).setId(63911), ILet(Id("""keys"""), ERef(RefId(Id("""__x3__""")))).setId(63912), ILet(Id("""descriptors"""), EList(List())).setId(63914), ILet(Id("""__x4__"""), ERef(RefId(Id("""keys""")))).setId(63943), ILet(Id("""__x5__"""), EINum(0L)).setId(63944), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""nextKey"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(63945), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""props""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""props"""))), ERef(RefId(Id("""nextKey"""))))).setId(63916), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(63917), IReturn(ERef(RefId(Id("""__x6__""")))).setId(63918)).setId(63919), ISeq(List()).setId(64003)).setId(63920), ILet(Id("""propDesc"""), ERef(RefId(Id("""__x6__""")))).setId(63921), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""propDesc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""propDesc""")), EStr("""Enumerable"""))), EBool(true))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""props"""))), ERef(RefId(Id("""nextKey"""))))).setId(63923), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(63924), IReturn(ERef(RefId(Id("""__x7__""")))).setId(63925)).setId(63926), ISeq(List()).setId(64010)).setId(63927), ILet(Id("""descObj"""), ERef(RefId(Id("""__x7__""")))).setId(63928), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToPropertyDescriptor"""))), List(ERef(RefId(Id("""descObj"""))))).setId(63930), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(63931), IReturn(ERef(RefId(Id("""__x8__""")))).setId(63932)).setId(63933), ISeq(List()).setId(64017)).setId(63934), ILet(Id("""desc"""), ERef(RefId(Id("""__x8__""")))).setId(63935), IAppend(EList(List(ERef(RefId(Id("""nextKey"""))), ERef(RefId(Id("""desc"""))))), ERef(RefId(Id("""descriptors""")))).setId(63937))).setId(64021), ISeq(List()).setId(64022)).setId(63940), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(63946))).setId(64025)).setId(63948), ILet(Id("""__x9__"""), ERef(RefId(Id("""descriptors""")))).setId(63963), ILet(Id("""__x10__"""), EINum(0L)).setId(63964), IWhile(EBOp(OLt, ERef(RefId(Id("""__x10__"""))), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""length""")))), ISeq(List(ILet(Id("""pair"""), ERef(RefProp(RefId(Id("""__x9__""")), ERef(RefId(Id("""__x10__""")))))).setId(63965), ILet(Id("""P"""), ERef(RefProp(RefId(Id("""pair""")), EINum(0L)))).setId(63951), ILet(Id("""desc"""), ERef(RefProp(RefId(Id("""pair""")), EINum(1L)))).setId(63953), IApp(Id("""__x11__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""desc"""))))).setId(63955), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(63956), IReturn(ERef(RefId(Id("""__x11__""")))).setId(63957)).setId(63958), ISeq(List()).setId(64036)).setId(63959), IExpr(ERef(RefId(Id("""__x11__""")))).setId(63960), IAssign(RefId(Id("""__x10__""")), EBOp(OPlus, ERef(RefId(Id("""__x10__"""))), EINum(1L))).setId(63966))).setId(64040)).setId(63968), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(63971), IReturn(ERef(RefId(Id("""__x12__""")))).setId(63972))).setId(64044))
  val instToStepMap: Map[Int, Int] = HashMap(63914 -> 4, 63968 -> 17, 63973 -> 18, 63962 -> 17, 63916 -> 12, 63960 -> 17, 63964 -> 17, 63912 -> 3, 63940 -> 12, 63949 -> 12, 63899 -> 1, 63963 -> 17, 63894 -> 0, 63905 -> 2, 63941 -> 12, 63922 -> 12, 63937 -> 12, 63954 -> 17, 63969 -> 17, 63898 -> 1, 63913 -> 3, 63895 -> 0, 63927 -> 12, 63952 -> 17, 63930 -> 12, 63923 -> 12, 63936 -> 12, 63955 -> 17, 63942 -> 12, 63904 -> 2, 63906 -> 2, 63959 -> 17, 63938 -> 12, 63970 -> 17, 63929 -> 12, 63948 -> 12, 63961 -> 17, 63896 -> 0, 63911 -> 3, 63928 -> 12, 63951 -> 17, 63935 -> 12, 63971 -> 18, 63907 -> 3, 63939 -> 12, 63920 -> 12, 63943 -> 12, 63900 -> 2, 63915 -> 4, 63950 -> 12, 63953 -> 17, 63944 -> 12, 63972 -> 18, 63893 -> 1, 63921 -> 12, 63934 -> 12)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(63894, 63895, 63896), 10 -> HashSet(63927, 63923, 63929, 63928), 1 -> HashSet(63899, 63898, 63893), 2 -> HashSet(63905, 63900, 63904, 63906), 17 -> HashSet(63963, 63968, 63952, 63962, 63955, 63961, 63951, 63960, 63964, 63953, 63954, 63969, 63959, 63970), 12 -> HashSet(63949, 63941, 63942, 63938, 63916, 63928, 63935, 63939, 63950, 63940, 63944, 63922, 63937, 63927, 63930, 63923, 63936, 63929, 63948, 63920, 63943, 63921, 63934), 7 -> HashSet(63922, 63916, 63920, 63921), 3 -> HashSet(63913, 63911, 63907, 63912), 18 -> HashSet(63973, 63971, 63972), 16 -> HashSet(63954, 63953), 11 -> HashSet(63930, 63936, 63935, 63934), 4 -> HashSet(63914, 63915), 15 -> HashSet(63952, 63951))
  /* Beautified form:
  "ObjectDefineProperties" (O, Properties) => {
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (ToObject Properties)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let props = __x2__
    app __x3__ = (props["OwnPropertyKeys"] props)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let keys = __x3__
    let descriptors = (new [])
    let __x4__ = keys
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let nextKey = __x4__[__x5__]
      app __x6__ = (props["GetOwnProperty"] props nextKey)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let propDesc = __x6__
      if (&& (! (= propDesc undefined)) (= propDesc["Enumerable"] true)) {
        app __x7__ = (Get props nextKey)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let descObj = __x7__
        app __x8__ = (ToPropertyDescriptor descObj)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let desc = __x8__
        append (new [nextKey, desc]) -> descriptors
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    let __x9__ = descriptors
    let __x10__ = 0i
    while (< __x10__ __x9__["length"]) {
      let pair = __x9__[__x10__]
      let P = pair[0i]
      let desc = pair[1i]
      app __x11__ = (DefinePropertyOrThrow O P desc)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      __x10__ = (+ __x10__ 1i)
    }
    app __x12__ = (WrapCompletion O)
    return __x12__
  }
  */
}
