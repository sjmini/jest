package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPromiseReactionJob {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.PromiseReactionJob""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91402), ILet(Id("""reaction"""), ERef(RefId(Id("""__x0__""")))).setId(91403), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(91405), ILet(Id("""argument"""), ERef(RefId(Id("""__x1__""")))).setId(91406), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Capability""")))).setId(91409), ILet(Id("""type"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Type""")))).setId(91411), ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Handler""")))).setId(91413), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), EUndef), IIf(EBOp(OEq, ERef(RefId(Id("""type"""))), EStr("""Fulfill""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""argument"""))))).setId(91415), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x2__""")))).setId(91416))).setId(91462), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(ERef(RefId(Id("""argument"""))))).setId(91418), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x3__""")))).setId(91419))).setId(91465)).setId(91422), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""handler"""))), EUndef, EList(List(ERef(RefId(Id("""argument"""))))))).setId(91425), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x4__""")))).setId(91426))).setId(91469)).setId(91428), IIf(EBOp(OEq, ERef(RefId(Id("""promiseCapability"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(91430), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(91431), IReturn(ERef(RefId(Id("""__x6__""")))).setId(91432))).setId(91474), ISeq(List()).setId(91475)).setId(91435), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""handlerResult"""))))).setId(91437), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""handlerResult""")), EStr("""Value"""))))))).setId(91438), ILet(Id("""status"""), ERef(RefId(Id("""__x8__""")))).setId(91439))).setId(91480), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""handlerResult""")), EStr("""Value"""))))))).setId(91442), ILet(Id("""status"""), ERef(RefId(Id("""__x9__""")))).setId(91443))).setId(91483)).setId(91446), IApp(Id("""__x10__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(91448), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(91449), IReturn(ERef(RefId(Id("""__x11__""")))).setId(91450))).setId(91488))
  val instToStepMap: Map[Int, Int] = HashMap(91444 -> 24, 91448 -> 25, 91412 -> 4, 91425 -> 13, 91405 -> 1, 91437 -> 24, 91409 -> 3, 91441 -> 21, 91414 -> 5, 91435 -> 18, 91403 -> 0, 91430 -> 17, 91445 -> 24, 91418 -> 12, 91439 -> 21, 91419 -> 12, 91426 -> 13, 91436 -> 18, 91408 -> 17, 91423 -> 12, 91404 -> 0, 91429 -> 13, 91440 -> 21, 91451 -> 25, 91424 -> 12, 91442 -> 24, 91410 -> 3, 91415 -> 8, 91420 -> 12, 91432 -> 17, 91443 -> 24, 91411 -> 4, 91416 -> 8, 91428 -> 13, 91433 -> 17, 91447 -> 24, 91431 -> 17, 91449 -> 25, 91402 -> 0, 91434 -> 17, 91427 -> 13, 91417 -> 8, 91446 -> 24, 91438 -> 21, 91406 -> 1, 91421 -> 12, 91413 -> 5, 91450 -> 25, 91422 -> 12, 91407 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(91404, 91402, 91403), 5 -> HashSet(91414, 91413), 1 -> HashSet(91405, 91406, 91407), 21 -> HashSet(91440, 91441, 91438, 91439), 13 -> HashSet(91426, 91429, 91425, 91428, 91427), 2 -> HashSet(91408), 17 -> HashSet(91408, 91432, 91433, 91431, 91434, 91430), 12 -> HashSet(91419, 91424, 91420, 91421, 91418, 91422, 91408, 91423), 3 -> HashSet(91410, 91409), 18 -> HashSet(91436, 91435), 16 -> HashSet(91408), 11 -> HashSet(91408), 8 -> HashSet(91415, 91416, 91417), 4 -> HashSet(91412, 91411), 24 -> HashSet(91444, 91442, 91443, 91447, 91437, 91446, 91445), 25 -> HashSet(91448, 91451, 91449, 91450))
  /* Beautified form:
  "GLOBAL.PromiseReactionJob" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reaction = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let argument = __x1__
    let promiseCapability = reaction["Capability"]
    let type = reaction["Type"]
    let handler = reaction["Handler"]
    if (= handler undefined) if (= type "Fulfill") {
      app __x2__ = (NormalCompletion argument)
      let handlerResult = __x2__
    } else {
      app __x3__ = (ThrowCompletion argument)
      let handlerResult = __x3__
    } else {
      app __x4__ = (Call handler undefined (new [argument]))
      let handlerResult = __x4__
    }
    if (= promiseCapability undefined) {
      app __x5__ = (NormalCompletion CONST_empty)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (IsAbruptCompletion handlerResult)
    if __x7__ {
      app __x8__ = (Call promiseCapability["Reject"] undefined (new [handlerResult["Value"]]))
      let status = __x8__
    } else {
      app __x9__ = (Call promiseCapability["Resolve"] undefined (new [handlerResult["Value"]]))
      let status = __x9__
    }
    app __x10__ = (Completion status)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
