package typings.yup.anon

import typings.yup.mod.ISchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema[TContext] extends StObject {
  
  var schema: ISchema[Any, TContext, Any, Any]
  
  var value: Any
}
object Schema {
  
  inline def apply[TContext](schema: ISchema[Any, TContext, Any, Any], value: Any): Schema[TContext] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema[TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Schema[?], TContext] (val x: Self & Schema[TContext]) extends AnyVal {
    
    inline def setSchema(value: ISchema[Any, TContext, Any, Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
