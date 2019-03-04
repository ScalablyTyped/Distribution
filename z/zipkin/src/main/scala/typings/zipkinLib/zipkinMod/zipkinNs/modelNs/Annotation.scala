package typings
package zipkinLib.zipkinMod.zipkinNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  var timestamp: scala.Double
  var value: java.lang.String
}

object Annotation {
  @scala.inline
  def apply(timestamp: scala.Double, value: java.lang.String): Annotation = {
    val __obj = js.Dynamic.literal(timestamp = timestamp, value = value)
  
    __obj.asInstanceOf[Annotation]
  }
}

