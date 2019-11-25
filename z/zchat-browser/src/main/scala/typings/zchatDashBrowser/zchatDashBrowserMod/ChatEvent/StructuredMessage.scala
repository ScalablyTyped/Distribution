package typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent

import typings.zchatDashBrowser.zchatDashBrowserStrings.LIST_TEMPLATE
import typings.zchatDashBrowser.zchatDashBrowserStrings.PANEL_TEMPLATE
import typings.zchatDashBrowser.zchatDashBrowserStrings.PANEL_TEMPLATE_CAROUSEL
import typings.zchatDashBrowser.zchatDashBrowserStrings.QUICK_REPLIES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.zchatDashBrowser.Anon_Msg
  - typings.zchatDashBrowser.Anon_Buttons
  - typings.zchatDashBrowser.Anon_Items
  - typings.zchatDashBrowser.Anon_ButtonsItems
*/
trait StructuredMessage extends js.Object

object StructuredMessage {
  @scala.inline
  def Anon_Msg(msg: String, quick_replies: js.Array[Button], `type`: QUICK_REPLIES): StructuredMessage = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
  @scala.inline
  def Anon_Buttons(buttons: js.Array[Button], panel: Panel, `type`: PANEL_TEMPLATE): StructuredMessage = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
  @scala.inline
  def Anon_Items(items: js.Array[PanelTemplate], `type`: PANEL_TEMPLATE_CAROUSEL): StructuredMessage = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
  @scala.inline
  def Anon_ButtonsItems(buttons: js.Array[Button], items: js.Array[ListItem], `type`: LIST_TEMPLATE): StructuredMessage = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
}

