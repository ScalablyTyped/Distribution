package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotmemberjoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.memberjoin'} */
@js.native
trait BaseChatEventDatatypechatDisplayname extends ChatEventData {
  
  var display_name: String = js.native
  
  var nick: String = js.native
  
  var time_stamp: Double = js.native
  
  var `type`: chatDotmemberjoin = js.native
}
object BaseChatEventDatatypechatDisplayname {
  
  @scala.inline
  def apply(display_name: String, nick: String, time_stamp: Double, `type`: chatDotmemberjoin): BaseChatEventDatatypechatDisplayname = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatDisplayname]
  }
  
  @scala.inline
  implicit class BaseChatEventDatatypechatDisplaynameMutableBuilder[Self <: BaseChatEventDatatypechatDisplayname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chatDotmemberjoin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
