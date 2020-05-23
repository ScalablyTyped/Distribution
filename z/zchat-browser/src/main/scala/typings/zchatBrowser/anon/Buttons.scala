package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.Button
import typings.zchatBrowser.mod.ChatEvent.Panel
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buttons extends StructuredMessage {
  var buttons: js.Array[Button]
  var panel: Panel
  var `type`: PANEL_TEMPLATE
}

object Buttons {
  @scala.inline
  def apply(buttons: js.Array[Button], panel: Panel, `type`: PANEL_TEMPLATE): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
}

