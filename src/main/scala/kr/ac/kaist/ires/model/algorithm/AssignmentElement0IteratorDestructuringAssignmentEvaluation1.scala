package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentElement0IteratorDestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElement0IteratorDestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""DestructuringAssignmentTarget"""), Id("""Initializer"""), Id("""iteratorRecord""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral"""))), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""Evaluation""")).setId(24894), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(24895), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""lref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""lref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""lref""")), ERef(RefProp(RefId(Id("""lref""")), EStr("""Value""")))).setId(24897), IReturn(ERef(RefId(Id("""lref""")))).setId(24898)).setId(24899), ISeq(List()).setId(24998)).setId(24901), IExpr(ERef(RefId(Id("""lref""")))).setId(24902))).setId(25001), ISeq(List()).setId(25002)).setId(24905), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24907), ILet(Id("""next"""), ERef(RefId(Id("""__x1__""")))).setId(24908), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(24910), IIf(ERef(RefId(Id("""__x2__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24911), ISeq(List()).setId(25008)).setId(24913), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(24915), IReturn(ERef(RefId(Id("""next""")))).setId(24916)).setId(24917), ISeq(List()).setId(25013)).setId(24918), IExpr(ERef(RefId(Id("""next""")))).setId(24919), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24921), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(24923), ILet(Id("""value"""), ERef(RefId(Id("""__x3__""")))).setId(24924), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(24926), IIf(ERef(RefId(Id("""__x4__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24927), ISeq(List()).setId(25021)).setId(24929), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""value""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""value""")), ERef(RefProp(RefId(Id("""value""")), EStr("""Value""")))).setId(24931), IReturn(ERef(RefId(Id("""value""")))).setId(24932)).setId(24933), ISeq(List()).setId(25026)).setId(24934), IExpr(ERef(RefId(Id("""value""")))).setId(24935))).setId(25029)).setId(24938))).setId(25031), ISeq(List()).setId(25032)).setId(24941), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""value"""), EUndef).setId(24943), ISeq(List()).setId(25035)).setId(24945), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""value"""))), EUndef)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(24947), IAccess(Id("""__x6__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""IsIdentifierRef""")).setId(24948), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""lref"""))))).setId(24949), IAccess(Id("""__x8__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(24950), IApp(Id("""__x9__"""), ERef(RefId(Id("""__x8__"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(24951), ILet(Id("""v"""), ERef(RefId(Id("""__x9__""")))).setId(24952))).setId(25043), ISeq(List(IAccess(Id("""__x10__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(24956), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x10__""")))).setId(24957), IApp(Id("""__x11__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(24959), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(24960), IReturn(ERef(RefId(Id("""__x11__""")))).setId(24961)).setId(24962), ISeq(List()).setId(25050)).setId(24963), ILet(Id("""v"""), ERef(RefId(Id("""__x11__""")))).setId(24964))).setId(25053)).setId(24967))).setId(25055), ILet(Id("""v"""), ERef(RefId(Id("""value""")))).setId(24970)).setId(24972), IIf(EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral""")), ISeq(List(ILet(Id("""nestedAssignmentPattern"""), EParseSyntax(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""AssignmentPattern"""), List())).setId(24974), IAccess(Id("""__x12__"""), ERef(RefId(Id("""nestedAssignmentPattern"""))), EStr("""DestructuringAssignmentEvaluation""")).setId(24976), IApp(Id("""__x13__"""), ERef(RefId(Id("""__x12__"""))), List(ERef(RefId(Id("""v"""))))).setId(24977), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(24978), IReturn(ERef(RefId(Id("""__x14__""")))).setId(24979))).setId(25063), ISeq(List()).setId(25064)).setId(24982), IApp(Id("""__x15__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""v"""))))).setId(24984), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(24985), IReturn(ERef(RefId(Id("""__x15__""")))).setId(24986)).setId(24987), ISeq(List()).setId(25070)).setId(24988), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))).setId(24989), IReturn(ERef(RefId(Id("""__x16__""")))).setId(24990))).setId(25074))
  val instToStepMap: Map[Int, Int] = HashMap(24936 -> 17, 24944 -> 19, 24939 -> 17, 24914 -> 17, 24963 -> 29, 24978 -> 34, 24966 -> 29, 24981 -> 34, 24949 -> 25, 24907 -> 17, 24946 -> 20, 24990 -> 36, 24902 -> 3, 24934 -> 17, 24958 -> 29, 24922 -> 11, 24971 -> 30, 24943 -> 19, 24926 -> 17, 24975 -> 34, 24982 -> 35, 24954 -> 25, 24894 -> 3, 24911 -> 8, 24950 -> 25, 24947 -> 29, 24964 -> 29, 24979 -> 34, 24967 -> 29, 24935 -> 17, 24903 -> 3, 24918 -> 17, 24957 -> 29, 24974 -> 34, 24989 -> 36, 24906 -> 4, 24921 -> 11, 24938 -> 17, 24953 -> 25, 24970 -> 30, 24910 -> 17, 24942 -> 18, 24925 -> 17, 24948 -> 29, 24924 -> 17, 24980 -> 34, 24929 -> 17, 24904 -> 3, 24919 -> 17, 24951 -> 25, 24968 -> 29, 24983 -> 35, 24988 -> 36, 24905 -> 4, 24937 -> 17, 24973 -> 30, 24956 -> 29, 24896 -> 3, 24909 -> 17, 24941 -> 18, 24969 -> 29, 24928 -> 15, 24908 -> 17, 24923 -> 17, 24920 -> 17, 24965 -> 29, 24930 -> 17, 24913 -> 17, 24901 -> 3, 24977 -> 34, 24952 -> 25, 24984 -> 36, 24945 -> 20, 24959 -> 29, 24972 -> 30, 24895 -> 3, 24912 -> 8, 24940 -> 17, 24927 -> 15, 24991 -> 36, 24976 -> 34)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(10 -> HashSet(24918, 24919, 24920), 25 -> HashSet(24949, 24954, 24950, 24953, 24951, 24952), 14 -> HashSet(24925, 24924, 24923), 9 -> HashSet(24914, 24910, 24913), 2 -> HashSet(24894, 24896, 24895), 7 -> HashSet(24907, 24909, 24908), 18 -> HashSet(24942, 24941), 16 -> HashSet(24926, 24929, 24930), 11 -> HashSet(24922, 24921), 8 -> HashSet(24911, 24912), 4 -> HashSet(24906, 24905), 15 -> HashSet(24928, 24927), 20 -> HashSet(24946, 24945), 29 -> HashSet(24958, 24947, 24964, 24967, 24957, 24948, 24968, 24956, 24969, 24965, 24959, 24963, 24966), 28 -> HashSet(24958, 24957, 24956), 33 -> HashSet(24975, 24974), 34 -> HashSet(24975, 24979, 24974, 24980, 24977, 24976, 24978, 24981), 17 -> HashSet(24907, 24934, 24926, 24935, 24918, 24938, 24936, 24919, 24937, 24909, 24940, 24939, 24914, 24910, 24925, 24924, 24929, 24908, 24923, 24920, 24930, 24913), 3 -> HashSet(24902, 24894, 24903, 24904, 24896, 24901, 24895), 35 -> HashSet(24982, 24983), 36 -> HashSet(24990, 24989, 24988, 24984, 24991), 30 -> HashSet(24971, 24970, 24973, 24972), 19 -> HashSet(24943, 24944))
  /* Beautified form:
  "AssignmentElement0IteratorDestructuringAssignmentEvaluation1" (this, DestructuringAssignmentTarget, Initializer, iteratorRecord) => {
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      access __x0__ = (DestructuringAssignmentTarget "Evaluation")
      let lref = __x0__
      if (= (typeof lref) "Completion") if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
    } else {}
    if (= iteratorRecord["Done"] false) {
      app __x1__ = (IteratorStep iteratorRecord)
      let next = __x1__
      app __x2__ = (IsAbruptCompletion next)
      if __x2__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {
        app __x3__ = (IteratorValue next)
        let value = __x3__
        app __x4__ = (IsAbruptCompletion value)
        if __x4__ iteratorRecord["Done"] = true else {}
        if (= (typeof value) "Completion") if (= value["Type"] CONST_normal) value = value["Value"] else return value else {}
        value
      }
    } else {}
    if (= iteratorRecord["Done"] true) let value = undefined else {}
    if (&& (! (= Initializer absent)) (= value undefined)) {
      app __x5__ = (IsAnonymousFunctionDefinition Initializer)
      access __x6__ = (DestructuringAssignmentTarget "IsIdentifierRef")
      if (&& (= __x5__ true) (= __x6__ true)) {
        app __x7__ = (GetReferencedName lref)
        access __x8__ = (Initializer "NamedEvaluation")
        app __x9__ = (__x8__ __x7__)
        let v = __x9__
      } else {
        access __x10__ = (Initializer "Evaluation")
        let defaultValue = __x10__
        app __x11__ = (GetValue defaultValue)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        let v = __x11__
      }
    } else let v = value
    if (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral)) {
      let nestedAssignmentPattern = (parse-syntax DestructuringAssignmentTarget "AssignmentPattern" )
      access __x12__ = (nestedAssignmentPattern "DestructuringAssignmentEvaluation")
      app __x13__ = (__x12__ v)
      app __x14__ = (WrapCompletion __x13__)
      return __x14__
    } else {}
    app __x15__ = (PutValue lref v)
    if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }
  */
}
