package typings.zingchart.mod

import typings.zingchart.AnonButtonCustomitems
import typings.zingchart.AnonEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait gui extends js.Object {
  var behaviors: js.UndefOr[js.Array[AnonEnabled]] = js.undefined
  var `context-menu`: js.UndefOr[AnonButtonCustomitems] = js.undefined
}

object gui {
  @scala.inline
  def apply(behaviors: js.Array[AnonEnabled] = null, `context-menu`: AnonButtonCustomitems = null): gui = {
    val __obj = js.Dynamic.literal()
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    if (`context-menu` != null) __obj.updateDynamic("context-menu")(`context-menu`.asInstanceOf[js.Any])
    __obj.asInstanceOf[gui]
  }
}

