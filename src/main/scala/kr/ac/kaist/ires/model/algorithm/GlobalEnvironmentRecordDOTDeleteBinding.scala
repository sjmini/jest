package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.DeleteBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48351), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))).setId(48353), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48355), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""DeleteBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48356), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(48357), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48358))).setId(48411), ISeq(List()).setId(48412)).setId(48362), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48364), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))).setId(48366), IApp(Id("""__x3__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))).setId(48368), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(48369), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48370)).setId(48371), ISeq(List()).setId(48420)).setId(48372), ILet(Id("""existingProp"""), ERef(RefId(Id("""__x3__""")))).setId(48373), IIf(EBOp(OEq, ERef(RefId(Id("""existingProp"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""DeleteBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))))).setId(48375), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(48376), IReturn(ERef(RefId(Id("""__x4__""")))).setId(48377)).setId(48378), ISeq(List()).setId(48427)).setId(48379), ILet(Id("""status"""), ERef(RefId(Id("""__x4__""")))).setId(48380), IIf(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(true)), ISeq(List(ILet(Id("""varNames"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""VarNames""")))).setId(48382), ILet(Id("""__x5__"""), EINum(0L)).setId(48384), ILet(Id("""__x6__"""), ERef(RefProp(RefId(Id("""varNames""")), EStr("""length""")))).setId(48385), IWhile(EBOp(OAnd, EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""__x6__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""varNames""")), ERef(RefId(Id("""__x5__"""))))), ERef(RefId(Id("""N""")))))), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(48386)).setId(48387), IIf(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""__x6__""")))), IExpr(EPop(ERef(RefId(Id("""varNames"""))), ERef(RefId(Id("""__x5__"""))))).setId(48388), ISeq(List()).setId(48436)).setId(48390))).setId(48438), ISeq(List()).setId(48439)).setId(48393), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(48395), IReturn(ERef(RefId(Id("""__x7__""")))).setId(48396))).setId(48443), ISeq(List()).setId(48444)).setId(48399), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48401), IReturn(ERef(RefId(Id("""__x8__""")))).setId(48402))).setId(48448))
  val instToStepMap: Map[Int, Int] = HashMap(48383 -> 15, 48351 -> 0, 48381 -> 17, 48357 -> 4, 48393 -> 17, 48380 -> 17, 48397 -> 17, 48365 -> 6, 48385 -> 15, 48368 -> 8, 48373 -> 8, 48359 -> 4, 48399 -> 18, 48363 -> 5, 48395 -> 17, 48382 -> 15, 48355 -> 5, 48394 -> 17, 48362 -> 5, 48398 -> 17, 48366 -> 7, 48403 -> 19, 48356 -> 4, 48353 -> 1, 48372 -> 8, 48390 -> 15, 48358 -> 4, 48364 -> 6, 48379 -> 17, 48400 -> 18, 48391 -> 15, 48396 -> 17, 48401 -> 19, 48354 -> 1, 48374 -> 8, 48367 -> 7, 48352 -> 0, 48384 -> 15, 48375 -> 17, 48360 -> 4, 48387 -> 15, 48402 -> 19, 48392 -> 15)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48351, 48352), 5 -> HashSet(48362, 48363, 48355), 14 -> HashSet(48383, 48382), 1 -> HashSet(48353, 48354), 6 -> HashSet(48365, 48364), 17 -> HashSet(48394, 48398, 48381, 48393, 48380, 48397, 48379, 48396, 48395, 48375), 7 -> HashSet(48366, 48367), 18 -> HashSet(48400, 48399), 16 -> HashSet(48394, 48393), 11 -> HashSet(48381, 48380, 48379, 48375), 8 -> HashSet(48372, 48368, 48373, 48374), 19 -> HashSet(48403, 48401, 48402), 4 -> HashSet(48356, 48357, 48358, 48359, 48360), 15 -> HashSet(48383, 48385, 48390, 48391, 48384, 48382, 48387, 48392))
  /* Beautified form:
  "GlobalEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (DclRec["DeleteBinding"] DclRec N)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x3__ = (HasOwnProperty globalObject N)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let existingProp = __x3__
    if (= existingProp true) {
      app __x4__ = (ObjRec["DeleteBinding"] ObjRec N)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let status = __x4__
      if (= status true) {
        let varNames = envRec["VarNames"]
        let __x5__ = 0i
        let __x6__ = varNames["length"]
        while (&& (< __x5__ __x6__) (! (= varNames[__x5__] N))) __x5__ = (+ __x5__ 1i)
        if (< __x5__ __x6__) (pop varNames __x5__) else {}
      } else {}
      app __x7__ = (WrapCompletion status)
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion true)
    return __x8__
  }
  */
}
