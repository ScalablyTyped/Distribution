package typings.zwjsbridge

import typings.zwjsbridge.zwjsbridgeStrings.fail
import typings.zwjsbridge.zwjsbridgeStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 文件上传返回结果
  */
trait UploadFileResult extends StObject {
  
  /** 选择文件名称 */
  var fileName: js.Array[String]
  
  /** 上传文件地址 */
  var filePath: js.Array[String]
  
  /** 成功/错误信息 */
  var msg: String
  
  /** 上传状态 */
  var status: success | fail
}
object UploadFileResult {
  
  inline def apply(fileName: js.Array[String], filePath: js.Array[String], msg: String, status: success | fail): UploadFileResult = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadFileResult] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: js.Array[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameVarargs(value: String*): Self = StObject.set(x, "fileName", js.Array(value*))
    
    inline def setFilePath(value: js.Array[String]): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathVarargs(value: String*): Self = StObject.set(x, "filePath", js.Array(value*))
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: success | fail): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
