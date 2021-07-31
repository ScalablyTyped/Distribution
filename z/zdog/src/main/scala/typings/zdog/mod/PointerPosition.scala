package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerPosition extends StObject {
  
  var pageX: Double
  
  var pageY: Double
}
object PointerPosition {
  
  @scala.inline
  def apply(pageX: Double, pageY: Double): PointerPosition = {
    val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerPosition]
  }
  
  @scala.inline
  implicit class PointerPositionMutableBuilder[Self <: PointerPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
  }
}
