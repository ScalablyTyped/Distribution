package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractAuthData extends js.Object {
  var authType: java.lang.String
  var deploymentId: java.lang.String
  var login: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
}

object AbstractAuthData {
  @scala.inline
  def apply(
    authType: java.lang.String,
    deploymentId: java.lang.String,
    login: java.lang.String,
    password: java.lang.String = null
  ): AbstractAuthData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authType")(authType)
    __obj.updateDynamic("deploymentId")(deploymentId)
    __obj.updateDynamic("login")(login)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[AbstractAuthData]
  }
}

