package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotrating
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
  implicit class BaseChatEventDatatypechatNewratingOps[Self <: BaseChatEventDatatypechatNewrating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNick(value: String): Self = this.set("nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_stamp(value: Double): Self = this.set("time_stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chatDotrating): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_rating(value: String): Self = this.set("new_rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_rating: Self = this.set("new_rating", js.undefined)
    
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
  }
}
