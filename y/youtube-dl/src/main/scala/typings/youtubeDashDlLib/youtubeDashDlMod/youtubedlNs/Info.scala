package typings
package youtubeDashDlLib.youtubeDashDlMod.youtubedlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var _duration_hms: java.lang.String
  var _duration_raw: scala.Double
  var _filename: java.lang.String
  var duration: java.lang.String
  var filename: java.lang.String
  var size: scala.Double
}

object Info {
  @scala.inline
  def apply(
    _duration_hms: java.lang.String,
    _duration_raw: scala.Double,
    _filename: java.lang.String,
    duration: java.lang.String,
    filename: java.lang.String,
    size: scala.Double
  ): Info = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_duration_hms")(_duration_hms)
    __obj.updateDynamic("_duration_raw")(_duration_raw)
    __obj.updateDynamic("_filename")(_filename)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Info]
  }
}

