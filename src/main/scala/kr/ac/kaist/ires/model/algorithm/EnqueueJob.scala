package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EnqueueJob {
  val length: Int = 3
  val func: Func = Func("""EnqueueJob""", List(Id("""queueName"""), Id("""job"""), Id("""arguments""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(8609), ILet(Id("""callerRealm"""), ERef(RefProp(RefId(Id("""callerContext""")), EStr("""Realm""")))).setId(8611), ILet(Id("""callerScriptOrModule"""), ERef(RefProp(RefId(Id("""callerContext""")), EStr("""ScriptOrModule""")))).setId(8613), ILet(Id("""pending"""), EMap(Ty("""PendingJob"""), List((EStr("""Job"""), ERef(RefId(Id("""job""")))), (EStr("""Arguments"""), ERef(RefId(Id("""arguments""")))), (EStr("""Realm"""), ERef(RefId(Id("""callerRealm""")))), (EStr("""ScriptOrModule"""), ERef(RefId(Id("""callerScriptOrModule""")))), (EStr("""HostDefined"""), EUndef)))).setId(8615), IAppend(ERef(RefId(Id("""pending"""))), ERef(RefId(Id("""GLOBAL_jobQueue""")))).setId(8617), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(8618), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(8619), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8620))).setId(8631))
  val instToStepMap: Map[Int, Int] = HashMap(8618 -> 9, 8610 -> 3, 8615 -> 6, 8613 -> 5, 8608 -> 7, 8619 -> 9, 8620 -> 9, 8612 -> 4, 8617 -> 8, 8621 -> 9, 8616 -> 6, 8611 -> 4, 8614 -> 5, 8609 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(8608), 5 -> HashSet(8613, 8614), 1 -> HashSet(8608), 6 -> HashSet(8615, 8616), 9 -> HashSet(8618, 8619, 8620, 8621), 2 -> HashSet(8608), 7 -> HashSet(8608), 3 -> HashSet(8610, 8609), 8 -> HashSet(8617), 4 -> HashSet(8612, 8611))
  /* Beautified form:
  "EnqueueJob" (queueName, job, arguments) => {
    let callerContext = GLOBAL_context
    let callerRealm = callerContext["Realm"]
    let callerScriptOrModule = callerContext["ScriptOrModule"]
    let pending = (new PendingJob("Job" -> job, "Arguments" -> arguments, "Realm" -> callerRealm, "ScriptOrModule" -> callerScriptOrModule, "HostDefined" -> undefined))
    append pending -> GLOBAL_jobQueue
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
