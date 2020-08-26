package typings.zSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaErrorDetail extends js.Object {
  /**
    * An error identifier that can be used to format a custom error message.
    * Example: "INVALID_TYPE"
    */
  var code: String = js.native
  /**
    * The schema rule description, which is included for certain errors where
    * this information is useful (e.g. to describe a constraint).
    */
  var description: String = js.native
  /**
    * Returns details for sub-schemas that failed to match.  For example, if the schema
    * uses the "oneOf" constraint to accept several alternative possibilities, each
    * alternative will have its own inner detail object explaining why it failed to match.
    */
  var inner: js.Array[SchemaErrorDetail] = js.native
  /**
    * Example: "Expected type string but found type array"
    */
  var message: String = js.native
  /**
    * Format parameters that can be used to format a custom error message.
    * Example: ["string","array"]
    */
  var params: js.Array[String] = js.native
  /**
    * A JSON path indicating the location of the error.
    * Example: "#/projects/1"
    */
  var path: String = js.native
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
  @scala.inline
  implicit class SchemaErrorDetailOps[Self <: SchemaErrorDetail] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerVarargs(value: SchemaErrorDetail*): Self = this.set("inner", js.Array(value :_*))
    @scala.inline
    def setInner(value: js.Array[SchemaErrorDetail]): Self = this.set("inner", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: String*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

