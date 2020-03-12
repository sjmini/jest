package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_ArrayIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_ArrayIteratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(83767), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(83769), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(83770), IReturn(ERef(RefId(Id("""__x1__""")))).setId(83771))).setId(83864), ISeq(List()).setId(83865)).setId(83774), IIf(EBOp(OOr, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedObject""")))), EBOp(OOr, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIteratorNextIndex""")))), EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIterationKind""")))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(83776), IReturn(ERef(RefId(Id("""__x2__""")))).setId(83777))).setId(83869), ISeq(List()).setId(83870)).setId(83779), ILet(Id("""a"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedObject""")))).setId(83781), IIf(EBOp(OEq, ERef(RefId(Id("""a"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(83783), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(83784), IReturn(ERef(RefId(Id("""__x4__""")))).setId(83785))).setId(83876), ISeq(List()).setId(83877)).setId(83787), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIteratorNextIndex""")))).setId(83789), ILet(Id("""itemKind"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ArrayIterationKind""")))).setId(83791), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""a""")), EStr("""TypedArrayName"""))), EAbsent)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""IsDetachedBuffer"""))), List(ERef(RefProp(RefId(Id("""a""")), EStr("""ViewedArrayBuffer"""))))).setId(83793), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(83794), IReturn(ERef(RefId(Id("""__x6__""")))).setId(83795))).setId(83884), ISeq(List()).setId(83885)).setId(83797), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""a""")), EStr("""ArrayLength""")))).setId(83799))).setId(83888), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""a"""))))).setId(83802), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(83803), IReturn(ERef(RefId(Id("""__x7__""")))).setId(83804)).setId(83805), ISeq(List()).setId(83893)).setId(83806), ILet(Id("""len"""), ERef(RefId(Id("""__x7__""")))).setId(83807))).setId(83896)).setId(83810), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IAssign(RefProp(RefId(Id("""O""")), EStr("""IteratedObject""")), EUndef).setId(83812), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(83814), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(83815), IReturn(ERef(RefId(Id("""__x9__""")))).setId(83816))).setId(83902), ISeq(List()).setId(83903)).setId(83819), IAssign(RefProp(RefId(Id("""O""")), EStr("""ArrayIteratorNextIndex""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(83821), IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""key""")), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""index"""))), EBool(false))).setId(83823), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(83824), IReturn(ERef(RefId(Id("""__x11__""")))).setId(83825))).setId(83909), ISeq(List()).setId(83910)).setId(83827), IApp(Id("""__x12__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))).setId(83829), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(83830), IReturn(ERef(RefId(Id("""__x12__""")))).setId(83831)).setId(83832), ISeq(List()).setId(83916)).setId(83833), ILet(Id("""elementKey"""), ERef(RefId(Id("""__x12__""")))).setId(83834), IApp(Id("""__x13__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""a"""))), ERef(RefId(Id("""elementKey"""))))).setId(83836), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(83837), IReturn(ERef(RefId(Id("""__x13__""")))).setId(83838)).setId(83839), ISeq(List()).setId(83923)).setId(83840), ILet(Id("""elementValue"""), ERef(RefId(Id("""__x13__""")))).setId(83841), IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""value""")), ILet(Id("""result"""), ERef(RefId(Id("""elementValue""")))).setId(83843), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(EList(List(ERef(RefId(Id("""index"""))), ERef(RefId(Id("""elementValue"""))))))).setId(83845), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(83846), IReturn(ERef(RefId(Id("""__x14__""")))).setId(83847)).setId(83848), ISeq(List()).setId(83931)).setId(83849), ILet(Id("""result"""), ERef(RefId(Id("""__x14__""")))).setId(83850))).setId(83934)).setId(83853), IApp(Id("""__x15__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""result"""))), EBool(false))).setId(83855), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))).setId(83856), IReturn(ERef(RefId(Id("""__x16__""")))).setId(83857))).setId(83939))
  val instToStepMap: Map[Int, Int] = HashMap(83840 -> 27, 83797 -> 14, 83770 -> 1, 83781 -> 5, 83789 -> 8, 83819 -> 22, 83844 -> 28, 83829 -> 26, 83851 -> 32, 83808 -> 17, 83787 -> 7, 83810 -> 17, 83854 -> 32, 83780 -> 4, 83807 -> 17, 83843 -> 28, 83816 -> 21, 83779 -> 4, 83775 -> 2, 83822 -> 23, 83790 -> 8, 83858 -> 33, 83811 -> 17, 83784 -> 6, 83812 -> 21, 83801 -> 14, 83768 -> 0, 83783 -> 6, 83824 -> 24, 83772 -> 1, 83856 -> 33, 83815 -> 21, 83833 -> 26, 83836 -> 27, 83792 -> 9, 83852 -> 32, 83796 -> 12, 83776 -> 3, 83793 -> 14, 83791 -> 9, 83778 -> 3, 83857 -> 33, 83823 -> 24, 83825 -> 24, 83855 -> 33, 83800 -> 14, 83842 -> 27, 83769 -> 2, 83828 -> 25, 83785 -> 6, 83802 -> 17, 83799 -> 14, 83849 -> 32, 83788 -> 7, 83767 -> 0, 83782 -> 5, 83814 -> 21, 83817 -> 21, 83820 -> 22, 83827 -> 25, 83853 -> 32, 83809 -> 17, 83834 -> 26, 83841 -> 27, 83777 -> 3, 83773 -> 32, 83826 -> 24, 83835 -> 26, 83786 -> 6, 83813 -> 21, 83798 -> 14, 83850 -> 32, 83794 -> 12, 83771 -> 1, 83818 -> 21, 83821 -> 23, 83806 -> 17, 83774 -> 2, 83845 -> 32, 83795 -> 12)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(83768, 83767), 5 -> HashSet(83782, 83781), 14 -> HashSet(83797, 83801, 83793, 83800, 83799, 83798), 20 -> HashSet(83812, 83813), 1 -> HashSet(83772, 83770, 83771), 6 -> HashSet(83784, 83783, 83785, 83786), 9 -> HashSet(83792, 83791), 13 -> HashSet(83797, 83793, 83798), 2 -> HashSet(83775, 83769, 83774), 12 -> HashSet(83796, 83794, 83795), 7 -> HashSet(83787, 83788), 3 -> HashSet(83776, 83778, 83777), 31 -> HashSet(83773), 8 -> HashSet(83790, 83789), 4 -> HashSet(83780, 83779), 24 -> HashSet(83824, 83826, 83823, 83825), 25 -> HashSet(83828, 83827), 28 -> HashSet(83844, 83843), 21 -> HashSet(83816, 83812, 83815, 83814, 83817, 83813, 83818), 33 -> HashSet(83858, 83856, 83857, 83855), 32 -> HashSet(83851, 83854, 83852, 83849, 83853, 83773, 83850, 83845), 17 -> HashSet(83807, 83811, 83802, 83809, 83806, 83808, 83810), 22 -> HashSet(83819, 83820), 27 -> HashSet(83840, 83836, 83842, 83841), 26 -> HashSet(83829, 83833, 83834, 83835), 23 -> HashSet(83822, 83821))
  /* Beautified form:
  "GLOBAL.INTRINSIC_ArrayIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (= absent O["IteratedObject"]) (|| (= absent O["ArrayIteratorNextIndex"]) (= absent O["ArrayIterationKind"]))) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let a = O["IteratedObject"]
    if (= a undefined) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let index = O["ArrayIteratorNextIndex"]
    let itemKind = O["ArrayIterationKind"]
    if (! (= a["TypedArrayName"] absent)) {
      app __x5__ = (IsDetachedBuffer a["ViewedArrayBuffer"])
      if (= __x5__ true) {
        app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x6__
      } else {}
      let len = a["ArrayLength"]
    } else {
      app __x7__ = (LengthOfArrayLike a)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let len = __x7__
    }
    if (! (< index len)) {
      O["IteratedObject"] = undefined
      app __x8__ = (CreateIterResultObject undefined true)
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    O["ArrayIteratorNextIndex"] = (+ index 1i)
    if (= itemKind "key") {
      app __x10__ = (CreateIterResultObject index false)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (ToString index)
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let elementKey = __x12__
    app __x13__ = (Get a elementKey)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let elementValue = __x13__
    if (= itemKind "value") let result = elementValue else {
      app __x14__ = (CreateArrayFromList (new [index, elementValue]))
      if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let result = __x14__
    }
    app __x15__ = (CreateIterResultObject result false)
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }
  */
}
