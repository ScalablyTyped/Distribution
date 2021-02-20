package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotrequestDotrating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.request.rating'} */
@js.native
trait BaseChatEventDatatypechatTimestamp extends ChatEventData {
  
  var display_name: String = js.native
  
  var nick: String = js.native
  
  var time_stamp: Double = js.native
  
  var `type`: chatDotrequestDotrating = js.native
}
object BaseChatEventDatatypechatTimestamp {
  
  @scala.inline
  def apply(display_name: String, nick: String, time_stamp: Double, `type`: chatDotrequestDotrating): BaseChatEventDatatypechatTimestamp = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatTimestamp]
  }
  
  @scala.inline
  implicit class BaseChatEventDatatypechatTimestampMutableBuilder[Self <: BaseChatEventDatatypechatTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chatDotrequestDotrating): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
