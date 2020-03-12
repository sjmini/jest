package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleNamespaceExoticObjectDOTHasProperty {
  val length: Int = 1
  val func: Func = Func("""ModuleNamespaceExoticObject.HasProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(57827), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryHasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(57828), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(57829), IReturn(ERef(RefId(Id("""__x2__""")))).setId(57830))).setId(57850), ISeq(List()).setId(57851)).setId(57833), ILet(Id("""exports"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Exports""")))).setId(57835), IIf(EContains(ERef(RefId(Id("""exports"""))), ERef(RefId(Id("""P""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(57837), IReturn(ERef(RefId(Id("""__x3__""")))).setId(57838))).setId(57856), ISeq(List()).setId(57857)).setId(57840), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57842), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57843))).setId(57861))
  val instToStepMap: Map[Int, Int] = HashMap(57833 -> 1, 57829 -> 0, 57840 -> 4, 57836 -> 2, 57839 -> 3, 57827 -> 1, 57831 -> 0, 57838 -> 3, 57828 -> 0, 57834 -> 1, 57843 -> 5, 57844 -> 5, 57837 -> 3, 57841 -> 4, 57830 -> 0, 57842 -> 5, 57835 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(57829, 57830, 57831, 57828), 5 -> HashSet(57844, 57842, 57843), 1 -> HashSet(57833, 57827, 57834), 2 -> HashSet(57836, 57835), 3 -> HashSet(57837, 57839, 57838), 4 -> HashSet(57840, 57841))
  /* Beautified form:
  "ModuleNamespaceExoticObject.HasProperty" (O, P) => {
    app __x0__ = (Type P)
    if (= __x0__ Symbol) {
      app __x1__ = (OrdinaryHasProperty O P)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let exports = O["Exports"]
    if (contains exports P) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }
  */
}
