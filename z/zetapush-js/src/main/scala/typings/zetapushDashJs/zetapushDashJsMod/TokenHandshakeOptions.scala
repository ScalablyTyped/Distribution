package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenHandshakeOptions extends js.Object {
  var authType: String
  var deploymentId: String
  var token: String
}

object TokenHandshakeOptions {
  @scala.inline
  def apply(authType: String, deploymentId: String, token: String): TokenHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType, deploymentId = deploymentId, token = token)
  
    __obj.asInstanceOf[TokenHandshakeOptions]
  }
}

