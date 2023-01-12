package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoundedRectOptions
  extends StObject
     with ShapeOptions {
  
  /** @default 0.25 */
  val cornerRadius: js.UndefOr[Double] = js.undefined
  
  /** @default 1 */
  val height: js.UndefOr[Double] = js.undefined
  
  /** @default 1 */
  val width: js.UndefOr[Double] = js.undefined
}
object RoundedRectOptions {
  
  inline def apply(): RoundedRectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoundedRectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoundedRectOptions] (val x: Self) extends AnyVal {
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
