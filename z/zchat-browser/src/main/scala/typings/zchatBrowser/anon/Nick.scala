package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotqueue_position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nick extends EventData {
  
  var nick: String = js.native
  
  var queue_position: Double = js.native
  
  var `type`: chatDotqueue_position = js.native
}
object Nick {
  
  @scala.inline
  def apply(nick: String, queue_position: Double, `type`: chatDotqueue_position): Nick = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], queue_position = queue_position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nick]
  }
  
  @scala.inline
  implicit class NickMutableBuilder[Self <: Nick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue_position(value: Double): Self = StObject.set(x, "queue_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chatDotqueue_position): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
