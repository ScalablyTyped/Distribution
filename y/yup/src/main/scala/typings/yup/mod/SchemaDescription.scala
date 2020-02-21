package typings.yup.mod

import typings.std.Record
import typings.yup.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDescription extends SchemaFieldDescription {
  var fields: Record[String, SchemaFieldDescription]
  var label: String
  var meta: js.Object
  var tests: js.Array[AnonName]
  var `type`: String
}

object SchemaDescription {
  @scala.inline
  def apply(
    fields: Record[String, SchemaFieldDescription],
    label: String,
    meta: js.Object,
    tests: js.Array[AnonName],
    `type`: String
  ): SchemaDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDescription]
  }
}

