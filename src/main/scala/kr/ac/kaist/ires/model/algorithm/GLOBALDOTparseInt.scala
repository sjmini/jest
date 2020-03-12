package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTparseInt {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.parseInt""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(62937), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))).setId(62938), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(62940), ILet(Id("""radix"""), ERef(RefId(Id("""__x1__""")))).setId(62941), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""string"""))))).setId(62943), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(62944), IReturn(ERef(RefId(Id("""__x2__""")))).setId(62945)).setId(62946), ISeq(List()).setId(63008)).setId(62948), ILet(Id("""inputString"""), ERef(RefId(Id("""__x2__""")))).setId(62949), IApp(Id("""__x3__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""inputString"""))), EStr("""start"""))).setId(62951), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(62952), IReturn(ERef(RefId(Id("""__x3__""")))).setId(62953)).setId(62954), ISeq(List()).setId(63015)).setId(62955), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(62956), ILet(Id("""sign"""), EINum(1L)).setId(62958), IExpr(ENotSupported("""Etc""")).setId(62960), IExpr(ENotSupported("""Etc""")).setId(62960), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""radix"""))))).setId(62961), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(62962), IReturn(ERef(RefId(Id("""__x4__""")))).setId(62963)).setId(62964), ISeq(List()).setId(63025)).setId(62965), ILet(Id("""R"""), ERef(RefId(Id("""__x4__""")))).setId(62966), ILet(Id("""stripPrefix"""), EBool(true)).setId(62968), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""R"""))), EINum(0L))), ISeq(List(IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""R"""))), EINum(2L)), EBOp(OLt, EINum(36L), ERef(RefId(Id("""R"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(Double.NaN))).setId(62970), IReturn(ERef(RefId(Id("""__x5__""")))).setId(62971))).setId(63031), ISeq(List()).setId(63032)).setId(62973), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""R"""))), EINum(16L))), IAssign(RefId(Id("""stripPrefix""")), EBool(false)).setId(62975), ISeq(List()).setId(63035)).setId(62977))).setId(63037), IAssign(RefId(Id("""R""")), EINum(10L)).setId(62980)).setId(62983), IIf(EBOp(OEq, ERef(RefId(Id("""stripPrefix"""))), EBool(true)), IExpr(ENotSupported("""Etc""")).setId(62960), ISeq(List()).setId(63041)).setId(62986), IExpr(ENotSupported("""StringOp""")).setId(62988), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Z""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(Double.NaN))).setId(62989), IReturn(ERef(RefId(Id("""__x6__""")))).setId(62990))).setId(63046), ISeq(List()).setId(63047)).setId(62992), ILet(Id("""mathInt"""), ENotSupported("""NumberOp""")).setId(62994), IExpr(ENotSupported("""Etc""")).setId(62960), IExpr(ENotSupported("""Etc""")).setId(62960), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OMul, ERef(RefId(Id("""sign"""))), ERef(RefId(Id("""number""")))))).setId(62996), IReturn(ERef(RefId(Id("""__x7__""")))).setId(62997))).setId(63054))
  val instToStepMap: Map[Int, Int] = HashMap(62969 -> 8, 62979 -> 13, 62990 -> 24, 62961 -> 7, 62984 -> 16, 62982 -> 16, 62967 -> 7, 62939 -> 0, 62937 -> 0, 62959 -> 4, 62983 -> 16, 62991 -> 24, 62951 -> 3, 62996 -> 31, 62968 -> 8, 62955 -> 3, 62974 -> 13, 62997 -> 31, 62965 -> 7, 62948 -> 2, 62980 -> 16, 62987 -> 22, 62993 -> 25, 62942 -> 1, 62972 -> 11, 62973 -> 13, 62994 -> 26, 62981 -> 16, 62966 -> 7, 62949 -> 2, 62985 -> 21, 62998 -> 31, 62989 -> 24, 62986 -> 22, 62958 -> 4, 62976 -> 13, 62977 -> 13, 62941 -> 1, 62943 -> 2, 62970 -> 11, 62940 -> 1, 62938 -> 0, 62960 -> 30, 62971 -> 11, 62978 -> 13, 62992 -> 25, 62950 -> 2, 62988 -> 23, 62995 -> 26, 62975 -> 13, 62956 -> 3, 62957 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(62937, 62938, 62939), 5 -> HashSet(62960), 29 -> HashSet(62960), 1 -> HashSet(62942, 62941, 62940), 6 -> HashSet(62960), 21 -> HashSet(62985, 62960), 13 -> HashSet(62979, 62974, 62973, 62976, 62977, 62978, 62975), 2 -> HashSet(62948, 62949, 62943, 62950), 22 -> HashSet(62987, 62986), 12 -> HashSet(62974, 62973), 7 -> HashSet(62965, 62961, 62966, 62967), 3 -> HashSet(62951, 62955, 62956, 62957), 11 -> HashSet(62972, 62970, 62971), 8 -> HashSet(62969, 62968), 30 -> HashSet(62960), 4 -> HashSet(62959, 62958), 24 -> HashSet(62991, 62990, 62989), 25 -> HashSet(62993, 62992), 16 -> HashSet(62983, 62980, 62981, 62984, 62982), 31 -> HashSet(62996, 62997, 62998), 26 -> HashSet(62994, 62995), 23 -> HashSet(62988))
  /* Beautified form:
  "GLOBAL.parseInt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let radix = __x1__
    app __x2__ = (ToString string)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let inputString = __x2__
    app __x3__ = (TrimString inputString "start")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    let sign = 1i
    !!! "Etc"
    !!! "Etc"
    app __x4__ = (ToInt32 radix)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let R = __x4__
    let stripPrefix = true
    if (! (= R 0i)) {
      if (|| (< R 2i) (< 36i R)) {
        app __x5__ = (WrapCompletion NaN)
        return __x5__
      } else {}
      if (! (= R 16i)) stripPrefix = false else {}
    } else R = 10i
    if (= stripPrefix true) !!! "Etc" else {}
    !!! "StringOp"
    if (= Z["length"] 0i) {
      app __x6__ = (WrapCompletion NaN)
      return __x6__
    } else {}
    let mathInt = !!! "NumberOp"
    !!! "Etc"
    !!! "Etc"
    app __x7__ = (WrapCompletion (* sign number))
    return __x7__
  }
  */
}
