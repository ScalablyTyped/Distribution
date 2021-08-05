package typings.yup.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var min: Date | String
}
object `0` {
  
  inline def apply(min: Date | String): `0` = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setMin(value: Date | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
