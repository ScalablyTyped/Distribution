package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: ERRORS
  var file: FileObj
  var message: String
}

object AnonError {
  @scala.inline
  def apply(error: ERRORS, file: FileObj, message: String): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

