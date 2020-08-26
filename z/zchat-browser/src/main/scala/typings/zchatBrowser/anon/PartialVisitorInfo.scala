package typings.zchatBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<zchat-browser.zchat-browser.VisitorInfo> */
@js.native
trait PartialVisitorInfo extends js.Object {
  var display_name: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var phone: js.UndefOr[String] = js.native
}

object PartialVisitorInfo {
  @scala.inline
  def apply(): PartialVisitorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVisitorInfo]
  }
  @scala.inline
  implicit class PartialVisitorInfoOps[Self <: PartialVisitorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_name: Self = this.set("display_name", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
  }
  
}

