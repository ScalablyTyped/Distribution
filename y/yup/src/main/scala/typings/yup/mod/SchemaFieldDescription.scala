package typings.yup.mod

import typings.std.Record
import typings.yup.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yup.mod.SchemaDescription
  - typings.yup.mod.SchemaFieldRefDescription
  - typings.yup.mod.SchemaFieldInnerTypeDescription
*/
trait SchemaFieldDescription extends js.Object

object SchemaFieldDescription {
  @scala.inline
  def SchemaDescription(
    fields: Record[String, SchemaFieldDescription],
    label: String,
    meta: js.Object,
    tests: js.Array[Name],
    `type`: String
  ): SchemaFieldDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldDescription]
  }
  @scala.inline
  def SchemaFieldRefDescription(key: String, `type`: typings.yup.yupStrings.ref): SchemaFieldDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldDescription]
  }
  @scala.inline
  def SchemaFieldInnerTypeDescription(
    label: String,
    meta: js.Object,
    tests: js.Array[Name],
    `type`: String,
    innerType: SchemaFieldDescription = null
  ): SchemaFieldDescription = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerType != null) __obj.updateDynamic("innerType")(innerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldDescription]
  }
}

