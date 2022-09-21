package typings.zingchart.es6Mod.zingchart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait legendMarker extends StObject {
  
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. Requires Legend. Used only inside individual
    *  series rather than Plot. See the shape to the left of the text in the upper right box. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the rotation angle of the object/shape. Requires Legend. Used only inside individual series rather than Plot. See the shape t
    * o the left of the text in the upper right box. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the background color of the object. For the shape to the left of the Legend text. Colors can be entered by name (e.g. "red",
    * "blue", "yellow"), in hexadecimal notation (e.g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0
    * ,0,255)", "rgb(255,255,0)"). Requires Legend. Used only inside individual series rather than Plot. See the orange shape to the lef
    * t of the text in the upper right box. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with background-color-2. Requires Legend. Used onl
    * y inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with background-color-1. Requires Legend. Used on
    * ly inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "none" | "transparent"
    *  | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the direction/s on which the background image is being "stretched". Requires Legend. Used only inside individual series rathe
    * r than Plot. See the shape to the left of the text in the upper right box. "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. Requires Legend. Used only inside ind
    * ividual series rather than Plot. See the shape to the left of the text in the upper right box. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. Requires Legend. Used only inside individual se
    * ries rather than Plot. See the shape to the left of the text in the upper right box. "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the repeating mode for the background image. Requires Legend. Used only inside individual series rather than Plot. See the sh
    * ape to the left of the text in the upper right box. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
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
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. Requires Legend. Used onl
    * y inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's border radius, for rounded corners. Larger values create rounder corners, while smaller values create sharper co
    * rners. A single value will affect all 4 corners, while multiple values will have separate effects on each corner, with the first v
    * alue affecting the top-left corner, the second value affecting the top-right corner, and so on, in a clockwise direction. A negati
    * ve value will cut a corner off without rounding. 4 | "6px" | "6px 10px 3px 5px" | "-10px" | ...
    */
  var `border-radius`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's bottom-left border radius, for rounded corners. Larger values create rounder corners, while smaller values creat
    * e sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-left`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's bottom-right border radius, for rounded corners. Larger values create rounder corners, while smaller values crea
    * te sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-right`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's top-left border radius, for rounded corners. Larger values create rounder corners, while smaller values create s
    * harper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-left`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's top-right border radius, for rounded corners. Larger values create rounder corners, while smaller values create
    * sharper corners. A negative value will cut a corner off without rounding. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-right`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. See also line-color for c
    * losed shapes. Requires Legend. Used only inside individual series rather than Plot. See the shape to the left of the text in the u
    * pper right box. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[Any] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[Any] = js.undefined
  
  var borderRadiusBottomLeft: js.UndefOr[Any] = js.undefined
  
  var borderRadiusBottomRight: js.UndefOr[Any] = js.undefined
  
  var borderRadiusTopLeft: js.UndefOr[Any] = js.undefined
  
  var borderRadiusTopRight: js.UndefOr[Any] = js.undefined
  
  var borderWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the style of the cursor when hovering over a node. "hand" | "normal"
    */
  var cursor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. Requires Legend. Used only inside individual series rather th
    * an Plot. See the shape to the left of the text in the upper right box. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets an X offset to apply to the fill. Requires Legend. Used only inside individual series rather than Plot. See the shape to the
    * left of the text in the upper right box. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets an Y offset to apply to the fill. Requires Legend. Used only inside individual series rather than Plot. See the shape to the
    * left of the text in the upper right box. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the background gradient fill type to either linear or radial. Requires Legend. Used only inside individual series rather than
    *  Plot. See the shape to the left of the text in the upper right box. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  
  var fillAngle: js.UndefOr[Double] = js.undefined
  
  var fillOffsetX: js.UndefOr[Any] = js.undefined
  
  var fillOffsetY: js.UndefOr[Any] = js.undefined
  
  var fillType: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with gradient-stops. Requires Le
    * gend. Used only inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "#f00 #0f
    * 0 #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with gradient-colors. Require
    * s Legend. Used only inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "0.1
    * 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  
  var gradientColors: js.UndefOr[String] = js.undefined
  
  var gradientStops: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line style of the object. 'solid' | 'dotted' | 'dashed' | 'dashdot'
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  var lineStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Sets an X offset to apply when positioning the object/shape. Requires Legend. Used only inside individual series rather than Plot.
    *  See the shape to the left of the text in the upper right box. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets an Y offset to apply when positioning the object/shape. Requires Legend. Used only inside individual series rather than Plot.
    *  See the shape to the left of the text in the upper right box. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[Any] = js.undefined
  
  var offsetX: js.UndefOr[Any] = js.undefined
  
  var offsetY: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the size of the object/shape. Requires Legend. Used only inside individual series rather than Plot. See the shape to the left
    *  of the text in the upper right box. 4 | "6px" | ...
    */
  var size: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the type of the object/shape. Requires Legend. Used only inside individual series rather than Plot. See the shape to the left
    *  of the text in the upper right box. "pie" | "circle" | "star5" | ...
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. Requires Legend. Used only in
    * side individual series rather than Plot. See the shapes to the left of the text in the upper right box. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the X position of the object. Requires Legend. Used only inside individual series rather than Plot. See the shapes to the lef
    * t of the text in the upper right box. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the Y position of the object. Requires Legend. Used only inside individual series rather than Plot. See the shapes to the lef
    * t of the text in the upper right box. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[Any] = js.undefined
}
object legendMarker {
  
