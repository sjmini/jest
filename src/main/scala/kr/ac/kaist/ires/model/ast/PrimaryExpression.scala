package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait PrimaryExpression extends AST {
  val kind: String = "PrimaryExpression"
}
case class PrimaryExpression0(parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 4)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("this")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = PrimaryExpression0
}
object PrimaryExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> PrimaryExpression0Evaluation0.func,
    "HasCallInTailPosition0" -> PrimaryExpression0HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> PrimaryExpression0IsFunctionDefinition0.func,
  )
}
case class PrimaryExpression1(x0: IdentifierReference, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("IdentifierReference", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression1
}
object PrimaryExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> PrimaryExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> PrimaryExpression1IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> PrimaryExpression1IsIdentifierRef0.func
  )
}
case class PrimaryExpression2(x0: Literal, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Literal", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression2
}
object PrimaryExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> PrimaryExpression2HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> PrimaryExpression2IsFunctionDefinition0.func,
  )
}
case class PrimaryExpression3(x0: ArrayLiteral, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ArrayLiteral", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression3
}
object PrimaryExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsFunctionDefinition0" -> PrimaryExpression3IsFunctionDefinition0.func,
  )
}
case class PrimaryExpression4(x0: ObjectLiteral, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression4"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ObjectLiteral", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression4
}
object PrimaryExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> PrimaryExpression4HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> PrimaryExpression4IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> PrimaryExpression4IsIdentifierRef0.func
  )
}
case class PrimaryExpression5(x0: FunctionExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression5"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FunctionExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression5
}
object PrimaryExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class PrimaryExpression6(x0: ClassExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression6"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ClassExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression6
}
object PrimaryExpression6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class PrimaryExpression7(x0: GeneratorExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression7"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("GeneratorExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression7
}
object PrimaryExpression7 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class PrimaryExpression8(x0: AsyncFunctionExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression8"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AsyncFunctionExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression8
}
object PrimaryExpression8 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class PrimaryExpression9(x0: AsyncGeneratorExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression9"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AsyncGeneratorExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression9
}
object PrimaryExpression9 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class PrimaryExpression10(x0: Lexical, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression10"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression10
}
object PrimaryExpression10 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class PrimaryExpression11(x0: TemplateLiteral, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression11"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("TemplateLiteral", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression11
}
object PrimaryExpression11 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> PrimaryExpression11HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> PrimaryExpression11IsFunctionDefinition0.func,
  )
}
case class PrimaryExpression12(x0: CoverParenthesizedExpressionAndArrowParameterList, parserParams: List[Boolean]) extends PrimaryExpression {
  x0.parent = Some(this)
  val name: String = "PrimaryExpression12"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("CoverParenthesizedExpressionAndArrowParameterList", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression12
}
object PrimaryExpression12 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> PrimaryExpression12Evaluation0.func,
    "HasName0" -> PrimaryExpression12HasName0.func,
    "IsFunctionDefinition0" -> PrimaryExpression12IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> PrimaryExpression12IsIdentifierRef0.func,
    "NamedEvaluation0" -> PrimaryExpression12NamedEvaluation0.func
  )
}
