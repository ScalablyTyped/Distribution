package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDescription extends js.Object {
  var fields: js.Object
  var label: java.lang.String
  var meta: js.Object
  var tests: js.Array[java.lang.String]
  var `type`: java.lang.String
}

object SchemaDescription {
  @scala.inline
  def apply(
    fields: js.Object,
    label: java.lang.String,
    meta: js.Object,
    tests: js.Array[java.lang.String],
    `type`: java.lang.String
  ): SchemaDescription = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("tests")(tests)
    __obj.asInstanceOf[SchemaDescription]
  }
}

