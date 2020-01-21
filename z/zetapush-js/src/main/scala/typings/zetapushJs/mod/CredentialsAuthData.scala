package typings.zetapushJs.mod

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
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialsAuthData]
  }
}

