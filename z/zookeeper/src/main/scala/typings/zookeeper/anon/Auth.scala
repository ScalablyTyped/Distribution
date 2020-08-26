package typings.zookeeper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends js.Object {
  var auth: String = js.native
  var perms: Double = js.native
  var scheme: String = js.native
}

object Auth {
  @scala.inline
  def apply(auth: String, perms: Double, scheme: String): Auth = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], perms = perms.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
  @scala.inline
  implicit class AuthOps[Self <: Auth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerms(value: Double): Self = this.set("perms", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
  }
  
}

