package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetIdentifierReference {
  val length: Int = 3
  val func: Func = Func("""GetIdentifierReference""", List(Id("""lex"""), Id("""name"""), Id("""strict""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""lex"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), EUndef), (EStr("""ReferencedName"""), ERef(RefId(Id("""name""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))).setId(7866), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7867))).setId(7902), ISeq(List()).setId(7903)).setId(7871), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""lex""")), EStr("""EnvironmentRecord""")))).setId(7873), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(7875), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(7876), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7877)).setId(7878), ISeq(List()).setId(7910)).setId(7879), ILet(Id("""exists"""), ERef(RefId(Id("""__x1__""")))).setId(7880), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), ERef(RefId(Id("""envRec""")))), (EStr("""ReferencedName"""), ERef(RefId(Id("""name""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))).setId(7882), IReturn(ERef(RefId(Id("""__x2__""")))).setId(7883))).setId(7915), ISeq(List(ILet(Id("""outer"""), ERef(RefProp(RefId(Id("""lex""")), EStr("""Outer""")))).setId(7886), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetIdentifierReference"""))), List(ERef(RefId(Id("""outer"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""strict"""))))).setId(7888), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(7889), IReturn(ERef(RefId(Id("""__x3__""")))).setId(7890)).setId(7891), ISeq(List()).setId(7921)).setId(7892), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(7893), IReturn(ERef(RefId(Id("""__x4__""")))).setId(7894))).setId(7925)).setId(7897))).setId(7927))
  val instToStepMap: Map[Int, Int] = HashMap(7867 -> 2, 7894 -> 12, 7882 -> 8, 7885 -> 8, 7881 -> 5, 7874 -> 4, 7866 -> 2, 7875 -> 5, 7884 -> 8, 7879 -> 5, 7872 -> 3, 7887 -> 12, 7880 -> 5, 7893 -> 12, 7888 -> 12, 7886 -> 12, 7873 -> 4, 7871 -> 3, 7898 -> 12, 7895 -> 12, 7892 -> 12, 7869 -> 2, 7896 -> 12, 7897 -> 12, 7868 -> 2, 7883 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(7881, 7875, 7879, 7880), 2 -> HashSet(7867, 7866, 7869, 7868), 12 -> HashSet(7894, 7892, 7887, 7893, 7888, 7886, 7898, 7895, 7896, 7897), 3 -> HashSet(7871, 7872), 11 -> HashSet(7886, 7887), 8 -> HashSet(7882, 7885, 7884, 7883), 4 -> HashSet(7873, 7874))
  /* Beautified form:
  "GetIdentifierReference" (lex, name, strict) => {
    if (= lex null) {
      app __x0__ = (WrapCompletion (new Reference("BaseValue" -> undefined, "ReferencedName" -> name, "StrictReference" -> strict)))
      return __x0__
    } else {}
    let envRec = lex["EnvironmentRecord"]
    app __x1__ = (envRec["HasBinding"] envRec name)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let exists = __x1__
    if (= exists true) {
      app __x2__ = (WrapCompletion (new Reference("BaseValue" -> envRec, "ReferencedName" -> name, "StrictReference" -> strict)))
      return __x2__
    } else {
      let outer = lex["Outer"]
      app __x3__ = (GetIdentifierReference outer name strict)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    }
  }
  */
}
