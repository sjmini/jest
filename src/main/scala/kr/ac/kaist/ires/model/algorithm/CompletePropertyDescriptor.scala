package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CompletePropertyDescriptor {
  val length: Int = 1
  val func: Func = Func("""CompletePropertyDescriptor""", List(Id("""Desc""")), None, ISeq(List(ILet(Id("""like"""), EMap(Ty("""Record"""), List((EStr("""Value"""), EUndef), (EStr("""Writable"""), EBool(false)), (EStr("""Get"""), EUndef), (EStr("""Set"""), EUndef), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false))))).setId(1860), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsGenericDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(1862), ILet(Id("""__x1__"""), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))).setId(1868), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List()).setId(1905), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(1863), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true))).setId(1866))).setId(1908)).setId(1869), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Value""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Value""")))).setId(1870), ISeq(List()).setId(1911)).setId(1872), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Writable""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Writable""")))).setId(1874), ISeq(List()).setId(1914)).setId(1876))).setId(1916), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Get""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Get""")))).setId(1879), ISeq(List()).setId(1918)).setId(1881), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Set""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Set""")))).setId(1883), ISeq(List()).setId(1921)).setId(1885))).setId(1923)).setId(1888), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Enumerable""")))).setId(1890), ISeq(List()).setId(1926)).setId(1892), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Configurable""")))).setId(1894), ISeq(List()).setId(1929)).setId(1896), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""Desc"""))))).setId(1898), IReturn(ERef(RefId(Id("""__x3__""")))).setId(1899))).setId(1933))
  val instToStepMap: Map[Int, Int] = HashMap(1882 -> 11, 1872 -> 6, 1887 -> 11, 1868 -> 11, 1888 -> 11, 1878 -> 6, 1889 -> 11, 1874 -> 6, 1895 -> 14, 1884 -> 11, 1897 -> 15, 1894 -> 14, 1873 -> 6, 1869 -> 11, 1876 -> 6, 1870 -> 4, 1879 -> 9, 1899 -> 16, 1871 -> 4, 1860 -> 1, 1892 -> 13, 1890 -> 12, 1875 -> 6, 1896 -> 15, 1886 -> 11, 1900 -> 16, 1883 -> 11, 1877 -> 6, 1862 -> 11, 1898 -> 16, 1881 -> 11, 1861 -> 1, 1893 -> 13, 1859 -> 0, 1891 -> 12, 1880 -> 9, 1885 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(1859), 5 -> HashSet(1872, 1873), 10 -> HashSet(1882, 1881), 14 -> HashSet(1895, 1894), 1 -> HashSet(1860, 1861), 6 -> HashSet(1872, 1875, 1878, 1874, 1877, 1873, 1876), 9 -> HashSet(1879, 1880), 13 -> HashSet(1892, 1893), 12 -> HashSet(1890, 1891), 16 -> HashSet(1899, 1900, 1898), 11 -> HashSet(1882, 1887, 1886, 1868, 1883, 1888, 1889, 1884, 1862, 1869, 1881, 1885), 4 -> HashSet(1871, 1870), 15 -> HashSet(1896, 1897))
  /* Beautified form:
  "CompletePropertyDescriptor" (Desc) => {
    let like = (new Record("Value" -> undefined, "Writable" -> false, "Get" -> undefined, "Set" -> undefined, "Enumerable" -> false, "Configurable" -> false))
    app __x0__ = (IsGenericDescriptor Desc)
    let __x1__ = (= __x0__ true)
    if __x1__ {} else {
      app __x2__ = (IsDataDescriptor Desc)
      __x1__ = (= __x2__ true)
    }
    if __x1__ {
      if (= Desc["Value"] absent) Desc["Value"] = like["Value"] else {}
      if (= Desc["Writable"] absent) Desc["Writable"] = like["Writable"] else {}
    } else {
      if (= Desc["Get"] absent) Desc["Get"] = like["Get"] else {}
      if (= Desc["Set"] absent) Desc["Set"] = like["Set"] else {}
    }
    if (= Desc["Enumerable"] absent) Desc["Enumerable"] = like["Enumerable"] else {}
    if (= Desc["Configurable"] absent) Desc["Configurable"] = like["Configurable"] else {}
    app __x3__ = (WrapCompletion Desc)
    return __x3__
  }
  */
}
