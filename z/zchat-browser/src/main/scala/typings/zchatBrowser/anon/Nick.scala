package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotqueue_position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nick
  extends StObject
     with EventData {
  
  var nick: String
  
  var queue_position: Double
  
  var `type`: chatDotqueue_position
}
object Nick {
  
  inline def apply(nick: String, queue_position: Double): Nick = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], queue_position = queue_position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.queue_position")
    __obj.asInstanceOf[Nick]
  }
  
  extension [Self <: Nick](x: Self) {
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setQueue_position(value: Double): Self = StObject.set(x, "queue_position", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotqueue_position): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
