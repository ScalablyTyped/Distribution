package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDescription extends js.Object {
  var fields: js.Object
  var label: java.lang.String
  var meta: js.Object
  var tests: js.Array[yupLib.Anon_Name]
  var `type`: java.lang.String
}

object SchemaDescription {
  @scala.inline
  def apply(
    fields: js.Object,
    label: java.lang.String,
    meta: js.Object,
    tests: js.Array[yupLib.Anon_Name],
    `type`: java.lang.String
  ): SchemaDescription = {
    val __obj = js.Dynamic.literal(fields = fields, label = label, meta = meta, tests = tests)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SchemaDescription]
  }
}

