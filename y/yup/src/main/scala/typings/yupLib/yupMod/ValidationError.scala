package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ValidationError extends js.Object {
  /**
       * array of error messages
       */
  var errors: js.Array[java.lang.String]
  /**
       * In the case of aggregate errors, inner is an array of ValidationErrors throw earlier in the validation chain.
       */
  var inner: js.Array[ValidationError]
  var message: java.lang.String
  var name: java.lang.String
  var params: js.UndefOr[js.Object] = js.undefined
  /**
       * A string, indicating where there error was thrown. path is empty at the root level.
       */
  var path: java.lang.String
  var `type`: js.Any
  var value: js.Any
}

