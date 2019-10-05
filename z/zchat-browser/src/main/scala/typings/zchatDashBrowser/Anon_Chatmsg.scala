package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent.StructuredMessage
import typings.zchatDashBrowser.zchatDashBrowserStrings.chatDOTmsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatmsg extends js.Object {
  var msg: String
  var options: js.Array[String]
  var structured_msg: StructuredMessage
  var `type`: chatDOTmsg
}

object Anon_Chatmsg {
  @scala.inline
  def apply(msg: String, options: js.Array[String], structured_msg: StructuredMessage, `type`: chatDOTmsg): Anon_Chatmsg = {
    val __obj = js.Dynamic.literal(msg = msg, options = options, structured_msg = structured_msg)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Chatmsg]
  }
}

