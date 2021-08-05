package typings.yup.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var max: Date | String
}
object `1` {
  
  inline def apply(max: Date | String): `1` = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setMax(value: Date | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
