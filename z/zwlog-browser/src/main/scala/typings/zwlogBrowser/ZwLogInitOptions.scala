package typings.zwlogBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZwLogInitOptions extends StObject {
  
  /**
    * 用户ID
    */
  var _user_id: String
  
  /**
    * 用户昵称
    */
  var _user_nick: String
}
object ZwLogInitOptions {
  
  inline def apply(_user_id: String, _user_nick: String): ZwLogInitOptions = {
    val __obj = js.Dynamic.literal(_user_id = _user_id.asInstanceOf[js.Any], _user_nick = _user_nick.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZwLogInitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZwLogInitOptions] (val x: Self) extends AnyVal {
    
    inline def set_user_id(value: String): Self = StObject.set(x, "_user_id", value.asInstanceOf[js.Any])
    
    inline def set_user_nick(value: String): Self = StObject.set(x, "_user_nick", value.asInstanceOf[js.Any])
  }
}
