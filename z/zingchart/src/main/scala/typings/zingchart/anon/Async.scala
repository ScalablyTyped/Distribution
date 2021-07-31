package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Async extends StObject {
  
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * TODO: description of async attribute true | false | 1 | 0
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the blur radius of the heatmap regions. 10 | 20 | ...
    */
  var blur: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the type of blur shape. "circle" | "square" | ...
    */
  var `brush-typebrushType`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the blur shapes to composite or not. true | false | 1 | 0
    */
  var composite: js.UndefOr[Boolean] = js.undefined
  
  var graph: js.UndefOr[KeyscalekeyScale] = js.undefined
  
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Sets whether or not the data is sorted. true | false | 1 | 0
    */
  var `sort-datasortData`: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: js.UndefOr[Backgroundfit] = js.undefined
}
object Async {
  
  @scala.inline
  def apply(): Async = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Async]
  }
  
  @scala.inline
  implicit class AsyncMutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def `setBrush-typebrushType`(value: String): Self = StObject.set(x, "brush-typebrushType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBrush-typebrushTypeUndefined`: Self = StObject.set(x, "brush-typebrushType", js.undefined)
    
    @scala.inline
    def setComposite(value: Boolean): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    @scala.inline
    def setGraph(value: KeyscalekeyScale): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    @scala.inline
    def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def `setSort-datasortData`(value: Boolean): Self = StObject.set(x, "sort-datasortData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSort-datasortDataUndefined`: Self = StObject.set(x, "sort-datasortData", js.undefined)
    
    @scala.inline
    def setTooltip(value: Backgroundfit): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
