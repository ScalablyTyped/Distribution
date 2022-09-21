package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adjustlayout extends StObject {
  
  /**
    * If true, it is similar with setting margin:"dynamic", added with adjust-layout attributes on title and legend. true | false | 1 |
    * 0
    */
  var `adjust-layout`: js.UndefOr[Boolean] = js.undefined
  
  var adjustLayout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
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
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundColor1: js.UndefOr[String] = js.undefined
  
  var backgroundColor2: js.UndefOr[String] = js.undefined
  
  var backgroundFit: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var backgroundPosition: js.UndefOr[String] = js.undefined
  
  var backgroundRepeat: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's bottom border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-bottom`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. "none" | "transparent" |
    * "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's left border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-left`: js.UndefOr[String] = js.undefined
  
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
    * Sets the object's right border style. Accepts solid, dashed, and dotted styles. "2px solid #f00" | ...
    */
  var `border-right`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's top border style. Values must include the border width, style, and color. Accepts solid, dashed, and dotted styl
    * es. "2px solid #f00" | ...
    */
  var `border-top`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[Any] = js.undefined
  
  var borderBottom: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderLeft: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[Any] = js.undefined
  
  var borderRadiusBottomLeft: js.UndefOr[Any] = js.undefined
  
  var borderRadiusBottomRight: js.UndefOr[Any] = js.undefined
  
  var borderRadiusTopLeft: js.UndefOr[Any] = js.undefined
  
  var borderRadiusTopRight: js.UndefOr[Any] = js.undefined
  
  var borderRight: js.UndefOr[String] = js.undefined
  
  var borderTop: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets whether an object will have a callout arrow or not. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the length of the extension that extends beyond the tip of the callout arrow. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the point of the tip of the callout arrow to a specified coordinate on the chart, with the starting point of [0,0] being the
    * top left corner of the chart. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the offset along the callout direction of the arrow's base. Positive and negative values can be used to offset the callout ar
    * row up, down, left, or right depending on the callout-position. 4 | "6px" | ...
    */
  var `callout-offset`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the width of the object's callout arrow. A larger value will create a wider callout arrow. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[Any] = js.undefined
  
  var calloutExtension: js.UndefOr[Any] = js.undefined
  
  var calloutHeight: js.UndefOr[Any] = js.undefined
  
  var calloutHook: js.UndefOr[Any] = js.undefined
  
  var calloutOffset: js.UndefOr[Any] = js.undefined
  
  var calloutPosition: js.UndefOr[String] = js.undefined
  
  var calloutWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets an X offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets an Y offset to apply to the fill. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  
  var fillAngle: js.UndefOr[Double] = js.undefined
  
  var fillOffsetX: js.UndefOr[Any] = js.undefined
  
  var fillOffsetY: js.UndefOr[Any] = js.undefined
  
  var fillType: js.UndefOr[String] = js.undefined
  
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
  
  var gradientColors: js.UndefOr[String] = js.undefined
  
  var gradientStops: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the item id of the map on which the object/shape is being added. "itemid" | ...
    */
  var item: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the map id of the map on which the object/shape is being added. "mapid" | ...
    */
  var map: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the object's margin/s. The plotarea object also accepts "dynamic" as value for the margin attribute, in which case it analyze
    * s the scale labels and change the plotarea size accordingly in order to fit all scale labels. "dynamic" | 10 | "5px" | "10 20" | "
    * 5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's top margin. The plotarea object also accepts "dynamic" as value for the margin attribute, in which case it analy
    * zes the scale labels and change the plotarea size accordingly in order to fit all scale labels. "dynamic" | 10 | "5px" | "10 20" |
    *  "5px 10px 15px 20px" | ...
    */
  var `margin-bottom`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets an additional margin specifically to the bottom of the plotarea when using dynamic margins. Offset will only be set if there
    * is a scale object on the bottom of the chart. "dynamic" | 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var `margin-bottom-offset`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's top margin. The plotarea object also accepts "dynamic" as value for the margin attribute, in which case it analy
    * zes the scale labels and change the plotarea size accordingly in order to fit all scale labels. "dynamic" | 10 | "5px" | "10 20" |
    *  "5px 10px 15px 20px" | ...
    */
  var `margin-left`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets an additional margin specifically to the left of the plotarea when using dynamic margins. Offset will only be set if there is
    *  a scale object on the left of the chart. "dynamic" | 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var `margin-left-offset`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's top margin. The plotarea object also accepts "dynamic" as value for the margin attribute, in which case it analy
    * zes the scale labels and change the plotarea size accordingly in order to fit all scale labels. "dynamic" | 10 | "5px" | "10 20" |
    *  "5px 10px 15px 20px" | ...
    */
  var `margin-right`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets an additional margin specifically to the left of the plotarea when using dynamic margins. Offset will only be set if there is
    *  a scale object on the right of the chart. "dynamic" | 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var `margin-right-offset`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's top margin. The plotarea object also accepts "dynamic" as value for the margin attribute, in which case it analy
    * zes the scale labels and change the plotarea size accordingly in order to fit all scale labels. "dynamic" | 10 | "5px" | "10 20" |
    *  "5px 10px 15px 20px" | ...
    */
  var `margin-top`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets an additional margin specifically to the top of the plotarea when using dynamic margins. Offset will only be set if there is
    * a scale object on the top of the chart. "dynamic" | 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var `margin-top-offset`: js.UndefOr[Any] = js.undefined
  
  var marginBottom: js.UndefOr[Any] = js.undefined
  
  var marginBottomOffset: js.UndefOr[Any] = js.undefined
  
  var marginLeft: js.UndefOr[Any] = js.undefined
  
  var marginLeftOffset: js.UndefOr[Any] = js.undefined
  
  var marginRight: js.UndefOr[Any] = js.undefined
  
  var marginRightOffset: js.UndefOr[Any] = js.undefined
  
  var marginTop: js.UndefOr[Any] = js.undefined
  
  var marginTopOffset: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the tolerance of the mask (in number of pixels) that covers the plotarea to allow objects to overflow outside of the plotarea
    * . 4 | "6px" | ...
    */
  var `mask-tolerance`: js.UndefOr[Double] = js.undefined
  
  var maskTolerance: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[Any] = js.undefined
  
  var offsetX: js.UndefOr[Any] = js.undefined
  
  var offsetY: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the object's position relative to it's container. Similar results can be obtained by setting marginand margin-... attributes.
    */
  var position: js.UndefOr[String] = js.undefined
  
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
  var `shadow-blur`: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the color of the shadow of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ..
    * .
    */
  var `shadow-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the distance between the shadow and the object. 4 | "6px" | ...
    */
  var `shadow-distance`: js.UndefOr[Any] = js.undefined
  
  var shadowAlpha: js.UndefOr[Double] = js.undefined
  
  var shadowAngle: js.UndefOr[Double] = js.undefined
  
  var shadowBlur: js.UndefOr[Any] = js.undefined
  
  var shadowColor: js.UndefOr[String] = js.undefined
  
  var shadowDistance: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the X position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the Y position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the z position of the object. Objects with higher z indexes will appear "above" those with lower z index values. 5 | 10 | ...
    */
  var `z-index`: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object Adjustlayout {
  
  inline def apply(): Adjustlayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adjustlayout]
  }
  
  extension [Self <: Adjustlayout](x: Self) {
    
    inline def `setAdjust-layout`(value: Boolean): Self = StObject.set(x, "adjust-layout", value.asInstanceOf[js.Any])
    
    inline def `setAdjust-layoutUndefined`: Self = StObject.set(x, "adjust-layout", js.undefined)
    
    inline def setAdjustLayout(value: Boolean): Self = StObject.set(x, "adjustLayout", value.asInstanceOf[js.Any])
    
    inline def setAdjustLayoutUndefined: Self = StObject.set(x, "adjustLayout", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
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
    
    inline def `setBorder-bottom`(value: String): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-left`(value: String): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
    
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
    
    inline def `setBorder-right`(value: String): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
    
    inline def `setBorder-top`(value: String): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
    
    inline def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
    
    inline def `setBorder-width`(value: Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderLeft(value: String): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
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
    
    inline def setBorderRight(value: String): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    inline def setBorderTop(value: String): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setBorderWidth(value: Any): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def `setCallout-extension`(value: Any): Self = StObject.set(x, "callout-extension", value.asInstanceOf[js.Any])
    
    inline def `setCallout-extensionUndefined`: Self = StObject.set(x, "callout-extension", js.undefined)
    
    inline def `setCallout-height`(value: Any): Self = StObject.set(x, "callout-height", value.asInstanceOf[js.Any])
    
    inline def `setCallout-heightUndefined`: Self = StObject.set(x, "callout-height", js.undefined)
    
    inline def `setCallout-hook`(value: Any): Self = StObject.set(x, "callout-hook", value.asInstanceOf[js.Any])
    
    inline def `setCallout-hookUndefined`: Self = StObject.set(x, "callout-hook", js.undefined)
    
    inline def `setCallout-offset`(value: Any): Self = StObject.set(x, "callout-offset", value.asInstanceOf[js.Any])
    
    inline def `setCallout-offsetUndefined`: Self = StObject.set(x, "callout-offset", js.undefined)
    
    inline def `setCallout-position`(value: String): Self = StObject.set(x, "callout-position", value.asInstanceOf[js.Any])
    
    inline def `setCallout-positionUndefined`: Self = StObject.set(x, "callout-position", js.undefined)
    
    inline def `setCallout-width`(value: Any): Self = StObject.set(x, "callout-width", value.asInstanceOf[js.Any])
    
    inline def `setCallout-widthUndefined`: Self = StObject.set(x, "callout-width", js.undefined)
    
    inline def setCalloutExtension(value: Any): Self = StObject.set(x, "calloutExtension", value.asInstanceOf[js.Any])
    
    inline def setCalloutExtensionUndefined: Self = StObject.set(x, "calloutExtension", js.undefined)
    
    inline def setCalloutHeight(value: Any): Self = StObject.set(x, "calloutHeight", value.asInstanceOf[js.Any])
    
    inline def setCalloutHeightUndefined: Self = StObject.set(x, "calloutHeight", js.undefined)
    
    inline def setCalloutHook(value: Any): Self = StObject.set(x, "calloutHook", value.asInstanceOf[js.Any])
    
    inline def setCalloutHookUndefined: Self = StObject.set(x, "calloutHook", js.undefined)
    
    inline def setCalloutOffset(value: Any): Self = StObject.set(x, "calloutOffset", value.asInstanceOf[js.Any])
    
    inline def setCalloutOffsetUndefined: Self = StObject.set(x, "calloutOffset", js.undefined)
    
    inline def setCalloutPosition(value: String): Self = StObject.set(x, "calloutPosition", value.asInstanceOf[js.Any])
    
    inline def setCalloutPositionUndefined: Self = StObject.set(x, "calloutPosition", js.undefined)
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setCalloutWidth(value: Any): Self = StObject.set(x, "calloutWidth", value.asInstanceOf[js.Any])
    
    inline def setCalloutWidthUndefined: Self = StObject.set(x, "calloutWidth", js.undefined)
    
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
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMargin(value: Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def `setMargin-bottom`(value: Any): Self = StObject.set(x, "margin-bottom", value.asInstanceOf[js.Any])
    
    inline def `setMargin-bottom-offset`(value: Any): Self = StObject.set(x, "margin-bottom-offset", value.asInstanceOf[js.Any])
    
    inline def `setMargin-bottom-offsetUndefined`: Self = StObject.set(x, "margin-bottom-offset", js.undefined)
    
    inline def `setMargin-bottomUndefined`: Self = StObject.set(x, "margin-bottom", js.undefined)
    
    inline def `setMargin-left`(value: Any): Self = StObject.set(x, "margin-left", value.asInstanceOf[js.Any])
    
    inline def `setMargin-left-offset`(value: Any): Self = StObject.set(x, "margin-left-offset", value.asInstanceOf[js.Any])
    
    inline def `setMargin-left-offsetUndefined`: Self = StObject.set(x, "margin-left-offset", js.undefined)
    
    inline def `setMargin-leftUndefined`: Self = StObject.set(x, "margin-left", js.undefined)
    
    inline def `setMargin-right`(value: Any): Self = StObject.set(x, "margin-right", value.asInstanceOf[js.Any])
    
    inline def `setMargin-right-offset`(value: Any): Self = StObject.set(x, "margin-right-offset", value.asInstanceOf[js.Any])
    
    inline def `setMargin-right-offsetUndefined`: Self = StObject.set(x, "margin-right-offset", js.undefined)
    
    inline def `setMargin-rightUndefined`: Self = StObject.set(x, "margin-right", js.undefined)
    
    inline def `setMargin-top`(value: Any): Self = StObject.set(x, "margin-top", value.asInstanceOf[js.Any])
    
    inline def `setMargin-top-offset`(value: Any): Self = StObject.set(x, "margin-top-offset", value.asInstanceOf[js.Any])
    
    inline def `setMargin-top-offsetUndefined`: Self = StObject.set(x, "margin-top-offset", js.undefined)
    
    inline def `setMargin-topUndefined`: Self = StObject.set(x, "margin-top", js.undefined)
    
    inline def setMarginBottom(value: Any): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomOffset(value: Any): Self = StObject.set(x, "marginBottomOffset", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomOffsetUndefined: Self = StObject.set(x, "marginBottomOffset", js.undefined)
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginLeft(value: Any): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftOffset(value: Any): Self = StObject.set(x, "marginLeftOffset", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftOffsetUndefined: Self = StObject.set(x, "marginLeftOffset", js.undefined)
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: Any): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightOffset(value: Any): Self = StObject.set(x, "marginRightOffset", value.asInstanceOf[js.Any])
    
    inline def setMarginRightOffsetUndefined: Self = StObject.set(x, "marginRightOffset", js.undefined)
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginTop(value: Any): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopOffset(value: Any): Self = StObject.set(x, "marginTopOffset", value.asInstanceOf[js.Any])
    
    inline def setMarginTopOffsetUndefined: Self = StObject.set(x, "marginTopOffset", js.undefined)
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def `setMask-tolerance`(value: Double): Self = StObject.set(x, "mask-tolerance", value.asInstanceOf[js.Any])
    
    inline def `setMask-toleranceUndefined`: Self = StObject.set(x, "mask-tolerance", js.undefined)
    
    inline def setMaskTolerance(value: Double): Self = StObject.set(x, "maskTolerance", value.asInstanceOf[js.Any])
    
    inline def setMaskToleranceUndefined: Self = StObject.set(x, "maskTolerance", js.undefined)
    
    inline def `setOffset-x`(value: Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    inline def setOffsetX(value: Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def `setShadow-alpha`(value: Double): Self = StObject.set(x, "shadow-alpha", value.asInstanceOf[js.Any])
    
    inline def `setShadow-alphaUndefined`: Self = StObject.set(x, "shadow-alpha", js.undefined)
    
    inline def `setShadow-angle`(value: Double): Self = StObject.set(x, "shadow-angle", value.asInstanceOf[js.Any])
    
    inline def `setShadow-angleUndefined`: Self = StObject.set(x, "shadow-angle", js.undefined)
    
    inline def `setShadow-blur`(value: Any): Self = StObject.set(x, "shadow-blur", value.asInstanceOf[js.Any])
    
    inline def `setShadow-blurUndefined`: Self = StObject.set(x, "shadow-blur", js.undefined)
    
    inline def `setShadow-color`(value: String): Self = StObject.set(x, "shadow-color", value.asInstanceOf[js.Any])
    
    inline def `setShadow-colorUndefined`: Self = StObject.set(x, "shadow-color", js.undefined)
    
    inline def `setShadow-distance`(value: Any): Self = StObject.set(x, "shadow-distance", value.asInstanceOf[js.Any])
    
    inline def `setShadow-distanceUndefined`: Self = StObject.set(x, "shadow-distance", js.undefined)
    
    inline def setShadowAlpha(value: Double): Self = StObject.set(x, "shadowAlpha", value.asInstanceOf[js.Any])
    
    inline def setShadowAlphaUndefined: Self = StObject.set(x, "shadowAlpha", js.undefined)
    
    inline def setShadowAngle(value: Double): Self = StObject.set(x, "shadowAngle", value.asInstanceOf[js.Any])
    
    inline def setShadowAngleUndefined: Self = StObject.set(x, "shadowAngle", js.undefined)
    
    inline def setShadowBlur(value: Any): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowDistance(value: Any): Self = StObject.set(x, "shadowDistance", value.asInstanceOf[js.Any])
    
    inline def setShadowDistanceUndefined: Self = StObject.set(x, "shadowDistance", js.undefined)
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def `setZ-index`(value: Double): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    inline def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
