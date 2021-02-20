package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotrating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.rating',   rating :string | undefined,   new_rating :string | undefined} */
@js.native
trait BaseChatEventDatatypechatNewrating extends ChatEventData {
  
  var display_name: String = js.native
  
  var new_rating: js.UndefOr[String] = js.native
  
  var nick: String = js.native
  
  var rating: js.UndefOr[String] = js.native
  
  var time_stamp: Double = js.native
  
  var `type`: chatDotrating = js.native
}
object BaseChatEventDatatypechatNewrating {
  
  @scala.inline
  def apply(display_name: String, nick: String, time_stamp: Double, `type`: chatDotrating): BaseChatEventDatatypechatNewrating = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatNewrating]
  }
  
  @scala.inline
  implicit class BaseChatEventDatatypechatNewratingMutableBuilder[Self <: BaseChatEventDatatypechatNewrating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_rating(value: String): Self = StObject.set(x, "new_rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_ratingUndefined: Self = StObject.set(x, "new_rating", js.undefined)
    
    @scala.inline
    def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    @scala.inline
    def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chatDotrating): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
