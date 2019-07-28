package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenHandshake extends AbstractHandshake {
  var authData: TokenAuthData
  var token: String
}

object TokenHandshake {
  @scala.inline
  def apply(
    authData: TokenAuthData,
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => HandshakeFields,
    sandboxId: String,
    token: String
  ): TokenHandshake = {
    val __obj = js.Dynamic.literal(authData = authData, authType = authType, authVersion = authVersion, deploymentId = deploymentId, getHandshakeFields = js.Any.fromFunction1(getHandshakeFields), sandboxId = sandboxId, token = token)
  
    __obj.asInstanceOf[TokenHandshake]
  }
}

