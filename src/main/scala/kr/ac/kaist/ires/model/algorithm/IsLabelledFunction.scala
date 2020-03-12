package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsLabelledFunction {
  val length: Int = 1
  val func: Func = Func("""IsLabelledFunction""", List(Id("""stmt""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(36258), IAccess(Id("""__x0__"""), ERef(RefId(Id("""stmt"""))), EStr("""LabelledItem""")).setId(36259), ILet(Id("""item"""), ERef(RefId(Id("""__x0__""")))).setId(36260), IIf(EIsInstanceOf(ERef(RefId(Id("""item"""))), """LabelledItem1"""), ISeq(List(IAccess(Id("""FunctionDeclaration"""), ERef(RefId(Id("""item"""))), EStr("""FunctionDeclaration""")).setId(36264), IReturn(EBool(true)).setId(36262))).setId(36280), ISeq(List()).setId(36281)).setId(36267), IAccess(Id("""__x1__"""), ERef(RefId(Id("""item"""))), EStr("""Statement""")).setId(36268), ILet(Id("""subStmt"""), ERef(RefId(Id("""__x1__""")))).setId(36269), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsLabelledFunction"""))), List(ERef(RefId(Id("""subStmt"""))))).setId(36271), IReturn(ERef(RefId(Id("""__x2__""")))).setId(36272))).setId(36287))
  val instToStepMap: Map[Int, Int] = HashMap(36258 -> 0, 36268 -> 3, 36272 -> 4, 36262 -> 2, 36269 -> 3, 36261 -> 1, 36273 -> 4, 36270 -> 3, 36263 -> 2, 36259 -> 1, 36267 -> 2, 36260 -> 1, 36271 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(36258), 1 -> HashSet(36261, 36259, 36260), 2 -> HashSet(36262, 36263, 36267), 3 -> HashSet(36268, 36269, 36270), 4 -> HashSet(36272, 36273, 36271))
  /* Beautified form:
  "IsLabelledFunction" (stmt) => {
    !!! "Etc"
    access __x0__ = (stmt "LabelledItem")
    let item = __x0__
    if (is-instance-of item LabelledItem1) {
      access FunctionDeclaration = (item "FunctionDeclaration")
      return true
    } else {}
    access __x1__ = (item "Statement")
    let subStmt = __x1__
    app __x2__ = (IsLabelledFunction subStmt)
    return __x2__
  }
  */
}
