package typings.zoomist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dist extends StObject {
  
  var dist: Double
  
  var startX: Double
  
  var startY: Double
}
object Dist {
  
  inline def apply(dist: Double, startX: Double, startY: Double): Dist = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dist]
  }
  
  extension [Self <: Dist](x: Self) {
    
    inline def setDist(value: Double): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
    
    inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
  }
}
