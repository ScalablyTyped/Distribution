package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.Attachment
import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.file',   attachment :zchat-browser.zchat-browser.Attachment,   deleted :boolean} */
trait BaseChatEventDatatypechatAttachment
  extends StObject
     with ChatEventData {
  
  var attachment: Attachment
  
  var deleted: Boolean
  
  var display_name: String
  
  var nick: String
  
  var time_stamp: Double
  
  var `type`: chatDotfile
}
object BaseChatEventDatatypechatAttachment {
  
  @scala.inline
  def apply(attachment: Attachment, deleted: Boolean, display_name: String, nick: String, time_stamp: Double): BaseChatEventDatatypechatAttachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.file")
    __obj.asInstanceOf[BaseChatEventDatatypechatAttachment]
  }
  
  @scala.inline
  implicit class BaseChatEventDatatypechatAttachmentMutableBuilder[Self <: BaseChatEventDatatypechatAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chatDotfile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
