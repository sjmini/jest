package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_StringIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_StringIteratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(74541), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(74543), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(74544), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74545))).setId(74596), ISeq(List()).setId(74597)).setId(74548), IIf(EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedString"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""StringIteratorNextIndex"""))), EAbsent)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(74550), IReturn(ERef(RefId(Id("""__x2__""")))).setId(74551))).setId(74601), ISeq(List()).setId(74602)).setId(74553), ILet(Id("""s"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedString""")))).setId(74555), IIf(EBOp(OEq, ERef(RefId(Id("""s"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(74557), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(74558), IReturn(ERef(RefId(Id("""__x4__""")))).setId(74559))).setId(74608), ISeq(List()).setId(74609)).setId(74561), ILet(Id("""position"""), ERef(RefProp(RefId(Id("""O""")), EStr("""StringIteratorNextIndex""")))).setId(74563), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""s""")), EStr("""length""")))).setId(74565), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IAssign(RefProp(RefId(Id("""O""")), EStr("""IteratedString""")), EUndef).setId(74567), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(74569), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(74570), IReturn(ERef(RefId(Id("""__x6__""")))).setId(74571))).setId(74617), ISeq(List()).setId(74618)).setId(74574), IApp(Id("""__x7__"""), ERef(RefId(Id("""CodePointAt"""))), List(ERef(RefId(Id("""s"""))), ERef(RefId(Id("""position"""))))).setId(74576), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(74577), IReturn(ERef(RefId(Id("""__x7__""")))).setId(74578)).setId(74579), ISeq(List()).setId(74624)).setId(74580), ILet(Id("""cp"""), ERef(RefId(Id("""__x7__""")))).setId(74581), ILet(Id("""resultString"""), ENotSupported("""StringOp""")).setId(74583), IAssign(RefProp(RefId(Id("""O""")), EStr("""StringIteratorNextIndex""")), EBOp(OPlus, ERef(RefId(Id("""position"""))), ERef(RefProp(RefId(Id("""cp""")), EStr("""CodeUnitCount"""))))).setId(74585), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""resultString"""))), EBool(false))).setId(74587), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(74588), IReturn(ERef(RefId(Id("""__x9__""")))).setId(74589))).setId(74632))
  val instToStepMap: Map[Int, Int] = HashMap(74572 -> 13, 74552 -> 3, 74588 -> 18, 74559 -> 6, 74546 -> 1, 74542 -> 0, 74570 -> 13, 74582 -> 15, 74586 -> 17, 74590 -> 18, 74544 -> 1, 74580 -> 15, 74566 -> 9, 74583 -> 16, 74563 -> 8, 74585 -> 17, 74557 -> 6, 74548 -> 2, 74553 -> 4, 74589 -> 18, 74584 -> 16, 74545 -> 1, 74576 -> 15, 74560 -> 6, 74543 -> 2, 74564 -> 8, 74567 -> 13, 74571 -> 13, 74549 -> 2, 74568 -> 13, 74556 -> 5, 74575 -> 14, 74581 -> 15, 74574 -> 14, 74565 -> 9, 74587 -> 18, 74555 -> 5, 74550 -> 3, 74573 -> 13, 74541 -> 0, 74562 -> 7, 74569 -> 13, 74558 -> 6, 74551 -> 3, 74554 -> 4, 74561 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(74542, 74541), 5 -> HashSet(74556, 74555), 14 -> HashSet(74575, 74574), 1 -> HashSet(74544, 74545, 74546), 6 -> HashSet(74557, 74560, 74559, 74558), 9 -> HashSet(74566, 74565), 13 -> HashSet(74572, 74567, 74570, 74573, 74569, 74571, 74568), 2 -> HashSet(74548, 74543, 74549), 17 -> HashSet(74585, 74586), 12 -> HashSet(74567, 74568), 7 -> HashSet(74562, 74561), 3 -> HashSet(74552, 74550, 74551), 18 -> HashSet(74589, 74588, 74587, 74590), 16 -> HashSet(74583, 74584), 8 -> HashSet(74563, 74564), 4 -> HashSet(74553, 74554), 15 -> HashSet(74580, 74576, 74581, 74582))
  /* Beautified form:
  "GLOBAL.INTRINSIC_StringIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (= O["IteratedString"] absent) (= O["StringIteratorNextIndex"] absent)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let s = O["IteratedString"]
    if (= s undefined) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let position = O["StringIteratorNextIndex"]
    let len = s["length"]
    if (! (< position len)) {
      O["IteratedString"] = undefined
      app __x5__ = (CreateIterResultObject undefined true)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (CodePointAt s position)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let cp = __x7__
    let resultString = !!! "StringOp"
    O["StringIteratorNextIndex"] = (+ position cp["CodeUnitCount"])
    app __x8__ = (CreateIterResultObject resultString false)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
