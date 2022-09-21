package typings.zrender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPatternObject
  extends StObject
     with PatternObject {
  
  var svgElement: js.UndefOr[Any] = js.undefined
  
  var svgHeight: js.UndefOr[Double] = js.undefined
  
  var svgWidth: js.UndefOr[Double] = js.undefined
}
object SVGPatternObject {
  
  inline def apply(): SVGPatternObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPatternObject]
  }
  
  extension [Self <: SVGPatternObject](x: Self) {
    
    inline def setSvgElement(value: Any): Self = StObject.set(x, "svgElement", value.asInstanceOf[js.Any])
    
    inline def setSvgElementUndefined: Self = StObject.set(x, "svgElement", js.undefined)
    
    inline def setSvgHeight(value: Double): Self = StObject.set(x, "svgHeight", value.asInstanceOf[js.Any])
    
    inline def setSvgHeightUndefined: Self = StObject.set(x, "svgHeight", js.undefined)
    
    inline def setSvgWidth(value: Double): Self = StObject.set(x, "svgWidth", value.asInstanceOf[js.Any])
    
    inline def setSvgWidthUndefined: Self = StObject.set(x, "svgWidth", js.undefined)
  }
}
