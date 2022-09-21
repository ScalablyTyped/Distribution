package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRight extends StObject {
  
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the styling for the bottom border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a s
    * tring. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-bottom`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the styling for the left border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a str
    * ing. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-left`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the border radius (rounded corners) of the object. The higher the value, the more rounded the corners appear. 4 | "6px" | "6p
    * x 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the styling for the right border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a st
    * ring. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-right`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the styling for the top border. Provide border width, line style (solid, dotted, dashed, dashdot), and border color in a stri
    * ng. "1px solid green" | "3px dotted purple" | ...
    */
  var `border-top`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Any] = js.undefined
  
  var borderBottom: js.UndefOr[Any] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderLeft: js.UndefOr[Any] = js.undefined
  
  var borderRadius: js.UndefOr[Any] = js.undefined
  
  var borderRight: js.UndefOr[Any] = js.undefined
  
  var borderTop: js.UndefOr[Any] = js.undefined
  
  var borderWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Any] = js.undefined
}
object BorderRight {
  
  inline def apply(): BorderRight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRight]
  }
  
  extension [Self <: BorderRight](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def `setBorder-bottom`(value: Any): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-left`(value: Any): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
    
    inline def `setBorder-radius`(value: Any): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    inline def `setBorder-right`(value: Any): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
    
    inline def `setBorder-top`(value: Any): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
    
    inline def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
    
    inline def `setBorder-width`(value: Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderBottom(value: Any): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderLeft(value: Any): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    inline def setBorderRadius(value: Any): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderRight(value: Any): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderTop(value: Any): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setBorderWidth(value: Any): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
