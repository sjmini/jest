package kr.ac.kaist.ires.util

import spray.json._
import scala.collection.mutable

object StepTracerJsonProtocol extends DefaultJsonProtocol {
  implicit object StringToIntMutableMapJsonFormat extends RootJsonFormat[mutable.Map[String, Int]] {
    override def read(json: JsValue): mutable.Map[String, Int] = json match {
      case JsObject(fields) => fields.map({
        case (k, v) => v match {
          case JsNumber(value) => (k -> value.toIntExact)
          case _ => deserializationError("JsNumber expected")
        }
      }).to(mutable.Map)
      case _ => deserializationError("JsObject expected")
    }

    override def write(obj: mutable.Map[String, Int]): JsValue = JsObject(obj.map({ case (k, v) => k -> JsNumber(v) }).to(Map))
  }

  implicit object StringToSetIntMutableMapJsonFormat extends RootJsonFormat[mutable.Map[String, mutable.Set[Int]]] {
    override def read(json: JsValue): mutable.Map[String, mutable.Set[Int]] = json match {
      case JsObject(fields) => fields.map({
        case (k, v) => v match {
          case JsArray(elements) => k -> elements.map({
            case JsNumber(value) => value.toIntExact
            case _ => deserializationError("JsNumber expected")
          }).to(mutable.Set)
          case _ => deserializationError("JsArray expected")
        }
      }).to(mutable.Map)
      case _ => deserializationError("JsObject expected")
    }

    override def write(obj: mutable.Map[String, mutable.Set[Int]]): JsValue = JsObject(obj.map({ case (k, v) => k -> JsArray(v.toVector.map(e => JsNumber(e))) }).to(Map))
  }

  implicit object IntToStringMutableMapJsonFormat extends RootJsonFormat[mutable.Map[Int, String]] {
    override def read(json: JsValue): mutable.Map[Int, String] = json match {
      case JsObject(fields) => fields.map({
        case (k, v) => v match {
          case JsString(value) => (k.toInt -> value)
          case _ => deserializationError("JsString expected")
        }
      }).to(mutable.Map)
      case _ => deserializationError("JsObject expected")
    }

    override def write(obj: mutable.Map[Int, String]): JsValue = JsObject(obj.map({ case (k, v) => k.toString -> JsString(v) }).to(Map))
  }

  implicit object NestedMutableMapJsonFormat extends RootJsonFormat[mutable.Map[String, mutable.Map[Int, Int]]] {
    override def read(json: JsValue): mutable.Map[String, mutable.Map[Int, Int]] = json match {
      case JsObject(fields) => fields.map({
        case (k, v) => v match {
          case JsObject(fields) => k -> fields.map({
            case (k, v) => v match {
              case JsNumber(value) => k.toInt -> value.toIntExact
              case _ => deserializationError("JsNumber expected")
            }
          }).to(mutable.Map)
          case _ => deserializationError("JsObject expected")
        }
      }).to(mutable.Map)
      case _ => deserializationError("JsObject expected")
    }

    override def write(obj: mutable.Map[String, mutable.Map[Int, Int]]): JsValue = JsObject(obj.map({
      case (k, v) => k -> JsObject(v.map({
        case (k, v) => k.toString -> JsNumber(v)
      }).to(Map))
    }).to(Map))
  }
}