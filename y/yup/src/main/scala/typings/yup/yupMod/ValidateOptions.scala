package typings.yup.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOptions extends js.Object {
  /**
    * Teturn from validation methods on the first error rather than after all validations run. Default - true
    */
  var abortEarly: js.UndefOr[Boolean] = js.undefined
  /**
    * Any context needed for validating schema conditions (see: when())
    */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * When false validations will not descend into nested schema (relevant for objects or arrays). Default - true
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
  /**
    * Only validate the input, and skip and coercion or transformation. Default - false
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * Remove unspecified keys from objects. Default - false
    */
  var stripUnknown: js.UndefOr[Boolean] = js.undefined
}

object ValidateOptions {
  @scala.inline
  def apply(
    abortEarly: js.UndefOr[Boolean] = js.undefined,
    context: js.Object = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    stripUnknown: js.UndefOr[Boolean] = js.undefined
  ): ValidateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortEarly)) __obj.updateDynamic("abortEarly")(abortEarly)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(stripUnknown)) __obj.updateDynamic("stripUnknown")(stripUnknown)
    __obj.asInstanceOf[ValidateOptions]
  }
}

