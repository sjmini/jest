package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FromPropertyDescriptor {
  val length: Int = 1
  val func: Func = Func("""FromPropertyDescriptor""", List(Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""Desc"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(1258), IReturn(ERef(RefId(Id("""__x0__""")))).setId(1259))).setId(1309), ISeq(List()).setId(1310)).setId(1262), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(1264), ILet(Id("""obj"""), ERef(RefId(Id("""__x1__""")))).setId(1265), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""value"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))).setId(1267), IExpr(ERef(RefId(Id("""__x2__""")))).setId(1268))).setId(1316), ISeq(List()).setId(1317)).setId(1271), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""writable"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))))).setId(1273), IExpr(ERef(RefId(Id("""__x3__""")))).setId(1274))).setId(1321), ISeq(List()).setId(1322)).setId(1277), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""get"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))))).setId(1279), IExpr(ERef(RefId(Id("""__x4__""")))).setId(1280))).setId(1326), ISeq(List()).setId(1327)).setId(1283), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""set"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))))).setId(1285), IExpr(ERef(RefId(Id("""__x5__""")))).setId(1286))).setId(1331), ISeq(List()).setId(1332)).setId(1289), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""enumerable"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))))).setId(1291), IExpr(ERef(RefId(Id("""__x6__""")))).setId(1292))).setId(1336), ISeq(List()).setId(1337)).setId(1295), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EAbsent)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""configurable"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))).setId(1297), IExpr(ERef(RefId(Id("""__x7__""")))).setId(1298))).setId(1341), ISeq(List()).setId(1342)).setId(1301), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(1303), IReturn(ERef(RefId(Id("""__x8__""")))).setId(1304))).setId(1346))
  val instToStepMap: Map[Int, Int] = HashMap(1295 -> 23, 1265 -> 2, 1274 -> 10, 1292 -> 22, 1286 -> 18, 1282 -> 14, 1293 -> 22, 1267 -> 6, 1289 -> 19, 1276 -> 10, 1294 -> 22, 1288 -> 18, 1290 -> 19, 1269 -> 6, 1305 -> 29, 1275 -> 10, 1260 -> 0, 1287 -> 18, 1298 -> 26, 1264 -> 2, 1279 -> 14, 1302 -> 27, 1283 -> 15, 1296 -> 23, 1281 -> 14, 1291 -> 22, 1270 -> 6, 1259 -> 0, 1263 -> 1, 1297 -> 26, 1266 -> 2, 1278 -> 11, 1273 -> 10, 1301 -> 27, 1271 -> 7, 1258 -> 0, 1304 -> 29, 1277 -> 11, 1300 -> 26, 1262 -> 1, 1285 -> 18, 1284 -> 15, 1272 -> 7, 1280 -> 14, 1303 -> 29, 1261 -> 28, 1268 -> 6, 1299 -> 26)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(1260, 1259, 1258), 10 -> HashSet(1275, 1274, 1273, 1276), 14 -> HashSet(1279, 1281, 1282, 1280), 29 -> HashSet(1305, 1304, 1303), 1 -> HashSet(1263, 1262), 6 -> HashSet(1269, 1270, 1267, 1268), 28 -> HashSet(1261), 2 -> HashSet(1265, 1264, 1266), 7 -> HashSet(1271, 1272), 3 -> HashSet(1261), 18 -> HashSet(1287, 1286, 1285, 1288), 11 -> HashSet(1278, 1277), 19 -> HashSet(1290, 1289), 15 -> HashSet(1283, 1284), 22 -> HashSet(1291, 1292, 1293, 1294), 27 -> HashSet(1302, 1301), 26 -> HashSet(1298, 1297, 1300, 1299), 23 -> HashSet(1295, 1296))
  /* Beautified form:
  "FromPropertyDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    app __x1__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x1__
    if (! (= Desc["Value"] absent)) {
      app __x2__ = (CreateDataProperty obj "value" Desc["Value"])
      __x2__
    } else {}
    if (! (= Desc["Writable"] absent)) {
      app __x3__ = (CreateDataProperty obj "writable" Desc["Writable"])
      __x3__
    } else {}
    if (! (= Desc["Get"] absent)) {
      app __x4__ = (CreateDataProperty obj "get" Desc["Get"])
      __x4__
    } else {}
    if (! (= Desc["Set"] absent)) {
      app __x5__ = (CreateDataProperty obj "set" Desc["Set"])
      __x5__
    } else {}
    if (! (= Desc["Enumerable"] absent)) {
      app __x6__ = (CreateDataProperty obj "enumerable" Desc["Enumerable"])
      __x6__
    } else {}
    if (! (= Desc["Configurable"] absent)) {
      app __x7__ = (CreateDataProperty obj "configurable" Desc["Configurable"])
      __x7__
    } else {}
    app __x8__ = (WrapCompletion obj)
    return __x8__
  }
  */
}
