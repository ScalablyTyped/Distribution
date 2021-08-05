package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotmemberjoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.memberjoin'} */
trait BaseChatEventDatatypechatDisplayname
  extends StObject
     with ChatEventData {
  
  var display_name: String
  
  var nick: String
  
  var time_stamp: Double
  
  var `type`: chatDotmemberjoin
}
object BaseChatEventDatatypechatDisplayname {
  
  inline def apply(display_name: String, nick: String, time_stamp: Double): BaseChatEventDatatypechatDisplayname = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.memberjoin")
    __obj.asInstanceOf[BaseChatEventDatatypechatDisplayname]
  }
  
  extension [Self <: BaseChatEventDatatypechatDisplayname](x: Self) {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotmemberjoin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
