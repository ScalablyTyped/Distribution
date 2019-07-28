package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsHandshake extends AbstractHandshake {
  var authData: CredentialsAuthData
  var login: String
  var password: String
}

object CredentialsHandshake {
  @scala.inline
  def apply(
    authData: CredentialsAuthData,
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => HandshakeFields,
    login: String,
    password: String,
    sandboxId: String
  ): CredentialsHandshake = {
    val __obj = js.Dynamic.literal(authData = authData, authType = authType, authVersion = authVersion, deploymentId = deploymentId, getHandshakeFields = js.Any.fromFunction1(getHandshakeFields), login = login, password = password, sandboxId = sandboxId)
  
    __obj.asInstanceOf[CredentialsHandshake]
  }
}

