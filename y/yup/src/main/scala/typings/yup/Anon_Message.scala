package typings.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(message: String = null, path: String = null): Anon_Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_Message]
  }
}

