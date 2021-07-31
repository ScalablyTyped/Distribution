package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontcolorHoverstate extends StObject {
  
  /**
    * Sets the background color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border width of the object. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the font color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets how the context menu item appears when a user hovers over it. Use the backgroundColor and fontColor attributes. {...}
    */
  var `hover-state`: js.UndefOr[js.Any] = js.undefined
}
object FontcolorHoverstate {
  
  @scala.inline
  def apply(): FontcolorHoverstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontcolorHoverstate]
  }
  
  @scala.inline
  implicit class FontcolorHoverstateMutableBuilder[Self <: FontcolorHoverstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    @scala.inline
    def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    @scala.inline
    def `setFont-color`(value: String): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    @scala.inline
    def `setHover-state`(value: js.Any): Self = StObject.set(x, "hover-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHover-stateUndefined`: Self = StObject.set(x, "hover-state", js.undefined)
  }
}
