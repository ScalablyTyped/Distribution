package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderwidthFontcolor extends StObject {
  
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
  
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the font color of the object text. "none" | "transparent" | "purple" | "#33ccff" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font family of the object text. "Courier" | "Georgia" | "Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font size of the object text. 12 | "20px" | ...
    */
  var `font-size`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font style of the object text. "normal" | "italic"
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font weight of the object text. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the padding around the object text. "10%" | "25px" ...
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the visibility of the object. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BorderwidthFontcolor {
  
  inline def apply(): BorderwidthFontcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderwidthFontcolor]
  }
  
  extension [Self <: BorderwidthFontcolor](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-width`(value: Double): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def `setFont-color`(value: String): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    inline def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-size`(value: String): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    inline def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    inline def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
