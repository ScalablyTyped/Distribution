package typings.zSchema.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaError extends Error {
  /**
    * Returns details for each error that occurred during validation.
    * See Options.breakOnFirstError.
    */
  var details: js.Array[SchemaErrorDetail]
}

object SchemaError {
  @scala.inline
  def apply(details: js.Array[SchemaErrorDetail], message: String, name: String, stack: String = null): SchemaError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaError]
  }
}

