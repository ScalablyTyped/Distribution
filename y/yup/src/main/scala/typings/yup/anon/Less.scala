package typings.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Less extends StObject {
  
  var less: Double
}
object Less {
  
  inline def apply(less: Double): Less = {
    val __obj = js.Dynamic.literal(less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[Less]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Less] (val x: Self) extends AnyVal {
    
    inline def setLess(value: Double): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
  }
}
