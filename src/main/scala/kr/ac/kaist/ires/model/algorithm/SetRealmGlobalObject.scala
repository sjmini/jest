package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SetRealmGlobalObject {
  val length: Int = 3
  val func: Func = Func("""SetRealmGlobalObject""", List(Id("""realmRec"""), Id("""globalObj"""), Id("""thisValue""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""globalObj"""))), EUndef), ISeq(List(ILet(Id("""intrinsics"""), ERef(RefProp(RefId(Id("""realmRec""")), EStr("""Intrinsics""")))).setId(8274), IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefProp(RefId(Id("""intrinsics""")), EStr("""INTRINSIC_ObjectPrototype"""))))).setId(8276), IAssign(RefId(Id("""globalObj""")), ERef(RefId(Id("""__x0__""")))).setId(8277))).setId(8301), ISeq(List()).setId(8302)).setId(8281), IIf(EBOp(OEq, ERef(RefId(Id("""thisValue"""))), EUndef), IAssign(RefId(Id("""thisValue""")), ERef(RefId(Id("""globalObj""")))).setId(8283), ISeq(List()).setId(8305)).setId(8285), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalObject""")), ERef(RefId(Id("""globalObj""")))).setId(8287), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewGlobalEnvironment"""))), List(ERef(RefId(Id("""globalObj"""))), ERef(RefId(Id("""thisValue"""))))).setId(8289), ILet(Id("""newGlobalEnv"""), ERef(RefId(Id("""__x1__""")))).setId(8290), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalEnv""")), ERef(RefId(Id("""newGlobalEnv""")))).setId(8292), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""realmRec"""))))).setId(8294), IReturn(ERef(RefId(Id("""__x2__""")))).setId(8295))).setId(8313))
  val instToStepMap: Map[Int, Int] = HashMap(8284 -> 6, 8287 -> 8, 8282 -> 4, 8275 -> 3, 8294 -> 11, 8279 -> 3, 8290 -> 9, 8286 -> 7, 8276 -> 3, 8281 -> 4, 8295 -> 11, 8285 -> 7, 8292 -> 10, 8296 -> 11, 8277 -> 3, 8288 -> 8, 8283 -> 6, 8278 -> 3, 8293 -> 10, 8274 -> 3, 8289 -> 9, 8280 -> 5, 8291 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(8280), 10 -> HashSet(8293, 8292), 6 -> HashSet(8283, 8284), 9 -> HashSet(8289, 8290, 8291), 2 -> HashSet(8274, 8275), 7 -> HashSet(8286, 8285), 3 -> HashSet(8278, 8274, 8275, 8279, 8276, 8277), 11 -> HashSet(8294, 8295, 8296), 8 -> HashSet(8288, 8287), 4 -> HashSet(8282, 8281))
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
