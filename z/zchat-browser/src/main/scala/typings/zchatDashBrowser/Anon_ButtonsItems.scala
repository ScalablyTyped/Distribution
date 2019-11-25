package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.Button
import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.ListItem
import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.StructuredMessage
import typings.zchatDashBrowser.zchatDashBrowserStrings.LIST_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonsItems extends StructuredMessage {
  var buttons: js.Array[Button]
  var items: js.Array[ListItem]
  var `type`: LIST_TEMPLATE
}

object Anon_ButtonsItems {
  @scala.inline
  def apply(buttons: js.Array[Button], items: js.Array[ListItem], `type`: LIST_TEMPLATE): Anon_ButtonsItems = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ButtonsItems]
  }
}

