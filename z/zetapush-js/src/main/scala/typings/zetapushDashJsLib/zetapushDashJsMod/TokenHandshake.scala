package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenHandshake extends AbstractHandshake {
  var authData: TokenAuthData
  var token: java.lang.String
}

object TokenHandshake {
  @scala.inline
  def apply(
    authData: TokenAuthData,
    authType: java.lang.String,
    authVersion: java.lang.String,
    deploymentId: java.lang.String,
    getHandshakeFields: js.Function1[Client, HandshakeFields],
    sandboxId: java.lang.String,
    token: java.lang.String
  ): TokenHandshake = {
    val __obj = js.Dynamic.literal(authData = authData, authType = authType, authVersion = authVersion, deploymentId = deploymentId, getHandshakeFields = getHandshakeFields, sandboxId = sandboxId, token = token)
  
    __obj.asInstanceOf[TokenHandshake]
  }
}

