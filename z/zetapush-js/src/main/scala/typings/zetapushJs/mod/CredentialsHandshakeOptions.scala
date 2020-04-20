package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsHandshakeOptions extends js.Object {
  var authType: String
  var deploymentId: String
  var login: String
  var password: String
}

object CredentialsHandshakeOptions {
  @scala.inline
  def apply(authType: String, deploymentId: String, login: String, password: String): CredentialsHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsHandshakeOptions]
  }
}

