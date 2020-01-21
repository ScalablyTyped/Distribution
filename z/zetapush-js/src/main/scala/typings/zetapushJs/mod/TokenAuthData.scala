package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenAuthData extends js.Object {
  var token: String
}

object TokenAuthData {
  @scala.inline
  def apply(token: String): TokenAuthData = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenAuthData]
  }
}

