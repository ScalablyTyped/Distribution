package typings.zchatBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<zchat-browser.zchat-browser.VisitorInfo> */
trait PartialVisitorInfo extends js.Object {
  var display_name: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
}

object PartialVisitorInfo {
  @scala.inline
  def apply(display_name: String = null, email: String = null, phone: String = null): PartialVisitorInfo = {
    val __obj = js.Dynamic.literal()
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialVisitorInfo]
  }
}

