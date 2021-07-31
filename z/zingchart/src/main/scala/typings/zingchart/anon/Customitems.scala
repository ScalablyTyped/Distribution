package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customitems extends StObject {
  
  var button: js.UndefOr[Maxchars] = js.undefined
  
  var `custom-items`: js.UndefOr[js.Array[Function]] = js.undefined
  
  /**
    * To fix the position of the context menu to one side of the chart. true | false
    */
  var docked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Empties all default context-menu items, leaving just the "About ZingChart" button. true | false | 1 | 0
    */
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var gear: js.UndefOr[Offsety] = js.undefined
  
  var item: js.UndefOr[FontcolorHoverstate] = js.undefined
  
  /**
    * To position the context menu button on the left or right side of the chart. left | right
    */
  var position: js.UndefOr[String] = js.undefined
}
object Customitems {
  
  @scala.inline
  def apply(): Customitems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Customitems]
  }
  
  @scala.inline
  implicit class CustomitemsMutableBuilder[Self <: Customitems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Maxchars): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def `setCustom-items`(value: js.Array[Function]): Self = StObject.set(x, "custom-items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCustom-itemsUndefined`: Self = StObject.set(x, "custom-items", js.undefined)
    
    @scala.inline
    def `setCustom-itemsVarargs`(value: Function*): Self = StObject.set(x, "custom-items", js.Array(value :_*))
    
    @scala.inline
    def setDocked(value: Boolean): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setGear(value: Offsety): Self = StObject.set(x, "gear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGearUndefined: Self = StObject.set(x, "gear", js.undefined)
    
    @scala.inline
    def setItem(value: FontcolorHoverstate): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
