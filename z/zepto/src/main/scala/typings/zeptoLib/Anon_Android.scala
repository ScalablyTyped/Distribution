package typings
package zeptoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Android extends js.Object {
  var android: scala.Boolean
  var bb10: scala.Boolean
  var blackberry: scala.Boolean
  /**
  		* Specific OS
  		**/
  var ios: scala.Boolean
  var ipad: scala.Boolean
  /**
  		* Specific device type
  		**/
  var iphone: scala.Boolean
  var kindle: scala.Boolean
  /**
  		* General device type
  		**/
  var phone: scala.Boolean
  var rimtabletos: scala.Boolean
  var tablet: scala.Boolean
  var touchpad: scala.Boolean
  /**
  		* OS version.
  		**/
  var version: java.lang.String
  var webos: scala.Boolean
}

object Anon_Android {
  @scala.inline
  def apply(
    android: scala.Boolean,
    bb10: scala.Boolean,
    blackberry: scala.Boolean,
    ios: scala.Boolean,
    ipad: scala.Boolean,
    iphone: scala.Boolean,
    kindle: scala.Boolean,
    phone: scala.Boolean,
    rimtabletos: scala.Boolean,
    tablet: scala.Boolean,
    touchpad: scala.Boolean,
    version: java.lang.String,
    webos: scala.Boolean
  ): Anon_Android = {
    val __obj = js.Dynamic.literal(android = android, bb10 = bb10, blackberry = blackberry, ios = ios, ipad = ipad, iphone = iphone, kindle = kindle, phone = phone, rimtabletos = rimtabletos, tablet = tablet, touchpad = touchpad, version = version, webos = webos)
  
    __obj.asInstanceOf[Anon_Android]
  }
}

