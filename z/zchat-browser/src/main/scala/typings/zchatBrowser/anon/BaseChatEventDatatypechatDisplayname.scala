package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotmemberjoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.memberjoin'} */
trait BaseChatEventDatatypechatDisplayname extends ChatEventData {
  var display_name: String
  var nick: String
  var time_stamp: Double
  var `type`: chatDotmemberjoin
}

object BaseChatEventDatatypechatDisplayname {
  @scala.inline
  def apply(display_name: String, nick: String, time_stamp: Double, `type`: chatDotmemberjoin): BaseChatEventDatatypechatDisplayname = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatDisplayname]
  }
}

