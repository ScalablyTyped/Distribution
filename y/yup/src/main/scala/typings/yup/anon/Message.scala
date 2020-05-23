package typings.yup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(message: String = null, params: js.Object = null, path: String = null): Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

