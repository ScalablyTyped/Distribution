package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CylinderOptions
  extends StObject
     with ShapeOptions {
  
  /** @default 1 */
  val diameter: js.UndefOr[Double] = js.undefined
  
  val frontFace: js.UndefOr[Boolean | String] = js.undefined
  
  /** @default 1 */
  val length: js.UndefOr[Double] = js.undefined
}
object CylinderOptions {
  
  inline def apply(): CylinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CylinderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CylinderOptions] (val x: Self) extends AnyVal {
    
    inline def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    inline def setFrontFace(value: Boolean | String): Self = StObject.set(x, "frontFace", value.asInstanceOf[js.Any])
    
    inline def setFrontFaceUndefined: Self = StObject.set(x, "frontFace", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
