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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authData")(authData)
    __obj.updateDynamic("authType")(authType)
    __obj.updateDynamic("authVersion")(authVersion)
    __obj.updateDynamic("deploymentId")(deploymentId)
    __obj.updateDynamic("getHandshakeFields")(getHandshakeFields)
    __obj.updateDynamic("login")(login)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("sandboxId")(sandboxId)
    __obj.asInstanceOf[CredentialsHandshake]
  }
}

