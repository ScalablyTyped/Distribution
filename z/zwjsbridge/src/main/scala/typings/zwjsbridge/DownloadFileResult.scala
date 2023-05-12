package typings.zwjsbridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 文件下载返回结果
  */
trait DownloadFileResult extends StObject {
  
  /** 下载成功标识 */
  var success: Boolean
}
object DownloadFileResult {
  
  inline def apply(success: Boolean): DownloadFileResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadFileResult] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
