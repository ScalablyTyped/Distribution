package typings.zchatBrowser.mod

import typings.zchatBrowser.mod.StructuredMessage.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.zchatBrowser.mod.ChatMsgChatEventData
  - typings.zchatBrowser.mod.ChatFileChatEventData
  - typings.zchatBrowser.mod.ChatMemberJoinChatEventData
  - typings.zchatBrowser.mod.ChatMemberLeaveChatEventData
  - typings.zchatBrowser.mod.ChatRequestRatingChatEventData
  - typings.zchatBrowser.mod.ChatCommentChatEventData
*/
trait HistoryEventData extends StObject
object HistoryEventData {
  
  inline def ChatCommentChatEventData(display_name: String, nick: String, timestamp: Double): typings.zchatBrowser.mod.ChatCommentChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.comment")
    __obj.asInstanceOf[typings.zchatBrowser.mod.ChatCommentChatEventData]
  }
  
  inline def ChatFileChatEventData(attachment: Attachment, deleted: Boolean, display_name: String, nick: String, timestamp: Double): typings.zchatBrowser.mod.ChatFileChatEventData = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.file")
    __obj.asInstanceOf[typings.zchatBrowser.mod.ChatFileChatEventData]
  }
  
  inline def ChatMemberJoinChatEventData(display_name: String, nick: String, timestamp: Double): typings.zchatBrowser.mod.ChatMemberJoinChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.memberjoin")
    __obj.asInstanceOf[typings.zchatBrowser.mod.ChatMemberJoinChatEventData]
  }
  
  inline def ChatMemberLeaveChatEventData(display_name: String, nick: String, timestamp: Double): typings.zchatBrowser.mod.ChatMemberLeaveChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.memberleave")
    __obj.asInstanceOf[typings.zchatBrowser.mod.ChatMemberLeaveChatEventData]
  }
  
  inline def ChatMsgChatEventData(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: Message,
    timestamp: Double
  ): typings.zchatBrowser.mod.ChatMsgChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.msg")
    __obj.asInstanceOf[typings.zchatBrowser.mod.ChatMsgChatEventData]
  }
  
  inline def ChatRequestRatingChatEventData(display_name: String, nick: String, timestamp: Double): typings.zchatBrowser.mod.ChatRequestRatingChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.request.rating")
    __obj.asInstanceOf[typings.zchatBrowser.mod.ChatRequestRatingChatEventData]
  }
}
