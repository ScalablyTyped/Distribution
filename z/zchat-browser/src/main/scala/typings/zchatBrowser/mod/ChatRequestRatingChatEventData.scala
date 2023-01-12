package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.chatDotrequestDotrating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRequestRatingChatEventData
  extends StObject
     with ChatEventData
     with HistoryEventData {
  
  var display_name: String
  
  var nick: String
  
  var timestamp: Double
  
  var `type`: chatDotrequestDotrating
}
object ChatRequestRatingChatEventData {
  
  inline def apply(display_name: String, nick: String, timestamp: Double): ChatRequestRatingChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.request.rating")
    __obj.asInstanceOf[ChatRequestRatingChatEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatRequestRatingChatEventData] (val x: Self) extends AnyVal {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotrequestDotrating): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
