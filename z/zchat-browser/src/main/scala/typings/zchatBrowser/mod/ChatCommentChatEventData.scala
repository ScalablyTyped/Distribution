package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.chatDotcomment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatCommentChatEventData
  extends StObject
     with ChatEventData
     with HistoryEventData {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var display_name: String
  
  var new_comment: js.UndefOr[String] = js.undefined
  
  var nick: String
  
  var timestamp: Double
  
  var `type`: chatDotcomment
}
object ChatCommentChatEventData {
  
  inline def apply(display_name: String, nick: String, timestamp: Double): ChatCommentChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.comment")
    __obj.asInstanceOf[ChatCommentChatEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatCommentChatEventData] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setNew_comment(value: String): Self = StObject.set(x, "new_comment", value.asInstanceOf[js.Any])
    
    inline def setNew_commentUndefined: Self = StObject.set(x, "new_comment", js.undefined)
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotcomment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
