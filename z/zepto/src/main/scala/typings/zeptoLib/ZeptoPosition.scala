package typings
package zeptoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoPosition extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object ZeptoPosition {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): ZeptoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[ZeptoPosition]
  }
}

