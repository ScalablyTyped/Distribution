package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.chatDotmemberleave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMemberLeaveChatEventData
  extends StObject
     with ChatEventData
     with HistoryEventData {
  
  var display_name: String
  
  var nick: String
  
  var timestamp: Double
  
  var `type`: chatDotmemberleave
}
object ChatMemberLeaveChatEventData {
  
  inline def apply(display_name: String, nick: String, timestamp: Double): ChatMemberLeaveChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.memberleave")
    __obj.asInstanceOf[ChatMemberLeaveChatEventData]
  }
  
  extension [Self <: ChatMemberLeaveChatEventData](x: Self) {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotmemberleave): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
