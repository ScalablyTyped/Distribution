package typings.yup.mod

import typings.std.Record
import typings.yup.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.yup.mod.SchemaDescription
  - typings.yup.mod.SchemaRefDescription
  - typings.yup.mod.SchemaObjectDescription
  - typings.yup.mod.SchemaInnerTypeDescription
  - typings.yup.mod.SchemaLazyDescription
*/
trait SchemaFieldDescription extends StObject
object SchemaFieldDescription {
  
  inline def SchemaDescription(
    notOneOf: js.Array[Any],
    nullable: Boolean,
    oneOf: js.Array[Any],
    optional: Boolean,
    tests: js.Array[Name],
    `type`: String
  ): typings.yup.mod.SchemaDescription = {
    val __obj = js.Dynamic.literal(notOneOf = notOneOf.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.SchemaDescription]
  }
  
  inline def SchemaInnerTypeDescription(
    notOneOf: js.Array[Any],
    nullable: Boolean,
    oneOf: js.Array[Any],
    optional: Boolean,
    tests: js.Array[Name],
    `type`: String
  ): typings.yup.mod.SchemaInnerTypeDescription = {
    val __obj = js.Dynamic.literal(notOneOf = notOneOf.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.SchemaInnerTypeDescription]
  }
  
  inline def SchemaLazyDescription(`type`: String): typings.yup.mod.SchemaLazyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.SchemaLazyDescription]
  }
  
  inline def SchemaObjectDescription(
    fields: Record[String, SchemaFieldDescription],
    notOneOf: js.Array[Any],
    nullable: Boolean,
    oneOf: js.Array[Any],
    optional: Boolean,
    tests: js.Array[Name],
    `type`: String
  ): typings.yup.mod.SchemaObjectDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], notOneOf = notOneOf.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.SchemaObjectDescription]
  }
  
  inline def SchemaRefDescription(key: String): typings.yup.mod.SchemaRefDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ref")
    __obj.asInstanceOf[typings.yup.mod.SchemaRefDescription]
  }
}
