package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _ZoneFrame represents zone stack frame information
  */
trait ZoneFrame extends js.Object {
  var parent: ZoneFrame | Null
  var zone: Zone
}

object ZoneFrame {
  @scala.inline
  def apply(zone: Zone, parent: ZoneFrame = null): ZoneFrame = {
    val __obj = js.Dynamic.literal(zone = zone.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneFrame]
  }
}

