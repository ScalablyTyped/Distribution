package typings.zipkin.zipkinMod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  var timestamp: Double
  var value: String
}

object Annotation {
  @scala.inline
  def apply(timestamp: Double, value: String): Annotation = {
    val __obj = js.Dynamic.literal(timestamp = timestamp, value = value)
  
    __obj.asInstanceOf[Annotation]
  }
}

