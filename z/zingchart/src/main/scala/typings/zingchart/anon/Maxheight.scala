package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maxheight extends StObject {
  
  /**
    * Sets the maximum chart height in pixels. 600 | 400 | 300
    */
  var `max-height`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum chart width in pixels. 1000 | 800 | 600
    */
  var `max-width`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the minimum chart height in pixels. 600 | 400 | 300
    */
  var `min-height`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the minimum chart width in pixels. 1000 | 800 | 600
    */
  var `min-width`: js.UndefOr[Double] = js.native
  
  /**
    * Removes the object (legend, title) from the chart at that specified breakpoint. Use the attribute to save screen space at smaller
    * breakpoints. true | false
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object Maxheight {
  
  @scala.inline
  def apply(): Maxheight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxheight]
  }
  
  @scala.inline
  implicit class MaxheightMutableBuilder[Self <: Maxheight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setMax-height`(value: Double): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
    
    @scala.inline
    def `setMax-width`(value: Double): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
    
    @scala.inline
    def `setMin-height`(value: Double): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
    
    @scala.inline
    def `setMin-width`(value: Double): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-widthUndefined`: Self = StObject.set(x, "min-width", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
