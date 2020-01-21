package typings.zchatBrowser

import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.chatDotmsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChatmsg extends js.Object {
  var msg: String
  var options: js.Array[String]
  var structured_msg: StructuredMessage
  var `type`: chatDotmsg
}

object AnonChatmsg {
  @scala.inline
  def apply(msg: String, options: js.Array[String], structured_msg: StructuredMessage, `type`: chatDotmsg): AnonChatmsg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChatmsg]
  }
}

