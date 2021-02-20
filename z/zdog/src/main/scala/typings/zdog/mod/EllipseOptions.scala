package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EllipseOptions extends ShapeOptions {
  
  /** @default 1 */
  val diameter: js.UndefOr[Double] = js.native
  
  val height: js.UndefOr[Double] = js.native
  
  /** @default 4 */
  val quarters: js.UndefOr[QuartersValue] = js.native
  
  val width: js.UndefOr[Double] = js.native
}
object EllipseOptions {
  
  @scala.inline
  def apply(): EllipseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipseOptions]
  }
  
  @scala.inline
  implicit class EllipseOptionsMutableBuilder[Self <: EllipseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setQuarters(value: QuartersValue): Self = StObject.set(x, "quarters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartersUndefined: Self = StObject.set(x, "quarters", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
