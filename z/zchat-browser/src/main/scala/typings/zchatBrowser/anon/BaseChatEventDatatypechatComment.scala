package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotcomment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.comment',   comment :string | undefined,   new_comment :string | undefined} */
trait BaseChatEventDatatypechatComment
  extends StObject
     with ChatEventData {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var display_name: String
  
  var new_comment: js.UndefOr[String] = js.undefined
  
  var nick: String
  
  var time_stamp: Double
  
  var `type`: chatDotcomment
}
object BaseChatEventDatatypechatComment {
  
  inline def apply(display_name: String, nick: String, time_stamp: Double): BaseChatEventDatatypechatComment = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.comment")
    __obj.asInstanceOf[BaseChatEventDatatypechatComment]
  }
  
  extension [Self <: BaseChatEventDatatypechatComment](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setNew_comment(value: String): Self = StObject.set(x, "new_comment", value.asInstanceOf[js.Any])
    
    inline def setNew_commentUndefined: Self = StObject.set(x, "new_comment", js.undefined)
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotcomment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
