package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.away
import typings.zchatBrowser.zchatBrowserStrings.offline
import typings.zchatBrowser.zchatBrowserStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getAccountStatus")
@js.native
object getAccountStatus extends js.Object {
  def apply(): online | offline | away = js.native
}

