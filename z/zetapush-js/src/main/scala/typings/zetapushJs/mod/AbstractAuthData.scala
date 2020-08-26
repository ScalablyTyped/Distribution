package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractAuthData extends js.Object {
  var authType: String = js.native
  var deploymentId: String = js.native
  var login: String = js.native
  var password: js.UndefOr[String] = js.native
}

object AbstractAuthData {
  @scala.inline
  def apply(authType: String, deploymentId: String, login: String): AbstractAuthData = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractAuthData]
  }
  @scala.inline
  implicit class AbstractAuthDataOps[Self <: AbstractAuthData] (val x: Self) extends AnyVal {
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
    def setAuthType(value: String): Self = this.set("authType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
  
}

