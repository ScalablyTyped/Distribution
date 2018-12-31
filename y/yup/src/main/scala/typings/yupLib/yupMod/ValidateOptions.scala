package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOptions extends js.Object {
  /**
    * Teturn from validation methods on the first error rather than after all validations run. Default - true
    */
  var abortEarly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Any context needed for validating schema conditions (see: when())
    */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * When false validations will not descend into nested schema (relevant for objects or arrays). Default - true
    */
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only validate the input, and skip and coercion or transformation. Default - false
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove unspecified keys from objects. Default - false
    */
  var stripUnknown: js.UndefOr[scala.Boolean] = js.undefined
}

