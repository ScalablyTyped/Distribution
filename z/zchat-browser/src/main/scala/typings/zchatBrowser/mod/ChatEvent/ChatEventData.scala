package typings.zchatBrowser.mod.ChatEvent

import typings.zchatBrowser.mod.Attachment
import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotcomment
import typings.zchatBrowser.zchatBrowserStrings.chatDotfile
import typings.zchatBrowser.zchatBrowserStrings.chatDotmemberjoin
import typings.zchatBrowser.zchatBrowserStrings.chatDotmemberleave
import typings.zchatBrowser.zchatBrowserStrings.chatDotmsg
import typings.zchatBrowser.zchatBrowserStrings.chatDotrating
import typings.zchatBrowser.zchatBrowserStrings.chatDotrequestDotrating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.zchatBrowser.anon.BaseChatEventDatatypechat
  - typings.zchatBrowser.anon.BaseChatEventDatatypechatAttachment
  - typings.zchatBrowser.anon.BaseChatEventDatatypechatDisplayname
  - typings.zchatBrowser.anon.BaseChatEventDatatypechatNick
  - typings.zchatBrowser.anon.BaseChatEventDatatypechatTimestamp
  - typings.zchatBrowser.anon.BaseChatEventDatatypechatNewrating
  - typings.zchatBrowser.anon.BaseChatEventDatatypechatComment
*/
trait ChatEventData extends EventData

object ChatEventData {
  @scala.inline
  def BaseChatEventDatatypechatTimestamp(display_name: String, nick: String, time_stamp: Double, `type`: chatDotrequestDotrating): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechat(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: StructuredMessage,
    time_stamp: Double,
    `type`: chatDotmsg
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatDisplayname(display_name: String, nick: String, time_stamp: Double, `type`: chatDotmemberjoin): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatAttachment(
    attachment: Attachment,
    deleted: Boolean,
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotfile
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatNewrating(display_name: String, nick: String, time_stamp: Double, `type`: chatDotrating): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatComment(display_name: String, nick: String, time_stamp: Double, `type`: chatDotcomment): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatNick(display_name: String, nick: String, time_stamp: Double, `type`: chatDotmemberleave): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
}

