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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android")(android)
    __obj.updateDynamic("bb10")(bb10)
    __obj.updateDynamic("blackberry")(blackberry)
    __obj.updateDynamic("ios")(ios)
    __obj.updateDynamic("ipad")(ipad)
    __obj.updateDynamic("iphone")(iphone)
    __obj.updateDynamic("kindle")(kindle)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("rimtabletos")(rimtabletos)
    __obj.updateDynamic("tablet")(tablet)
    __obj.updateDynamic("touchpad")(touchpad)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("webos")(webos)
    __obj.asInstanceOf[Anon_Android]
  }
}

