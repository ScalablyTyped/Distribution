package typings.zepto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Android extends StObject {
    
    var android: Boolean
    
    var bb10: Boolean
    
    var blackberry: Boolean
    
    /**
      * Specific OS
      **/
    var ios: Boolean
    
    var ipad: Boolean
    
    /**
      * Specific device type
      **/
    var iphone: Boolean
    
    var kindle: Boolean
    
    /**
      * General device type
      **/
    var phone: Boolean
    
    var rimtabletos: Boolean
    
    var tablet: Boolean
    
    var touchpad: Boolean
    
    /**
      * OS version.
      **/
    var version: String
    
    var webos: Boolean
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
    implicit class AndroidMutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBb10(value: Boolean): Self = StObject.set(x, "bb10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackberry(value: Boolean): Self = StObject.set(x, "blackberry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIos(value: Boolean): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpad(value: Boolean): Self = StObject.set(x, "ipad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIphone(value: Boolean): Self = StObject.set(x, "iphone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindle(value: Boolean): Self = StObject.set(x, "kindle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRimtabletos(value: Boolean): Self = StObject.set(x, "rimtabletos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchpad(value: Boolean): Self = StObject.set(x, "touchpad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebos(value: Boolean): Self = StObject.set(x, "webos", value.asInstanceOf[js.Any])
    }
  }
  
  trait Chrome extends StObject {
    
    /**
      * Specific browser
      **/
    var chrome: Boolean
    
    var firefox: Boolean
    
    var playbook: Boolean
    
    var silk: Boolean
    
    /**
      * Browser version.
      **/
    var version: String
  }
  object Chrome {
    
    @scala.inline
    def apply(chrome: Boolean, firefox: Boolean, playbook: Boolean, silk: Boolean, version: String): Chrome = {
      val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], playbook = playbook.asInstanceOf[js.Any], silk = silk.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chrome]
    }
    
    @scala.inline
    implicit class ChromeMutableBuilder[Self <: Chrome] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirefox(value: Boolean): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaybook(value: Boolean): Self = StObject.set(x, "playbook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilk(value: Boolean): Self = StObject.set(x, "silk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
