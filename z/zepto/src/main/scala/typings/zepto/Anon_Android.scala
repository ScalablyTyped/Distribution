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
    val __obj = js.Dynamic.literal(android = android, bb10 = bb10, blackberry = blackberry, ios = ios, ipad = ipad, iphone = iphone, kindle = kindle, phone = phone, rimtabletos = rimtabletos, tablet = tablet, touchpad = touchpad, version = version, webos = webos)
  
    __obj.asInstanceOf[Anon_Android]
  }
}

