package typings.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoCoordinates extends ZeptoPosition {
  var height: Double
  var width: Double
}

object ZeptoCoordinates {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): ZeptoCoordinates = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoCoordinates]
  }
}

