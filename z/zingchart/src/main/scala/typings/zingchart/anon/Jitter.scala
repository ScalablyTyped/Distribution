package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jitter extends StObject {
  
  /**
    * To set the jitter width. 0 | .5 | 1 | 2 | ...
    */
  var jitter: js.UndefOr[Any] = js.undefined
  
  /**
    * To set the `mean-factor` width. 0 | .5 | 1 | 2 | ...
    */
  var meanFactor: js.UndefOr[Any] = js.undefined
  
  /**
    * To set the `rounding-factor` on median edges. 0 | .5 | 1 | 2 | ...
    */
  var roundingFactor: js.UndefOr[Any] = js.undefined
  
  /**
    * To set the styling of the violin object. {}
    */
  var style: js.UndefOr[Any] = js.undefined
  
  /**
    * To set the trim. true | false | 0 | 1
    */
  var trim: js.UndefOr[Boolean] = js.undefined
}
object Jitter {
  
  inline def apply(): Jitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jitter]
  }
  
  extension [Self <: Jitter](x: Self) {
    
    inline def setJitter(value: Any): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    inline def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    inline def setMeanFactor(value: Any): Self = StObject.set(x, "meanFactor", value.asInstanceOf[js.Any])
    
    inline def setMeanFactorUndefined: Self = StObject.set(x, "meanFactor", js.undefined)
    
    inline def setRoundingFactor(value: Any): Self = StObject.set(x, "roundingFactor", value.asInstanceOf[js.Any])
    
    inline def setRoundingFactorUndefined: Self = StObject.set(x, "roundingFactor", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
  }
}
