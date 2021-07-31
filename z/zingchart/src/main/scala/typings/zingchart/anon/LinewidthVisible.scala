package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinewidthVisible extends StObject {
  
  /**
    * Sets the transparency of the scale-x / scale-y guide. See the red lines. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the line color of the scale-x / scale-y guide. See the red lines. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow
    * " | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  
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
object LinewidthVisible {
  
  @scala.inline
  def apply(): LinewidthVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinewidthVisible]
  }
  
  @scala.inline
  implicit class LinewidthVisibleMutableBuilder[Self <: LinewidthVisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def `setLine-color`(value: String): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-colorUndefined`: Self = StObject.set(x, "line-color", js.undefined)
    
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
