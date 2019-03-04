package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsHandshakeOptions extends js.Object {
  var authType: java.lang.String
  var deploymentId: java.lang.String
  var login: java.lang.String
  var password: java.lang.String
}

object CredentialsHandshakeOptions {
  @scala.inline
  def apply(
    authType: java.lang.String,
    deploymentId: java.lang.String,
    login: java.lang.String,
    password: java.lang.String
  ): CredentialsHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType, deploymentId = deploymentId, login = login, password = password)
  
    __obj.asInstanceOf[CredentialsHandshakeOptions]
  }
}

