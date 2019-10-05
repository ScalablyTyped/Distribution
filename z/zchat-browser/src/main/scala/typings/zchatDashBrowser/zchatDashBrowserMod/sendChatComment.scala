package typings.zchatDashBrowser.zchatDashBrowserMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "sendChatComment")
@js.native
object sendChatComment extends js.Object {
  def apply(comment: String): Unit = js.native
  def apply(comment: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

