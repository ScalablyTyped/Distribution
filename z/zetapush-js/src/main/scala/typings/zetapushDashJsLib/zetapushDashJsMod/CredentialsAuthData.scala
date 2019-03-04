package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsAuthData extends js.Object {
  var login: java.lang.String
  var password: java.lang.String
}

object CredentialsAuthData {
  @scala.inline
  def apply(login: java.lang.String, password: java.lang.String): CredentialsAuthData = {
    val __obj = js.Dynamic.literal(login = login, password = password)
  
    __obj.asInstanceOf[CredentialsAuthData]
  }
}

