package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _ZoneFrame represents zone stack frame information
  */
@js.native
trait ZoneFrame extends js.Object {
  var parent: ZoneFrame | Null = js.native
  var zone: Zone = js.native
}

object ZoneFrame {
  @scala.inline
  def apply(zone: Zone): ZoneFrame = {
    val __obj = js.Dynamic.literal(zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneFrame]
  }
  @scala.inline
  implicit class ZoneFrameOps[Self <: ZoneFrame] (val x: Self) extends AnyVal {
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
    def setZone(value: Zone): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: ZoneFrame): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

