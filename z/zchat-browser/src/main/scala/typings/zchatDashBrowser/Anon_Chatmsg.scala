package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.StructuredMessage
import typings.zchatDashBrowser.zchatDashBrowserStrings.chatDotmsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatmsg extends js.Object {
  var msg: String
  var options: js.Array[String]
  var structured_msg: StructuredMessage
  var `type`: chatDotmsg
}

object Anon_Chatmsg {
  @scala.inline
  def apply(msg: String, options: js.Array[String], structured_msg: StructuredMessage, `type`: chatDotmsg): Anon_Chatmsg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Chatmsg]
  }
}

