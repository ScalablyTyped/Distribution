package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractHandshake extends js.Object {
  var authType: java.lang.String
  var authVersion: java.lang.String
  var deploymentId: java.lang.String
  var sandboxId: java.lang.String
  def getHandshakeFields(client: Client): HandshakeFields
}

object AbstractHandshake {
  @scala.inline
  def apply(
    authType: java.lang.String,
    authVersion: java.lang.String,
    deploymentId: java.lang.String,
    getHandshakeFields: js.Function1[Client, HandshakeFields],
    sandboxId: java.lang.String
  ): AbstractHandshake = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authType")(authType)
    __obj.updateDynamic("authVersion")(authVersion)
    __obj.updateDynamic("deploymentId")(deploymentId)
    __obj.updateDynamic("getHandshakeFields")(getHandshakeFields)
    __obj.updateDynamic("sandboxId")(sandboxId)
    __obj.asInstanceOf[AbstractHandshake]
  }
}

