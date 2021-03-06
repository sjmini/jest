package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait EmptyStatement extends AST {
  val kind: String = "EmptyStatement"
}
case class EmptyStatement0(parserParams: List[Boolean]) extends EmptyStatement {
  val name: String = "EmptyStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(";")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = EmptyStatement0
}
object EmptyStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> EmptyStatement0Evaluation0.func
  )
}
