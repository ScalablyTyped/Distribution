package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Upload extends StObject {
  
  /**
    * 是否将选取的图片上传到服务器。
    * 默认值为false，图片不上传到服务器。
    * 值为true时，图片上传到服务器，上传成功后返回公网可访问的URL。
    */
  var upload: js.UndefOr[Boolean] = js.undefined
}
object Upload {
  
  inline def apply(): Upload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Upload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Upload] (val x: Self) extends AnyVal {
    
    inline def setUpload(value: Boolean): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
