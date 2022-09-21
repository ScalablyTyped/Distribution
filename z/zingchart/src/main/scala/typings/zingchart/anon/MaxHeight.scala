package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxHeight extends StObject {
  
  /**
    * Sets the maximum chart height in pixels. 600 | 400 | 300
    */
  var `max-height`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the maximum chart width in pixels. 1000 | 800 | 600
    */
  var `max-width`: js.UndefOr[Double] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the minimum chart height in pixels. 600 | 400 | 300
    */
  var `min-height`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the minimum chart width in pixels. 1000 | 800 | 600
    */
  var `min-width`: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Removes the object (legend, title) from the chart at that specified breakpoint. Use the attribute to save screen space at smaller
    * breakpoints. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MaxHeight {
  
  inline def apply(): MaxHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeight]
  }
  
  extension [Self <: MaxHeight](x: Self) {
    
    inline def `setMax-height`(value: Double): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
    
    inline def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
    
    inline def `setMax-width`(value: Double): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    inline def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def `setMin-height`(value: Double): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
    
    inline def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
    
    inline def `setMin-width`(value: Double): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
    
    inline def `setMin-widthUndefined`: Self = StObject.set(x, "min-width", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
