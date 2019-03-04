package typings
package zDashSchemaLib.zDashSchemaMod.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaError
  extends stdLib.Error {
  /**
    * Returns details for each error that occurred during validation.
    * See Options.breakOnFirstError.
    */
  var details: js.Array[SchemaErrorDetail]
}

object SchemaError {
  @scala.inline
  def apply(
    details: js.Array[SchemaErrorDetail],
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): SchemaError = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SchemaError]
  }
}

