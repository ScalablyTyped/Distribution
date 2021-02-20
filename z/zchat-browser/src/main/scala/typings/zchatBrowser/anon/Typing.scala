package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.typing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typing extends EventData {
  
  var nick: String = js.native
  
  var `type`: typing = js.native
  
  var typing: Boolean = js.native
}
object Typing {
  
  @scala.inline
  def apply(nick: String, `type`: typing, typing: Boolean): Typing = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
