package typings.zDashSchema.zDashSchemaMod

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
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SchemaError]
  }
}

