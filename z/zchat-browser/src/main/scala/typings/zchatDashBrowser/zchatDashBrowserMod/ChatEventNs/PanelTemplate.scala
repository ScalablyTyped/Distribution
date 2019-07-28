package typings.zchatDashBrowser.zchatDashBrowserMod.ChatEventNs

import typings.zchatDashBrowser.zchatDashBrowserStrings.PANEL_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelTemplate extends js.Object {
  var buttons: js.Array[Button]
  var panel: Panel
  var `type`: PANEL_TEMPLATE
}

object PanelTemplate {
  @scala.inline
  def apply(buttons: js.Array[Button], panel: Panel, `type`: PANEL_TEMPLATE): PanelTemplate = {
    val __obj = js.Dynamic.literal(buttons = buttons, panel = panel)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PanelTemplate]
  }
}

