package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTmap {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.map""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(79707), ILet(Id("""callbackfn"""), ERef(RefId(Id("""__x0__""")))).setId(79708), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(79710), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(79711), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(79713), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(79714), IReturn(ERef(RefId(Id("""__x2__""")))).setId(79715)).setId(79716), ISeq(List()).setId(79804)).setId(79718), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(79719), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(79721), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(79722), IReturn(ERef(RefId(Id("""__x3__""")))).setId(79723)).setId(79724), ISeq(List()).setId(79811)).setId(79725), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(79726), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""callbackfn"""))))).setId(79728), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(79729), IReturn(ERef(RefId(Id("""__x5__""")))).setId(79730))).setId(79817), ISeq(List()).setId(79818)).setId(79732), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(79734), ILet(Id("""T"""), EUndef).setId(79736)).setId(79738), IApp(Id("""__x6__"""), ERef(RefId(Id("""ArraySpeciesCreate"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""len"""))))).setId(79740), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(79741), IReturn(ERef(RefId(Id("""__x6__""")))).setId(79742)).setId(79743), ISeq(List()).setId(79827)).setId(79744), ILet(Id("""A"""), ERef(RefId(Id("""__x6__""")))).setId(79745), ILet(Id("""k"""), EINum(0L)).setId(79747), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(79749), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(79750), IReturn(ERef(RefId(Id("""__x7__""")))).setId(79751)).setId(79752), ISeq(List()).setId(79835)).setId(79753), ILet(Id("""Pk"""), ERef(RefId(Id("""__x7__""")))).setId(79754), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(79756), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(79757), IReturn(ERef(RefId(Id("""__x8__""")))).setId(79758)).setId(79759), ISeq(List()).setId(79842)).setId(79760), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x8__""")))).setId(79761), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(79763), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(79764), IReturn(ERef(RefId(Id("""__x9__""")))).setId(79765)).setId(79766), ISeq(List()).setId(79849)).setId(79767), ILet(Id("""kValue"""), ERef(RefId(Id("""__x9__""")))).setId(79768), IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""callbackfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""O"""))))))).setId(79770), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(79771), IReturn(ERef(RefId(Id("""__x10__""")))).setId(79772)).setId(79773), ISeq(List()).setId(79856)).setId(79774), ILet(Id("""mappedValue"""), ERef(RefId(Id("""__x10__""")))).setId(79775), IApp(Id("""__x11__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""mappedValue"""))))).setId(79777), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(79778), IReturn(ERef(RefId(Id("""__x11__""")))).setId(79779)).setId(79780), ISeq(List()).setId(79863)).setId(79781), IExpr(ERef(RefId(Id("""__x11__""")))).setId(79782))).setId(79866), ISeq(List()).setId(79867)).setId(79785), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(79787))).setId(79870)).setId(79790), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(79792), IReturn(ERef(RefId(Id("""__x12__""")))).setId(79793))).setId(79874))
  val instToStepMap: Map[Int, Int] = HashMap(79725 -> 3, 79781 -> 18, 79768 -> 18, 79731 -> 4, 79736 -> 6, 79761 -> 20, 79746 -> 7, 79786 -> 20, 79770 -> 18, 79762 -> 20, 79788 -> 20, 79721 -> 3, 79774 -> 18, 79767 -> 18, 79789 -> 20, 79753 -> 20, 79735 -> 6, 79710 -> 1, 79763 -> 18, 79748 -> 8, 79730 -> 4, 79711 -> 1, 79720 -> 2, 79777 -> 18, 79760 -> 20, 79745 -> 7, 79739 -> 6, 79790 -> 20, 79732 -> 5, 79728 -> 5, 79775 -> 18, 79707 -> 0, 79709 -> 0, 79749 -> 20, 79785 -> 20, 79784 -> 18, 79712 -> 1, 79756 -> 20, 79791 -> 20, 79738 -> 6, 79744 -> 7, 79708 -> 0, 79713 -> 2, 79740 -> 7, 79755 -> 20, 79733 -> 5, 79783 -> 18, 79794 -> 21, 79718 -> 2, 79787 -> 20, 79734 -> 6, 79737 -> 6, 79792 -> 21, 79726 -> 3, 79719 -> 2, 79747 -> 8, 79729 -> 4, 79769 -> 18, 79782 -> 18, 79754 -> 20, 79793 -> 21, 79727 -> 3, 79776 -> 18)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(79708, 79707, 79709), 5 -> HashSet(79732, 79728, 79733), 20 -> HashSet(79789, 79753, 79760, 79790, 79749, 79785, 79761, 79786, 79755, 79787, 79762, 79754, 79788, 79756, 79791), 1 -> HashSet(79710, 79711, 79712), 6 -> HashSet(79735, 79739, 79736, 79738, 79737, 79734), 21 -> HashSet(79794, 79792, 79793), 13 -> HashSet(79760, 79761, 79756, 79762), 2 -> HashSet(79720, 79713, 79718, 79719), 17 -> HashSet(79774, 79775, 79770, 79776), 12 -> HashSet(79753, 79749, 79755, 79754), 7 -> HashSet(79745, 79746, 79744, 79740), 3 -> HashSet(79721, 79725, 79726, 79727), 18 -> HashSet(79774, 79767, 79763, 79781, 79777, 79775, 79784, 79768, 79770, 79783, 79769, 79782, 79776), 16 -> HashSet(79767, 79763, 79768, 79769), 8 -> HashSet(79748, 79747), 19 -> HashSet(79785, 79786), 4 -> HashSet(79730, 79731, 79729))
  /* Beautified form:
  "GLOBAL.Array.prototype.map" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (IsCallable callbackfn)
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    app __x6__ = (ArraySpeciesCreate O len)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let A = __x6__
    let k = 0i
    while (< k len) {
      app __x7__ = (ToString k)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let Pk = __x7__
      app __x8__ = (HasProperty O Pk)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let kPresent = __x8__
      if (= kPresent true) {
        app __x9__ = (Get O Pk)
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        let kValue = __x9__
        app __x10__ = (Call callbackfn T (new [kValue, k, O]))
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let mappedValue = __x10__
        app __x11__ = (CreateDataPropertyOrThrow A Pk mappedValue)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        __x11__
      } else {}
      k = (+ k 1i)
    }
    app __x12__ = (WrapCompletion A)
    return __x12__
  }
  */
}
