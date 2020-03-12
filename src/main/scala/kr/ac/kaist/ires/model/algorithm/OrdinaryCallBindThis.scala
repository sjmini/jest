package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryCallBindThis {
  val length: Int = 3
  val func: Func = Func("""OrdinaryCallBindThis""", List(Id("""F"""), Id("""calleeContext"""), Id("""thisArgument""")), None, ISeq(List(ILet(Id("""thisMode"""), ERef(RefProp(RefId(Id("""F""")), EStr("""ThisMode""")))).setId(51503), IIf(EBOp(OEq, ERef(RefId(Id("""thisMode"""))), ERef(RefId(Id("""CONST_lexical""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(51505), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(51506), IReturn(ERef(RefId(Id("""__x1__""")))).setId(51507))).setId(51550), ISeq(List()).setId(51551)).setId(51510), ILet(Id("""calleeRealm"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))).setId(51512), IAccess(Id("""__x2__"""), ERef(RefId(Id("""calleeContext"""))), EStr("""LexicalEnvironment""")).setId(51514), ILet(Id("""localEnv"""), ERef(RefId(Id("""__x2__""")))).setId(51515), IIf(EBOp(OEq, ERef(RefId(Id("""thisMode"""))), ERef(RefId(Id("""CONST_strict""")))), ILet(Id("""thisValue"""), ERef(RefId(Id("""thisArgument""")))).setId(51517), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""thisArgument"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""thisArgument"""))), ENull)), ISeq(List(ILet(Id("""globalEnv"""), ERef(RefProp(RefId(Id("""calleeRealm""")), EStr("""GlobalEnv""")))).setId(51519), ILet(Id("""globalEnvRec"""), ERef(RefProp(RefId(Id("""globalEnv""")), EStr("""EnvironmentRecord""")))).setId(51521), ILet(Id("""thisValue"""), ERef(RefProp(RefId(Id("""globalEnvRec""")), EStr("""GlobalThisValue""")))).setId(51523))).setId(51560), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""thisArgument"""))))).setId(51526), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(51527), IReturn(ERef(RefId(Id("""__x3__""")))).setId(51528)).setId(51529), ISeq(List()).setId(51565)).setId(51530), ILet(Id("""thisValue"""), ERef(RefId(Id("""__x3__""")))).setId(51531))).setId(51568)).setId(51534)).setId(51537), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""localEnv""")), EStr("""EnvironmentRecord""")))).setId(51539), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""BindThisValue"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""thisValue"""))))).setId(51541), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(51542), IReturn(ERef(RefId(Id("""__x5__""")))).setId(51543))).setId(51575))
  val instToStepMap: Map[Int, Int] = HashMap(51519 -> 13, 51533 -> 17, 51530 -> 17, 51515 -> 4, 51543 -> 21, 51507 -> 1, 51511 -> 2, 51516 -> 4, 51504 -> 0, 51517 -> 5, 51538 -> 17, 51513 -> 3, 51532 -> 17, 51535 -> 17, 51510 -> 2, 51505 -> 1, 51541 -> 21, 51514 -> 4, 51509 -> 20, 51536 -> 17, 51540 -> 18, 51508 -> 1, 51521 -> 13, 51512 -> 3, 51544 -> 21, 51503 -> 0, 51526 -> 17, 51539 -> 18, 51524 -> 13, 51520 -> 13, 51531 -> 17, 51534 -> 17, 51525 -> 13, 51542 -> 21, 51506 -> 1, 51523 -> 13, 51522 -> 13, 51518 -> 5, 51537 -> 17)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(51503, 51504), 5 -> HashSet(51517, 51518), 10 -> HashSet(51519, 51520), 20 -> HashSet(51509), 1 -> HashSet(51508, 51507, 51506, 51505), 21 -> HashSet(51544, 51543, 51542, 51541), 13 -> HashSet(51519, 51521, 51522, 51509, 51524, 51520, 51525, 51523), 2 -> HashSet(51511, 51510), 17 -> HashSet(51533, 51530, 51526, 51538, 51532, 51535, 51537, 51509, 51536, 51531, 51534), 12 -> HashSet(51509), 3 -> HashSet(51512, 51513), 18 -> HashSet(51540, 51539), 16 -> HashSet(51530, 51526, 51531, 51532), 11 -> HashSet(51521, 51522), 19 -> HashSet(51509), 4 -> HashSet(51515, 51516, 51514))
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
