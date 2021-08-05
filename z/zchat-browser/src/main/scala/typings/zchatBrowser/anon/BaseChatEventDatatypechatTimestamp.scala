package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotrequestDotrating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.request.rating'} */
trait BaseChatEventDatatypechatTimestamp
  extends StObject
     with ChatEventData {
  
  var display_name: String
  
  var nick: String
  
  var time_stamp: Double
  
  var `type`: chatDotrequestDotrating
}
object BaseChatEventDatatypechatTimestamp {
  
  inline def apply(display_name: String, nick: String, time_stamp: Double): BaseChatEventDatatypechatTimestamp = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.request.rating")
    __obj.asInstanceOf[BaseChatEventDatatypechatTimestamp]
  }
  
  extension [Self <: BaseChatEventDatatypechatTimestamp](x: Self) {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotrequestDotrating): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
