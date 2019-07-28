package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractHandshake extends js.Object {
  var authType: String
  var authVersion: String
  var deploymentId: String
  var sandboxId: String
  def getHandshakeFields(client: Client): HandshakeFields
}

object AbstractHandshake {
  @scala.inline
  def apply(
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => HandshakeFields,
    sandboxId: String
  ): AbstractHandshake = {
    val __obj = js.Dynamic.literal(authType = authType, authVersion = authVersion, deploymentId = deploymentId, getHandshakeFields = js.Any.fromFunction1(getHandshakeFields), sandboxId = sandboxId)
  
    __obj.asInstanceOf[AbstractHandshake]
  }
}

