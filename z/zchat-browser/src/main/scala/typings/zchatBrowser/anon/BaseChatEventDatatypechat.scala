package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.chatDotmsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.msg',   msg :string,   options :std.Array<string>,   structured_msg :zchat-browser.zchat-browser.ChatEvent.StructuredMessage} */
trait BaseChatEventDatatypechat
  extends StObject
     with ChatEventData {
  
  var display_name: String
  
  var msg: String
  
  var nick: String
  
  var options: js.Array[String]
  
  var structured_msg: StructuredMessage
  
  var time_stamp: Double
  
  var `type`: chatDotmsg
}
object BaseChatEventDatatypechat {
  
  inline def apply(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: StructuredMessage,
    time_stamp: Double
  ): BaseChatEventDatatypechat = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.msg")
    __obj.asInstanceOf[BaseChatEventDatatypechat]
  }
  
  extension [Self <: BaseChatEventDatatypechat](x: Self) {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setStructured_msg(value: StructuredMessage): Self = StObject.set(x, "structured_msg", value.asInstanceOf[js.Any])
    
    inline def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotmsg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
