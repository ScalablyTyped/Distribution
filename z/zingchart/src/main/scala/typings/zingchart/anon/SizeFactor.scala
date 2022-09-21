package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeFactor extends StObject {
  
  /**
    * To modify the size of the chart. Provide a value in relation to 1.0 or 100%. 0.3 | 0.9 | "30%" | "90%" | ...
    */
  var `size-factor`: js.UndefOr[Double] = js.undefined
  
  var sizeFactor: js.UndefOr[Double] = js.undefined
}
object SizeFactor {
  
  inline def apply(): SizeFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeFactor]
  }
  
  extension [Self <: SizeFactor](x: Self) {
    
    inline def `setSize-factor`(value: Double): Self = StObject.set(x, "size-factor", value.asInstanceOf[js.Any])
    
    inline def `setSize-factorUndefined`: Self = StObject.set(x, "size-factor", js.undefined)
    
    inline def setSizeFactor(value: Double): Self = StObject.set(x, "sizeFactor", value.asInstanceOf[js.Any])
    
    inline def setSizeFactorUndefined: Self = StObject.set(x, "sizeFactor", js.undefined)
  }
}
