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
  
  @scala.inline
  def apply(): CylinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CylinderOptions]
  }
  
  @scala.inline
  implicit class CylinderOptionsMutableBuilder[Self <: CylinderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    @scala.inline
    def setFrontFace(value: Boolean | String): Self = StObject.set(x, "frontFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontFaceUndefined: Self = StObject.set(x, "frontFace", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
