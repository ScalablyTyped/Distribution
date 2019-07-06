package typings
package zchatDashBrowserLib.zchatDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitProps extends js.Object {
  var account_key: java.lang.String
  var authentication: js.UndefOr[zchatDashBrowserLib.Anon_Callback] = js.undefined
}

object InitProps {
  @scala.inline
  def apply(account_key: java.lang.String, authentication: zchatDashBrowserLib.Anon_Callback = null): InitProps = {
    val __obj = js.Dynamic.literal(account_key = account_key)
    if (authentication != null) __obj.updateDynamic("authentication")(authentication)
    __obj.asInstanceOf[InitProps]
  }
}

