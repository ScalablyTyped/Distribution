package typings.yup.yupMod

import typings.yup.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDescription extends js.Object {
  var fields: js.Object
  var label: String
  var meta: js.Object
  var tests: js.Array[Anon_Name]
  var `type`: String
}

object SchemaDescription {
  @scala.inline
  def apply(fields: js.Object, label: String, meta: js.Object, tests: js.Array[Anon_Name], `type`: String): SchemaDescription = {
    val __obj = js.Dynamic.literal(fields = fields, label = label, meta = meta, tests = tests)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SchemaDescription]
  }
}

