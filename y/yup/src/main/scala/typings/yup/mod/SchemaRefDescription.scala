package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRefDescription
  extends StObject
     with SchemaFieldDescription {
  
  var key: String
  
  var `type`: typings.yup.yupStrings.ref
}
object SchemaRefDescription {
  
  inline def apply(key: String): SchemaRefDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ref")
    __obj.asInstanceOf[SchemaRefDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaRefDescription] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.yup.yupStrings.ref): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
