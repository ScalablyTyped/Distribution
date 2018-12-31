package typings
package zDashSchemaLib.zDashSchemaMod.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaErrorDetail extends js.Object {
  /**
    * An error identifier that can be used to format a custom error message.
    * Example: "INVALID_TYPE"
    */
  var code: java.lang.String
  /**
    * The schema rule description, which is included for certain errors where
    * this information is useful (e.g. to describe a constraint).
    */
  var description: java.lang.String
  /**
    * Returns details for sub-schemas that failed to match.  For example, if the schema
    * uses the "oneOf" constraint to accept several alternative possibilities, each
    * alternative will have its own inner detail object explaining why it failed to match.
    */
  var inner: js.Array[SchemaErrorDetail]
  /**
    * Example: "Expected type string but found type array"
    */
  var message: java.lang.String
  /**
    * Format parameters that can be used to format a custom error message.
    * Example: ["string","array"]
    */
  var params: js.Array[java.lang.String]
  /**
    * A JSON path indicating the location of the error.
    * Example: "#/projects/1"
    */
  var path: java.lang.String
}

