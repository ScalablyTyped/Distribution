package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  def fromJS(expose: js.Function2[/* width */ Double, /* height */ Double, Any]): Unit
  
  val height: Double
  
  val width: Double
}
object Size {
  
  inline def apply(
    fromJS: js.Function2[/* width */ Double, /* height */ Double, Any] => Unit,
    height: Double,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1(fromJS), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setFromJS(value: js.Function2[/* width */ Double, /* height */ Double, Any] => Unit): Self = StObject.set(x, "fromJS", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
