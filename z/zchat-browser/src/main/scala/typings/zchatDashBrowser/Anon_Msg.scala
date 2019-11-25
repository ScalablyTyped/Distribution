package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.Button
import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.StructuredMessage
import typings.zchatDashBrowser.zchatDashBrowserStrings.QUICK_REPLIES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends StructuredMessage {
  var msg: String
  var quick_replies: js.Array[Button]
  var `type`: QUICK_REPLIES
}

object Anon_Msg {
  @scala.inline
  def apply(msg: String, quick_replies: js.Array[Button], `type`: QUICK_REPLIES): Anon_Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Msg]
  }
}

