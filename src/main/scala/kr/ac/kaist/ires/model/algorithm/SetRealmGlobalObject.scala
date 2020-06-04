package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetRealmGlobalObject {
  val length: Int = 3
  val func: Func = Func("""SetRealmGlobalObject""", List(Id("""realmRec"""), Id("""globalObj"""), Id("""thisValue""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""globalObj"""))), EUndef), ISeq(List(ILet(Id("""intrinsics"""), ERef(RefProp(RefId(Id("""realmRec""")), EStr("""Intrinsics""")))).setId(8274), IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_ObjectPrototype"""))))).setId(8276), IAssign(RefId(Id("""globalObj""")), ERef(RefId(Id("""__x0__""")))).setId(8277))).setId(8279), ISeq(List()).setId(8280)).setId(8281), IIf(EBOp(OEq, ERef(RefId(Id("""thisValue"""))), EUndef), IAssign(RefId(Id("""thisValue""")), ERef(RefId(Id("""globalObj""")))).setId(8283), ISeq(List()).setId(8280)).setId(8285), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalObject""")), ERef(RefId(Id("""globalObj""")))).setId(8287), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewGlobalEnvironment"""))), List(ERef(RefId(Id("""globalObj"""))), ERef(RefId(Id("""thisValue"""))))).setId(8289), ILet(Id("""newGlobalEnv"""), ERef(RefId(Id("""__x1__""")))).setId(8290), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalEnv""")), ERef(RefId(Id("""newGlobalEnv""")))).setId(8292), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""realmRec"""))))).setId(8294), IReturn(ERef(RefId(Id("""__x2__""")))).setId(8295))).setId(-1))
  /* Beautified form:
  "SetRealmGlobalObject" (realmRec, globalObj, thisValue) => {
    if (= globalObj undefined) {
      let intrinsics = realmRec["Intrinsics"]
      app __x0__ = (ObjectCreate intrinsics["INTRINSIC_ObjectPrototype"])
      globalObj = __x0__
    } else {}
    if (= thisValue undefined) thisValue = globalObj else {}
    realmRec["GlobalObject"] = globalObj
    app __x1__ = (NewGlobalEnvironment globalObj thisValue)
    let newGlobalEnv = __x1__
    realmRec["GlobalEnv"] = newGlobalEnv
    app __x2__ = (WrapCompletion realmRec)
    return __x2__
  }
  */
}
