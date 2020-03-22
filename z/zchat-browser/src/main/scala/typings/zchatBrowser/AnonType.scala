package typings.zchatBrowser

import typings.zchatBrowser.mod.ChatEvent.Button
import typings.zchatBrowser.mod.ChatEvent.ListItem
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.LIST_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends StructuredMessage {
  var buttons: js.Array[Button]
  var items: js.Array[ListItem]
  var `type`: LIST_TEMPLATE
}

object AnonType {
  @scala.inline
  def apply(buttons: js.Array[Button], items: js.Array[ListItem], `type`: LIST_TEMPLATE): AnonType = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

