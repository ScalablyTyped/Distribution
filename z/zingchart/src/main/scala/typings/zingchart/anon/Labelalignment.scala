package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labelalignment extends StObject {
  
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the rotation angle of the object/shape. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). One color will se
    * t a solid background color, two colors will, by default, create a horizontal gradient. For more complex gradients, use gradient-co
    * lors and gradient-stops. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with background-color-2. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with background-color-1. "none" | "transparent" |
    *  "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the direction/s on which the background image is being "stretched". "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the repeating mode for the background image. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets an X offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets an Y offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with gradient-stops. "#f00 #0f0
    * #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with gradient-colors. "0.1 0.
    * 5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[Textalpha] = js.undefined
  
  /**
    * Allows you to set how the label is aligned with the chart. "normal" | "opposite" | "auto"
    */
  var `label-alignment`: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to set how the label is placed on the chart. "normal" | "opposite" | "auto"
    */
  var `label-placement`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line color of the object, applicable on non-closed shapes. See also border-color for closed shapes. "none" | "transparent
    * " | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Can be used to create custom dashed or dotted lines when used with line-segment-size. This will control the size of the gaps betwe
    * en each line segment. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line width of the object, applicable on non-closed shapes. See also border-width for closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Setting 'placement' to 'top' will overlay the marker on top of your charted data. By default, markers are set to 'placement':'bott
    * om', which will place the marker behind your charted data. top | bottom
    */
  var placement: js.UndefOr[String] = js.undefined
  
  /**
    * To indicate the range you want the scale marker to span. Without specification, that range is based on the scale indexes. Add a "v
    * alue-range" attribute and set the value to true to set the range based on the scale values. Line scale markers accept one or two r
    * ange values. One value specifies the point that the scale marker is drawn at, similar to a reference line. Two values specify the
    * starting and ending points, appearing as an angled line. Area scale markers accept two or four range values. Two values specify th
    * e starting and ending points, always appearing as a rectangle shape. Four values specify the connecting points of the scale marker
    * , allowing you to create various trapezoid shapes. [1] | [3,4] | [3,4,5,6] | ...
    */
  var range: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets whether the object's shadow is visible or not. Has limited effect on HTML5 implementation. true | false | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the angle of the shadow underneath the object. -45 | 115 | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the blur effect size for the shadow of the object. Has limited effect on HTML5 implementation. 4 | "6px" | ...
    */
  var `shadow-blur`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the color of the shadow of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ..
    * .
    */
  var `shadow-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the distance between the shadow and the object. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the marker type to either a single line or a marker that will cover an area. "line" | "area"
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * To use with the "range" array. When set to true, the scale marker (area or line) accommodates values, including Unix timestamps, a
    * s your starting and ending values. E.g., "range": [30,34] or "range": [1420491600000,1422651600000]. true | false (default) | 1 |
    * 0
    */
  var `value-range`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Labelalignment {
  
  inline def apply(): Labelalignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labelalignment]
  }
  
  extension [Self <: Labelalignment](x: Self) {
    
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
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-width`(value: js.Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def `setFill-angle`(value: Double): Self = StObject.set(x, "fill-angle", value.asInstanceOf[js.Any])
    
    inline def `setFill-angleUndefined`: Self = StObject.set(x, "fill-angle", js.undefined)
    
    inline def `setFill-offset-x`(value: js.Any): Self = StObject.set(x, "fill-offset-x", value.asInstanceOf[js.Any])
    
    inline def `setFill-offset-xUndefined`: Self = StObject.set(x, "fill-offset-x", js.undefined)
    
    inline def `setFill-offset-y`(value: js.Any): Self = StObject.set(x, "fill-offset-y", value.asInstanceOf[js.Any])
    
    inline def `setFill-offset-yUndefined`: Self = StObject.set(x, "fill-offset-y", js.undefined)
    
    inline def `setFill-type`(value: String): Self = StObject.set(x, "fill-type", value.asInstanceOf[js.Any])
    
    inline def `setFill-typeUndefined`: Self = StObject.set(x, "fill-type", js.undefined)
    
    inline def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    inline def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    inline def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    inline def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    inline def setLabel(value: Textalpha): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def `setLabel-alignment`(value: String): Self = StObject.set(x, "label-alignment", value.asInstanceOf[js.Any])
    
    inline def `setLabel-alignmentUndefined`: Self = StObject.set(x, "label-alignment", js.undefined)
    
    inline def `setLabel-placement`(value: String): Self = StObject.set(x, "label-placement", value.asInstanceOf[js.Any])
    
    inline def `setLabel-placementUndefined`: Self = StObject.set(x, "label-placement", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def `setLine-color`(value: String): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    inline def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    inline def `setLine-gap-size`(value: js.Any): Self = StObject.set(x, "line-gap-size", value.asInstanceOf[js.Any])
    
    inline def `setLine-gap-sizeUndefined`: Self = StObject.set(x, "line-gap-size", js.undefined)
    
    inline def `setLine-segment-size`(value: js.Any): Self = StObject.set(x, "line-segment-size", value.asInstanceOf[js.Any])
    
    inline def `setLine-segment-sizeUndefined`: Self = StObject.set(x, "line-segment-size", js.undefined)
    
    inline def `setLine-style`(value: String): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    inline def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    inline def `setLine-width`(value: js.Any): Self = StObject.set(x, "line-width", value.asInstanceOf[js.Any])
    
    inline def `setLine-widthUndefined`: Self = StObject.set(x, "line-width", js.undefined)
    
    inline def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: js.Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRange(value: js.Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def `setShadow-alpha`(value: Double): Self = StObject.set(x, "shadow-alpha", value.asInstanceOf[js.Any])
    
    inline def `setShadow-alphaUndefined`: Self = StObject.set(x, "shadow-alpha", js.undefined)
    
    inline def `setShadow-angle`(value: Double): Self = StObject.set(x, "shadow-angle", value.asInstanceOf[js.Any])
    
    inline def `setShadow-angleUndefined`: Self = StObject.set(x, "shadow-angle", js.undefined)
    
    inline def `setShadow-blur`(value: js.Any): Self = StObject.set(x, "shadow-blur", value.asInstanceOf[js.Any])
    
    inline def `setShadow-blurUndefined`: Self = StObject.set(x, "shadow-blur", js.undefined)
    
    inline def `setShadow-color`(value: String): Self = StObject.set(x, "shadow-color", value.asInstanceOf[js.Any])
    
    inline def `setShadow-colorUndefined`: Self = StObject.set(x, "shadow-color", js.undefined)
    
    inline def `setShadow-distance`(value: js.Any): Self = StObject.set(x, "shadow-distance", value.asInstanceOf[js.Any])
    
    inline def `setShadow-distanceUndefined`: Self = StObject.set(x, "shadow-distance", js.undefined)
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def `setValue-range`(value: Boolean): Self = StObject.set(x, "value-range", value.asInstanceOf[js.Any])
    
    inline def `setValue-rangeUndefined`: Self = StObject.set(x, "value-range", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
