package typings.zwjsbridge.anon

import typings.zwjsbridge.zwjsbridgeInts.`1`
import typings.zwjsbridge.zwjsbridgeInts.`2`
import typings.zwjsbridge.zwjsbridgeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credential extends StObject {
  
  /**
    * 等待支付的订单信息
    */
  var credential: String
  
  /**
    * 是否为测试环境，缺省为False。支付宝只支持Android端
    *
    */
  var inSandBox: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 支付平台，取值: 1:支付宝 2:微信，微信支付暂不支持 3:银联云闪付
    */
  var platform: `1` | `2` | `3`
}
object Credential {
  
  inline def apply(credential: String, platform: `1` | `2` | `3`): Credential = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
    
    inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setInSandBox(value: Boolean): Self = StObject.set(x, "inSandBox", value.asInstanceOf[js.Any])
    
    inline def setInSandBoxUndefined: Self = StObject.set(x, "inSandBox", js.undefined)
    
    inline def setPlatform(value: `1` | `2` | `3`): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
