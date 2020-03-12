package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncFunctionStart {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.AsyncFunctionStart""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(93588), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x0__""")))).setId(93589), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(93591), ILet(Id("""asyncFunctionBody"""), ERef(RefId(Id("""__x1__""")))).setId(93592), ILet(Id("""runningContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(93594), ILet(Id("""asyncContext"""), ECopy(ERef(RefId(Id("""runningContext"""))))).setId(93596), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""asyncFunctionBody"""))), EStr("""Evaluation""")).setId(93645), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))).setId(93646), IAccess(Id("""__ret__"""), ERef(RefId(Id("""asyncContext"""))), EStr("""ReturnCont""")).setId(93648), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))).setId(93649), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""asyncContext""")))), ISeq(List(IAssign(RefId(Id("""__x3__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(93651), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x3__"""))))).setId(93652))).setId(93722), ISeq(List()).setId(93723)).setId(93655), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(93656), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(EUndef)))).setId(93658), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(93659), IReturn(ERef(RefId(Id("""__x4__""")))).setId(93660)).setId(93661), ISeq(List()).setId(93730)).setId(93663), IExpr(ERef(RefId(Id("""__x4__""")))).setId(93664))).setId(93733), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(93667), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(93668), IReturn(ERef(RefId(Id("""__x5__""")))).setId(93669)).setId(93670), ISeq(List()).setId(93738)).setId(93672), IExpr(ERef(RefId(Id("""__x5__""")))).setId(93673))).setId(93741), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(93677), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(93678), IReturn(ERef(RefId(Id("""__x6__""")))).setId(93679)).setId(93680), ISeq(List()).setId(93746)).setId(93682), IExpr(ERef(RefId(Id("""__x6__""")))).setId(93683))).setId(93749)).setId(93686)).setId(93688), IApp(Id("""__x7__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(93690), IReturn(ERef(RefId(Id("""__x7__""")))).setId(93691))).setId(93754))).setId(93694), IAppend(ERef(RefId(Id("""asyncContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(93695), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(93696), IWithCont(Id("""__x8__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")), EList(List())).setId(93698), ISeq(List()).setId(93759)).setId(93701), IAppend(ERef(RefId(Id("""__x8__"""))), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")))).setId(93702), IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont"""))), List()).setId(93703))).setId(93763)).setId(93705), IApp(Id("""__x10__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(93706), IReturn(ERef(RefId(Id("""__x10__""")))).setId(93707))).setId(93767))
  val instToStepMap: Map[Int, Int] = HashMap(93637 -> 18, 93705 -> 21, 93633 -> 18, 93619 -> 11, 93601 -> 19, 93639 -> 19, 93636 -> 18, 93616 -> 23, 93599 -> 19, 93602 -> 19, 93629 -> 18, 93696 -> 20, 93641 -> 19, 93704 -> 21, 93596 -> 3, 93701 -> 21, 93628 -> 14, 93609 -> 19, 93638 -> 18, 93592 -> 1, 93597 -> 3, 93618 -> 11, 93634 -> 18, 93708 -> 24, 93590 -> 0, 93600 -> 19, 93697 -> 20, 93702 -> 21, 93695 -> 20, 93593 -> 1, 93627 -> 14, 93591 -> 1, 93644 -> 19, 93610 -> 19, 93604 -> 19, 93707 -> 24, 93617 -> 11, 93703 -> 21, 93589 -> 0, 93621 -> 14, 93626 -> 14, 93594 -> 2, 93635 -> 18, 93611 -> 19, 93706 -> 24, 93588 -> 0, 93603 -> 19, 93620 -> 11, 93643 -> 19, 93694 -> 19, 93612 -> 11, 93642 -> 19, 93595 -> 2, 93640 -> 19, 93625 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(93590, 93589, 93588), 24 -> HashSet(93708, 93707, 93706), 14 -> HashSet(93628, 93627, 93625, 93621, 93626), 20 -> HashSet(93696, 93697, 93695), 1 -> HashSet(93592, 93593, 93591), 6 -> HashSet(93599, 93601, 93600), 21 -> HashSet(93705, 93704, 93701, 93702, 93703), 2 -> HashSet(93594, 93595), 17 -> HashSet(93616), 22 -> HashSet(93616), 7 -> HashSet(93602, 93604, 93603), 3 -> HashSet(93596, 93597), 18 -> HashSet(93637, 93633, 93616, 93629, 93638, 93634, 93635, 93639, 93636, 93640), 11 -> HashSet(93619, 93618, 93617, 93620, 93612), 23 -> HashSet(93616), 8 -> HashSet(93609, 93610, 93611), 19 -> HashSet(93599, 93602, 93641, 93609, 93601, 93600, 93604, 93611, 93639, 93640, 93644, 93610, 93603, 93643, 93694, 93642))
  /* Beautified form:
  "GLOBAL.AsyncFunctionStart" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promiseCapability = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let asyncFunctionBody = __x1__
    let runningContext = GLOBAL_context
    let asyncContext = (copy-obj runningContext)
    asyncContext["ResumeCont"] = () [=>] {
      access __x2__ = (asyncFunctionBody "Evaluation")
      let result = __x2__
      access __ret__ = (asyncContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] asyncContext) {
        __x3__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x3__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      if (= result["Type"] CONST_normal) {
        app __x4__ = (Call promiseCapability["Resolve"] undefined (new [undefined]))
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        __x4__
      } else if (= result["Type"] CONST_return) {
        app __x5__ = (Call promiseCapability["Resolve"] undefined (new [result["Value"]]))
        if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
      } else {
        app __x6__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        __x6__
      }
      app __x7__ = (NormalCompletion undefined)
      return __x7__
    }
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x8__ (result) ={
      if (= asyncContext["ReturnCont"] absent) asyncContext["ReturnCont"] = (new []) else {}
      append __x8__ -> asyncContext["ReturnCont"]
      app __x9__ = (asyncContext["ResumeCont"] )
    }
    app __x10__ = (NormalCompletion undefined)
    return __x10__
  }
  */
}
