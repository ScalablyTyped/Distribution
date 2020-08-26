package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractHandshake extends js.Object {
  var authType: String = js.native
  var authVersion: String = js.native
  var deploymentId: String = js.native
  var sandboxId: String = js.native
  def getHandshakeFields(client: Client): HandshakeFields = js.native
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
  @scala.inline
  implicit class AbstractHandshakeOps[Self <: AbstractHandshake] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthType(value: String): Self = this.set("authType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthVersion(value: String): Self = this.set("authVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetHandshakeFields(value: Client => HandshakeFields): Self = this.set("getHandshakeFields", js.Any.fromFunction1(value))
    @scala.inline
    def setSandboxId(value: String): Self = this.set("sandboxId", value.asInstanceOf[js.Any])
  }
  
}

