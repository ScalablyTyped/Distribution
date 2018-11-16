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

