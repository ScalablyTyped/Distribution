package typings.zdog.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerPosition extends js.Object {
  var pageX: Double
  var pageY: Double
}

object PointerPosition {
  @scala.inline
  def apply(pageX: Double, pageY: Double): PointerPosition = {
    val __obj = js.Dynamic.literal(pageX = pageX, pageY = pageY)
  
    __obj.asInstanceOf[PointerPosition]
  }
}

