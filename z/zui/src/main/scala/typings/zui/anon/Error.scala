package typings.zui.anon

import typings.zui.ERRORS
import typings.zui.FileObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: ERRORS
  var file: FileObj
  var message: String
}

object Error {
  @scala.inline
  def apply(error: ERRORS, file: FileObj, message: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

