package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoundedRectOptions extends ShapeOptions {
  
  /** @default 0.25 */
  val cornerRadius: js.UndefOr[Double] = js.native
  
  /** @default 1 */
  val height: js.UndefOr[Double] = js.native
  
  /** @default 1 */
  val width: js.UndefOr[Double] = js.native
}
object RoundedRectOptions {
  
  @scala.inline
  def apply(): RoundedRectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoundedRectOptions]
  }
  
  @scala.inline
  implicit class RoundedRectOptionsMutableBuilder[Self <: RoundedRectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
