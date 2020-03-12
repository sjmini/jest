package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectEnvironmentRecordDOTHasBinding {
  val length: Int = 1
  val func: Func = Func("""ObjectEnvironmentRecord.HasBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47394), ILet(Id("""bindings"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""BindingObject""")))).setId(47396), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""bindings"""))), ERef(RefId(Id("""N"""))))).setId(47398), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(47399), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47400)).setId(47401), ISeq(List()).setId(47454)).setId(47403), ILet(Id("""foundBinding"""), ERef(RefId(Id("""__x0__""")))).setId(47404), IIf(EBOp(OEq, ERef(RefId(Id("""foundBinding"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47406), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47407))).setId(47459), ISeq(List()).setId(47460)).setId(47409), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""withEnvironment"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(47411), IReturn(ERef(RefId(Id("""__x2__""")))).setId(47412))).setId(47464), ISeq(List()).setId(47465)).setId(47414), IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""bindings"""))), ERef(RefId(Id("""SYMBOL_unscopables"""))))).setId(47416), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(47417), IReturn(ERef(RefId(Id("""__x3__""")))).setId(47418)).setId(47419), ISeq(List()).setId(47471)).setId(47420), ILet(Id("""unscopables"""), ERef(RefId(Id("""__x3__""")))).setId(47421), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""unscopables"""))))).setId(47423), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""Object""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""unscopables"""))), ERef(RefId(Id("""N"""))))).setId(47424), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(47425), IReturn(ERef(RefId(Id("""__x5__""")))).setId(47426)).setId(47427), ISeq(List()).setId(47479)).setId(47428), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(47429), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(47430), IReturn(ERef(RefId(Id("""__x6__""")))).setId(47431)).setId(47432), ISeq(List()).setId(47485)).setId(47433), ILet(Id("""blocked"""), ERef(RefId(Id("""__x6__""")))).setId(47434), IIf(EBOp(OEq, ERef(RefId(Id("""blocked"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47436), IReturn(ERef(RefId(Id("""__x7__""")))).setId(47437))).setId(47490), ISeq(List()).setId(47491)).setId(47439))).setId(47493), ISeq(List()).setId(47494)).setId(47442), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(47444), IReturn(ERef(RefId(Id("""__x8__""")))).setId(47445))).setId(47498))
  val instToStepMap: Map[Int, Int] = HashMap(47442 -> 12, 47408 -> 3, 47414 -> 6, 47436 -> 11, 47439 -> 11, 47403 -> 2, 47443 -> 12, 47395 -> 0, 47435 -> 11, 47444 -> 13, 47416 -> 7, 47429 -> 11, 47437 -> 11, 47433 -> 11, 47398 -> 2, 47445 -> 13, 47421 -> 7, 47404 -> 2, 47440 -> 11, 47446 -> 13, 47409 -> 4, 47424 -> 11, 47428 -> 11, 47407 -> 3, 47410 -> 4, 47415 -> 6, 47438 -> 11, 47406 -> 3, 47423 -> 12, 47434 -> 11, 47397 -> 1, 47396 -> 1, 47411 -> 5, 47441 -> 11, 47394 -> 0, 47420 -> 7, 47422 -> 7, 47405 -> 2, 47412 -> 5, 47413 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(47395, 47394), 5 -> HashSet(47411, 47412, 47413), 10 -> HashSet(47435, 47434, 47429, 47433, 47424, 47428), 1 -> HashSet(47397, 47396), 6 -> HashSet(47414, 47415), 13 -> HashSet(47446, 47444, 47445), 2 -> HashSet(47404, 47403, 47405, 47398), 12 -> HashSet(47442, 47443, 47423), 7 -> HashSet(47421, 47416, 47420, 47422), 3 -> HashSet(47408, 47407, 47406), 11 -> HashSet(47440, 47436, 47439, 47435, 47438, 47434, 47429, 47441, 47437, 47433, 47424, 47428), 4 -> HashSet(47409, 47410))
  /* Beautified form:
  "ObjectEnvironmentRecord.HasBinding" (this, N) => {
    let envRec = this
    let bindings = envRec["BindingObject"]
    app __x0__ = (HasProperty bindings N)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let foundBinding = __x0__
    if (= foundBinding false) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= envRec["withEnvironment"] false) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (Get bindings SYMBOL_unscopables)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let unscopables = __x3__
    app __x4__ = (Type unscopables)
    if (= __x4__ Object) {
      app __x5__ = (Get unscopables N)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (ToBoolean __x5__)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let blocked = __x6__
      if (= blocked true) {
        app __x7__ = (WrapCompletion false)
        return __x7__
      } else {}
    } else {}
    app __x8__ = (WrapCompletion true)
    return __x8__
  }
  */
}
