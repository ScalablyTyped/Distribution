package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.Alpha
import typings.zingchart.anon.Angle
import typings.zingchart.anon.BackgroundColor_
import typings.zingchart.anon.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait contextMenuGui extends StObject {
  
  var button: js.UndefOr[Alpha] = js.undefined
  
  var `custom-items`: js.UndefOr[js.Array[Function]] = js.undefined
  
  /**
    * To fix the position of the context menu to one side of the chart. true | false
    */
  var docked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Empties all default context-menu items, leaving just the "About ZingChart" button. true | false | 1 | 0
    */
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var gear: js.UndefOr[Angle] = js.undefined
  
  var item: js.UndefOr[BackgroundColor_] = js.undefined
  
  /**
    * To position the context menu button on the left or right side of the chart. left | right
    */
  var position: js.UndefOr[String] = js.undefined
}
object contextMenuGui {
  
  inline def apply(): contextMenuGui = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[contextMenuGui]
  }
  
  extension [Self <: contextMenuGui](x: Self) {
    
    inline def setButton(value: Alpha): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def `setCustom-items`(value: js.Array[Function]): Self = StObject.set(x, "custom-items", value.asInstanceOf[js.Any])
    
    inline def `setCustom-itemsUndefined`: Self = StObject.set(x, "custom-items", js.undefined)
    
    inline def `setCustom-itemsVarargs`(value: Function*): Self = StObject.set(x, "custom-items", js.Array(value*))
    
    inline def setDocked(value: Boolean): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
    
    inline def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setGear(value: Angle): Self = StObject.set(x, "gear", value.asInstanceOf[js.Any])
    
    inline def setGearUndefined: Self = StObject.set(x, "gear", js.undefined)
    
    inline def setItem(value: BackgroundColor_): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
