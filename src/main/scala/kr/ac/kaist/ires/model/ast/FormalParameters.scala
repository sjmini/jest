package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FormalParameters extends AST {
  val kind: String = "FormalParameters"
}
case class FormalParameters0(parserParams: List[Boolean]) extends FormalParameters {
  val name: String = "FormalParameters0"
  override def toString: String = {
    s""
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = FormalParameters0
}
object FormalParameters0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IteratorBindingInitialization0" -> FormalParameters0IteratorBindingInitialization0.func,
    "BoundNames0" -> FormalParameters0BoundNames0.func,
    "IsSimpleParameterList0" -> FormalParameters0IsSimpleParameterList0.func,
    "ExpectedArgumentCount0" -> FormalParameters0ExpectedArgumentCount0.func,
    "ContainsExpression0" -> FormalParameters0ContainsExpression0.func
  )
}
case class FormalParameters1(x0: FunctionRestParameter, parserParams: List[Boolean]) extends FormalParameters {
  val name: String = "FormalParameters1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FunctionRestParameter", x0, Nil).reverse
  val info: ASTInfo = FormalParameters1
}
object FormalParameters1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpectedArgumentCount0" -> FormalParameters1ExpectedArgumentCount0.func,
    "IsSimpleParameterList0" -> FormalParameters1IsSimpleParameterList0.func
  )
}
case class FormalParameters2(x0: FormalParameterList, parserParams: List[Boolean]) extends FormalParameters {
  val name: String = "FormalParameters2"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FormalParameterList", x0, Nil).reverse
  val info: ASTInfo = FormalParameters2
}
object FormalParameters2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class FormalParameters3(x0: FormalParameterList, parserParams: List[Boolean]) extends FormalParameters {
  val name: String = "FormalParameters3"
  override def toString: String = {
    s"$x0 ,"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FormalParameterList", x0, Nil).reverse
  val info: ASTInfo = FormalParameters3
}
object FormalParameters3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class FormalParameters4(x0: FormalParameterList, x2: FunctionRestParameter, parserParams: List[Boolean]) extends FormalParameters {
  val name: String = "FormalParameters4"
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("FunctionRestParameter", x2, l("FormalParameterList", x0, Nil)).reverse
  val info: ASTInfo = FormalParameters4
}
object FormalParameters4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsSimpleParameterList0" -> FormalParameters4IsSimpleParameterList0.func,
    "BoundNames0" -> FormalParameters4BoundNames0.func,
    "IteratorBindingInitialization0" -> FormalParameters4IteratorBindingInitialization0.func,
    "ExpectedArgumentCount0" -> FormalParameters4ExpectedArgumentCount0.func,
    "ContainsExpression0" -> FormalParameters4ContainsExpression0.func
  )
}
