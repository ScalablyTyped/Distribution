package typings.zepto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeptoPosition extends StObject {
  
  var left: Double
  
  var top: Double
}
object ZeptoPosition {
  
  @scala.inline
  def apply(left: Double, top: Double): ZeptoPosition = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoPosition]
  }
  
  @scala.inline
  implicit class ZeptoPositionMutableBuilder[Self <: ZeptoPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
