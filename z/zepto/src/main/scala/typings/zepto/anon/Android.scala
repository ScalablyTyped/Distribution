package typings.zepto.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Android extends js.Object {
  
  var android: Boolean = js.native
  
  var bb10: Boolean = js.native
  
  var blackberry: Boolean = js.native
  
  /**
    * Specific OS
    **/
  var ios: Boolean = js.native
  
  var ipad: Boolean = js.native
  
  /**
    * Specific device type
    **/
  var iphone: Boolean = js.native
  
  var kindle: Boolean = js.native
  
  /**
    * General device type
    **/
  var phone: Boolean = js.native
  
  var rimtabletos: Boolean = js.native
  
  var tablet: Boolean = js.native
  
  var touchpad: Boolean = js.native
  
  /**
    * OS version.
    **/
  var version: String = js.native
  
  var webos: Boolean = js.native
}
object Android {
  
  @scala.inline
  def apply(
    android: Boolean,
    bb10: Boolean,
    blackberry: Boolean,
    ios: Boolean,
    ipad: Boolean,
    iphone: Boolean,
    kindle: Boolean,
    phone: Boolean,
    rimtabletos: Boolean,
    tablet: Boolean,
    touchpad: Boolean,
    version: String,
    webos: Boolean
  ): Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], bb10 = bb10.asInstanceOf[js.Any], blackberry = blackberry.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], ipad = ipad.asInstanceOf[js.Any], iphone = iphone.asInstanceOf[js.Any], kindle = kindle.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], rimtabletos = rimtabletos.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], touchpad = touchpad.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webos = webos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
  
  @scala.inline
  implicit class AndroidOps[Self <: Android] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAndroid(value: Boolean): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBb10(value: Boolean): Self = this.set("bb10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackberry(value: Boolean): Self = this.set("blackberry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos(value: Boolean): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpad(value: Boolean): Self = this.set("ipad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIphone(value: Boolean): Self = this.set("iphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindle(value: Boolean): Self = this.set("kindle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: Boolean): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRimtabletos(value: Boolean): Self = this.set("rimtabletos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablet(value: Boolean): Self = this.set("tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchpad(value: Boolean): Self = this.set("touchpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebos(value: Boolean): Self = this.set("webos", value.asInstanceOf[js.Any])
  }
}
