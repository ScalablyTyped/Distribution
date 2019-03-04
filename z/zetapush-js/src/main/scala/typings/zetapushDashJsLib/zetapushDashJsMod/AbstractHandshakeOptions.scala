package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractHandshakeOptions extends js.Object {
  var authType: java.lang.String
  var deploymentId: java.lang.String
  var sandboxId: java.lang.String
}

object AbstractHandshakeOptions {
  @scala.inline
  def apply(authType: java.lang.String, deploymentId: java.lang.String, sandboxId: java.lang.String): AbstractHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType, deploymentId = deploymentId, sandboxId = sandboxId)
  
    __obj.asInstanceOf[AbstractHandshakeOptions]
  }
}

