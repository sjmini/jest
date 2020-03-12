package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateListIteratorRecord {
  val length: Int = 1
  val func: Func = Func("""CreateListIteratorRecord""", List(Id("""list""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_IteratorPrototype"""))), EList(List(EStr("""IteratedList"""), EStr("""ListIteratorNextIndex"""))))).setId(7762), ILet(Id("""iterator"""), ERef(RefId(Id("""__x0__""")))).setId(7763), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""IteratedList""")), ERef(RefId(Id("""list""")))).setId(7765), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""ListIteratorNextIndex""")), EINum(0L)).setId(7767), ILet(Id("""steps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""next""")), (EStr("""length"""), EINum(0L)), (EStr("""step"""), ERef(RefId(Id("""ListIteratornext"""))))))).setId(7769), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List()))).setId(7771), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(7772), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7773)).setId(7774), ISeq(List()).setId(7792)).setId(7776), ILet(Id("""next"""), ERef(RefId(Id("""__x1__""")))).setId(7777), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Record"""), List((EStr("""Iterator"""), ERef(RefId(Id("""iterator""")))), (EStr("""NextMethod"""), ERef(RefId(Id("""next""")))), (EStr("""Done"""), EBool(false)))))).setId(7779), IReturn(ERef(RefId(Id("""__x2__""")))).setId(7780))).setId(7797))
  val instToStepMap: Map[Int, Int] = HashMap(7766 -> 1, 7781 -> 5, 7771 -> 4, 7777 -> 4, 7770 -> 3, 7763 -> 0, 7769 -> 3, 7779 -> 5, 7780 -> 5, 7776 -> 4, 7762 -> 0, 7767 -> 2, 7768 -> 2, 7778 -> 4, 7764 -> 0, 7765 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(7762, 7763, 7764), 5 -> HashSet(7781, 7779, 7780), 1 -> HashSet(7766, 7765), 2 -> HashSet(7767, 7768), 3 -> HashSet(7770, 7769), 4 -> HashSet(7771, 7777, 7778, 7776))
  /* Beautified form:
  "CreateListIteratorRecord" (list) => {
    app __x0__ = (ObjectCreate INTRINSIC_IteratorPrototype (new ["IteratedList", "ListIteratorNextIndex"]))
    let iterator = __x0__
    iterator["IteratedList"] = list
    iterator["ListIteratorNextIndex"] = 0i
    let steps = (new algorithm("name" -> "next", "length" -> 0i, "step" -> ListIteratornext))
    app __x1__ = (CreateBuiltinFunction steps (new []))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let next = __x1__
    app __x2__ = (WrapCompletion (new Record("Iterator" -> iterator, "NextMethod" -> next, "Done" -> false)))
    return __x2__
  }
  */
}
