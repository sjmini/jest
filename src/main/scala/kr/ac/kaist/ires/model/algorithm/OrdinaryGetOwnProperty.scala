package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryGetOwnProperty {
  val length: Int = 2
  val func: Func = Func("""OrdinaryGetOwnProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IIf(EUOp(ONot, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P"""))))), EAbsent))), IReturn(EUndef).setId(49454), ISeq(List()).setId(49453)).setId(49456), ILet(Id("""D"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(49458), ILet(Id("""X"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))))).setId(49460), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""X"""))))).setId(49462), IIf(ERef(RefId(Id("""__x0__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""D""")), EStr("""Value""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Value""")))).setId(49463), IAssign(RefProp(RefId(Id("""D""")), EStr("""Writable""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Writable""")))).setId(49465))).setId(49467), ISeq(List(IAssign(RefProp(RefId(Id("""D""")), EStr("""Get""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Get""")))).setId(49468), IAssign(RefProp(RefId(Id("""D""")), EStr("""Set""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Set""")))).setId(49470))).setId(49472)).setId(49473), IAssign(RefProp(RefId(Id("""D""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Enumerable""")))).setId(49475), IAssign(RefProp(RefId(Id("""D""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Configurable""")))).setId(49477), IReturn(ERef(RefId(Id("""D""")))).setId(49479))).setId(-1))
  /* Beautified form:
  "OrdinaryGetOwnProperty" (O, P) => {
    if (! (! (= O["SubMap"][P] absent))) return undefined else {}
    let D = (new PropertyDescriptor("SubMap" -> (new SubMap())))
    let X = O["SubMap"][P]
    app __x0__ = (IsDataDescriptor X)
    if __x0__ {
      D["Value"] = X["Value"]
      D["Writable"] = X["Writable"]
    } else {
      D["Get"] = X["Get"]
      D["Set"] = X["Set"]
    }
    D["Enumerable"] = X["Enumerable"]
    D["Configurable"] = X["Configurable"]
    return D
  }
  */
}
