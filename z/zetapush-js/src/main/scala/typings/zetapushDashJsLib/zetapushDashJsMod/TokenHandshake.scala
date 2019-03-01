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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authData")(authData)
    __obj.updateDynamic("authType")(authType)
    __obj.updateDynamic("authVersion")(authVersion)
    __obj.updateDynamic("deploymentId")(deploymentId)
    __obj.updateDynamic("getHandshakeFields")(getHandshakeFields)
    __obj.updateDynamic("sandboxId")(sandboxId)
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[TokenHandshake]
  }
}

