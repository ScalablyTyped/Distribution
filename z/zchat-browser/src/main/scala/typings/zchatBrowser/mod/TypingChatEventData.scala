package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.typing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypingChatEventData
  extends StObject
     with ChatEventData {
  
  var nick: String
  
  var `type`: typing
  
  var typing: Boolean
}
object TypingChatEventData {
  
  inline def apply(nick: String, typing: Boolean): TypingChatEventData = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("typing")
    __obj.asInstanceOf[TypingChatEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypingChatEventData] (val x: Self) extends AnyVal {
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setType(value: typing): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTyping(value: Boolean): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
  }
}
