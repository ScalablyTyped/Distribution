package typings.zrender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: String
  var offset: Double
}

object AnonColor {
  @scala.inline
  def apply(color: String, offset: Double): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

