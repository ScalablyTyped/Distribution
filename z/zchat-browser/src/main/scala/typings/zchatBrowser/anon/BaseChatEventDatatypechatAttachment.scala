package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.Attachment
import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.file',   attachment  :zchat-browser.zchat-browser.Attachment,   deleted  :boolean} */
trait BaseChatEventDatatypechatAttachment extends ChatEventData {
  var attachment: Attachment
  var deleted: Boolean
  var display_name: String
  var nick: String
  var time_stamp: Double
  var `type`: chatDotfile
}

object BaseChatEventDatatypechatAttachment {
  @scala.inline
  def apply(
    attachment: Attachment,
    deleted: Boolean,
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotfile
  ): BaseChatEventDatatypechatAttachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatAttachment]
  }
}

