package typings.zDashSchema.zDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaErrorDetail extends js.Object {
  /**
    * An error identifier that can be used to format a custom error message.
    * Example: "INVALID_TYPE"
    */
  var code: String
  /**
    * The schema rule description, which is included for certain errors where
    * this information is useful (e.g. to describe a constraint).
    */
  var description: String
  /**
    * Returns details for sub-schemas that failed to match.  For example, if the schema
    * uses the "oneOf" constraint to accept several alternative possibilities, each
    * alternative will have its own inner detail object explaining why it failed to match.
    */
  var inner: js.Array[SchemaErrorDetail]
  /**
    * Example: "Expected type string but found type array"
    */
  var message: String
  /**
    * Format parameters that can be used to format a custom error message.
    * Example: ["string","array"]
    */
  var params: js.Array[String]
  /**
    * A JSON path indicating the location of the error.
    * Example: "#/projects/1"
    */
  var path: String
}

object SchemaErrorDetail {
  @scala.inline
  def apply(
    code: String,
    description: String,
    inner: js.Array[SchemaErrorDetail],
    message: String,
    params: js.Array[String],
    path: String
  ): SchemaErrorDetail = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SchemaErrorDetail]
  }
}

