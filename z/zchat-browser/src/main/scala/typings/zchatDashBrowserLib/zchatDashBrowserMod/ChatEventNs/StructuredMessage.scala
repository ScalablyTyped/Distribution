package typings
package zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredMessage extends js.Object {
  var buttons: js.UndefOr[js.Array[Button]] = js.undefined
  var items: js.UndefOr[js.Array[ListItem | PanelTemplate]] = js.undefined
  var msg: js.UndefOr[java.lang.String] = js.undefined
  var panel: js.UndefOr[Panel] = js.undefined
  var quick_replies: js.UndefOr[js.Array[Button]] = js.undefined
  var `type`: js.UndefOr[
    zchatDashBrowserLib.zchatDashBrowserLibStrings.LIST_TEMPLATE | zchatDashBrowserLib.zchatDashBrowserLibStrings.PANEL_TEMPLATE | zchatDashBrowserLib.zchatDashBrowserLibStrings.PANEL_TEMPLATE_CAROUSEL | zchatDashBrowserLib.zchatDashBrowserLibStrings.QUICK_REPLIES
  ] = js.undefined
}

object StructuredMessage {
  @scala.inline
  def apply(
    buttons: js.Array[Button] = null,
    items: js.Array[PanelTemplate] = null,
    msg: java.lang.String = null,
    panel: Panel = null,
    quick_replies: js.Array[Button] = null,
    `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.QUICK_REPLIES = null
  ): StructuredMessage = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (items != null) __obj.updateDynamic("items")(items)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (quick_replies != null) __obj.updateDynamic("quick_replies")(quick_replies)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StructuredMessage]
  }
}

