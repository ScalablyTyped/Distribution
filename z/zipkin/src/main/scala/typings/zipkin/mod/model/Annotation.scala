package typings.zipkin.mod.model

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
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Annotation]
  }
}

