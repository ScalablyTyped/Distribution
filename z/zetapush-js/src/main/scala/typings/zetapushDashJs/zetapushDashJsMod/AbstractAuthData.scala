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
    val __obj = js.Dynamic.literal(authType = authType, deploymentId = deploymentId, login = login)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[AbstractAuthData]
  }
}

