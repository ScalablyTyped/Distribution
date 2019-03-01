package typings
package zookeeperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auth extends js.Object {
  var auth: java.lang.String
  var perms: scala.Double
  var scheme: java.lang.String
}

object Anon_Auth {
  @scala.inline
  def apply(auth: java.lang.String, perms: scala.Double, scheme: java.lang.String): Anon_Auth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("perms")(perms)
    __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[Anon_Auth]
  }
}

