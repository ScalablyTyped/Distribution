package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySchemaSpec[TIn, TContext]
  extends StObject
     with SchemaSpec[Any] {
  
  var types: js.UndefOr[ISchema[InnerType[TIn], TContext, Any, Any]] = js.undefined
}
object ArraySchemaSpec {
  
  inline def apply[TIn, TContext](coerce: Boolean, nullable: Boolean, optional: Boolean): ArraySchemaSpec[TIn, TContext] = {
    val __obj = js.Dynamic.literal(coerce = coerce.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySchemaSpec[TIn, TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArraySchemaSpec[?, ?], TIn, TContext] (val x: Self & (ArraySchemaSpec[TIn, TContext])) extends AnyVal {
    
    inline def setTypes(value: ISchema[InnerType[TIn], TContext, Any, Any]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
