package typings.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values extends StObject {
  
  var values: js.Any = js.native
}
object Values {
  
  @scala.inline
  def apply(values: js.Any): Values = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  @scala.inline
  implicit class ValuesMutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
