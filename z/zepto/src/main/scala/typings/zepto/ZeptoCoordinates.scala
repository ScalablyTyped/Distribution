package typings.zepto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeptoCoordinates
  extends StObject
     with ZeptoPosition {
  
  var height: Double
  
  var width: Double
}
object ZeptoCoordinates {
  
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): ZeptoCoordinates = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoCoordinates]
  }
  
  @scala.inline
  implicit class ZeptoCoordinatesMutableBuilder[Self <: ZeptoCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
