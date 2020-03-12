package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTCall {
  val length: Int = 2
  val func: Func = Func("""ProxyExoticObject.Call""", List(Id("""O"""), Id("""thisArgument"""), Id("""argumentsList""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(60881), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(60883), IReturn(ERef(RefId(Id("""__x0__""")))).setId(60884))).setId(60928), ISeq(List()).setId(60929)).setId(60887), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(60889), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""apply"""))).setId(60891), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(60892), IReturn(ERef(RefId(Id("""__x1__""")))).setId(60893)).setId(60894), ISeq(List()).setId(60936)).setId(60895), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(60896), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""thisArgument"""))), ERef(RefId(Id("""argumentsList"""))))).setId(60898), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(60899), IReturn(ERef(RefId(Id("""__x2__""")))).setId(60900)).setId(60901), ISeq(List()).setId(60943)).setId(60902), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(60903), IReturn(ERef(RefId(Id("""__x3__""")))).setId(60904))).setId(60947), ISeq(List()).setId(60948)).setId(60907), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""argumentsList"""))))).setId(60909), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(60910), IReturn(ERef(RefId(Id("""__x4__""")))).setId(60911)).setId(60912), ISeq(List()).setId(60954)).setId(60913), ILet(Id("""argArray"""), ERef(RefId(Id("""__x4__""")))).setId(60914), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""thisArgument"""))), ERef(RefId(Id("""argArray"""))))))).setId(60916), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(60917), IReturn(ERef(RefId(Id("""__x5__""")))).setId(60918)).setId(60919), ISeq(List()).setId(60961)).setId(60920), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(60921), IReturn(ERef(RefId(Id("""__x6__""")))).setId(60922))).setId(60965))
  val instToStepMap: Map[Int, Int] = HashMap(60884 -> 1, 60916 -> 11, 60903 -> 8, 60907 -> 9, 60890 -> 4, 60885 -> 1, 60913 -> 10, 60909 -> 10, 60896 -> 5, 60914 -> 10, 60897 -> 5, 60905 -> 8, 60902 -> 8, 60908 -> 9, 60922 -> 11, 60904 -> 8, 60887 -> 2, 60881 -> 0, 60889 -> 4, 60920 -> 11, 60906 -> 8, 60886 -> 3, 60888 -> 2, 60882 -> 0, 60921 -> 11, 60895 -> 5, 60923 -> 11, 60915 -> 10, 60883 -> 1, 60898 -> 8, 60891 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(60881, 60882), 5 -> HashSet(60896, 60897, 60895, 60891), 10 -> HashSet(60913, 60909, 60914, 60915), 1 -> HashSet(60884, 60885, 60883), 9 -> HashSet(60907, 60908), 2 -> HashSet(60887, 60888), 3 -> HashSet(60886), 11 -> HashSet(60916, 60922, 60920, 60921, 60923), 8 -> HashSet(60903, 60904, 60906, 60905, 60902, 60898), 4 -> HashSet(60890, 60889))
  /* Beautified form:
  "ProxyExoticObject.Call" (O, thisArgument, argumentsList) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "apply")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (Call target thisArgument argumentsList)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (CreateArrayFromList argumentsList)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let argArray = __x4__
    app __x5__ = (Call trap handler (new [target, thisArgument, argArray]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
