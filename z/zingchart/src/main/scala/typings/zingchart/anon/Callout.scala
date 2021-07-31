package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callout extends StObject {
  
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
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets whether or not the object will have a callout arrow. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  
  var connector: js.UndefOr[AlphaLinecolor] = js.undefined
  
  /**
    * Allows you to set the number of decimal places displayed for each value. 2 | 3 | 10 | ...
    */
  var decimals: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows you to set the decimal mark displayed for each value. "." | "," | " " | ...
    */
  var `decimals-separator`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets an X offset to apply to the object. 5 | "10px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets a Y offset to apply to the object. 5 | "10px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the background gradient fill type to linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  
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
  var `font-size`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font style of the value box text. Similar to the "italic" attribute. "none" | "italic"
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font weight of the value box text. Similar to the "bold" attribute. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  
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
  
  var joined: js.UndefOr[Padding] = js.undefined
  
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets an X offset to apply when positioning the object. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets a Y offset to apply when positioning the object. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the padding around the text of the object. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Specifies where the value boxes are placed in relation to the data points. Options by chart type: "in" | "out" | "auto" | "left" |
    *  "right" | "over" | ...
    */
  var placement: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  @JSName("rtl (right-to-left)")
  var `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets whether or not the object's shadow is visible. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var shared: js.UndefOr[Padding] = js.undefined
  
  /**
    * Sets the transparency of the text. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comple
    * tely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the character used to separate thousands. "," | "." | " " | ...
    */
  var `thousands-separator`: js.UndefOr[String] = js.undefined
  
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
object Callout {
  
  @scala.inline
  def apply(): Callout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callout]
  }
  
  @scala.inline
  implicit class CalloutMutableBuilder[Self <: Callout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-1`(value: String): Self = StObject.set(x, "background-color-1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-1Undefined`: Self = StObject.set(x, "background-color-1", js.undefined)
    
    @scala.inline
    def `setBackground-color-2`(value: String): Self = StObject.set(x, "background-color-2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-color-2Undefined`: Self = StObject.set(x, "background-color-2", js.undefined)
    
    @scala.inline
    def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    @scala.inline
    def `setBackground-fit`(value: String): Self = StObject.set(x, "background-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-fitUndefined`: Self = StObject.set(x, "background-fit", js.undefined)
    
    @scala.inline
    def `setBackground-image`(value: String): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    @scala.inline
    def `setBackground-position`(value: String): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    @scala.inline
    def `setBackground-repeat`(value: String): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    @scala.inline
    def `setBorder-alpha`(value: Double): Self = StObject.set(x, "border-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-alphaUndefined`: Self = StObject.set(x, "border-alpha", js.undefined)
    
    @scala.inline
    def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    @scala.inline
    def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    @scala.inline
    def setConnector(value: AlphaLinecolor): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDecimals-separator`(value: String): Self = StObject.set(x, "decimals-separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDecimals-separatorUndefined`: Self = StObject.set(x, "decimals-separator", js.undefined)
    
    @scala.inline
    def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    @scala.inline
    def `setFill-angle`(value: Double): Self = StObject.set(x, "fill-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-angleUndefined`: Self = StObject.set(x, "fill-angle", js.undefined)
    
    @scala.inline
    def `setFill-offset-x`(value: js.Any): Self = StObject.set(x, "fill-offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-offset-xUndefined`: Self = StObject.set(x, "fill-offset-x", js.undefined)
    
    @scala.inline
    def `setFill-offset-y`(value: js.Any): Self = StObject.set(x, "fill-offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-offset-yUndefined`: Self = StObject.set(x, "fill-offset-y", js.undefined)
    
    @scala.inline
    def `setFill-type`(value: String): Self = StObject.set(x, "fill-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-typeUndefined`: Self = StObject.set(x, "fill-type", js.undefined)
    
    @scala.inline
    def `setFont-color`(value: String): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: String): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    @scala.inline
    def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    @scala.inline
    def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    @scala.inline
    def setJoined(value: Padding): Self = StObject.set(x, "joined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinedUndefined: Self = StObject.set(x, "joined", js.undefined)
    
    @scala.inline
    def `setLine-style`(value: String): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPlacement(value: js.Any): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def `setRtl Leftparenthesisright-to-leftRightparenthesis`(value: Boolean): Self = StObject.set(x, "rtl (right-to-left)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRtl Leftparenthesisright-to-leftRightparenthesisUndefined`: Self = StObject.set(x, "rtl (right-to-left)", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShared(value: Padding): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def `setText-alpha`(value: Double): Self = StObject.set(x, "text-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-alphaUndefined`: Self = StObject.set(x, "text-alpha", js.undefined)
    
    @scala.inline
    def `setThousands-separator`(value: String): Self = StObject.set(x, "thousands-separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setThousands-separatorUndefined`: Self = StObject.set(x, "thousands-separator", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
