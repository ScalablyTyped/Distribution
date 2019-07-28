package typings.zookeeper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auth extends js.Object {
  var auth: String
  var perms: Double
  var scheme: String
}

object Anon_Auth {
  @scala.inline
  def apply(auth: String, perms: Double, scheme: String): Anon_Auth = {
    val __obj = js.Dynamic.literal(auth = auth, perms = perms, scheme = scheme)
  
    __obj.asInstanceOf[Anon_Auth]
  }
}

