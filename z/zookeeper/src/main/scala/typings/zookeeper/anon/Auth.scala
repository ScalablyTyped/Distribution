package typings.zookeeper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  var auth: String
  var perms: Double
  var scheme: String
}

object Auth {
  @scala.inline
  def apply(auth: String, perms: Double, scheme: String): Auth = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], perms = perms.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
}

