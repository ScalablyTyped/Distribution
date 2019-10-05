package typings.zchatDashBrowser.zchatDashBrowserMod

import typings.zchatDashBrowser.zchatDashBrowserStrings.away
import typings.zchatDashBrowser.zchatDashBrowserStrings.offline
import typings.zchatDashBrowser.zchatDashBrowserStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getAccountStatus")
@js.native
object getAccountStatus extends js.Object {
  def apply(): online | offline | away = js.native
}

