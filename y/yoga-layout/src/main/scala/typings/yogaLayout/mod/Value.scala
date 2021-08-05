package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  def fromJS(expose: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, js.Any]): Unit
  
  val unit: YogaUnit | Double
  
  val value: Double
}
object Value {
  
  inline def apply(
    fromJS: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, js.Any] => Unit,
    unit: YogaUnit | Double,
    value: Double
  ): Value = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1(fromJS), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setFromJS(value: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, js.Any] => Unit): Self = StObject.set(x, "fromJS", js.Any.fromFunction1(value))
    
    inline def setUnit(value: YogaUnit | Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
