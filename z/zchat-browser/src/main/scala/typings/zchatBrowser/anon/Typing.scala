package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.typing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typing
  extends StObject
     with EventData {
  
  var nick: String
  
  var `type`: typing
  
  var typing: Boolean
}
object Typing {
  
  @scala.inline
  def apply(nick: String, typing: Boolean): Typing = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("typing")
    __obj.asInstanceOf[Typing]
  }
  
  @scala.inline
  implicit class TypingMutableBuilder[Self <: Typing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typing): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTyping(value: Boolean): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
  }
}
