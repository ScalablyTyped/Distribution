package typings
package zDashSchemaLib.zDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator extends js.Object {
  /**
       * Returns an Error object for the most recent failed validation, or null if the validation was successful.
       */
  def getLastError(): zDashSchemaLib.zDashSchemaMod.ValidatorNs.SchemaError = js.native
  /**
       * Returns the error details for the most recent validation, or undefined if the validation was successful.
       * This is the same list as the SchemaError.details property.
       */
  def getLastErrors(): js.Array[zDashSchemaLib.zDashSchemaMod.ValidatorNs.SchemaErrorDetail] = js.native
  /**
       * @param json - either a JSON string or a parsed JSON object
       * @param schema - the JSON object representing the schema
       * @returns true if json matches schema
       */
  def validate(json: js.Any, schema: js.Any): scala.Boolean = js.native
  /**
       * @param json - either a JSON string or a parsed JSON object
       * @param schema - the JSON object representing the schema
       */
  def validate(
    json: js.Any,
    schema: js.Any,
    callback: js.Function2[/* err */ js.Any, /* valid */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
       * @param schema - JSON object representing schema
       * @returns {boolean} true if schema is valid.
       */
  def validateSchema(schema: js.Any): scala.Boolean = js.native
}

