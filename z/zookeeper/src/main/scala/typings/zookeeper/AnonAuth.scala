package typings.zookeeper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuth extends js.Object {
  var auth: String
  var perms: Double
  var scheme: String
}

object AnonAuth {
  @scala.inline
  def apply(auth: String, perms: Double, scheme: String): AnonAuth = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], perms = perms.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuth]
  }
}

