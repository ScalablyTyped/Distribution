package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.PanelTemplate
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE_CAROUSEL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items
  extends StObject
     with StructuredMessage {
  
  var items: js.Array[PanelTemplate]
  
  var `type`: PANEL_TEMPLATE_CAROUSEL
}
object Items {
  
  @scala.inline
  def apply(items: js.Array[PanelTemplate]): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PANEL_TEMPLATE_CAROUSEL")
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PanelTemplate]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: PanelTemplate*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setType(value: PANEL_TEMPLATE_CAROUSEL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
