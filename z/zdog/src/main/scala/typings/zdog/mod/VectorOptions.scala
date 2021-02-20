package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorOptions extends PathCommand {
  
  val x: js.UndefOr[Double] = js.native
  
  val y: js.UndefOr[Double] = js.native
  
  val z: js.UndefOr[Double] = js.native
}
object VectorOptions {
  
  @scala.inline
  def apply(): VectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorOptions]
  }
  
  @scala.inline
  implicit class VectorOptionsMutableBuilder[Self <: VectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
