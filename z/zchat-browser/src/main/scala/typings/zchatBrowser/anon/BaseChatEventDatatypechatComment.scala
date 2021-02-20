package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotcomment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.comment',   comment :string | undefined,   new_comment :string | undefined} */
@js.native
trait BaseChatEventDatatypechatComment extends ChatEventData {
  
  var comment: js.UndefOr[String] = js.native
  
  var display_name: String = js.native
  
  var new_comment: js.UndefOr[String] = js.native
  
  var nick: String = js.native
  
  var time_stamp: Double = js.native
  
  var `type`: chatDotcomment = js.native
}
object BaseChatEventDatatypechatComment {
  
  @scala.inline
  def apply(display_name: String, nick: String, time_stamp: Double, `type`: chatDotcomment): BaseChatEventDatatypechatComment = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatComment]
  }
  
  @scala.inline
  implicit class BaseChatEventDatatypechatCommentMutableBuilder[Self <: BaseChatEventDatatypechatComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_comment(value: String): Self = StObject.set(x, "new_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_commentUndefined: Self = StObject.set(x, "new_comment", js.undefined)
    
    @scala.inline
    def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chatDotcomment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
