package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleNamespaceExoticObjectDOTGet {
  val length: Int = 2
  val func: Func = Func("""ModuleNamespaceExoticObject.Get""", List(Id("""O"""), Id("""P"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(57879), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryGet"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))).setId(57880), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(57881), IReturn(ERef(RefId(Id("""__x1__""")))).setId(57882)).setId(57883), ISeq(List()).setId(57932)).setId(57884), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(57885), IReturn(ERef(RefId(Id("""__x2__""")))).setId(57886))).setId(57936), ISeq(List()).setId(57937)).setId(57889), ILet(Id("""exports"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Exports""")))).setId(57891), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""exports"""))), ERef(RefId(Id("""P"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(57893), IReturn(ERef(RefId(Id("""__x3__""")))).setId(57894))).setId(57942), ISeq(List()).setId(57943)).setId(57896), ILet(Id("""m"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Module""")))).setId(57898), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""m""")), EStr("""ResolveExport"""))), List(ERef(RefId(Id("""m"""))), ERef(RefId(Id("""P"""))))).setId(57900), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(57901), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57902)).setId(57903), ISeq(List()).setId(57950)).setId(57904), ILet(Id("""binding"""), ERef(RefId(Id("""__x4__""")))).setId(57905), ILet(Id("""targetModule"""), ERef(RefProp(RefId(Id("""binding""")), EStr("""Module""")))).setId(57907), ILet(Id("""targetEnv"""), ERef(RefProp(RefId(Id("""targetModule""")), EStr("""Environment""")))).setId(57909), IIf(EBOp(OEq, ERef(RefId(Id("""targetEnv"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(57911), IReturn(ERef(RefId(Id("""__x5__""")))).setId(57912))).setId(57957), ISeq(List()).setId(57958)).setId(57914), ILet(Id("""targetEnvRec"""), ERef(RefProp(RefId(Id("""targetEnv""")), EStr("""EnvironmentRecord""")))).setId(57916), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""targetEnvRec""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""targetEnvRec"""))), ERef(RefProp(RefId(Id("""binding""")), EStr("""BindingName"""))), EBool(true))).setId(57918), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(57919), IReturn(ERef(RefId(Id("""__x6__""")))).setId(57920)).setId(57921), ISeq(List()).setId(57965)).setId(57922), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(57923), IReturn(ERef(RefId(Id("""__x7__""")))).setId(57924))).setId(57969))
  val instToStepMap: Map[Int, Int] = HashMap(57916 -> 16, 57887 -> 3, 57908 -> 11, 57886 -> 3, 57893 -> 6, 57894 -> 6, 57898 -> 8, 57922 -> 17, 57888 -> 3, 57900 -> 9, 57911 -> 14, 57924 -> 17, 57879 -> 4, 57892 -> 5, 57905 -> 9, 57896 -> 7, 57915 -> 15, 57907 -> 11, 57904 -> 9, 57897 -> 7, 57914 -> 15, 57899 -> 8, 57889 -> 4, 57912 -> 14, 57880 -> 3, 57918 -> 17, 57925 -> 17, 57909 -> 13, 57890 -> 4, 57878 -> 12, 57923 -> 17, 57884 -> 3, 57885 -> 3, 57910 -> 13, 57895 -> 6, 57917 -> 16, 57891 -> 5, 57906 -> 9, 57913 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(57878), 5 -> HashSet(57892, 57891), 10 -> HashSet(57878), 14 -> HashSet(57911, 57912, 57913), 6 -> HashSet(57893, 57894, 57895), 9 -> HashSet(57900, 57905, 57904, 57906), 13 -> HashSet(57909, 57910), 17 -> HashSet(57924, 57922, 57923, 57918, 57925), 12 -> HashSet(57878), 7 -> HashSet(57896, 57897), 3 -> HashSet(57887, 57880, 57886, 57888, 57884, 57885), 16 -> HashSet(57916, 57917), 11 -> HashSet(57907, 57908), 8 -> HashSet(57899, 57898), 4 -> HashSet(57879, 57889, 57890), 15 -> HashSet(57915, 57914))
  /* Beautified form:
  "ModuleNamespaceExoticObject.Get" (O, P, Receiver) => {
    app __x0__ = (Type P)
    if (= __x0__ Symbol) {
      app __x1__ = (OrdinaryGet O P Receiver)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let exports = O["Exports"]
    if (! (contains exports P)) {
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {}
    let m = O["Module"]
    app __x4__ = (m["ResolveExport"] m P)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let binding = __x4__
    let targetModule = binding["Module"]
    let targetEnv = targetModule["Environment"]
    if (= targetEnv undefined) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    let targetEnvRec = targetEnv["EnvironmentRecord"]
    app __x6__ = (targetEnvRec["GetBindingValue"] targetEnvRec binding["BindingName"] true)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
