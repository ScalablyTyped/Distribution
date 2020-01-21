package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.closed
import typings.zchatBrowser.zchatBrowserStrings.connected
import typings.zchatBrowser.zchatBrowserStrings.connecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getConnectionStatus")
@js.native
object getConnectionStatus extends js.Object {
  def apply(): connected | connecting | closed = js.native
}

