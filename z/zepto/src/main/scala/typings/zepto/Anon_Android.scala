package typings.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Android extends js.Object {
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

object Anon_Android {
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
  ): Anon_Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], bb10 = bb10.asInstanceOf[js.Any], blackberry = blackberry.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], ipad = ipad.asInstanceOf[js.Any], iphone = iphone.asInstanceOf[js.Any], kindle = kindle.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], rimtabletos = rimtabletos.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], touchpad = touchpad.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webos = webos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Android]
  }
}

