package typings.zwjsbridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileOptions extends StObject {
  
  /** 上传文件数量 默认为1 */
  var count: js.UndefOr[Double] = js.undefined
  
  /** 对应 input 文件选择 accept 属性说明 在微信端会转化为 image/video/file/all */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** 服务端接受文件流上传地址 */
  var url: String
}
object UploadFileOptions {
  
  inline def apply(url: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadFileOptions] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
