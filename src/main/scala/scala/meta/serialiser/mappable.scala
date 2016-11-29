package scala.meta.serialiser

import scala.annotation.StaticAnnotation
import scala.collection.immutable.Seq
import scala.meta._

class mappable extends StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    val q"..$mods class $tName (..$params) extends $template" = defn

    val res = q"""
      ..$mods class $tName(..$params) {
        def toMap(): Map[String, Any] = Map.empty[String, Any]
      }
    """

    println("============== result ==============")
    println(res)
    println("====================================")
    res
  }
}
