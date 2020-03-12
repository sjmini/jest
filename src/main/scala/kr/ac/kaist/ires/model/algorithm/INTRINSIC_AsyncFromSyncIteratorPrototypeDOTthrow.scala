package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTthrow {
  val length: Int = 1
  val func: Func = Func("""INTRINSIC_AsyncFromSyncIteratorPrototype.throw""", List(Id("""value""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(9889), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(9892), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(9893), IReturn(ERef(RefId(Id("""__x0__""")))).setId(9894)).setId(9895), ISeq(List()).setId(9968)).setId(9896), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x0__""")))).setId(9897), ILet(Id("""syncIterator"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord""")), EStr("""Iterator""")))).setId(9899), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""syncIterator"""))), EStr("""throw"""))).setId(9901), ILet(Id("""throw"""), ERef(RefId(Id("""__x1__""")))).setId(9902), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""throw""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""throw""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""throw""")), ERef(RefProp(RefId(Id("""throw""")), EStr("""Value""")))).setId(9904), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""throw""")), EStr("""Value"""))))))).setId(9905), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x2__""")))).setId(9906), ISeq(List()).setId(9977)).setId(9907), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(9908))).setId(9980)).setId(9910), ISeq(List()).setId(9982)).setId(9911), IExpr(ERef(RefId(Id("""throw""")))).setId(9912), IIf(EBOp(OEq, ERef(RefId(Id("""throw"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""value"""))))))).setId(9914), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(9915), IReturn(ERef(RefId(Id("""__x3__""")))).setId(9916)).setId(9917), ISeq(List()).setId(9989)).setId(9918), IExpr(ERef(RefId(Id("""__x3__""")))).setId(9919), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(9921), IReturn(ERef(RefId(Id("""__x4__""")))).setId(9922))).setId(9994), ISeq(List()).setId(9995)).setId(9925), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""throw"""))), ERef(RefId(Id("""syncIterator"""))), EList(List(ERef(RefId(Id("""value"""))))))).setId(9927), ILet(Id("""result"""), ERef(RefId(Id("""__x5__""")))).setId(9928), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(9930), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(9931), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x6__""")))).setId(9932), ISeq(List()).setId(10002)).setId(9933), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(9934))).setId(10005)).setId(9936), ISeq(List()).setId(10007)).setId(9937), IExpr(ERef(RefId(Id("""result""")))).setId(9938), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))).setId(9940), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))))).setId(9941), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(9942), IReturn(ERef(RefId(Id("""__x8__""")))).setId(9943)).setId(9944), ISeq(List()).setId(10015)).setId(9945), IExpr(ERef(RefId(Id("""__x8__""")))).setId(9946), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(9948), IReturn(ERef(RefId(Id("""__x9__""")))).setId(9949))).setId(10020), ISeq(List()).setId(10021)).setId(9952), IApp(Id("""__x10__"""), ERef(RefId(Id("""AsyncFromSyncIteratorContinuation"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""promiseCapability"""))))).setId(9954), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(9955), IReturn(ERef(RefId(Id("""__x10__""")))).setId(9956)).setId(9957), ISeq(List()).setId(10027)).setId(9958), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(9959), IReturn(ERef(RefId(Id("""__x11__""")))).setId(9960))).setId(10031))
  val instToStepMap: Map[Int, Int] = HashMap(9929 -> 11, 9961 -> 18, 9946 -> 16, 9941 -> 16, 9949 -> 16, 9900 -> 3, 9939 -> 12, 9952 -> 17, 9958 -> 18, 9911 -> 5, 9912 -> 5, 9919 -> 9, 9898 -> 2, 9954 -> 18, 9924 -> 9, 9901 -> 4, 9892 -> 2, 9918 -> 9, 9950 -> 16, 9960 -> 18, 9938 -> 12, 9897 -> 2, 9928 -> 11, 9914 -> 9, 9923 -> 9, 9896 -> 2, 9945 -> 16, 9889 -> 0, 9913 -> 5, 9925 -> 10, 9903 -> 4, 9920 -> 9, 9890 -> 0, 9899 -> 3, 9921 -> 9, 9926 -> 10, 9953 -> 17, 9948 -> 16, 9891 -> 1, 9947 -> 16, 9902 -> 4, 9951 -> 16, 9940 -> 17, 9922 -> 9, 9937 -> 12, 9959 -> 18, 9927 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(9889, 9890), 5 -> HashSet(9913, 9911, 9912), 10 -> HashSet(9925, 9926), 1 -> HashSet(9891), 9 -> HashSet(9920, 9921, 9919, 9922, 9924, 9918, 9914, 9923), 2 -> HashSet(9892, 9898, 9897, 9896), 17 -> HashSet(9952, 9953, 9940), 12 -> HashSet(9938, 9939, 9937), 3 -> HashSet(9900, 9899), 18 -> HashSet(9961, 9960, 9958, 9959, 9954), 16 -> HashSet(9950, 9946, 9941, 9949, 9945, 9948, 9947, 9951), 11 -> HashSet(9929, 9928, 9927), 8 -> HashSet(9918, 9914, 9920, 9919), 4 -> HashSet(9901, 9903, 9902), 15 -> HashSet(9946, 9941, 9945, 9947))
  /* Beautified form:
  "INTRINSIC_AsyncFromSyncIteratorPrototype.throw" (value) => {
    let O = this
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x1__ = (GetMethod syncIterator "throw")
    let throw = __x1__
    if (= (typeof throw) "Completion") if (= throw["Type"] CONST_normal) throw = throw["Value"] else {
      app __x2__ = (Call promiseCapability["Reject"] undefined (new [throw["Value"]]))
      if (&& (= (typeof __x2__) "Completion") (! (= __x2__["Type"] CONST_normal))) return __x2__ else {}
      return promiseCapability["Promise"]
    } else {}
    throw
    if (= throw undefined) {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [value]))
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
      app __x4__ = (WrapCompletion promiseCapability["Promise"])
      return __x4__
    } else {}
    app __x5__ = (Call throw syncIterator (new [value]))
    let result = __x5__
    if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x6__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (= (typeof __x6__) "Completion") (! (= __x6__["Type"] CONST_normal))) return __x6__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x7__ = (Type result)
    if (! (= __x7__ Object)) {
      app __x8__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      __x8__
      app __x9__ = (WrapCompletion promiseCapability["Promise"])
      return __x9__
    } else {}
    app __x10__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
