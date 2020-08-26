package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateOptions extends js.Object {
  /**
    * Return from validation methods on the first error rather than after all validations run. Default - true
    */
  var abortEarly: js.UndefOr[Boolean] = js.native
  /**
    * Any context needed for validating schema conditions (see: when())
    */
  var context: js.UndefOr[js.Object] = js.native
  /**
    * When false validations will not descend into nested schema (relevant for objects or arrays). Default - true
    */
  var recursive: js.UndefOr[Boolean] = js.native
  /**
    * Only validate the input, and skip and coercion or transformation. Default - false
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * Remove unspecified keys from objects. Default - false
    */
  var stripUnknown: js.UndefOr[Boolean] = js.native
}

object ValidateOptions {
  @scala.inline
  def apply(): ValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOptions]
  }
  @scala.inline
  implicit class ValidateOptionsOps[Self <: ValidateOptions] (val x: Self) extends AnyVal {
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
    def setAbortEarly(value: Boolean): Self = this.set("abortEarly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortEarly: Self = this.set("abortEarly", js.undefined)
    @scala.inline
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setStripUnknown(value: Boolean): Self = this.set("stripUnknown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripUnknown: Self = this.set("stripUnknown", js.undefined)
  }
  
}

