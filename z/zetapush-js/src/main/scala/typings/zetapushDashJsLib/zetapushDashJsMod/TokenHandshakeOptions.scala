package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenHandshakeOptions extends js.Object {
  var authType: java.lang.String
  var deploymentId: java.lang.String
  var token: java.lang.String
}

object TokenHandshakeOptions {
  @scala.inline
  def apply(authType: java.lang.String, deploymentId: java.lang.String, token: java.lang.String): TokenHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType, deploymentId = deploymentId, token = token)
  
    __obj.asInstanceOf[TokenHandshakeOptions]
  }
}

