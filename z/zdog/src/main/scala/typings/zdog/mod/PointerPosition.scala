package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerPosition extends js.Object {
  var pageX: Double = js.native
  var pageY: Double = js.native
}

object PointerPosition {
  @scala.inline
  def apply(pageX: Double, pageY: Double): PointerPosition = {
    val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerPosition]
  }
  @scala.inline
  implicit class PointerPositionOps[Self <: PointerPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
  }
  
}

