package typings.zchatBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitorInfo extends js.Object {
  var display_name: String
  var email: String
  var phone: String
}

object VisitorInfo {
  @scala.inline
  def apply(display_name: String, email: String, phone: String): VisitorInfo = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitorInfo]
  }
}

