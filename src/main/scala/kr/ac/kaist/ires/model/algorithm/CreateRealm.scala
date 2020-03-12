package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateRealm {
  val length: Int = 0
  val func: Func = Func("""CreateRealm""", List(), None, ISeq(List(ILet(Id("""realmRec"""), ERef(RefId(Id("""REALM""")))).setId(8138), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateIntrinsics"""))), List(ERef(RefId(Id("""realmRec"""))))).setId(8139), IExpr(ERef(RefId(Id("""__x0__""")))).setId(8140), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalObject""")), EUndef).setId(8142), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""GlobalEnv""")), EUndef).setId(8144), IAssign(RefProp(RefId(Id("""realmRec""")), EStr("""TemplateMap""")), EList(List())).setId(8146), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""realmRec"""))))).setId(8148), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8149))).setId(8160))
  val instToStepMap: Map[Int, Int] = HashMap(8150 -> 5, 8146 -> 4, 8141 -> 1, 8145 -> 3, 8139 -> 1, 8143 -> 2, 8148 -> 5, 8140 -> 1, 8147 -> 4, 8149 -> 5, 8138 -> 0, 8144 -> 3, 8142 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(8138), 5 -> HashSet(8150, 8149, 8148), 1 -> HashSet(8141, 8139, 8140), 2 -> HashSet(8142, 8143), 3 -> HashSet(8145, 8144), 4 -> HashSet(8146, 8147))
  /* Beautified form:
  "CreateRealm" () => {
    let realmRec = REALM
    app __x0__ = (CreateIntrinsics realmRec)
    __x0__
    realmRec["GlobalObject"] = undefined
    realmRec["GlobalEnv"] = undefined
    realmRec["TemplateMap"] = (new [])
    app __x1__ = (WrapCompletion realmRec)
    return __x1__
  }
  */
}
