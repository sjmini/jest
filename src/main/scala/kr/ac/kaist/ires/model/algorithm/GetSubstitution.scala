package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetSubstitution {
  val length: Int = 6
  val func: Func = Func("""GetSubstitution""", List(Id("""matched"""), Id("""str"""), Id("""position"""), Id("""captures"""), Id("""namedCaptures"""), Id("""replacement""")), None, ISeq(List(ILet(Id("""matchLength"""), ERef(RefProp(RefId(Id("""matched""")), EStr("""length""")))).setId(72935), ILet(Id("""stringLength"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))).setId(72937), ILet(Id("""tailPos"""), EBOp(OPlus, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""matchLength"""))))).setId(72939), ILet(Id("""m"""), ERef(RefProp(RefId(Id("""captures""")), EStr("""length""")))).setId(72941), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""namedCaptures"""))), EUndef)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""namedCaptures"""))))).setId(72943), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(72944), IReturn(ERef(RefId(Id("""__x0__""")))).setId(72945)).setId(72946), ISeq(List()).setId(72966)).setId(72947), IAssign(RefId(Id("""namedCaptures""")), ERef(RefId(Id("""__x0__""")))).setId(72948))).setId(72969), ISeq(List()).setId(72970)).setId(72951), IExpr(ENotSupported("""Etc""")).setId(72953), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(72954), IReturn(ERef(RefId(Id("""__x1__""")))).setId(72955))).setId(72975))
  val instToStepMap: Map[Int, Int] = HashMap(72949 -> 12, 72940 -> 8, 72953 -> 14, 72934 -> 7, 72951 -> 13, 72947 -> 12, 72955 -> 15, 72938 -> 3, 72948 -> 12, 72937 -> 3, 72954 -> 15, 72941 -> 9, 72936 -> 1, 72943 -> 12, 72950 -> 12, 72939 -> 8, 72956 -> 15, 72935 -> 1, 72952 -> 13, 72942 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(72934), 5 -> HashSet(72934), 14 -> HashSet(72953), 1 -> HashSet(72936, 72935), 6 -> HashSet(72934), 9 -> HashSet(72941, 72942), 13 -> HashSet(72951, 72952), 2 -> HashSet(72934), 12 -> HashSet(72949, 72947, 72948, 72943, 72950), 7 -> HashSet(72934), 3 -> HashSet(72937, 72938), 8 -> HashSet(72940, 72939), 4 -> HashSet(72934), 15 -> HashSet(72954, 72956, 72955))
  /* Beautified form:
  "GetSubstitution" (matched, str, position, captures, namedCaptures, replacement) => {
    let matchLength = matched["length"]
    let stringLength = str["length"]
    let tailPos = (+ position matchLength)
    let m = captures["length"]
    if (! (= namedCaptures undefined)) {
      app __x0__ = (ToObject namedCaptures)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      namedCaptures = __x0__
    } else {}
    !!! "Etc"
    app __x1__ = (WrapCompletion result)
    return __x1__
  }
  */
}
