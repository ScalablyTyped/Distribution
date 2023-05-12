package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleSchemaSpec[T]
  extends StObject
     with SchemaSpec[Any] {
  
  var types: /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? {[ K in keyof T ]: yup.yup.ISchema<T[K], any, any, any>} : never */ js.Any
}
object TupleSchemaSpec {
  
  inline def apply[T](
    coerce: Boolean,
    nullable: Boolean,
    optional: Boolean,
    types: /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? {[ K in keyof T ]: yup.yup.ISchema<T[K], any, any, any>} : never */ js.Any
  ): TupleSchemaSpec[T] = {
    val __obj = js.Dynamic.literal(coerce = coerce.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleSchemaSpec[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TupleSchemaSpec[?], T] (val x: Self & TupleSchemaSpec[T]) extends AnyVal {
    
    inline def setTypes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? {[ K in keyof T ]: yup.yup.ISchema<T[K], any, any, any>} : never */ js.Any
    ): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
