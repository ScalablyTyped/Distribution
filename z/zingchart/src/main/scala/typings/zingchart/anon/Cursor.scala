package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cursor extends StObject {
  
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
  
  /**
    * Sets the border color of the object, applicable on closed shapes. See also line-color for closed shapes. Requires Legend. Used onl
    * y inside individual series rather than Plot. See the shape to the left of the text in the upper right box. "none" | "transparent"
    * | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border width of the object, applicable on closed shapes. See also line-width for closed shapes. See also line-color for c
    * losed shapes. Requires Legend. Used only inside individual series rather than Plot. See the shape to the left of the text in the u
    * pper right box. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  
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
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets an Y offset to apply to the fill. Requires Legend. Used only inside individual series rather than Plot. See the shape to the
    * left of the text in the upper right box. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the background gradient fill type to either linear or radial. Requires Legend. Used only inside individual series rather than
    *  Plot. See the shape to the left of the text in the upper right box. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  
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
  
  /**
    * Sets an X offset to apply when positioning the object/shape. Requires Legend. Used only inside individual series rather than Plot.
    *  See the shape to the left of the text in the upper right box. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets an Y offset to apply when positioning the object/shape. Requires Legend. Used only inside individual series rather than Plot.
    *  See the shape to the left of the text in the upper right box. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the size of the object/shape. Requires Legend. Used only inside individual series rather than Plot. See the shape to the left
    *  of the text in the upper right box. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  
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
  var x: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the Y position of the object. Requires Legend. Used only inside individual series rather than Plot. See the shapes to the lef
    * t of the text in the upper right box. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.undefined
}
object Cursor {
  
  inline def apply(): Cursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cursor]
  }
  
  extension [Self <: Cursor](x: Self) {
    
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
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
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
    
    inline def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: js.Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    inline def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
