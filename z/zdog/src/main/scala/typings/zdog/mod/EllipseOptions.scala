package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EllipseOptions
  extends StObject
     with ShapeOptions {
  
  /** @default 1 */
  val diameter: js.UndefOr[Double] = js.undefined
  
  val height: js.UndefOr[Double] = js.undefined
  
  /** @default 4 */
  val quarters: js.UndefOr[QuartersValue] = js.undefined
  
  val width: js.UndefOr[Double] = js.undefined
}
object EllipseOptions {
  
  inline def apply(): EllipseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipseOptions]
  }
  
  extension [Self <: EllipseOptions](x: Self) {
    
    inline def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setQuarters(value: QuartersValue): Self = StObject.set(x, "quarters", value.asInstanceOf[js.Any])
    
    inline def setQuartersUndefined: Self = StObject.set(x, "quarters", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
