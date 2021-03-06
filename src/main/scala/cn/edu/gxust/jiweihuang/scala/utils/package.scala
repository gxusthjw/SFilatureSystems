package cn.edu.gxust.jiweihuang.scala

package object utils {
  /**
    * @param s string
    * @tparam T class type
    * @return option
    */
  def parse[T: ParseOp](s: String): Option[T] =
    try
      Some(implicitly[ParseOp[T]].op(s))
    catch {
      case _: Throwable => None
    }

  /** Implicitly converts type classes */
  case class ParseOp[T](op: String => T)

  implicit val popDouble: ParseOp[Double] = ParseOp[Double](_.toDouble)
  implicit val popInt: ParseOp[Int] = ParseOp[Int](_.toInt)
  implicit val popLong: ParseOp[Long] = ParseOp[Long](_.toLong)
  implicit val popFloat: ParseOp[Float] = ParseOp[Float](_.toFloat)
}