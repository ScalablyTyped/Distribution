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
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], authVersion = authVersion.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], getHandshakeFields = js.Any.fromFunction1(getHandshakeFields), sandboxId = sandboxId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbstractHandshake]
  }
}