  inline def apply(): legendMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[legendMarker]
  }
  
  extension [Self <: legendMarker](x: Self) {
    
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
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-radius`(value: Any): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-bottom-left`(value: Any): Self = StObject.set(x, "border-radius-bottom-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-bottom-leftUndefined`: Self = StObject.set(x, "border-radius-bottom-left", js.undefined)
    
    inline def `setBorder-radius-bottom-right`(value: Any): Self = StObject.set(x, "border-radius-bottom-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-bottom-rightUndefined`: Self = StObject.set(x, "border-radius-bottom-right", js.undefined)
    
    inline def `setBorder-radius-top-left`(value: Any): Self = StObject.set(x, "border-radius-top-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-top-leftUndefined`: Self = StObject.set(x, "border-radius-top-left", js.undefined)
    
    inline def `setBorder-radius-top-right`(value: Any): Self = StObject.set(x, "border-radius-top-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-top-rightUndefined`: Self = StObject.set(x, "border-radius-top-right", js.undefined)
    
    inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    inline def `setBorder-width`(value: Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Any): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusBottomLeft(value: Any): Self = StObject.set(x, "borderRadiusBottomLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusBottomLeftUndefined: Self = StObject.set(x, "borderRadiusBottomLeft", js.undefined)
    
    inline def setBorderRadiusBottomRight(value: Any): Self = StObject.set(x, "borderRadiusBottomRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusBottomRightUndefined: Self = StObject.set(x, "borderRadiusBottomRight", js.undefined)
    
    inline def setBorderRadiusTopLeft(value: Any): Self = StObject.set(x, "borderRadiusTopLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusTopLeftUndefined: Self = StObject.set(x, "borderRadiusTopLeft", js.undefined)
    
    inline def setBorderRadiusTopRight(value: Any): Self = StObject.set(x, "borderRadiusTopRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusTopRightUndefined: Self = StObject.set(x, "borderRadiusTopRight", js.undefined)
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Any): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
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
    
    inline def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    inline def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    inline def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    inline def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    inline def setGradientColors(value: String): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
    
    inline def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
    
    inline def setGradientStops(value: String): Self = StObject.set(x, "gradientStops", value.asInstanceOf[js.Any])
    
    inline def setGradientStopsUndefined: Self = StObject.set(x, "gradientStops", js.undefined)
    
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
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
