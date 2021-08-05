package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.Button
import typings.zchatBrowser.mod.ChatEvent.Panel
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buttons
  extends StObject
     with StructuredMessage {
  
  var buttons: js.Array[Button]
  
  var panel: Panel
  
  var `type`: PANEL_TEMPLATE
}
object Buttons {
  
  inline def apply(buttons: js.Array[Button], panel: Panel): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PANEL_TEMPLATE")
    __obj.asInstanceOf[Buttons]
  }
  
  extension [Self <: Buttons](x: Self) {
    
    inline def setButtons(value: js.Array[Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setPanel(value: Panel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setType(value: PANEL_TEMPLATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
