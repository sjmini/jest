package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToPropertyDescriptor {
  val length: Int = 1
  val func: Func = Func("""ToPropertyDescriptor""", List(Id("""Obj""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""Obj"""))))).setId(1387), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(1388), IReturn(ERef(RefId(Id("""__x1__""")))).setId(1389))).setId(1390), ISeq(List()).setId(1391)).setId(1392), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(1394), IApp(Id("""__x2__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""enumerable"""))).setId(1396), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(1397), IReturn(ERef(RefId(Id("""__x2__""")))).setId(1398)).setId(1399), ISeq(List()).setId(1391)).setId(1400), ILet(Id("""hasEnumerable"""), ERef(RefId(Id("""__x2__""")))).setId(1401), IIf(EBOp(OEq, ERef(RefId(Id("""hasEnumerable"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""enumerable"""))).setId(1403), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(1404), IReturn(ERef(RefId(Id("""__x3__""")))).setId(1405)).setId(1406), ISeq(List()).setId(1391)).setId(1407), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(1408), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(1409), IReturn(ERef(RefId(Id("""__x4__""")))).setId(1410)).setId(1411), ISeq(List()).setId(1391)).setId(1412), ILet(Id("""enumerable"""), ERef(RefId(Id("""__x4__""")))).setId(1413), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Enumerable""")), ERef(RefId(Id("""enumerable""")))).setId(1415))).setId(1417), ISeq(List()).setId(1391)).setId(1418), IApp(Id("""__x5__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""configurable"""))).setId(1420), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(1421), IReturn(ERef(RefId(Id("""__x5__""")))).setId(1422)).setId(1423), ISeq(List()).setId(1391)).setId(1424), ILet(Id("""hasConfigurable"""), ERef(RefId(Id("""__x5__""")))).setId(1425), IIf(EBOp(OEq, ERef(RefId(Id("""hasConfigurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""configurable"""))).setId(1427), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(1428), IReturn(ERef(RefId(Id("""__x6__""")))).setId(1429)).setId(1430), ISeq(List()).setId(1391)).setId(1431), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(1432), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(1433), IReturn(ERef(RefId(Id("""__x7__""")))).setId(1434)).setId(1435), ISeq(List()).setId(1391)).setId(1436), ILet(Id("""configurable"""), ERef(RefId(Id("""__x7__""")))).setId(1437), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Configurable""")), ERef(RefId(Id("""configurable""")))).setId(1439))).setId(1441), ISeq(List()).setId(1391)).setId(1442), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""value"""))).setId(1444), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(1445), IReturn(ERef(RefId(Id("""__x8__""")))).setId(1446)).setId(1447), ISeq(List()).setId(1391)).setId(1448), ILet(Id("""hasValue"""), ERef(RefId(Id("""__x8__""")))).setId(1449), IIf(EBOp(OEq, ERef(RefId(Id("""hasValue"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""value"""))).setId(1451), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(1452), IReturn(ERef(RefId(Id("""__x9__""")))).setId(1453)).setId(1454), ISeq(List()).setId(1391)).setId(1455), ILet(Id("""value"""), ERef(RefId(Id("""__x9__""")))).setId(1456), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Value""")), ERef(RefId(Id("""value""")))).setId(1458))).setId(1460), ISeq(List()).setId(1391)).setId(1461), IApp(Id("""__x10__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""writable"""))).setId(1463), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(1464), IReturn(ERef(RefId(Id("""__x10__""")))).setId(1465)).setId(1466), ISeq(List()).setId(1391)).setId(1467), ILet(Id("""hasWritable"""), ERef(RefId(Id("""__x10__""")))).setId(1468), IIf(EBOp(OEq, ERef(RefId(Id("""hasWritable"""))), EBool(true)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""writable"""))).setId(1470), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(1471), IReturn(ERef(RefId(Id("""__x11__""")))).setId(1472)).setId(1473), ISeq(List()).setId(1391)).setId(1474), IApp(Id("""__x12__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(1475), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(1476), IReturn(ERef(RefId(Id("""__x12__""")))).setId(1477)).setId(1478), ISeq(List()).setId(1391)).setId(1479), ILet(Id("""writable"""), ERef(RefId(Id("""__x12__""")))).setId(1480), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Writable""")), ERef(RefId(Id("""writable""")))).setId(1482))).setId(1484), ISeq(List()).setId(1391)).setId(1485), IApp(Id("""__x13__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""get"""))).setId(1487), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(1488), IReturn(ERef(RefId(Id("""__x13__""")))).setId(1489)).setId(1490), ISeq(List()).setId(1391)).setId(1491), ILet(Id("""hasGet"""), ERef(RefId(Id("""__x13__""")))).setId(1492), IIf(EBOp(OEq, ERef(RefId(Id("""hasGet"""))), EBool(true)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""get"""))).setId(1494), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(1495), IReturn(ERef(RefId(Id("""__x14__""")))).setId(1496)).setId(1497), ISeq(List()).setId(1391)).setId(1498), ILet(Id("""getter"""), ERef(RefId(Id("""__x14__""")))).setId(1499), IApp(Id("""__x15__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""getter"""))))).setId(1501), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x15__"""))), EBool(false)), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""getter"""))), EUndef))), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(1502), IReturn(ERef(RefId(Id("""__x16__""")))).setId(1503))).setId(1504), ISeq(List()).setId(1391)).setId(1505), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Get""")), ERef(RefId(Id("""getter""")))).setId(1507))).setId(1509), ISeq(List()).setId(1391)).setId(1510), IApp(Id("""__x17__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""set"""))).setId(1512), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))).setId(1513), IReturn(ERef(RefId(Id("""__x17__""")))).setId(1514)).setId(1515), ISeq(List()).setId(1391)).setId(1516), ILet(Id("""hasSet"""), ERef(RefId(Id("""__x17__""")))).setId(1517), IIf(EBOp(OEq, ERef(RefId(Id("""hasSet"""))), EBool(true)), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Obj"""))), EStr("""set"""))).setId(1519), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))).setId(1520), IReturn(ERef(RefId(Id("""__x18__""")))).setId(1521)).setId(1522), ISeq(List()).setId(1391)).setId(1523), ILet(Id("""setter"""), ERef(RefId(Id("""__x18__""")))).setId(1524), IApp(Id("""__x19__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""setter"""))))).setId(1526), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x19__"""))), EBool(false)), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""setter"""))), EUndef))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(1527), IReturn(ERef(RefId(Id("""__x20__""")))).setId(1528))).setId(1529), ISeq(List()).setId(1391)).setId(1530), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Set""")), ERef(RefId(Id("""setter""")))).setId(1532))).setId(1534), ISeq(List()).setId(1391)).setId(1535), IIf(EBOp(OOr, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Get"""))), EAbsent)), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Set"""))), EAbsent))), IIf(EBOp(OOr, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Value"""))), EAbsent)), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Writable"""))), EAbsent))), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(1537), IReturn(ERef(RefId(Id("""__x21__""")))).setId(1538))).setId(1539), ISeq(List()).setId(1391)).setId(1540), ISeq(List()).setId(1391)).setId(1543), IApp(Id("""__x22__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""desc"""))))).setId(1545), IReturn(ERef(RefId(Id("""__x22__""")))).setId(1546))).setId(-1))
  /* Beautified form:
  "ToPropertyDescriptor" (Obj) => {
    app __x0__ = (Type Obj)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    let desc = (new PropertyDescriptor("SubMap" -> (new SubMap())))
    app __x2__ = (HasProperty Obj "enumerable")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let hasEnumerable = __x2__
    if (= hasEnumerable true) {
      app __x3__ = (Get Obj "enumerable")
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (ToBoolean __x3__)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let enumerable = __x4__
      desc["Enumerable"] = enumerable
    } else {}
    app __x5__ = (HasProperty Obj "configurable")
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let hasConfigurable = __x5__
    if (= hasConfigurable true) {
      app __x6__ = (Get Obj "configurable")
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (ToBoolean __x6__)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let configurable = __x7__
      desc["Configurable"] = configurable
    } else {}
    app __x8__ = (HasProperty Obj "value")
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let hasValue = __x8__
    if (= hasValue true) {
      app __x9__ = (Get Obj "value")
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let value = __x9__
      desc["Value"] = value
    } else {}
    app __x10__ = (HasProperty Obj "writable")
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    let hasWritable = __x10__
    if (= hasWritable true) {
      app __x11__ = (Get Obj "writable")
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (ToBoolean __x11__)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let writable = __x12__
      desc["Writable"] = writable
    } else {}
    app __x13__ = (HasProperty Obj "get")
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let hasGet = __x13__
    if (= hasGet true) {
      app __x14__ = (Get Obj "get")
      if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let getter = __x14__
      app __x15__ = (IsCallable getter)
      if (&& (= __x15__ false) (! (= getter undefined))) {
        app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x16__
      } else {}
      desc["Get"] = getter
    } else {}
    app __x17__ = (HasProperty Obj "set")
    if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
    let hasSet = __x17__
    if (= hasSet true) {
      app __x18__ = (Get Obj "set")
      if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
      let setter = __x18__
      app __x19__ = (IsCallable setter)
      if (&& (= __x19__ false) (! (= setter undefined))) {
        app __x20__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x20__
      } else {}
      desc["Set"] = setter
    } else {}
    if (|| (! (= desc["Get"] absent)) (! (= desc["Set"] absent))) if (|| (! (= desc["Value"] absent)) (! (= desc["Writable"] absent))) {
      app __x21__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x21__
    } else {} else {}
    app __x22__ = (WrapCompletion desc)
    return __x22__
  }
  */
}
