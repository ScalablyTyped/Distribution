package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.chatDotmsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type :'chat.msg',   msg :string,   options :std.Array<string>,   structured_msg :zchat-browser.zchat-browser.ChatEvent.StructuredMessage} */
@js.native
trait BaseChatEventDatatypechat extends ChatEventData {
  
  var display_name: String = js.native
  
  var msg: String = js.native
  
  var nick: String = js.native
  
  var options: js.Array[String] = js.native
  
  var structured_msg: StructuredMessage = js.native
  
  var time_stamp: Double = js.native
  
  var `type`: chatDotmsg = js.native
}
object BaseChatEventDatatypechat {
  
  @scala.inline
  def apply(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: StructuredMessage,
    time_stamp: Double,
    `type`: chatDotmsg
  ): BaseChatEventDatatypechat = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechat]
  }
  
  @scala.inline
  implicit class BaseChatEventDatatypechatMutableBuilder[Self <: BaseChatEventDatatypechat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setStructured_msg(value: StructuredMessage): Self = StObject.set(x, "structured_msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_stamp(value: Double): Self = StObject.set(x, "time_stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chatDotmsg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
