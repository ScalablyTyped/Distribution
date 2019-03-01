package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthData extends js.Object {
  var access_token: java.lang.String
  var refresh_token: js.UndefOr[java.lang.String] = js.undefined
}

object AuthData {
  @scala.inline
  def apply(access_token: java.lang.String, refresh_token: java.lang.String = null): AuthData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token)
    __obj.asInstanceOf[AuthData]
  }
}

