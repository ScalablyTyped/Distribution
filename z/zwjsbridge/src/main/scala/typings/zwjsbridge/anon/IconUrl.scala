package typings.zwjsbridge.anon

import typings.zwjsbridge.zwjsbridgeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconUrl extends StObject {
  
  // 图标地址。
  var iconUrl: js.UndefOr[String] = js.undefined
  
  // 按钮ID。点击后客戶端返回这个ID标识
  var id: js.UndefOr[String] = js.undefined
  
  // 按钮的说明文字。
  var text: js.UndefOr[String] = js.undefined
  
  // icon缩放模式： 默认0
  // 0表示 不保持纵横比缩放图片，使图片的宽高完全拉伸至填满image组件
  // 1表示保持纵横比缩放图片，使图片的长边能完全显示出来。也就是说，可以完整地将图片显示出来。
  var `type`: js.UndefOr[typings.zwjsbridge.zwjsbridgeInts.`0` | `1`] = js.undefined
}
object IconUrl {
  
  inline def apply(): IconUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconUrl]
  }
  
  extension [Self <: IconUrl](x: Self) {
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: typings.zwjsbridge.zwjsbridgeInts.`0` | `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
