package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.AlphaLineColor
import typings.zingchart.anon.Fontcolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait valueBox extends StObject {
  
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Note that values require the leading 0 before the decimal point. Use with "background-color" attribute. 0.3 | 0.4 |
    *  0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the rotation angle of the object. A positive value will turn it in a clockwise direction. A negative value will turn it in a
    * counterclockwise direction. -90 | 270 | 180 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#FF0
    * 000", "#0000FF"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). One color will set a solid background color. Two colors
    * will, by default, create a horizontal gradient. For more complex gradients, use "gradient-colors" and "gradient-stops". "none" | "
    * transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the first color of a two-color background gradient. To be used with "background-color-2". "none" | "transparent" | "#f00" | "
    * #f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the second color of a two-color background gradient. To be used with "background-color-1". "none" | "transparent" | "#f00" |
    * "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the direction(s) in which the background image is being stretched. Works with "background-image". "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the position of the background when the "background-repeat" attribute is set to "no-repeat". "0 0" | "50 100" | "80% 60%" | .
    * ..
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the repeating mode for the background image. Works with "background-image". "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundColor1: js.UndefOr[String] = js.undefined
  
  var backgroundColor2: js.UndefOr[String] = js.undefined
  
  var backgroundFit: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var backgroundPosition: js.UndefOr[String] = js.undefined
  
  var backgroundRepeat: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the transparency of the border. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `border-alpha`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the border color of the object, applicable on closed shapes. See the "line-color" attribute for closed shapes. "none" | "tran
    * sparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border width of the object, applicable on closed shapes. See the "line-width" attribute for closed shapes. 4 | "6px" | ..
    * .
    */
  var `border-width`: js.UndefOr[Any] = js.undefined
  
  var borderAlpha: js.UndefOr[Double] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets whether or not the object will have a callout arrow. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  
  var connector: js.UndefOr[AlphaLineColor] = js.undefined
  
  /**
    * Allows you to set the number of decimal places displayed for each value. 2 | 3 | 10 | ...
    */
  var decimals: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows you to set the decimal mark displayed for each value. "." | "," | " " | ...
    */
  var `decimals-separator`: js.UndefOr[String] = js.undefined
  
  var decimalsSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets an X offset to apply to the object. 5 | "10px" | ...
    */
  var `fill-offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets a Y offset to apply to the object. 5 | "10px" | ...
    */
  var `fill-offset-y`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the background gradient fill type to linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  
  var fillAngle: js.UndefOr[Double] = js.undefined
  
  var fillOffsetX: js.UndefOr[Any] = js.undefined
  
  var fillOffsetY: js.UndefOr[Any] = js.undefined
  
  var fillType: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font color of the value box text. Similar to the "color" attribute. "none" | "transparent" | "#f00" | "#f00 #00f" | "red
    * yellow" | "rgb(100, 15, 15)" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font family of the value box text. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font size of the value box text. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the font style of the value box text. Similar to the "italic" attribute. "none" | "italic"
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font weight of the value box text. Similar to the "bold" attribute. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  
  var fontColor: js.UndefOr[String] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Any] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the colors for a complex background gradient consisting of two or more colors. Use with the "gradient-stops" attribute. Works
    *  with output svg. "#f00 #0f0 #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the gradient stops for a complex background gradient consisting of two or more colors. Use with the "gradient-colors" attribu
    * te. Works with output svg. "0.1 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  
  var gradientColors: js.UndefOr[String] = js.undefined
  
  var gradientStops: js.UndefOr[String] = js.undefined
  
  var joined: js.UndefOr[Fontcolor] = js.undefined
  
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  var lineStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Sets an X offset to apply when positioning the object. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets a Y offset to apply when positioning the object. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[Any] = js.undefined
  
  var offsetX: js.UndefOr[Any] = js.undefined
  
  var offsetY: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the padding around the text of the object. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies where the value boxes are placed in relation to the data points. Options by chart type: "in" | "out" | "auto" | "left" |
    *  "right" | "over" | ...
    */
  var placement: js.UndefOr[Any] = js.undefined
  
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var rules: js.UndefOr[js.Array[valueBoxRules]] = js.undefined
  
  /**
    * Sets whether or not the object's shadow is visible. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var shared: js.UndefOr[Fontcolor] = js.undefined
  
  /**
    * Sets the text content of the object. "Some Text" | ...
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the transparency of the text. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comple
    * tely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.undefined
  
  var textAlpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the character used to separate thousands. "," | "." | " " | ...
    */
  var `thousands-separator`: js.UndefOr[String] = js.undefined
  
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which value boxes are displayed. By default, all values in a series are displayed. You can also display the minimum, max
    * imum, first, last, and/or no values. "all" | "min" | "max" | "first" | "last" | none" | "min,max" | "first,last,min,max" | ...
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the visibility of the value box object. Allows you to turn off the object without removing lines of JSON. true | false | 1 |
    * 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object valueBox {
  
  inline def apply(): valueBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[valueBox]
  }
  
  extension [Self <: valueBox](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-color-1`(value: String): Self = StObject.set(x, "background-color-1", value.asInstanceOf[js.Any])
    
    inline def `setBackground-color-1Undefined`: Self = StObject.set(x, "background-color-1", js.undefined)
    
    inline def `setBackground-color-2`(value: String): Self = StObject.set(x, "background-color-2", value.asInstanceOf[js.Any])
    
    inline def `setBackground-color-2Undefined`: Self = StObject.set(x, "background-color-2", js.undefined)
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def `setBackground-fit`(value: String): Self = StObject.set(x, "background-fit", value.asInstanceOf[js.Any])
    
    inline def `setBackground-fitUndefined`: Self = StObject.set(x, "background-fit", js.undefined)
    
    inline def `setBackground-image`(value: String): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    inline def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    inline def `setBackground-position`(value: String): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    inline def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    inline def `setBackground-repeat`(value: String): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    inline def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor1(value: String): Self = StObject.set(x, "backgroundColor1", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor1Undefined: Self = StObject.set(x, "backgroundColor1", js.undefined)
    
    inline def setBackgroundColor2(value: String): Self = StObject.set(x, "backgroundColor2", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor2Undefined: Self = StObject.set(x, "backgroundColor2", js.undefined)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundFit(value: String): Self = StObject.set(x, "backgroundFit", value.asInstanceOf[js.Any])
    
    inline def setBackgroundFitUndefined: Self = StObject.set(x, "backgroundFit", js.undefined)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    inline def `setBorder-alpha`(value: Double): Self = StObject.set(x, "border-alpha", value.asInstanceOf[js.Any])
    
    inline def `setBorder-alphaUndefined`: Self = StObject.set(x, "border-alpha", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-width`(value: Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderAlpha(value: Double): Self = StObject.set(x, "borderAlpha", value.asInstanceOf[js.Any])
    
    inline def setBorderAlphaUndefined: Self = StObject.set(x, "borderAlpha", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Any): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setConnector(value: AlphaLineColor): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def `setDecimals-separator`(value: String): Self = StObject.set(x, "decimals-separator", value.asInstanceOf[js.Any])
    
    inline def `setDecimals-separatorUndefined`: Self = StObject.set(x, "decimals-separator", js.undefined)
    
    inline def setDecimalsSeparator(value: String): Self = StObject.set(x, "decimalsSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalsSeparatorUndefined: Self = StObject.set(x, "decimalsSeparator", js.undefined)
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def `setFill-angle`(value: Double): Self = StObject.set(x, "fill-angle", value.asInstanceOf[js.Any])
    
    inline def `setFill-angleUndefined`: Self = StObject.set(x, "fill-angle", js.undefined)
    
    inline def `setFill-offset-x`(value: Any): Self = StObject.set(x, "fill-offset-x", value.asInstanceOf[js.Any])
    
    inline def `setFill-offset-xUndefined`: Self = StObject.set(x, "fill-offset-x", js.undefined)
    
    inline def `setFill-offset-y`(value: Any): Self = StObject.set(x, "fill-offset-y", value.asInstanceOf[js.Any])
    
    inline def `setFill-offset-yUndefined`: Self = StObject.set(x, "fill-offset-y", js.undefined)
    
    inline def `setFill-type`(value: String): Self = StObject.set(x, "fill-type", value.asInstanceOf[js.Any])
    
    inline def `setFill-typeUndefined`: Self = StObject.set(x, "fill-type", js.undefined)
    
    inline def setFillAngle(value: Double): Self = StObject.set(x, "fillAngle", value.asInstanceOf[js.Any])
    
    inline def setFillAngleUndefined: Self = StObject.set(x, "fillAngle", js.undefined)
    
    inline def setFillOffsetX(value: Any): Self = StObject.set(x, "fillOffsetX", value.asInstanceOf[js.Any])
    
    inline def setFillOffsetXUndefined: Self = StObject.set(x, "fillOffsetX", js.undefined)
    
    inline def setFillOffsetY(value: Any): Self = StObject.set(x, "fillOffsetY", value.asInstanceOf[js.Any])
    
    inline def setFillOffsetYUndefined: Self = StObject.set(x, "fillOffsetY", js.undefined)
    
    inline def setFillType(value: String): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    inline def setFillTypeUndefined: Self = StObject.set(x, "fillType", js.undefined)
    
    inline def `setFont-color`(value: String): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    inline def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-size`(value: Any): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    inline def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    inline def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    inline def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    inline def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    inline def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    inline def setGradientColors(value: String): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
    
    inline def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
    
    inline def setGradientStops(value: String): Self = StObject.set(x, "gradientStops", value.asInstanceOf[js.Any])
    
    inline def setGradientStopsUndefined: Self = StObject.set(x, "gradientStops", js.undefined)
    
    inline def setJoined(value: Fontcolor): Self = StObject.set(x, "joined", value.asInstanceOf[js.Any])
    
    inline def setJoinedUndefined: Self = StObject.set(x, "joined", js.undefined)
    
    inline def `setLine-style`(value: String): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    inline def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    inline def setLineStyle(value: String): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def `setOffset-x`(value: Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    inline def setOffsetX(value: Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPadding(value: Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPlacement(value: Any): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setRules(value: js.Array[valueBoxRules]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: valueBoxRules*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShared(value: Fontcolor): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def `setText-alpha`(value: Double): Self = StObject.set(x, "text-alpha", value.asInstanceOf[js.Any])
    
    inline def `setText-alphaUndefined`: Self = StObject.set(x, "text-alpha", js.undefined)
    
    inline def setTextAlpha(value: Double): Self = StObject.set(x, "textAlpha", value.asInstanceOf[js.Any])
    
    inline def setTextAlphaUndefined: Self = StObject.set(x, "textAlpha", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def `setThousands-separator`(value: String): Self = StObject.set(x, "thousands-separator", value.asInstanceOf[js.Any])
    
    inline def `setThousands-separatorUndefined`: Self = StObject.set(x, "thousands-separator", js.undefined)
    
    inline def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    
    inline def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
