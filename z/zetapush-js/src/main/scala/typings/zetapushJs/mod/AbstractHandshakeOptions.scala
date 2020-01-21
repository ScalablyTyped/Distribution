package typings.zetapushJs.mod

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
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], sandboxId = sandboxId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbstractHandshakeOptions]
  }
}

