package typings.yup.mod

import typings.std.Record
import typings.yup.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.yup.mod.SchemaDescription
  - typings.yup.mod.SchemaFieldRefDescription
  - typings.yup.mod.SchemaFieldInnerTypeDescription
*/
trait SchemaFieldDescription extends StObject
object SchemaFieldDescription {
  
  inline def SchemaDescription(
    fields: Record[String, SchemaFieldDescription],
    label: String,
    meta: js.Object,
    tests: js.Array[Name],
    `type`: String
  ): typings.yup.mod.SchemaDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.SchemaDescription]
  }
  
  inline def SchemaFieldInnerTypeDescription(label: String, meta: js.Object, tests: js.Array[Name], `type`: String): typings.yup.mod.SchemaFieldInnerTypeDescription = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yup.mod.SchemaFieldInnerTypeDescription]
  }
  
  inline def SchemaFieldRefDescription(key: String): typings.yup.mod.SchemaFieldRefDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ref")
    __obj.asInstanceOf[typings.yup.mod.SchemaFieldRefDescription]
  }
}
