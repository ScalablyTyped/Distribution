package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestOptions[TSchema /* <: AnySchema[Any, Any, Any, Flags] */] extends StObject {
  
  var options: InternalOptions[Any]
  
  var originalValue: Any
  
  var path: js.UndefOr[String] = js.undefined
  
  var schema: TSchema
  
  var value: Any
}
object TestOptions {
  
  inline def apply[TSchema /* <: AnySchema[Any, Any, Any, Flags] */](options: InternalOptions[Any], originalValue: Any, schema: TSchema, value: Any): TestOptions[TSchema] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestOptions[?], TSchema /* <: AnySchema[Any, Any, Any, Flags] */] (val x: Self & TestOptions[TSchema]) extends AnyVal {
    
    inline def setOptions(value: InternalOptions[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSchema(value: TSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
