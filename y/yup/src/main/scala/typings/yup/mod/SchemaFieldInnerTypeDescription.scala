package typings.yup.mod

import typings.yup.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<yup.yup.SchemaDescription, std.Exclude<keyof yup.yup.SchemaDescription, 'fields'>> */
trait SchemaFieldInnerTypeDescription extends SchemaFieldDescription {
  var innerType: js.UndefOr[SchemaFieldDescription] = js.undefined
  var label: String
  var meta: js.Object
  var tests: js.Array[Name]
  var `type`: String
}

object SchemaFieldInnerTypeDescription {
  @scala.inline
  def apply(
    label: String,
    meta: js.Object,
    tests: js.Array[Name],
    `type`: String,
    innerType: SchemaFieldDescription = null
  ): SchemaFieldInnerTypeDescription = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerType != null) __obj.updateDynamic("innerType")(innerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldInnerTypeDescription]
  }
}

