package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonOptions extends ShapeOptions {
  
  /** @default 0.5 */
  val radius: js.UndefOr[Double] = js.native
  
  /** @default 3 */
  val sides: js.UndefOr[Double] = js.native
}
object PolygonOptions {
  
  @scala.inline
  def apply(): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonOptions]
  }
  
  @scala.inline
  implicit class PolygonOptionsMutableBuilder[Self <: PolygonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
  }
}
