package typings
package zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.QUICK_REPLY_ACTION | zchatDashBrowserLib.zchatDashBrowserLibStrings.LINK_ACTION
  var value: java.lang.String
}

object Action {
  @scala.inline
  def apply(
    `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.QUICK_REPLY_ACTION | zchatDashBrowserLib.zchatDashBrowserLibStrings.LINK_ACTION,
    value: java.lang.String
  ): Action = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

