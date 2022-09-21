package typings.zingchart.es6Mod.zingchart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait globals extends StObject {
  
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require a leading zero before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the border color of the object, applicable to closed shapes. "none" | "transparent" | "#1A237E" | "purple" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border radius of the object, applicable to closed shapes. "3px" | "7px" | ...
    */
  var `border-radius`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the border width of the object, applicable to closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[Any] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[Any] = js.undefined
  
  var borderWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the font color of the object. "none" | "transparent" | "#1A237E" | "purple" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font family of the object. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font size of the object. 12 | "20px" | ...
    */
  var `font-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the font weight of the object. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  
  var fontColor: js.UndefOr[String] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Any] = js.undefined
  
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line color of the object, applicable to non-closed shapes. "none" | "transparent" | "#1A237E" | "purple" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line style of the object, applicable to non-closed shapes. "solid" | "dashed" | "dotted" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line width of the object, applicable to non-closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[Double] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var lineStyle: js.UndefOr[String] = js.undefined
}
object globals {
  
  inline def apply(): globals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[globals]
  }
  
  extension [Self <: globals](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-radius`(value: Any): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    inline def `setBorder-width`(value: Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Any): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Any): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def `setFont-color`(value: String): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    inline def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-size`(value: Any): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    inline def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def `setLine-color`(value: String): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    inline def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    inline def `setLine-style`(value: String): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    inline def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    inline def `setLine-width`(value: Double): Self = StObject.set(x, "line-width", value.asInstanceOf[js.Any])
    
    inline def `setLine-widthUndefined`: Self = StObject.set(x, "line-width", js.undefined)
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineStyle(value: String): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
