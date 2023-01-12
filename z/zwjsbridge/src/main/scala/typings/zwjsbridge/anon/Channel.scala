package typings.zwjsbridge.anon

import typings.zwjsbridge.zwjsbridgeStrings.dingtlk
import typings.zwjsbridge.zwjsbridgeStrings.wechat
import typings.zwjsbridge.zwjsbridgeStrings.wechat_moments
import typings.zwjsbridge.zwjsbridgeStrings.weibo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /**
    * 内容分享通道，不区分大小写。
    * 取值:
    * wechat，微信好友。
    * wechat_moments，微信朋友圈。
    * weibo，微博。
    * dingtlk，钉钉。
    */
  var channel: js.UndefOr[wechat | wechat_moments | weibo | dingtlk] = js.undefined
  
  /** 分享内容 */
  var content: js.UndefOr[String] = js.undefined
  
  /** 分享图片的路径 */
  var image: js.UndefOr[String] = js.undefined
  
  /** 分享标题 */
  var title: js.UndefOr[String] = js.undefined
  
  /** 分享链接，不能为空 */
  var url: String
}
object Channel {
  
  inline def apply(url: String): Channel = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: wechat | wechat_moments | weibo | dingtlk): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
