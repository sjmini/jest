package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryCallBindThis {
  val length: Int = 3
  val func: Func = Func("""OrdinaryCallBindThis""", List(Id("""F"""), Id("""calleeContext"""), Id("""thisArgument""")), None, ISeq(List(ILet(Id("""thisMode"""), ERef(RefProp(RefId(Id("""F""")), EStr("""ThisMode""")))).setId(51503), IIf(EBOp(OEq, ERef(RefId(Id("""thisMode"""))), ERef(RefId(Id("""CONST_lexical""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(51505), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(51506), IReturn(ERef(RefId(Id("""__x1__""")))).setId(51507))).setId(51508), ISeq(List()).setId(51509)).setId(51510), ILet(Id("""calleeRealm"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))).setId(51512), IAccess(Id("""__x2__"""), ERef(RefId(Id("""calleeContext"""))), EStr("""LexicalEnvironment""")).setId(51514), ILet(Id("""localEnv"""), ERef(RefId(Id("""__x2__""")))).setId(51515), IIf(EBOp(OEq, ERef(RefId(Id("""thisMode"""))), ERef(RefId(Id("""CONST_strict""")))), ILet(Id("""thisValue"""), ERef(RefId(Id("""thisArgument""")))).setId(51517), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""thisArgument"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""thisArgument"""))), ENull)), ISeq(List(ILet(Id("""globalEnv"""), ERef(RefProp(RefId(Id("""calleeRealm""")), EStr("""GlobalEnv""")))).setId(51519), ILet(Id("""globalEnvRec"""), ERef(RefProp(RefId(Id("""globalEnv""")), EStr("""EnvironmentRecord""")))).setId(51521), ILet(Id("""thisValue"""), ERef(RefProp(RefId(Id("""globalEnvRec""")), EStr("""GlobalThisValue""")))).setId(51523))).setId(51525), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""thisArgument"""))))).setId(51526), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(51527), IReturn(ERef(RefId(Id("""__x3__""")))).setId(51528)).setId(51529), ISeq(List()).setId(51509)).setId(51530), ILet(Id("""thisValue"""), ERef(RefId(Id("""__x3__""")))).setId(51531))).setId(51533)).setId(51534)).setId(51537), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""localEnv""")), EStr("""EnvironmentRecord""")))).setId(51539), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""BindThisValue"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""thisValue"""))))).setId(51541), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(51542), IReturn(ERef(RefId(Id("""__x5__""")))).setId(51543))).setId(-1))
  /* Beautified form:
  "OrdinaryCallBindThis" (F, calleeContext, thisArgument) => {
    let thisMode = F["ThisMode"]
    if (= thisMode CONST_lexical) {
      app __x0__ = (NormalCompletion undefined)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    let calleeRealm = F["Realm"]
    access __x2__ = (calleeContext "LexicalEnvironment")
    let localEnv = __x2__
    if (= thisMode CONST_strict) let thisValue = thisArgument else if (|| (= thisArgument undefined) (= thisArgument null)) {
      let globalEnv = calleeRealm["GlobalEnv"]
      let globalEnvRec = globalEnv["EnvironmentRecord"]
      let thisValue = globalEnvRec["GlobalThisValue"]
    } else {
      app __x3__ = (ToObject thisArgument)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let thisValue = __x3__
    }
    let envRec = localEnv["EnvironmentRecord"]
    app __x4__ = (envRec["BindThisValue"] envRec thisValue)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
