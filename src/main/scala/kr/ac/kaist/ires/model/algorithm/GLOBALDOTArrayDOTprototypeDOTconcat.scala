package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTconcat {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.concat""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(75878), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(75879), IReturn(ERef(RefId(Id("""__x0__""")))).setId(75880)).setId(75881), ISeq(List()).setId(76004)).setId(75883), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(75884), IApp(Id("""__x1__"""), ERef(RefId(Id("""ArraySpeciesCreate"""))), List(ERef(RefId(Id("""O"""))), EINum(0L))).setId(75886), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(75887), IReturn(ERef(RefId(Id("""__x1__""")))).setId(75888)).setId(75889), ISeq(List()).setId(76011)).setId(75890), ILet(Id("""A"""), ERef(RefId(Id("""__x1__""")))).setId(75891), ILet(Id("""n"""), EINum(0L)).setId(75893), IPrepend(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""argumentsList""")))).setId(75895), ILet(Id("""items"""), ERef(RefId(Id("""argumentsList""")))).setId(75896), IWhile(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""items""")), EStr("""length""")))), ISeq(List(ILet(Id("""E"""), EPop(ERef(RefId(Id("""items"""))), EINum(0L))).setId(75898), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsConcatSpreadable"""))), List(ERef(RefId(Id("""E"""))))).setId(75899), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(75900), IReturn(ERef(RefId(Id("""__x2__""")))).setId(75901)).setId(75902), ISeq(List()).setId(76022)).setId(75903), ILet(Id("""spreadable"""), ERef(RefId(Id("""__x2__""")))).setId(75904), IIf(EBOp(OEq, ERef(RefId(Id("""spreadable"""))), EBool(true)), ISeq(List(ILet(Id("""k"""), EINum(0L)).setId(75906), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""E"""))))).setId(75908), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(75909), IReturn(ERef(RefId(Id("""__x3__""")))).setId(75910)).setId(75911), ISeq(List()).setId(76030)).setId(75912), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(75913), IIf(EBOp(OLt, EBOp(OSub, EINum(9007199254740992L), EINum(1L)), EBOp(OPlus, ERef(RefId(Id("""n"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(75915), IReturn(ERef(RefId(Id("""__x4__""")))).setId(75916))).setId(76035), ISeq(List()).setId(76036)).setId(75918), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(75920), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(75921), IReturn(ERef(RefId(Id("""__x5__""")))).setId(75922)).setId(75923), ISeq(List()).setId(76042)).setId(75924), ILet(Id("""P"""), ERef(RefId(Id("""__x5__""")))).setId(75925), IApp(Id("""__x6__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""E"""))), ERef(RefId(Id("""P"""))))).setId(75927), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(75928), IReturn(ERef(RefId(Id("""__x6__""")))).setId(75929)).setId(75930), ISeq(List()).setId(76049)).setId(75931), ILet(Id("""exists"""), ERef(RefId(Id("""__x6__""")))).setId(75932), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""E"""))), ERef(RefId(Id("""P"""))))).setId(75934), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(75935), IReturn(ERef(RefId(Id("""__x7__""")))).setId(75936)).setId(75937), ISeq(List()).setId(76056)).setId(75938), ILet(Id("""subElement"""), ERef(RefId(Id("""__x7__""")))).setId(75939), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(75941), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(75942), IReturn(ERef(RefId(Id("""__x8__""")))).setId(75943)).setId(75944), ISeq(List()).setId(76063)).setId(75945), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""subElement"""))))).setId(75946), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(75947), IReturn(ERef(RefId(Id("""__x9__""")))).setId(75948)).setId(75949), ISeq(List()).setId(76069)).setId(75950), IExpr(ERef(RefId(Id("""__x9__""")))).setId(75951))).setId(76072), ISeq(List()).setId(76073)).setId(75954), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(75956), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(75958))).setId(76077)).setId(75961))).setId(76079), ISeq(List(IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""n"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(75964), IReturn(ERef(RefId(Id("""__x10__""")))).setId(75965))).setId(76082), ISeq(List()).setId(76083)).setId(75967), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(75969), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(75970), IReturn(ERef(RefId(Id("""__x11__""")))).setId(75971)).setId(75972), ISeq(List()).setId(76089)).setId(75973), IApp(Id("""__x12__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x11__"""))), ERef(RefId(Id("""E"""))))).setId(75974), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(75975), IReturn(ERef(RefId(Id("""__x12__""")))).setId(75976)).setId(75977), ISeq(List()).setId(76095)).setId(75978), IExpr(ERef(RefId(Id("""__x12__""")))).setId(75979), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(75981))).setId(76099)).setId(75984))).setId(76101)).setId(75987), IApp(Id("""__x13__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""n"""))), EBool(true))).setId(75989), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(75990), IReturn(ERef(RefId(Id("""__x13__""")))).setId(75991)).setId(75992), ISeq(List()).setId(76107)).setId(75993), IExpr(ERef(RefId(Id("""__x13__""")))).setId(75994), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(75996), IReturn(ERef(RefId(Id("""__x14__""")))).setId(75997))).setId(76112))
  val instToStepMap: Map[Int, Int] = HashMap(75987 -> 3, 75912 -> 13, 75969 -> 3, 75906 -> 13, 75952 -> 10, 75882 -> 3, 75883 -> 0, 75915 -> 0, 75983 -> 3, 75955 -> 13, 75893 -> 2, 75940 -> 10, 75941 -> 10, 75958 -> 13, 75926 -> 13, 75907 -> 13, 75950 -> 10, 75931 -> 13, 75963 -> 13, 75978 -> 3, 75995 -> 4, 75973 -> 3, 75946 -> 10, 75967 -> 3, 75890 -> 1, 75920 -> 13, 75956 -> 13, 75896 -> 3, 75916 -> 0, 75927 -> 13, 75988 -> 3, 75982 -> 3, 75959 -> 13, 75897 -> 3, 75885 -> 0, 75966 -> 0, 75934 -> 10, 75981 -> 3, 75994 -> 4, 75884 -> 0, 75945 -> 10, 75962 -> 13, 75974 -> 3, 75895 -> 3, 75998 -> 5, 75913 -> 13, 75878 -> 0, 75938 -> 10, 75898 -> 3, 75960 -> 13, 75917 -> 0, 75953 -> 10, 75985 -> 3, 75965 -> 0, 75903 -> 3, 75993 -> 4, 75905 -> 3, 75933 -> 13, 75886 -> 1, 75924 -> 13, 75961 -> 13, 75980 -> 3, 75997 -> 5, 75894 -> 2, 75914 -> 13, 75939 -> 10, 75957 -> 13, 75984 -> 3, 75986 -> 3, 75925 -> 13, 75954 -> 13, 75892 -> 1, 75989 -> 4, 75918 -> 13, 75891 -> 1, 75964 -> 0, 75996 -> 5, 75908 -> 13, 75904 -> 3, 75899 -> 3, 75919 -> 13, 75968 -> 3, 75951 -> 10, 75979 -> 3, 75932 -> 13)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(75916, 75884, 75878, 75917, 75965, 75964, 75883, 75915, 75885, 75966), 5 -> HashSet(75926, 75920, 75998, 75924, 75997, 75925, 75996), 10 -> HashSet(75950, 75946, 75934, 75945, 75938, 75953, 75952, 75939, 75951, 75940, 75941), 1 -> HashSet(75886, 75891, 75967, 75890, 75892, 75918, 75919, 75968), 6 -> HashSet(75931, 75927, 75933, 75932), 9 -> HashSet(75940, 75934, 75938, 75939), 13 -> HashSet(75955, 75912, 75963, 75920, 75956, 75927, 75959, 75906, 75962, 75913, 75960, 75961, 75925, 75908, 75958, 75926, 75907, 75931, 75933, 75924, 75957, 75914, 75954, 75918, 75919, 75932), 2 -> HashSet(75893, 75978, 75973, 75969, 75974, 75980, 75894, 75979), 12 -> HashSet(75912, 75956, 75913, 75908, 75957, 75914), 7 -> HashSet(75898), 3 -> HashSet(75983, 75987, 75978, 75973, 75967, 75969, 75896, 75988, 75981, 75974, 75895, 75898, 75985, 75903, 75905, 75980, 75984, 75986, 75882, 75904, 75982, 75897, 75899, 75968, 75979), 16 -> HashSet(75882), 11 -> HashSet(75955, 75907, 75906, 75954), 8 -> HashSet(75903, 75905, 75904, 75899), 4 -> HashSet(75995, 75994, 75993, 75989))
  /* Beautified form:
  "GLOBAL.Array.prototype.concat" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ArraySpeciesCreate O 0i)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let A = __x1__
    let n = 0i
    prepend O -> argumentsList
    let items = argumentsList
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x2__ = (IsConcatSpreadable E)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let spreadable = __x2__
      if (= spreadable true) {
        let k = 0i
        app __x3__ = (LengthOfArrayLike E)
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        let len = __x3__
        if (< (- 9007199254740992i 1i) (+ n len)) {
          app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x4__
        } else {}
        while (< k len) {
          app __x5__ = (ToString k)
          if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          let P = __x5__
          app __x6__ = (HasProperty E P)
          if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let exists = __x6__
          if (= exists true) {
            app __x7__ = (Get E P)
            if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
            let subElement = __x7__
            app __x8__ = (ToString n)
            if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
            app __x9__ = (CreateDataPropertyOrThrow A __x8__ subElement)
            if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
            __x9__
          } else {}
          n = (+ n 1i)
          k = (+ k 1i)
        }
      } else {
        if (! (< n (- 9007199254740992i 1i))) {
          app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x10__
        } else {}
        app __x11__ = (ToString n)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        app __x12__ = (CreateDataPropertyOrThrow A __x11__ E)
        if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        __x12__
        n = (+ n 1i)
      }
    }
    app __x13__ = (Set A "length" n true)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    __x13__
    app __x14__ = (WrapCompletion A)
    return __x14__
  }
  */
}
