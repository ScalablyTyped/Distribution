package typings.zchatDashBrowser.zchatDashBrowserMod

import typings.zchatDashBrowser.Anon_Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitProps extends js.Object {
  var account_key: String
  var authentication: js.UndefOr[Anon_Callback] = js.undefined
}

object InitProps {
  @scala.inline
  def apply(account_key: String, authentication: Anon_Callback = null): InitProps = {
    val __obj = js.Dynamic.literal(account_key = account_key)
    if (authentication != null) __obj.updateDynamic("authentication")(authentication)
    __obj.asInstanceOf[InitProps]
  }
}

