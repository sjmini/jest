package kr.ac.kaist.ires.ir

import scala.collection.mutable.{ Map => MutableMap }
import scala.collection.immutable.HashSet
import scala.annotation.tailrec
import kr.ac.kaist.ires.ir._

// Unique ID generator
object Inst {
  var genId = false
  private var internalId: Int = 0
  private def getId = {
    if (genId) {
      val returnId = internalId
      internalId += 1
      returnId
    } else {
      -1
    }
  }

  def getAllInstIds(target: Inst): HashSet[Int] = {
    @tailrec
    def helper(obj: Inst, result: HashSet[Int], remains: List[Inst]): HashSet[Int] = {
      obj match {
        case ISeq(insts) => insts match {
          case Nil => remains match {
            case Nil => result + obj.instId
            case head :: next => helper(head, result + obj.instId, next)
          }
          case head :: next => helper(head, result + obj.instId, next ++ remains)
        }
        case IWithCont(_, _, bodyInst) => helper(bodyInst, result + obj.instId, remains)
        case _ => remains match {
          case Nil => result + obj.instId
          case head :: next => helper(head, result + obj.instId, next)
        }
      }
    }

    helper(target, HashSet[Int](), Nil)
  }
}

// IR Instructions
sealed trait Inst extends IRNode with Product {
  var instId = Inst.getId

  def setId(id: Int): this.type = {
    this.instId = id
    this
  }

  def setId(inst: Inst): this.type = {
    this.instId = inst.instId
    this
  }

  override def toString(): String = {
    s"${this.productPrefix}(${this.productIterator.mkString(",")}).setId(${this.instId})"
  }
}
case class IExpr(expr: Expr) extends Inst
case class ILet(id: Id, expr: Expr) extends Inst
case class IAssign(ref: Ref, expr: Expr) extends Inst
case class IDelete(ref: Ref) extends Inst
case class IAppend(expr: Expr, list: Expr) extends Inst
case class IPrepend(expr: Expr, list: Expr) extends Inst
case class IReturn(expr: Expr) extends Inst
case class IIf(cond: Expr, thenInst: Inst, elseInst: Inst) extends Inst
case class IWhile(cond: Expr, body: Inst) extends Inst
case class ISeq(insts: List[Inst]) extends Inst
case class IAssert(expr: Expr) extends Inst
case class IPrint(expr: Expr) extends Inst
case class IApp(id: Id, fexpr: Expr, args: List[Expr]) extends Inst
case class IAccess(id: Id, bexpr: Expr, expr: Expr) extends Inst
case class IWithCont(id: Id, params: List[Id], bodyInst: Inst) extends Inst
