package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ancester[TContext] extends StObject {
  
  var schema: ISchema[Any, TContext, Any, Any]
  
  var value: Any
}
object Ancester {
  
  inline def apply[TContext](schema: ISchema[Any, TContext, Any, Any], value: Any): Ancester[TContext] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ancester[TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ancester[?], TContext] (val x: Self & Ancester[TContext]) extends AnyVal {
    
    inline def setSchema(value: ISchema[Any, TContext, Any, Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
