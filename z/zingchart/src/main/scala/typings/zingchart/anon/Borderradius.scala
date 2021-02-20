package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Borderradius extends StObject {
  
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the styling for the bottom border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a s
    * tring. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-bottom`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the styling for the left border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a str
    * ing. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-left`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the border radius (rounded corners) of the object. The higher the value, the more rounded the corners appear. 4 | "6px" | "6p
    * x 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the styling for the right border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a st
    * ring. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-right`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the styling for the top border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a stri
    * ng. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-top`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.native
}
object Borderradius {
  
  @scala.inline
  def apply(): Borderradius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Borderradius]
  }
  
  @scala.inline
  implicit class BorderradiusMutableBuilder[Self <: Borderradius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    @scala.inline
    def `setBorder-bottom`(value: js.Any): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
    
    @scala.inline
    def `setBorder-left`(value: js.Any): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
    
    @scala.inline
    def `setBorder-radius`(value: js.Any): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    @scala.inline
    def `setBorder-right`(value: js.Any): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
    
    @scala.inline
    def `setBorder-top`(value: js.Any): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
