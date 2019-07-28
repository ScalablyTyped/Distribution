package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractHandshakeOptions extends js.Object {
  var authType: String
  var deploymentId: String
  var sandboxId: String
}

object AbstractHandshakeOptions {
  @scala.inline
  def apply(authType: String, deploymentId: String, sandboxId: String): AbstractHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType, deploymentId = deploymentId, sandboxId = sandboxId)
  
    __obj.asInstanceOf[AbstractHandshakeOptions]
  }
}

