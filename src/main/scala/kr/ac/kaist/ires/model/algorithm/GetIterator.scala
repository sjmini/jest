package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetIterator {
  val length: Int = 1
  val func: Func = Func("""GetIterator""", List(Id("""obj"""), Id("""hint"""), Id("""method""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), EAbsent), IAssign(RefId(Id("""hint""")), ERef(RefId(Id("""CONST_sync""")))).setId(7039), ISeq(List()).setId(7116)).setId(7042), IIf(EBOp(OEq, ERef(RefId(Id("""method"""))), EAbsent), IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_asyncIterator"""))))).setId(7044), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(7045), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7046)).setId(7047), ISeq(List()).setId(7122)).setId(7048), IAssign(RefId(Id("""method""")), ERef(RefId(Id("""__x0__""")))).setId(7049), IIf(EBOp(OEq, ERef(RefId(Id("""method"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_iterator"""))))).setId(7051), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(7052), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7053)).setId(7054), ISeq(List()).setId(7129)).setId(7055), ILet(Id("""syncMethod"""), ERef(RefId(Id("""__x1__""")))).setId(7056), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""CONST_sync"""))), ERef(RefId(Id("""syncMethod"""))))).setId(7058), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(7059), IReturn(ERef(RefId(Id("""__x2__""")))).setId(7060)).setId(7061), ISeq(List()).setId(7136)).setId(7062), ILet(Id("""syncIteratorRecord"""), ERef(RefId(Id("""__x2__""")))).setId(7063), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateAsyncFromSyncIterator"""))), List(ERef(RefId(Id("""syncIteratorRecord"""))))).setId(7065), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(7066), IReturn(ERef(RefId(Id("""__x3__""")))).setId(7067)).setId(7068), ISeq(List()).setId(7143)).setId(7069), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(7070), IReturn(ERef(RefId(Id("""__x4__""")))).setId(7071))).setId(7147), ISeq(List()).setId(7148)).setId(7074))).setId(7150), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""SYMBOL_iterator"""))))).setId(7077), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(7078), IReturn(ERef(RefId(Id("""__x5__""")))).setId(7079)).setId(7080), ISeq(List()).setId(7155)).setId(7081), IAssign(RefId(Id("""method""")), ERef(RefId(Id("""__x5__""")))).setId(7082))).setId(7158)).setId(7084), ISeq(List()).setId(7160)).setId(7087), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""method"""))), ERef(RefId(Id("""obj"""))))).setId(7089), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(7090), IReturn(ERef(RefId(Id("""__x6__""")))).setId(7091)).setId(7092), ISeq(List()).setId(7166)).setId(7093), ILet(Id("""iterator"""), ERef(RefId(Id("""__x6__""")))).setId(7094), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""iterator"""))))).setId(7096), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(7097), IReturn(ERef(RefId(Id("""__x8__""")))).setId(7098))).setId(7172), ISeq(List()).setId(7173)).setId(7100), IApp(Id("""__x9__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""iterator"""))), EStr("""next"""))).setId(7102), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(7103), IReturn(ERef(RefId(Id("""__x9__""")))).setId(7104)).setId(7105), ISeq(List()).setId(7179)).setId(7106), ILet(Id("""nextMethod"""), ERef(RefId(Id("""__x9__""")))).setId(7107), ILet(Id("""iteratorRecord"""), EMap(Ty("""Record"""), List((EStr("""Iterator"""), ERef(RefId(Id("""iterator""")))), (EStr("""NextMethod"""), ERef(RefId(Id("""nextMethod""")))), (EStr("""Done"""), EBool(false))))).setId(7109), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(7111), IReturn(ERef(RefId(Id("""__x10__""")))).setId(7112))).setId(7185))
  val instToStepMap: Map[Int, Int] = HashMap(7096 -> 17, 7107 -> 18, 7051 -> 12, 7110 -> 19, 7065 -> 12, 7077 -> 13, 7049 -> 12, 7100 -> 17, 7072 -> 12, 7040 -> 0, 7083 -> 13, 7064 -> 12, 7043 -> 1, 7075 -> 12, 7112 -> 20, 7042 -> 1, 7084 -> 13, 7097 -> 16, 7063 -> 12, 7095 -> 15, 7101 -> 17, 7111 -> 20, 7069 -> 12, 7086 -> 13, 7106 -> 18, 7074 -> 12, 7073 -> 12, 7041 -> 2, 7109 -> 19, 7094 -> 15, 7062 -> 12, 7113 -> 20, 7098 -> 16, 7102 -> 18, 7070 -> 12, 7087 -> 14, 7085 -> 13, 7058 -> 12, 7055 -> 12, 7099 -> 16, 7089 -> 15, 7044 -> 12, 7082 -> 13, 7039 -> 0, 7093 -> 15, 7048 -> 12, 7081 -> 13, 7050 -> 12, 7076 -> 12, 7071 -> 12, 7088 -> 14, 7056 -> 12, 7108 -> 18, 7057 -> 12)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(7040, 7039), 10 -> HashSet(7051, 7055, 7056, 7057), 14 -> HashSet(7087, 7088), 20 -> HashSet(7112, 7111, 7113), 1 -> HashSet(7043, 7042), 13 -> HashSet(7083, 7084, 7086, 7077, 7085, 7082, 7081), 2 -> HashSet(7041), 17 -> HashSet(7100, 7096, 7101), 12 -> HashSet(7072, 7064, 7075, 7051, 7063, 7065, 7069, 7074, 7073, 7062, 7049, 7070, 7044, 7048, 7071, 7058, 7055, 7050, 7076, 7056, 7057), 7 -> HashSet(7049, 7044, 7048, 7050), 18 -> HashSet(7107, 7106, 7102, 7108), 16 -> HashSet(7097, 7098, 7099), 11 -> HashSet(7064, 7063, 7062, 7058), 19 -> HashSet(7110, 7109), 15 -> HashSet(7095, 7094, 7089, 7093))
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
