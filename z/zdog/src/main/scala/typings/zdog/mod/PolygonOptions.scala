package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonOptions
  extends StObject
     with ShapeOptions {
  
  /** @default 0.5 */
  val radius: js.UndefOr[Double] = js.undefined
  
  /** @default 3 */
  val sides: js.UndefOr[Double] = js.undefined
}
object PolygonOptions {
  
  inline def apply(): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonOptions]
  }
  
  extension [Self <: PolygonOptions](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    inline def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
  }
}
