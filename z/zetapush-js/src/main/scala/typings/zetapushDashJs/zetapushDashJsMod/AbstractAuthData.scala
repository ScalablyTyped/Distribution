package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractAuthData extends js.Object {
  var authType: String
  var deploymentId: String
  var login: String
  var password: js.UndefOr[String] = js.undefined
}

object AbstractAuthData {
  @scala.inline
  def apply(authType: String, deploymentId: String, login: String, password: String = null): AbstractAuthData = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractAuthData]
  }
}

