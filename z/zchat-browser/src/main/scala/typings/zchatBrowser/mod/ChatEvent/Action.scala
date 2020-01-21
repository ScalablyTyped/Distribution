package typings.zchatBrowser.mod.ChatEvent

import typings.zchatBrowser.zchatBrowserStrings.LINK_ACTION
import typings.zchatBrowser.zchatBrowserStrings.QUICK_REPLY_ACTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var `type`: QUICK_REPLY_ACTION | LINK_ACTION
  var value: String
}

object Action {
  @scala.inline
  def apply(`type`: QUICK_REPLY_ACTION | LINK_ACTION, value: String): Action = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

