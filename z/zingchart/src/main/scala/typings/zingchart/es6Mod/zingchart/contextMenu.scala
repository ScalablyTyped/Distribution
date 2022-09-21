package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.Close
import typings.zingchart.anon.FontColor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait contextMenu extends StObject {
  
  var button: js.UndefOr[Close] = js.undefined
  
  var items: js.UndefOr[js.Array[FontColor_]] = js.undefined
  
  /**
    * To set the visibility of the object. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object contextMenu {
  
  inline def apply(): contextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[contextMenu]
  }
  
  extension [Self <: contextMenu](x: Self) {
    
    inline def setButton(value: Close): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setItems(value: js.Array[FontColor_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FontColor_ *): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
