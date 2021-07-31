package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linesegmentsize extends StObject {
  
  /**
    * Sets the transparency of the scale-x / scale-y guide. See the red lines. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the background color of the scale-x / scale-y guide. See the blue background in between the red lines. "none" | "transparent"
    *  | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
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
  
  var items: js.UndefOr[js.Array[BackgroundcolorBordercolor]] = js.undefined
  
  /**
    * Sets the line color of the scale-x / scale-y guide. See the red lines. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow
    * " | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  
  /**
    * When using a dashed or dotted line-type, this will set the size of each gap between line segments. Can be used with line-segment-s
    * ize to create unique dashed or dotted lines. For the scale-x / scale-y guide. See the space between red lines. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * When using a dashed or dotted line-type, this will set the size of each visible segment of line. Can be used with line-gap-size to
    *  create unique dashed or dotted lines. For the scale-x / scale-y guide. See the red lines. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the style applied to lines and borders of the scale-x / scale-y guide. See the red lines. "solid" | "dotted" | "dashed" | "da
    * shdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the line width of the object, applicable on non-closed shapes. For the scale-x / scale-y guide. See the red lines. 4 | "6px"
    * | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Linesegmentsize {
  
  @scala.inline
  def apply(): Linesegmentsize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Linesegmentsize]
  }
  
  @scala.inline
  implicit class LinesegmentsizeMutableBuilder[Self <: Linesegmentsize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
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
    def setItems(value: js.Array[BackgroundcolorBordercolor]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: BackgroundcolorBordercolor*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
