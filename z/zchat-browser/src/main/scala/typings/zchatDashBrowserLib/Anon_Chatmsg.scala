package typings
package zchatDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatmsg extends js.Object {
  var msg: java.lang.String
  var options: js.Array[java.lang.String]
  var structured_msg: zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs.StructuredMessage
  var `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.chatDOTmsg
}

object Anon_Chatmsg {
  @scala.inline
  def apply(
    msg: java.lang.String,
    options: js.Array[java.lang.String],
    structured_msg: zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs.StructuredMessage,
    `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.chatDOTmsg
  ): Anon_Chatmsg = {
    val __obj = js.Dynamic.literal(msg = msg, options = options, structured_msg = structured_msg)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Chatmsg]
  }
}

