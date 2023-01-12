package typings.zchatBrowser.mod

import typings.zchatBrowser.mod.StructuredMessage.Message
import typings.zchatBrowser.zchatBrowserStrings.chatDotmsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMsgChatEventData
  extends StObject
     with ChatEventData
     with HistoryEventData {
  
  var display_name: String
  
  var msg: String
  
  var nick: String
  
  var options: js.Array[String]
  
  var structured_msg: Message
  
  var timestamp: Double
  
  var `type`: chatDotmsg
}
object ChatMsgChatEventData {
  
  inline def apply(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: Message,
    timestamp: Double
  ): ChatMsgChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.msg")
    __obj.asInstanceOf[ChatMsgChatEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMsgChatEventData] (val x: Self) extends AnyVal {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setStructured_msg(value: Message): Self = StObject.set(x, "structured_msg", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotmsg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
