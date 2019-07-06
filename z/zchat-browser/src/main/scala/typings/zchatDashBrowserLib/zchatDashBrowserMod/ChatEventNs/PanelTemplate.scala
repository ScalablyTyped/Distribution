package typings
package zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelTemplate extends js.Object {
  var buttons: js.Array[Button]
  var panel: Panel
  var `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.PANEL_TEMPLATE
}

object PanelTemplate {
  @scala.inline
  def apply(
    buttons: js.Array[Button],
    panel: Panel,
    `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.PANEL_TEMPLATE
  ): PanelTemplate = {
    val __obj = js.Dynamic.literal(buttons = buttons, panel = panel)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PanelTemplate]
  }
}

