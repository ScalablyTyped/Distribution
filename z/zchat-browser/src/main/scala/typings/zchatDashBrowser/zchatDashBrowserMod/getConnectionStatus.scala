package typings.zchatDashBrowser.zchatDashBrowserMod

import typings.zchatDashBrowser.zchatDashBrowserStrings.closed
import typings.zchatDashBrowser.zchatDashBrowserStrings.connected
import typings.zchatDashBrowser.zchatDashBrowserStrings.connecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getConnectionStatus")
@js.native
object getConnectionStatus extends js.Object {
  def apply(): connected | connecting | closed = js.native
}

