package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTgetPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.getPrototypeOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(64937), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(64938), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""O"""))))).setId(64940), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(64941), IReturn(ERef(RefId(Id("""__x1__""")))).setId(64942)).setId(64943), ISeq(List()).setId(64963)).setId(64945), ILet(Id("""obj"""), ERef(RefId(Id("""__x1__""")))).setId(64946), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""obj"""))))).setId(64948), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(64949), IReturn(ERef(RefId(Id("""__x2__""")))).setId(64950)).setId(64951), ISeq(List()).setId(64970)).setId(64952), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(64953), IReturn(ERef(RefId(Id("""__x3__""")))).setId(64954))).setId(64974))
  val instToStepMap: Map[Int, Int] = HashMap(64945 -> 1, 64952 -> 2, 64940 -> 1, 64948 -> 2, 64953 -> 2, 64946 -> 1, 64939 -> 0, 64955 -> 2, 64938 -> 0, 64954 -> 2, 64937 -> 0, 64947 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(64939, 64938, 64937), 1 -> HashSet(64945, 64940, 64946, 64947), 2 -> HashSet(64952, 64948, 64953, 64955, 64954))
  /* Beautified form:
  "GLOBAL.Object.getPrototypeOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (ToObject O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let obj = __x1__
    app __x2__ = (obj["GetPrototypeOf"] obj)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
