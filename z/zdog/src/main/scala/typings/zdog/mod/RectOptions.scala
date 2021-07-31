package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectOptions
  extends StObject
     with ShapeOptions {
  
  /** @default 1 */
  val height: js.UndefOr[Double] = js.undefined
  
  /** @default 1 */
  val width: js.UndefOr[Double] = js.undefined
}
object RectOptions {
  
  @scala.inline
  def apply(): RectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectOptions]
  }
  
  @scala.inline
  implicit class RectOptionsMutableBuilder[Self <: RectOptions] (val x: Self) extends AnyVal {
    
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
