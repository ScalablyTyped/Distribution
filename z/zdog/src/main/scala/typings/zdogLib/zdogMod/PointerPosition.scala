package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerPosition extends js.Object {
  var pageX: scala.Double
  var pageY: scala.Double
}

object PointerPosition {
  @scala.inline
  def apply(pageX: scala.Double, pageY: scala.Double): PointerPosition = {
    val __obj = js.Dynamic.literal(pageX = pageX, pageY = pageY)
  
    __obj.asInstanceOf[PointerPosition]
  }
}

