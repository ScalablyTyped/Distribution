package typings.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextPrefix extends js.Object {
  var contextPrefix: String
}

object AnonContextPrefix {
  @scala.inline
  def apply(contextPrefix: String): AnonContextPrefix = {
    val __obj = js.Dynamic.literal(contextPrefix = contextPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextPrefix]
  }
}

