package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.PanelTemplate
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE_CAROUSEL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends StructuredMessage {
  
  var items: js.Array[PanelTemplate] = js.native
  
  var `type`: PANEL_TEMPLATE_CAROUSEL = js.native
}
object Items {
  
  @scala.inline
  def apply(items: js.Array[PanelTemplate], `type`: PANEL_TEMPLATE_CAROUSEL): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
