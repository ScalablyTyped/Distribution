package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.Button
import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.Panel
import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.StructuredMessage
import typings.zchatDashBrowser.zchatDashBrowserStrings.PANEL_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buttons extends StructuredMessage {
  var buttons: js.Array[Button]
  var panel: Panel
  var `type`: PANEL_TEMPLATE
}

object Anon_Buttons {
  @scala.inline
  def apply(buttons: js.Array[Button], panel: Panel, `type`: PANEL_TEMPLATE): Anon_Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Buttons]
  }
}

