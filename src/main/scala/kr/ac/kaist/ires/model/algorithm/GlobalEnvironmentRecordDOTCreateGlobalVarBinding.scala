package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTCreateGlobalVarBinding {
  val length: Int = 2
  val func: Func = Func("""GlobalEnvironmentRecord.CreateGlobalVarBinding""", List(Id("""this"""), Id("""N"""), Id("""D""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48836), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48838), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))).setId(48840), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))).setId(48842), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(48843), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48844)).setId(48845), ISeq(List()).setId(48893)).setId(48847), ILet(Id("""hasProperty"""), ERef(RefId(Id("""__x0__""")))).setId(48848), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""globalObject"""))))).setId(48850), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(48851), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48852)).setId(48853), ISeq(List()).setId(48900)).setId(48854), ILet(Id("""extensible"""), ERef(RefId(Id("""__x1__""")))).setId(48855), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""hasProperty"""))), EBool(false)), EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(true))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""D"""))))).setId(48857), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(48858), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48859)).setId(48860), ISeq(List()).setId(48907)).setId(48861), IExpr(ERef(RefId(Id("""__x2__""")))).setId(48862), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))), EUndef)).setId(48864), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(48865), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48866)).setId(48867), ISeq(List()).setId(48914)).setId(48868), IExpr(ERef(RefId(Id("""__x3__""")))).setId(48869))).setId(48917), ISeq(List()).setId(48918)).setId(48872), ILet(Id("""varDeclaredNames"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""VarNames""")))).setId(48874), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""varDeclaredNames"""))), ERef(RefId(Id("""N"""))))), IAppend(ERef(RefId(Id("""N"""))), ERef(RefId(Id("""varDeclaredNames""")))).setId(48876), ISeq(List()).setId(48922)).setId(48879), IApp(Id("""__x4__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(48881), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(48882), IReturn(ERef(RefId(Id("""__x5__""")))).setId(48883))).setId(48927))
  val instToStepMap: Map[Int, Int] = HashMap(48875 -> 10, 48842 -> 3, 48847 -> 3, 48874 -> 10, 48837 -> 0, 48849 -> 3, 48861 -> 8, 48870 -> 8, 48838 -> 1, 48857 -> 8, 48881 -> 15, 48878 -> 13, 48873 -> 9, 48839 -> 1, 48880 -> 14, 48836 -> 0, 48876 -> 13, 48855 -> 4, 48883 -> 15, 48868 -> 8, 48848 -> 3, 48869 -> 8, 48862 -> 8, 48864 -> 8, 48884 -> 15, 48879 -> 14, 48871 -> 8, 48840 -> 2, 48841 -> 2, 48877 -> 13, 48854 -> 4, 48872 -> 9, 48882 -> 15, 48850 -> 4, 48856 -> 4, 48863 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48837, 48836), 10 -> HashSet(48875, 48874), 14 -> HashSet(48879, 48880), 1 -> HashSet(48838, 48839), 9 -> HashSet(48873, 48872), 13 -> HashSet(48878, 48877, 48876), 2 -> HashSet(48840, 48841), 7 -> HashSet(48862, 48861, 48857, 48863), 3 -> HashSet(48842, 48847, 48849, 48848), 8 -> HashSet(48861, 48870, 48857, 48871, 48863, 48868, 48869, 48862, 48864), 4 -> HashSet(48854, 48850, 48856, 48855), 15 -> HashSet(48884, 48881, 48882, 48883))
  /* Beautified form:
  "GlobalEnvironmentRecord.CreateGlobalVarBinding" (this, N, D) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (HasOwnProperty globalObject N)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let hasProperty = __x0__
    app __x1__ = (IsExtensible globalObject)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let extensible = __x1__
    if (&& (= hasProperty false) (= extensible true)) {
      app __x2__ = (ObjRec["CreateMutableBinding"] ObjRec N D)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (ObjRec["InitializeBinding"] ObjRec N undefined)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {}
    let varDeclaredNames = envRec["VarNames"]
    if (! (contains varDeclaredNames N)) append N -> varDeclaredNames else {}
    app __x4__ = (NormalCompletion CONST_empty)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
