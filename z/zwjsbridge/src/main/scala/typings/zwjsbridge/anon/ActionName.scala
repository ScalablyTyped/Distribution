package typings.zwjsbridge.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionName extends StObject {
  
  /** 行动点 */
  var actionName: js.UndefOr[String] = js.undefined
  
  /** 业务参数 */
  var bizInfo: js.UndefOr[Record[String, Any]] = js.undefined
  
  /** 计数 */
  var count: js.UndefOr[Double] = js.undefined
  
  /** 错误码 */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /** 错误信息 */
  var errorMsg: js.UndefOr[String] = js.undefined
  
  /** 模块 */
  var module: js.UndefOr[String] = js.undefined
  
  /** 模块点 */
  var modulePoint: js.UndefOr[String] = js.undefined
  
  /** 埋点类型: success:成功 fail:失败 count:计数 timeCost:时延 pageIn:进入页面 pageOut:离开页面 exposure:曝光 click:单击 */
  var monitorType: String
  
  /** 页面 */
  var pageName: js.UndefOr[String] = js.undefined
  
  /** 时延 */
  var timeCost: js.UndefOr[Double] = js.undefined
}
object ActionName {
  
  inline def apply(monitorType: String): ActionName = {
    val __obj = js.Dynamic.literal(monitorType = monitorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionName]
  }
  
  extension [Self <: ActionName](x: Self) {
    
    inline def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    inline def setBizInfo(value: Record[String, Any]): Self = StObject.set(x, "bizInfo", value.asInstanceOf[js.Any])
    
    inline def setBizInfoUndefined: Self = StObject.set(x, "bizInfo", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
    
    inline def setErrorMsgUndefined: Self = StObject.set(x, "errorMsg", js.undefined)
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModulePoint(value: String): Self = StObject.set(x, "modulePoint", value.asInstanceOf[js.Any])
    
    inline def setModulePointUndefined: Self = StObject.set(x, "modulePoint", js.undefined)
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setMonitorType(value: String): Self = StObject.set(x, "monitorType", value.asInstanceOf[js.Any])
    
    inline def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
    
    inline def setPageNameUndefined: Self = StObject.set(x, "pageName", js.undefined)
    
    inline def setTimeCost(value: Double): Self = StObject.set(x, "timeCost", value.asInstanceOf[js.Any])
    
    inline def setTimeCostUndefined: Self = StObject.set(x, "timeCost", js.undefined)
  }
}
