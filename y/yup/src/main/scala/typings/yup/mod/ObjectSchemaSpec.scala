package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSchemaSpec
  extends StObject
     with SchemaSpec[Any] {
  
  var noUnknown: js.UndefOr[Boolean] = js.undefined
}
object ObjectSchemaSpec {
  
  inline def apply(coerce: Boolean, nullable: Boolean, optional: Boolean): ObjectSchemaSpec = {
    val __obj = js.Dynamic.literal(coerce = coerce.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSchemaSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectSchemaSpec] (val x: Self) extends AnyVal {
    
    inline def setNoUnknown(value: Boolean): Self = StObject.set(x, "noUnknown", value.asInstanceOf[js.Any])
    
    inline def setNoUnknownUndefined: Self = StObject.set(x, "noUnknown", js.undefined)
  }
}
