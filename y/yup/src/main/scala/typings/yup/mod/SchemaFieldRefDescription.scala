package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaFieldRefDescription extends SchemaFieldDescription {
  var key: String
  var `type`: typings.yup.yupStrings.ref
}

object SchemaFieldRefDescription {
  @scala.inline
  def apply(key: String, `type`: typings.yup.yupStrings.ref): SchemaFieldRefDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldRefDescription]
  }
}

