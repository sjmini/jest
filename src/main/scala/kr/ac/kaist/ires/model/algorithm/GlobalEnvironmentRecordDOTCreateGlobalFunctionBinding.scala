package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTCreateGlobalFunctionBinding {
  val length: Int = 3
  val func: Func = Func("""GlobalEnvironmentRecord.CreateGlobalFunctionBinding""", List(Id("""this"""), Id("""N"""), Id("""V"""), Id("""D""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48970), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48972), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))).setId(48974), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""globalObject""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))).setId(48976), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(48977), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48978)).setId(48979), ISeq(List()).setId(49028)).setId(48981), ILet(Id("""existingProp"""), ERef(RefId(Id("""__x0__""")))).setId(48982), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""existingProp"""))), EUndef), EBOp(OEq, ERef(RefProp(RefId(Id("""existingProp""")), EStr("""Configurable"""))), EBool(true))), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""V""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), ERef(RefId(Id("""D"""))))))).setId(48984), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""V"""))))))).setId(48987)).setId(48990), IApp(Id("""__x1__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""desc"""))))).setId(48992), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(48993), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48994)).setId(48995), ISeq(List()).setId(49038)).setId(48996), IExpr(ERef(RefId(Id("""__x1__""")))).setId(48997), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefProp(RefId(Id("""ObjRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N"""))))), EAbsent)), IAssign(RefProp(RefProp(RefProp(RefId(Id("""ObjRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized""")), EBool(true)).setId(48999), ISeq(List()).setId(49042)).setId(49001), IApp(Id("""__x2__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""V"""))), EBool(false))).setId(49002), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(49003), IReturn(ERef(RefId(Id("""__x2__""")))).setId(49004)).setId(49005), ISeq(List()).setId(49048)).setId(49006), IExpr(ERef(RefId(Id("""__x2__""")))).setId(49007), ILet(Id("""varDeclaredNames"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""VarNames""")))).setId(49009), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""varDeclaredNames"""))), ERef(RefId(Id("""N"""))))), IAppend(ERef(RefId(Id("""N"""))), ERef(RefId(Id("""varDeclaredNames""")))).setId(49011), ISeq(List()).setId(49053)).setId(49014), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(49016), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(49017), IReturn(ERef(RefId(Id("""__x4__""")))).setId(49018))).setId(49058))
  val instToStepMap: Map[Int, Int] = HashMap(49014 -> 17, 48971 -> 0, 48970 -> 0, 48989 -> 9, 49013 -> 16, 48985 -> 6, 49018 -> 18, 49007 -> 12, 48973 -> 1, 49012 -> 16, 48991 -> 9, 48984 -> 6, 48972 -> 1, 48986 -> 6, 49009 -> 13, 49002 -> 12, 49017 -> 18, 48975 -> 2, 48981 -> 3, 48998 -> 10, 49006 -> 12, 48990 -> 9, 48974 -> 2, 48992 -> 10, 48997 -> 10, 48982 -> 3, 49016 -> 18, 49011 -> 16, 48983 -> 3, 49008 -> 12, 49019 -> 18, 48988 -> 9, 48987 -> 9, 49010 -> 13, 48976 -> 3, 49015 -> 17, 49001 -> 11, 48996 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48971, 48970), 10 -> HashSet(48998, 48992, 48997, 48996), 1 -> HashSet(48973, 48972), 6 -> HashSet(48986, 48985, 48984), 9 -> HashSet(48990, 48989, 48988, 48987, 48991), 13 -> HashSet(49009, 49010), 2 -> HashSet(48975, 48974), 17 -> HashSet(49014, 49015), 12 -> HashSet(49002, 49006, 49007, 49008), 3 -> HashSet(48981, 48982, 48983, 48976), 18 -> HashSet(49017, 49018, 49016, 49019), 16 -> HashSet(49013, 49011, 49012), 11 -> HashSet(49001))
  /* Beautified form:
  "GlobalEnvironmentRecord.CreateGlobalFunctionBinding" (this, N, V, D) => {
    let envRec = this
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x0__ = (globalObject["GetOwnProperty"] globalObject N)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let existingProp = __x0__
    if (|| (= existingProp undefined) (= existingProp["Configurable"] true)) let desc = (new PropertyDescriptor("Value" -> V, "Writable" -> true, "Enumerable" -> true, "Configurable" -> D)) else let desc = (new PropertyDescriptor("Value" -> V))
    app __x1__ = (DefinePropertyOrThrow globalObject N desc)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    if (! (= ObjRec["SubMap"][N] absent)) ObjRec["SubMap"][N]["initialized"] = true else {}
    app __x2__ = (Set globalObject N V false)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    let varDeclaredNames = envRec["VarNames"]
    if (! (contains varDeclaredNames N)) append N -> varDeclaredNames else {}
    app __x3__ = (NormalCompletion CONST_empty)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
