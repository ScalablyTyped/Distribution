package typings.zoomist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartX extends StObject {
  
  var startX: Double
  
  var startY: Double
  
  var transX: Double
  
  var transY: Double
}
object StartX {
  
  inline def apply(startX: Double, startY: Double, transX: Double, transY: Double): StartX = {
    val __obj = js.Dynamic.literal(startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], transX = transX.asInstanceOf[js.Any], transY = transY.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartX]
  }
  
  extension [Self <: StartX](x: Self) {
    
    inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    
    inline def setTransX(value: Double): Self = StObject.set(x, "transX", value.asInstanceOf[js.Any])
    
    inline def setTransY(value: Double): Self = StObject.set(x, "transY", value.asInstanceOf[js.Any])
  }
}
