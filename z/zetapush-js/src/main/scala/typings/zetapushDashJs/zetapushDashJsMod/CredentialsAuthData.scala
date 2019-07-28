package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsAuthData extends js.Object {
  var login: String
  var password: String
}

object CredentialsAuthData {
  @scala.inline
  def apply(login: String, password: String): CredentialsAuthData = {
    val __obj = js.Dynamic.literal(login = login, password = password)
  
    __obj.asInstanceOf[CredentialsAuthData]
  }
}

