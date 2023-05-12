package typings.yup.mod

import typings.std.Record
import typings.yup.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yup.mod.SchemaFieldDescription because Already inherited */ trait SchemaObjectDescription
  extends StObject
     with SchemaDescription {
  
  var fields: Record[String, SchemaFieldDescription]
}
object SchemaObjectDescription {
  
  inline def apply(
    fields: Record[String, SchemaFieldDescription],
    notOneOf: js.Array[Any],
    nullable: Boolean,
    oneOf: js.Array[Any],
    optional: Boolean,
    tests: js.Array[Name],
    `type`: String
  ): SchemaObjectDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], notOneOf = notOneOf.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObjectDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaObjectDescription] (val x: Self) extends AnyVal {
    
    inline def setFields(value: Record[String, SchemaFieldDescription]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
