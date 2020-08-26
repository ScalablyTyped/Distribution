package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialsAuthData extends js.Object {
  var login: String = js.native
  var password: String = js.native
}

object CredentialsAuthData {
  @scala.inline
  def apply(login: String, password: String): CredentialsAuthData = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsAuthData]
  }
  @scala.inline
  implicit class CredentialsAuthDataOps[Self <: CredentialsAuthData] (val x: Self) extends AnyVal {
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
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
  }
  
}

