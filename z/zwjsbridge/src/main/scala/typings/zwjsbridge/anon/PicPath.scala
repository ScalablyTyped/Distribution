package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PicPath extends StObject {
  
  /** upload取值为true时，picPath为图片的网 络地址数组，支持下载 */
  var picPath: js.Array[String]
  
  /** Base64编码格式的图片数据数组 */
  var picSrc: js.Array[String]
}
object PicPath {
  
  inline def apply(picPath: js.Array[String], picSrc: js.Array[String]): PicPath = {
    val __obj = js.Dynamic.literal(picPath = picPath.asInstanceOf[js.Any], picSrc = picSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PicPath] (val x: Self) extends AnyVal {
    
    inline def setPicPath(value: js.Array[String]): Self = StObject.set(x, "picPath", value.asInstanceOf[js.Any])
    
    inline def setPicPathVarargs(value: String*): Self = StObject.set(x, "picPath", js.Array(value*))
    
    inline def setPicSrc(value: js.Array[String]): Self = StObject.set(x, "picSrc", value.asInstanceOf[js.Any])
    
    inline def setPicSrcVarargs(value: String*): Self = StObject.set(x, "picSrc", js.Array(value*))
  }
}
