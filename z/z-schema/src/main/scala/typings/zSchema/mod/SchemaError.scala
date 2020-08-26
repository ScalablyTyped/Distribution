package typings.zSchema.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaError extends Error {
  /**
    * Returns details for each error that occurred during validation.
    * See Options.breakOnFirstError.
    */
  var details: js.Array[SchemaErrorDetail] = js.native
}

object SchemaError {
  @scala.inline
  def apply(details: js.Array[SchemaErrorDetail], message: String, name: String): SchemaError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaError]
  }
  @scala.inline
  implicit class SchemaErrorOps[Self <: SchemaError] (val x: Self) extends AnyVal {
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
    def setDetailsVarargs(value: SchemaErrorDetail*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[SchemaErrorDetail]): Self = this.set("details", value.asInstanceOf[js.Any])
  }
  
}

