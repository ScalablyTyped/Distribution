package typings.zchatBrowser.mod.ChatEvent

import typings.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelTemplate extends js.Object {
  
  var buttons: js.Array[Button] = js.native
  
  var panel: Panel = js.native
  
  var `type`: PANEL_TEMPLATE = js.native
}
object PanelTemplate {
  
  @scala.inline
  def apply(buttons: js.Array[Button], panel: Panel, `type`: PANEL_TEMPLATE): PanelTemplate = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelTemplate]
  }
  
  @scala.inline
  implicit class PanelTemplateOps[Self <: PanelTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtonsVarargs(value: Button*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[Button]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanel(value: Panel): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PANEL_TEMPLATE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
