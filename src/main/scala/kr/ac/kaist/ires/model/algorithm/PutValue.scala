package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PutValue {
  val length: Int = 2
  val func: Func = Func("""PutValue""", List(Id("""V"""), Id("""W""")), None, ISeq(List(IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""V""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""V""")), EStr("""Value""")))).setId(762), IReturn(ERef(RefId(Id("""V""")))).setId(763)).setId(764), ISeq(List()).setId(861)).setId(766), IExpr(ERef(RefId(Id("""V""")))).setId(767), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""W""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""W""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""W""")), ERef(RefProp(RefId(Id("""W""")), EStr("""Value""")))).setId(769), IReturn(ERef(RefId(Id("""W""")))).setId(770)).setId(771), ISeq(List()).setId(867)).setId(772), IExpr(ERef(RefId(Id("""W""")))).setId(773), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))).setId(775), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(776), IReturn(ERef(RefId(Id("""__x1__""")))).setId(777))).setId(873), ISeq(List()).setId(874)).setId(779), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""V"""))))).setId(781), ILet(Id("""base"""), ERef(RefId(Id("""__x2__""")))).setId(782), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""V"""))))).setId(784), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""V"""))))).setId(785), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(786), IReturn(ERef(RefId(Id("""__x5__""")))).setId(787))).setId(882), ISeq(List()).setId(883)).setId(790), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetGlobalObject"""))), List()).setId(792), ILet(Id("""globalObj"""), ERef(RefId(Id("""__x6__""")))).setId(793), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))).setId(795), IApp(Id("""__x8__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""globalObj"""))), ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""W"""))), EBool(false))).setId(796), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(797), IReturn(ERef(RefId(Id("""__x8__""")))).setId(798)).setId(799), ISeq(List()).setId(892)).setId(800), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(801), IReturn(ERef(RefId(Id("""__x9__""")))).setId(802))).setId(896), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""V"""))))).setId(805), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(true)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""HasPrimitiveBase"""))), List(ERef(RefId(Id("""V"""))))).setId(806), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), EBool(true)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""base"""))))).setId(807), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(808), IReturn(ERef(RefId(Id("""__x12__""")))).setId(809)).setId(810), ISeq(List()).setId(903)).setId(811), IAssign(RefId(Id("""base""")), ERef(RefId(Id("""__x12__""")))).setId(812))).setId(906), ISeq(List()).setId(907)).setId(815), IApp(Id("""__x13__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))).setId(817), IApp(Id("""__x14__"""), ERef(RefId(Id("""GetThisValue"""))), List(ERef(RefId(Id("""V"""))))).setId(818), IApp(Id("""__x15__"""), ERef(RefProp(RefId(Id("""base""")), EStr("""Set"""))), List(ERef(RefId(Id("""base"""))), ERef(RefId(Id("""__x13__"""))), ERef(RefId(Id("""W"""))), ERef(RefId(Id("""__x14__"""))))).setId(819), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(820), IReturn(ERef(RefId(Id("""__x15__""")))).setId(821)).setId(822), ISeq(List()).setId(915)).setId(823), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x15__""")))).setId(824), ILet(Id("""__x16__"""), EBOp(OEq, ERef(RefId(Id("""succeeded"""))), EBool(false))).setId(831), IIf(ERef(RefId(Id("""__x16__"""))), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""V"""))))).setId(826), IAssign(RefId(Id("""__x16__""")), EBOp(OEq, ERef(RefId(Id("""__x17__"""))), EBool(true))).setId(829))).setId(921), ISeq(List()).setId(922)).setId(832), IIf(ERef(RefId(Id("""__x16__"""))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(833), IReturn(ERef(RefId(Id("""__x18__""")))).setId(834))).setId(926), ISeq(List()).setId(927)).setId(836), IApp(Id("""__x19__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(838), IReturn(ERef(RefId(Id("""__x19__""")))).setId(839))).setId(931), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))).setId(842), IApp(Id("""__x21__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""V"""))))).setId(843), IApp(Id("""__x22__"""), ERef(RefProp(RefId(Id("""base""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""base"""))), ERef(RefId(Id("""__x20__"""))), ERef(RefId(Id("""W"""))), ERef(RefId(Id("""__x21__"""))))).setId(844), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x22__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x22__""")), ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Value""")))).setId(845), IReturn(ERef(RefId(Id("""__x22__""")))).setId(846)).setId(847), ISeq(List()).setId(938)).setId(848), IApp(Id("""__x23__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x22__"""))))).setId(849), IReturn(ERef(RefId(Id("""__x23__""")))).setId(850))).setId(942)).setId(853))).setId(944)).setId(855))).setId(946))
  val instToStepMap: Map[Int, Int] = HashMap(777 -> 2, 814 -> 18, 793 -> 12, 783 -> 4, 844 -> 27, 782 -> 4, 841 -> 23, 785 -> 12, 838 -> 23, 802 -> 12, 817 -> 23, 853 -> 27, 789 -> 9, 834 -> 21, 806 -> 23, 766 -> 0, 774 -> 1, 849 -> 27, 825 -> 23, 778 -> 2, 788 -> 9, 815 -> 23, 852 -> 27, 842 -> 27, 837 -> 23, 779 -> 3, 792 -> 12, 805 -> 27, 765 -> 27, 773 -> 1, 794 -> 12, 824 -> 23, 856 -> 27, 819 -> 23, 843 -> 27, 772 -> 1, 787 -> 9, 804 -> 12, 831 -> 23, 784 -> 27, 811 -> 18, 816 -> 23, 848 -> 27, 768 -> 0, 780 -> 3, 851 -> 27, 795 -> 12, 812 -> 18, 823 -> 23, 836 -> 23, 776 -> 2, 855 -> 27, 791 -> 12, 840 -> 23, 813 -> 18, 786 -> 9, 781 -> 4, 832 -> 23, 800 -> 12, 833 -> 21, 835 -> 21, 818 -> 23, 854 -> 27, 790 -> 12, 801 -> 12, 807 -> 18, 767 -> 0, 796 -> 12, 839 -> 23, 850 -> 27, 803 -> 12, 775 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(766, 768, 767), 10 -> HashSet(785, 791, 790), 20 -> HashSet(817, 825, 824, 819, 823, 818), 1 -> HashSet(774, 773, 772), 21 -> HashSet(834, 833, 835), 9 -> HashSet(789, 788, 787, 786), 2 -> HashSet(777, 778, 776), 17 -> HashSet(765), 12 -> HashSet(793, 804, 795, 791, 800, 790, 803, 785, 802, 792, 794, 801, 796), 3 -> HashSet(779, 780, 775), 18 -> HashSet(814, 765, 811, 812, 813, 807), 11 -> HashSet(793, 792, 794), 19 -> HashSet(806, 815, 816), 4 -> HashSet(782, 783, 781), 22 -> HashSet(837, 831, 836, 832), 27 -> HashSet(853, 849, 856, 843, 784, 848, 851, 855, 844, 854, 850, 852, 842, 805, 765), 26 -> HashSet(765), 23 -> HashSet(841, 838, 817, 806, 837, 824, 819, 831, 816, 840, 832, 818, 839, 825, 815, 823, 836))
  /* Beautified form:
  "PutValue" (V, W) => {
    if (= (typeof V) "Completion") if (= V["Type"] CONST_normal) V = V["Value"] else return V else {}
    V
    if (= (typeof W) "Completion") if (= W["Type"] CONST_normal) W = W["Value"] else return W else {}
    W
    app __x0__ = (Type V)
    if (! (= __x0__ Reference)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (GetBase V)
    let base = __x2__
    app __x3__ = (IsUnresolvableReference V)
    if (= __x3__ true) {
      app __x4__ = (IsStrictReference V)
      if (= __x4__ true) {
        app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x5__
      } else {}
      app __x6__ = (GetGlobalObject )
      let globalObj = __x6__
      app __x7__ = (GetReferencedName V)
      app __x8__ = (Set globalObj __x7__ W false)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {
      app __x10__ = (IsPropertyReference V)
      if (= __x10__ true) {
        app __x11__ = (HasPrimitiveBase V)
        if (= __x11__ true) {
          app __x12__ = (ToObject base)
          if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
          base = __x12__
        } else {}
        app __x13__ = (GetReferencedName V)
        app __x14__ = (GetThisValue V)
        app __x15__ = (base["Set"] base __x13__ W __x14__)
        if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        let succeeded = __x15__
        let __x16__ = (= succeeded false)
        if __x16__ {
          app __x17__ = (IsStrictReference V)
          __x16__ = (= __x17__ true)
        } else {}
        if __x16__ {
          app __x18__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x18__
        } else {}
        app __x19__ = (NormalCompletion undefined)
        return __x19__
      } else {
        app __x20__ = (GetReferencedName V)
        app __x21__ = (IsStrictReference V)
        app __x22__ = (base["SetMutableBinding"] base __x20__ W __x21__)
        if (= (typeof __x22__) "Completion") if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
        app __x23__ = (WrapCompletion __x22__)
        return __x23__
      }
    }
  }
  */
}
