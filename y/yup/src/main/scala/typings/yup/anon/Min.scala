package typings.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Min extends StObject {
  
  var min: Double
}
object Min {
  
  @scala.inline
  def apply(min: Double): Min = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Min]
  }
  
  @scala.inline
  implicit class MinMutableBuilder[Self <: Min] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
