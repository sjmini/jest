package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTthrow {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.throw""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(88186), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(88187), ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(88189), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(88192), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(88193), IReturn(ERef(RefId(Id("""__x1__""")))).setId(88194)).setId(88195), ISeq(List()).setId(88270)).setId(88196), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))).setId(88197), ILet(Id("""syncIterator"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord""")), EStr("""Iterator""")))).setId(88199), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""syncIterator"""))), EStr("""throw"""))).setId(88201), ILet(Id("""throw"""), ERef(RefId(Id("""__x2__""")))).setId(88202), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""throw""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""throw""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""throw""")), ERef(RefProp(RefId(Id("""throw""")), EStr("""Value""")))).setId(88204), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""throw""")), EStr("""Value"""))))))).setId(88205), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))).setId(88206), ISeq(List()).setId(88279)).setId(88207), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(88208))).setId(88282)).setId(88210), ISeq(List()).setId(88284)).setId(88211), IExpr(ERef(RefId(Id("""throw""")))).setId(88212), IIf(EBOp(OEq, ERef(RefId(Id("""throw"""))), EUndef), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""value"""))))))).setId(88214), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(88215), IReturn(ERef(RefId(Id("""__x4__""")))).setId(88216)).setId(88217), ISeq(List()).setId(88291)).setId(88218), IExpr(ERef(RefId(Id("""__x4__""")))).setId(88219), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(88221), IReturn(ERef(RefId(Id("""__x5__""")))).setId(88222))).setId(88296), ISeq(List()).setId(88297)).setId(88225), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""throw"""))), ERef(RefId(Id("""syncIterator"""))), EList(List(ERef(RefId(Id("""value"""))))))).setId(88227), ILet(Id("""result"""), ERef(RefId(Id("""__x6__""")))).setId(88228), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(88230), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(88231), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x7__""")))).setId(88232), ISeq(List()).setId(88304)).setId(88233), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(88234))).setId(88307)).setId(88236), ISeq(List()).setId(88309)).setId(88237), IExpr(ERef(RefId(Id("""result""")))).setId(88238), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))).setId(88240), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))))).setId(88241), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(88242), IReturn(ERef(RefId(Id("""__x9__""")))).setId(88243)).setId(88244), ISeq(List()).setId(88317)).setId(88245), IExpr(ERef(RefId(Id("""__x9__""")))).setId(88246), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(88248), IReturn(ERef(RefId(Id("""__x10__""")))).setId(88249))).setId(88322), ISeq(List()).setId(88323)).setId(88252), IApp(Id("""__x11__"""), ERef(RefId(Id("""AsyncFromSyncIteratorContinuation"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""promiseCapability"""))))).setId(88254), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(88255), IReturn(ERef(RefId(Id("""__x11__""")))).setId(88256)).setId(88257), ISeq(List()).setId(88329)).setId(88258), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(88259), IReturn(ERef(RefId(Id("""__x12__""")))).setId(88260))).setId(88333))
  val instToStepMap: Map[Int, Int] = HashMap(88259 -> 19, 88246 -> 17, 88225 -> 11, 88229 -> 12, 88219 -> 10, 88241 -> 17, 88190 -> 1, 88192 -> 3, 88200 -> 4, 88188 -> 0, 88228 -> 12, 88196 -> 3, 88211 -> 6, 88239 -> 13, 88249 -> 17, 88223 -> 10, 88201 -> 5, 88191 -> 2, 88220 -> 10, 88187 -> 0, 88240 -> 18, 88253 -> 18, 88212 -> 6, 88197 -> 3, 88250 -> 17, 88222 -> 10, 88258 -> 19, 88245 -> 17, 88226 -> 11, 88198 -> 3, 88186 -> 0, 88213 -> 6, 88254 -> 19, 88218 -> 10, 88237 -> 13, 88261 -> 19, 88248 -> 17, 88251 -> 17, 88221 -> 10, 88203 -> 5, 88214 -> 10, 88199 -> 4, 88189 -> 1, 88238 -> 13, 88202 -> 5, 88227 -> 12, 88260 -> 19, 88224 -> 10, 88252 -> 18, 88247 -> 17)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(88188, 88187, 88186), 5 -> HashSet(88201, 88203, 88202), 10 -> HashSet(88223, 88220, 88222, 88219, 88218, 88221, 88214, 88224), 1 -> HashSet(88190, 88189), 6 -> HashSet(88211, 88212, 88213), 9 -> HashSet(88220, 88219, 88218, 88214), 13 -> HashSet(88239, 88237, 88238), 2 -> HashSet(88191), 17 -> HashSet(88249, 88246, 88250, 88245, 88241, 88248, 88251, 88247), 12 -> HashSet(88228, 88229, 88227), 3 -> HashSet(88196, 88197, 88198, 88192), 18 -> HashSet(88240, 88253, 88252), 16 -> HashSet(88246, 88245, 88241, 88247), 11 -> HashSet(88225, 88226), 19 -> HashSet(88259, 88258, 88254, 88261, 88260), 4 -> HashSet(88200, 88199))
  /* Beautified form:
  "GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.throw" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let O = this
    app __x1__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x2__ = (GetMethod syncIterator "throw")
    let throw = __x2__
    if (= (typeof throw) "Completion") if (= throw["Type"] CONST_normal) throw = throw["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [throw["Value"]]))
      if (&& (= (typeof __x3__) "Completion") (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    throw
    if (= throw undefined) {
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [value]))
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      app __x5__ = (WrapCompletion promiseCapability["Promise"])
      return __x5__
    } else {}
    app __x6__ = (Call throw syncIterator (new [value]))
    let result = __x6__
    if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x7__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (= (typeof __x7__) "Completion") (! (= __x7__["Type"] CONST_normal))) return __x7__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x8__ = (Type result)
    if (! (= __x8__ Object)) {
      app __x9__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      __x9__
      app __x10__ = (WrapCompletion promiseCapability["Promise"])
      return __x10__
    } else {}
    app __x11__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
