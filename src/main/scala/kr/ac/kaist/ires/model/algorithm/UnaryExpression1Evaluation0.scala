package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression1Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(19104), ILet(Id("""ref"""), ERef(RefId(Id("""__x0__""")))).setId(19105), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""ref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""ref""")), ERef(RefProp(RefId(Id("""ref""")), EStr("""Value""")))).setId(19107), IReturn(ERef(RefId(Id("""ref""")))).setId(19108)).setId(19109), ISeq(List()).setId(19187)).setId(19111), IExpr(ERef(RefId(Id("""ref""")))).setId(19112), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""ref"""))))).setId(19114), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Reference"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(19115), IReturn(ERef(RefId(Id("""__x2__""")))).setId(19116))).setId(19193), ISeq(List()).setId(19194)).setId(19118), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""ref"""))))).setId(19120), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(19121), IReturn(ERef(RefId(Id("""__x4__""")))).setId(19122))).setId(19199), ISeq(List()).setId(19200)).setId(19125), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""ref"""))))).setId(19127), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsSuperReference"""))), List(ERef(RefId(Id("""ref"""))))).setId(19128), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(19129), IReturn(ERef(RefId(Id("""__x7__""")))).setId(19130))).setId(19206), ISeq(List()).setId(19207)).setId(19132), IApp(Id("""__x8__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""ref"""))))).setId(19134), IApp(Id("""__x9__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(19135), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(19136), IReturn(ERef(RefId(Id("""__x9__""")))).setId(19137)).setId(19138), ISeq(List()).setId(19214)).setId(19139), ILet(Id("""baseObj"""), ERef(RefId(Id("""__x9__""")))).setId(19140), IApp(Id("""__x10__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""ref"""))))).setId(19142), IApp(Id("""__x11__"""), ERef(RefProp(RefId(Id("""baseObj""")), EStr("""Delete"""))), List(ERef(RefId(Id("""baseObj"""))), ERef(RefId(Id("""__x10__"""))))).setId(19143), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(19144), IReturn(ERef(RefId(Id("""__x11__""")))).setId(19145)).setId(19146), ISeq(List()).setId(19222)).setId(19147), ILet(Id("""deleteStatus"""), ERef(RefId(Id("""__x11__""")))).setId(19148), ILet(Id("""__x12__"""), EBOp(OEq, ERef(RefId(Id("""deleteStatus"""))), EBool(false))).setId(19155), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""ref"""))))).setId(19150), IAssign(RefId(Id("""__x12__""")), EBOp(OEq, ERef(RefId(Id("""__x13__"""))), EBool(true))).setId(19153))).setId(19228), ISeq(List()).setId(19229)).setId(19156), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(19157), IReturn(ERef(RefId(Id("""__x14__""")))).setId(19158))).setId(19233), ISeq(List()).setId(19234)).setId(19160), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""deleteStatus"""))))).setId(19162), IReturn(ERef(RefId(Id("""__x15__""")))).setId(19163))).setId(19238), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""ref"""))))).setId(19166), ILet(Id("""bindings"""), ERef(RefId(Id("""__x16__""")))).setId(19167), IApp(Id("""__x17__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""ref"""))))).setId(19169), IApp(Id("""__x18__"""), ERef(RefProp(RefId(Id("""bindings""")), EStr("""DeleteBinding"""))), List(ERef(RefId(Id("""bindings"""))), ERef(RefId(Id("""__x17__"""))))).setId(19170), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))).setId(19171), IReturn(ERef(RefId(Id("""__x18__""")))).setId(19172)).setId(19173), ISeq(List()).setId(19246)).setId(19174), IApp(Id("""__x19__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x18__"""))))).setId(19175), IReturn(ERef(RefId(Id("""__x19__""")))).setId(19176))).setId(19250)).setId(19179))).setId(19252))
  val instToStepMap: Map[Int, Int] = HashMap(19123 -> 7, 19155 -> 17, 19113 -> 1, 19139 -> 17, 19114 -> 3, 19166 -> 22, 19149 -> 17, 19121 -> 7, 19157 -> 15, 19135 -> 17, 19116 -> 2, 19148 -> 17, 19117 -> 2, 19127 -> 22, 19142 -> 17, 19174 -> 22, 19110 -> 22, 19159 -> 15, 19180 -> 22, 19120 -> 8, 19140 -> 17, 19130 -> 11, 19165 -> 17, 19177 -> 22, 19158 -> 15, 19122 -> 7, 19126 -> 8, 19162 -> 17, 19131 -> 11, 19134 -> 17, 19178 -> 22, 19163 -> 17, 19170 -> 22, 19176 -> 22, 19112 -> 1, 19125 -> 8, 19179 -> 22, 19167 -> 22, 19118 -> 3, 19147 -> 17, 19106 -> 0, 19115 -> 2, 19133 -> 17, 19169 -> 22, 19164 -> 17, 19132 -> 17, 19104 -> 0, 19111 -> 1, 19160 -> 17, 19128 -> 17, 19175 -> 22, 19141 -> 17, 19143 -> 17, 19156 -> 17, 19124 -> 7, 19161 -> 17, 19105 -> 0, 19119 -> 3, 19129 -> 11, 19168 -> 22)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(19106, 19104, 19105), 14 -> HashSet(19148, 19142, 19149, 19147, 19143), 20 -> HashSet(19110), 1 -> HashSet(19113, 19112, 19111), 6 -> HashSet(19110), 21 -> HashSet(19166, 19167, 19168), 13 -> HashSet(19140, 19139, 19134, 19135, 19141), 2 -> HashSet(19117, 19115, 19116), 17 -> HashSet(19148, 19142, 19155, 19140, 19165, 19139, 19162, 19149, 19134, 19163, 19135, 19147, 19156, 19161, 19133, 19164, 19132, 19160, 19128, 19141, 19143), 22 -> HashSet(19127, 19177, 19166, 19178, 19170, 19176, 19179, 19167, 19169, 19175, 19168, 19174, 19110, 19180), 12 -> HashSet(19128, 19133, 19132), 7 -> HashSet(19110, 19123, 19122, 19121, 19124), 3 -> HashSet(19114, 19118, 19119), 16 -> HashSet(19155, 19160, 19156, 19161), 11 -> HashSet(19130, 19131, 19129), 8 -> HashSet(19120, 19126, 19125), 15 -> HashSet(19159, 19158, 19157))
  /* Beautified form:
  "UnaryExpression1Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let ref = __x0__
    if (= (typeof ref) "Completion") if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x1__ = (Type ref)
    if (! (= __x1__ Reference)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (IsUnresolvableReference ref)
    if (= __x3__ true) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    app __x5__ = (IsPropertyReference ref)
    if (= __x5__ true) {
      app __x6__ = (IsSuperReference ref)
      if (= __x6__ true) {
        app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x7__
      } else {}
      app __x8__ = (GetBase ref)
      app __x9__ = (ToObject __x8__)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let baseObj = __x9__
      app __x10__ = (GetReferencedName ref)
      app __x11__ = (baseObj["Delete"] baseObj __x10__)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let deleteStatus = __x11__
      let __x12__ = (= deleteStatus false)
      if __x12__ {
        app __x13__ = (IsStrictReference ref)
        __x12__ = (= __x13__ true)
      } else {}
      if __x12__ {
        app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x14__
      } else {}
      app __x15__ = (WrapCompletion deleteStatus)
      return __x15__
    } else {
      app __x16__ = (GetBase ref)
      let bindings = __x16__
      app __x17__ = (GetReferencedName ref)
      app __x18__ = (bindings["DeleteBinding"] bindings __x17__)
      if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
      app __x19__ = (WrapCompletion __x18__)
      return __x19__
    }
  }
  */
}
