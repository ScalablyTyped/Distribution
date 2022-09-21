package typings.zwjsbridge.anon

import typings.zwjsbridge.zwjsbridgeStrings.exception
import typings.zwjsbridge.zwjsbridgeStrings.fail
import typings.zwjsbridge.zwjsbridgeStrings.none
import typings.zwjsbridge.zwjsbridgeStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  /** 消息显示持续时间，单位毫秒，默认值为2000s */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 消息内容 */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * 根据toast类型展示相应图标，取值:
    * none，默认值
    * success
    * fail
    * exception，值为exception时，必须上传文字信息。
    */
  var `type`: js.UndefOr[none | success | fail | exception] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: none | success | fail | exception): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
