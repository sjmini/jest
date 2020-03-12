package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinarySetPrototypeOf {
  val length: Int = 2
  val func: Func = Func("""OrdinarySetPrototypeOf""", List(Id("""O"""), Id("""V""")), None, ISeq(List(ILet(Id("""current"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Prototype""")))).setId(49238), IApp(Id("""__x0__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""V"""))), ERef(RefId(Id("""current"""))))).setId(49240), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49241), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49242))).setId(49287), ISeq(List()).setId(49288)).setId(49244), ILet(Id("""extensible"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Extensible""")))).setId(49246), IIf(EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49248), IReturn(ERef(RefId(Id("""__x2__""")))).setId(49249))).setId(49293), ISeq(List()).setId(49294)).setId(49251), ILet(Id("""p"""), ERef(RefId(Id("""V""")))).setId(49253), ILet(Id("""done"""), EBool(false)).setId(49255), IWhile(EBOp(OEq, ERef(RefId(Id("""done"""))), EBool(false)), IIf(EBOp(OEq, ERef(RefId(Id("""p"""))), ENull), IAssign(RefId(Id("""done""")), EBool(true)).setId(49257), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""p"""))), ERef(RefId(Id("""O"""))))).setId(49259), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49260), IReturn(ERef(RefId(Id("""__x4__""")))).setId(49261))).setId(49302), IIf(EBool(false), IAssign(RefId(Id("""done""")), EBool(true)).setId(49263), IAssign(RefId(Id("""p""")), ERef(RefProp(RefId(Id("""p""")), EStr("""Prototype""")))).setId(49265)).setId(49267)).setId(49270))).setId(49307)).setId(49272)).setId(49275), IAssign(RefProp(RefId(Id("""O""")), EStr("""Prototype""")), ERef(RefId(Id("""V""")))).setId(49277), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49279), IReturn(ERef(RefId(Id("""__x5__""")))).setId(49280))).setId(49313))
  val instToStepMap: Map[Int, Int] = HashMap(49271 -> 16, 49247 -> 4, 49240 -> 3, 49267 -> 16, 49270 -> 16, 49245 -> 3, 49256 -> 8, 49265 -> 16, 49252 -> 6, 49242 -> 2, 49268 -> 16, 49251 -> 6, 49254 -> 7, 49257 -> 11, 49274 -> 16, 49261 -> 12, 49248 -> 5, 49243 -> 2, 49278 -> 17, 49250 -> 5, 49253 -> 7, 49279 -> 18, 49244 -> 3, 49239 -> 1, 49258 -> 11, 49275 -> 16, 49262 -> 12, 49249 -> 5, 49266 -> 16, 49238 -> 1, 49281 -> 18, 49269 -> 16, 49246 -> 4, 49280 -> 18, 49263 -> 15, 49241 -> 2, 49276 -> 16, 49259 -> 16, 49237 -> 0, 49272 -> 16, 49255 -> 8, 49273 -> 16, 49264 -> 15, 49260 -> 12, 49277 -> 17)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(49237), 5 -> HashSet(49248, 49250, 49249), 1 -> HashSet(49239, 49238), 6 -> HashSet(49251, 49252), 2 -> HashSet(49243, 49241, 49242), 17 -> HashSet(49278, 49277), 12 -> HashSet(49261, 49262, 49260), 7 -> HashSet(49254, 49253), 3 -> HashSet(49240, 49245, 49244), 18 -> HashSet(49279, 49281, 49280), 16 -> HashSet(49271, 49268, 49274, 49267, 49270, 49275, 49265, 49272, 49273, 49266, 49269, 49276, 49259), 11 -> HashSet(49257, 49258), 8 -> HashSet(49256, 49255), 4 -> HashSet(49247, 49246), 15 -> HashSet(49263, 49264))
  /* Beautified form:
  "OrdinarySetPrototypeOf" (O, V) => {
    let current = O["Prototype"]
    app __x0__ = (SameValue V current)
    if (= __x0__ true) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    let extensible = O["Extensible"]
    if (= extensible false) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    let p = V
    let done = false
    while (= done false) if (= p null) done = true else {
      app __x3__ = (SameValue p O)
      if (= __x3__ true) {
        app __x4__ = (WrapCompletion false)
        return __x4__
      } else if false done = true else p = p["Prototype"]
    }
    O["Prototype"] = V
    app __x5__ = (WrapCompletion true)
    return __x5__
  }
  */
}
