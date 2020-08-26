package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFieldRefDescription extends SchemaFieldDescription {
  var key: String = js.native
  var `type`: typings.yup.yupStrings.ref = js.native
}

object SchemaFieldRefDescription {
  @scala.inline
  def apply(key: String, `type`: typings.yup.yupStrings.ref): SchemaFieldRefDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldRefDescription]
  }
  @scala.inline
  implicit class SchemaFieldRefDescriptionOps[Self <: SchemaFieldRefDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.yup.yupStrings.ref): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

