package typings.zchatBrowser.mod

import typings.zchatBrowser.anon.Jwtfn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitProps extends js.Object {
  var account_key: String = js.native
  var authentication: js.UndefOr[Jwtfn] = js.native
}

object InitProps {
  @scala.inline
  def apply(account_key: String): InitProps = {
    val __obj = js.Dynamic.literal(account_key = account_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitProps]
  }
  @scala.inline
  implicit class InitPropsOps[Self <: InitProps] (val x: Self) extends AnyVal {
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
    def setAccount_key(value: String): Self = this.set("account_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthentication(value: Jwtfn): Self = this.set("authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
  }
  
}

