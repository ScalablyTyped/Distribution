package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.chatDotfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatFileChatEventData
  extends StObject
     with ChatEventData
     with HistoryEventData {
  
  var attachment: Attachment
  
  var deleted: Boolean
  
  var display_name: String
  
  var nick: String
  
  var timestamp: Double
  
  var `type`: chatDotfile
}
object ChatFileChatEventData {
  
  inline def apply(attachment: Attachment, deleted: Boolean, display_name: String, nick: String, timestamp: Double): ChatFileChatEventData = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.file")
    __obj.asInstanceOf[ChatFileChatEventData]
  }
  
  extension [Self <: ChatFileChatEventData](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotfile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
