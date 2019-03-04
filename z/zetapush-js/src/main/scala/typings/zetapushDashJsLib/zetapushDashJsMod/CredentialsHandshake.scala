package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsHandshake extends AbstractHandshake {
  var authData: CredentialsAuthData
  var login: java.lang.String
  var password: java.lang.String
}

object CredentialsHandshake {
  @scala.inline
  def apply(
    authData: CredentialsAuthData,
    authType: java.lang.String,
    authVersion: java.lang.String,
    deploymentId: java.lang.String,
    getHandshakeFields: js.Function1[Client, HandshakeFields],
    login: java.lang.String,
    password: java.lang.String,
    sandboxId: java.lang.String
  ): CredentialsHandshake = {
    val __obj = js.Dynamic.literal(authData = authData, authType = authType, authVersion = authVersion, deploymentId = deploymentId, getHandshakeFields = getHandshakeFields, login = login, password = password, sandboxId = sandboxId)
  
    __obj.asInstanceOf[CredentialsHandshake]
  }
}

