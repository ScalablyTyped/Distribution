package typings.zchatBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentInfo extends StObject {
  
  var avatar_path: String
  
  var display_name: String
  
  var nick: String
  
  var title: String
}
object AgentInfo {
  
  inline def apply(avatar_path: String, display_name: String, nick: String, title: String): AgentInfo = {
    val __obj = js.Dynamic.literal(avatar_path = avatar_path.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentInfo] (val x: Self) extends AnyVal {
    
    inline def setAvatar_path(value: String): Self = StObject.set(x, "avatar_path", value.asInstanceOf[js.Any])
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
