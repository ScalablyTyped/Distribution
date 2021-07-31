package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angleend extends StObject {
  
  /**
    * Sets the transparency of the object. The higher the value, the less transparent the object appears. Value ranges from 0.1 to 1 Req
    * uires the formatting 0.x 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the rotation angle of the object/shape. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the end angle of a pie shape. "10" | "212" | ...
    */
  var `angle-end`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the beginning angle of a pie shape. "10" | "212" | ...
    */
  var `angle-start`: js.UndefOr[Double] = js.undefined
  
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
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. Relies on border-width se
    * tting. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border width of the object, applicable on closed shapes. Defaults to black when border-color is not defined. See also lin
    * e-width for closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the angle of the axis along which the linear fill is drawn. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets an X offset to apply to the fill. Positive value moves the offset right. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets a Y offset to apply to the fill. With a radial fill, positive value moves the offset down. With a linear fill, affects locati
    * on of the gradient stop. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the background gradient fill type to either linear or radial. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a set of colors for a complex background gradient (more than 2 colors) of the object. Used with gradient stops. "#f00 #0f0 #0
    * 0f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a set of steps corresponding for each color for a complex background gradient (more than 2 colors) of the object. Paired with
    *  gradient-colors. "0.1 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the height of the shape "10" | "212" | ...
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Id of the shape "myShape" | "Square2" | ...
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the item id of the map on which the object/shape is being added. "itemid" | ...
    */
  var item: js.UndefOr[String] = js.undefined
  
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
    * Sets the style applied to lines and borders of the object. "solid" | "dotted" | "dashed"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line width of the object, applicable on non-closed shapes. See also border-width for closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the map id of the map on which the object/shape is being added. "mapid" | ...
    */
  var map: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a radial offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-r`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the coordinates of the object/shape points. [ [10,10], [10,20], [20,20], [20,10], [10,10] ] | ...
    */
  var points: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets whether the object gets a shadow or not. true | false | 1 | 0
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
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the radius of the inner ring of a pie shape. "10" | "42" | ...
    */
  var slice: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the type of the object/shape. "rect" | "circle" | "star5" | "star9" | "square" | "diamond" | "triangle" | "plus" | "cross" |
    * "line" | "poly" | "pie" | ...
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the width of the shape "10" | "212" | ...
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the X position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the Y position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the z position of the object. Objects with higher z indexes will appear "above" those with lower z index values. 5 | 10 | ...
    */
  var `z-index`: js.UndefOr[Double] = js.undefined
}
object Angleend {
  
  @scala.inline
  def apply(): Angleend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Angleend]
  }
  
  @scala.inline
  implicit class AngleendMutableBuilder[Self <: Angleend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAngle-end`(value: Double): Self = StObject.set(x, "angle-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAngle-endUndefined`: Self = StObject.set(x, "angle-end", js.undefined)
    
    @scala.inline
    def `setAngle-start`(value: Double): Self = StObject.set(x, "angle-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAngle-startUndefined`: Self = StObject.set(x, "angle-start", js.undefined)
    
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
    def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
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
    def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    @scala.inline
    def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def `setLine-color`(value: String): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
    @scala.inline
    def `setLine-gap-size`(value: js.Any): Self = StObject.set(x, "line-gap-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-gap-sizeUndefined`: Self = StObject.set(x, "line-gap-size", js.undefined)
    
    @scala.inline
    def `setLine-segment-size`(value: js.Any): Self = StObject.set(x, "line-segment-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-segment-sizeUndefined`: Self = StObject.set(x, "line-segment-size", js.undefined)
    
    @scala.inline
    def `setLine-style`(value: String): Self = StObject.set(x, "line-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-styleUndefined`: Self = StObject.set(x, "line-style", js.undefined)
    
    @scala.inline
    def `setLine-width`(value: js.Any): Self = StObject.set(x, "line-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-widthUndefined`: Self = StObject.set(x, "line-width", js.undefined)
    
    @scala.inline
    def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def `setOffset-r`(value: js.Any): Self = StObject.set(x, "offset-r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-rUndefined`: Self = StObject.set(x, "offset-r", js.undefined)
    
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Any): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-alpha`(value: Double): Self = StObject.set(x, "shadow-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-alphaUndefined`: Self = StObject.set(x, "shadow-alpha", js.undefined)
    
    @scala.inline
    def `setShadow-angle`(value: Double): Self = StObject.set(x, "shadow-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-angleUndefined`: Self = StObject.set(x, "shadow-angle", js.undefined)
    
    @scala.inline
    def `setShadow-blur`(value: js.Any): Self = StObject.set(x, "shadow-blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-blurUndefined`: Self = StObject.set(x, "shadow-blur", js.undefined)
    
    @scala.inline
    def `setShadow-color`(value: String): Self = StObject.set(x, "shadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-colorUndefined`: Self = StObject.set(x, "shadow-color", js.undefined)
    
    @scala.inline
    def `setShadow-distance`(value: js.Any): Self = StObject.set(x, "shadow-distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShadow-distanceUndefined`: Self = StObject.set(x, "shadow-distance", js.undefined)
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSlice(value: Double): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def `setZ-index`(value: Double): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
  }
}
