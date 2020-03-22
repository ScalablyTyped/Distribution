package typings.zchatBrowser

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.chatDotmsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.msg',   msg  :string,   options  :std.Array<string>,   structured_msg  :zchat-browser.zchat-browser.ChatEvent.StructuredMessage} */
trait BaseChatEventDatatypechat extends ChatEventData {
  var display_name: String
  var msg: String
  var nick: String
  var options: js.Array[String]
  var structured_msg: StructuredMessage
  var time_stamp: Double
  var `type`: chatDotmsg
}

object BaseChatEventDatatypechat {
  @scala.inline
  def apply(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: StructuredMessage,
    time_stamp: Double,
    `type`: chatDotmsg
  ): BaseChatEventDatatypechat = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechat]
  }
}

