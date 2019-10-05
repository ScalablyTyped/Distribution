package typings.zchatDashBrowser.zchatDashBrowserMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "sendChatMsg")
@js.native
object sendChatMsg extends js.Object {
  def apply(msg: String): Unit = js.native
  def apply(msg: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

