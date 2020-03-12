package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PromiseRejectFunctions {
  val length: Int = 0
  val func: Func = Func("""PromiseRejectFunctions""", List(), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(11946), ILet(Id("""promise"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Promise""")))).setId(11949), ILet(Id("""alreadyResolved"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyResolved""")))).setId(11951), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11953), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11954))).setId(11970), ISeq(List()).setId(11971)).setId(11956), IAssign(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value""")), EBool(true)).setId(11958), IApp(Id("""__x1__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""reason"""))))).setId(11960), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(11961), IReturn(ERef(RefId(Id("""__x2__""")))).setId(11962))).setId(11977))
  val instToStepMap: Map[Int, Int] = HashMap(11962 -> 7, 11949 -> 2, 11959 -> 6, 11954 -> 4, 11952 -> 3, 11948 -> 1, 11961 -> 7, 11955 -> 4, 11951 -> 3, 11947 -> 0, 11956 -> 5, 11957 -> 5, 11963 -> 7, 11946 -> 0, 11960 -> 7, 11950 -> 2, 11953 -> 4, 11958 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(11947, 11946), 5 -> HashSet(11956, 11957), 1 -> HashSet(11948), 6 -> HashSet(11959, 11958), 2 -> HashSet(11949, 11950), 7 -> HashSet(11962, 11961, 11963, 11960), 3 -> HashSet(11952, 11951), 4 -> HashSet(11954, 11955, 11953))
  /* Beautified form:
  "PromiseRejectFunctions" () => {
    let F = GLOBAL_context["Function"]
    let promise = F["Promise"]
    let alreadyResolved = F["AlreadyResolved"]
    if (= alreadyResolved["Value"] true) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    alreadyResolved["Value"] = true
    app __x1__ = (RejectPromise promise reason)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
