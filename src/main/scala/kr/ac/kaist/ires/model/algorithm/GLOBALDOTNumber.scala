package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTNumber {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(68841), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(68842), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(0L)), ILet(Id("""n"""), EINum(0L)).setId(68844), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""value"""))))).setId(68846), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(68847), IReturn(ERef(RefId(Id("""__x1__""")))).setId(68848)).setId(68849), ISeq(List()).setId(68881)).setId(68851), ILet(Id("""n"""), ERef(RefId(Id("""__x1__""")))).setId(68852))).setId(68884)).setId(68854), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""n"""))))).setId(68856), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68857))).setId(68888), ISeq(List()).setId(68889)).setId(68859), IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%NumberPrototype%"""), EList(List(EStr("""NumberData"""))))).setId(68861), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(68862), IReturn(ERef(RefId(Id("""__x3__""")))).setId(68863)).setId(68864), ISeq(List()).setId(68895)).setId(68865), ILet(Id("""O"""), ERef(RefId(Id("""__x3__""")))).setId(68866), IAssign(RefProp(RefId(Id("""O""")), EStr("""NumberData""")), ERef(RefId(Id("""n""")))).setId(68868), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(68870), IReturn(ERef(RefId(Id("""__x4__""")))).setId(68871))).setId(68901))
  val instToStepMap: Map[Int, Int] = HashMap(68853 -> 2, 68868 -> 6, 68871 -> 7, 68858 -> 3, 68865 -> 5, 68856 -> 3, 68844 -> 1, 68859 -> 4, 68843 -> 0, 68867 -> 5, 68855 -> 2, 68854 -> 2, 68846 -> 2, 68861 -> 5, 68860 -> 4, 68872 -> 7, 68870 -> 7, 68851 -> 2, 68842 -> 0, 68857 -> 3, 68845 -> 1, 68866 -> 5, 68869 -> 6, 68841 -> 0, 68852 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(68843, 68842, 68841), 5 -> HashSet(68867, 68865, 68861, 68866), 1 -> HashSet(68845, 68844), 6 -> HashSet(68868, 68869), 2 -> HashSet(68853, 68846, 68851, 68852, 68855, 68854), 7 -> HashSet(68871, 68872, 68870), 3 -> HashSet(68858, 68856, 68857), 4 -> HashSet(68860, 68859))
  /* Beautified form:
  "GLOBAL.Number" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    if (= argumentsList["length"] 0i) let n = 0i else {
      app __x1__ = (ToNumber value)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let n = __x1__
    }
    if (= NewTarget undefined) {
      app __x2__ = (WrapCompletion n)
      return __x2__
    } else {}
    app __x3__ = (OrdinaryCreateFromConstructor NewTarget "%NumberPrototype%" (new ["NumberData"]))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    O["NumberData"] = n
    app __x4__ = (WrapCompletion O)
    return __x4__
  }
  */
}
