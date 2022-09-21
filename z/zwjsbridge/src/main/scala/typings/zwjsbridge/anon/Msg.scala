package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Msg extends StObject {
  
  var msg: String
  
  /** 成功回调时为true, 否则为false */
  var pass: Boolean
  
  /** 从后台返回的用户票据信息 */
  var passId: String
  
  /**
    * success:成功, fail:失败, complete:完成。
    */
  var status: String
}
object Msg {
  
  inline def apply(msg: String, pass: Boolean, passId: String, status: String): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], passId = passId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  
  extension [Self <: Msg](x: Self) {
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setPassId(value: String): Self = StObject.set(x, "passId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
