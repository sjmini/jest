package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTevery {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.every""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(76759), ILet(Id("""callbackfn"""), ERef(RefId(Id("""__x0__""")))).setId(76760), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(76762), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(76763), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(76765), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(76766), IReturn(ERef(RefId(Id("""__x2__""")))).setId(76767)).setId(76768), ISeq(List()).setId(76852)).setId(76770), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(76771), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(76773), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(76774), IReturn(ERef(RefId(Id("""__x3__""")))).setId(76775)).setId(76776), ISeq(List()).setId(76859)).setId(76777), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(76778), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""callbackfn"""))))).setId(76780), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(76781), IReturn(ERef(RefId(Id("""__x5__""")))).setId(76782))).setId(76865), ISeq(List()).setId(76866)).setId(76784), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(76786), ILet(Id("""T"""), EUndef).setId(76788)).setId(76790), ILet(Id("""k"""), EINum(0L)).setId(76792), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(76794), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(76795), IReturn(ERef(RefId(Id("""__x6__""")))).setId(76796)).setId(76797), ISeq(List()).setId(76876)).setId(76798), ILet(Id("""Pk"""), ERef(RefId(Id("""__x6__""")))).setId(76799), IApp(Id("""__x7__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(76801), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(76802), IReturn(ERef(RefId(Id("""__x7__""")))).setId(76803)).setId(76804), ISeq(List()).setId(76883)).setId(76805), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x7__""")))).setId(76806), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(76808), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(76809), IReturn(ERef(RefId(Id("""__x8__""")))).setId(76810)).setId(76811), ISeq(List()).setId(76890)).setId(76812), ILet(Id("""kValue"""), ERef(RefId(Id("""__x8__""")))).setId(76813), IApp(Id("""__x9__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""callbackfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""O"""))))))).setId(76815), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(76816), IReturn(ERef(RefId(Id("""__x9__""")))).setId(76817)).setId(76818), ISeq(List()).setId(76897)).setId(76819), IApp(Id("""__x10__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(76820), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(76821), IReturn(ERef(RefId(Id("""__x10__""")))).setId(76822)).setId(76823), ISeq(List()).setId(76903)).setId(76824), ILet(Id("""testResult"""), ERef(RefId(Id("""__x10__""")))).setId(76825), IIf(EBOp(OEq, ERef(RefId(Id("""testResult"""))), EBool(false)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(76827), IReturn(ERef(RefId(Id("""__x11__""")))).setId(76828))).setId(76908), ISeq(List()).setId(76909)).setId(76830))).setId(76911), ISeq(List()).setId(76912)).setId(76833), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(76835))).setId(76915)).setId(76838), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(76840), IReturn(ERef(RefId(Id("""__x12__""")))).setId(76841))).setId(76919))
  val instToStepMap: Map[Int, Int] = HashMap(76830 -> 17, 76786 -> 6, 76785 -> 5, 76761 -> 0, 76842 -> 20, 76835 -> 19, 76794 -> 19, 76762 -> 1, 76781 -> 4, 76820 -> 17, 76783 -> 4, 76837 -> 19, 76806 -> 19, 76778 -> 3, 76763 -> 1, 76813 -> 17, 76834 -> 19, 76826 -> 17, 76831 -> 17, 76841 -> 20, 76771 -> 2, 76805 -> 19, 76800 -> 19, 76779 -> 3, 76764 -> 1, 76819 -> 17, 76827 -> 17, 76833 -> 19, 76815 -> 17, 76789 -> 6, 76760 -> 0, 76792 -> 7, 76801 -> 19, 76793 -> 7, 76832 -> 17, 76770 -> 2, 76814 -> 17, 76784 -> 5, 76836 -> 19, 76840 -> 20, 76780 -> 5, 76798 -> 19, 76791 -> 6, 76828 -> 17, 76773 -> 3, 76759 -> 0, 76777 -> 3, 76788 -> 6, 76808 -> 17, 76790 -> 6, 76765 -> 2, 76838 -> 19, 76824 -> 17, 76839 -> 19, 76782 -> 4, 76829 -> 17, 76772 -> 2, 76812 -> 17, 76787 -> 6, 76825 -> 17, 76807 -> 19, 76799 -> 19)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(76760, 76761, 76759), 5 -> HashSet(76785, 76784, 76780), 20 -> HashSet(76841, 76842, 76840), 1 -> HashSet(76763, 76764, 76762), 6 -> HashSet(76786, 76789, 76791, 76788, 76790, 76787), 2 -> HashSet(76771, 76770, 76765, 76772), 17 -> HashSet(76820, 76830, 76813, 76819, 76828, 76808, 76824, 76829, 76812, 76825, 76826, 76831, 76815, 76827, 76832, 76814), 12 -> HashSet(76806, 76805, 76801, 76807), 7 -> HashSet(76792, 76793), 3 -> HashSet(76778, 76779, 76773, 76777), 18 -> HashSet(76834, 76833), 16 -> HashSet(76820, 76826, 76819, 76815, 76824, 76825), 11 -> HashSet(76800, 76798, 76794, 76799), 19 -> HashSet(76837, 76806, 76834, 76833, 76801, 76836, 76798, 76835, 76794, 76805, 76800, 76838, 76839, 76807, 76799), 4 -> HashSet(76783, 76782, 76781), 15 -> HashSet(76813, 76814, 76808, 76812))
  /* Beautified form:
  "GLOBAL.Array.prototype.every" (this, argumentsList, NewTarget) => {
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
    let k = 0i
    while (< k len) {
      app __x6__ = (ToString k)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let Pk = __x6__
      app __x7__ = (HasProperty O Pk)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let kPresent = __x7__
      if (= kPresent true) {
        app __x8__ = (Get O Pk)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let kValue = __x8__
        app __x9__ = (Call callbackfn T (new [kValue, k, O]))
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        app __x10__ = (ToBoolean __x9__)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let testResult = __x10__
        if (= testResult false) {
          app __x11__ = (WrapCompletion false)
          return __x11__
        } else {}
      } else {}
      k = (+ k 1i)
    }
    app __x12__ = (WrapCompletion true)
    return __x12__
  }
  */
}
