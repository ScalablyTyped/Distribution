package typings.zingchart.mod

import typings.zingchart.anon.Customitems
import typings.zingchart.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait gui extends js.Object {
  var behaviors: js.UndefOr[js.Array[Enabled]] = js.undefined
  var `context-menu`: js.UndefOr[Customitems] = js.undefined
}

object gui {
  @scala.inline
  def apply(behaviors: js.Array[Enabled] = null, `context-menu`: Customitems = null): gui = {
    val __obj = js.Dynamic.literal()
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    if (`context-menu` != null) __obj.updateDynamic("context-menu")(`context-menu`.asInstanceOf[js.Any])
    __obj.asInstanceOf[gui]
  }
}

