package typings.zetapushDashJs.zetapushDashJsMod

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
    val __obj = js.Dynamic.literal(authType = authType, deploymentId = deploymentId, login = login, password = password)
  
    __obj.asInstanceOf[CredentialsHandshakeOptions]
  }
}

