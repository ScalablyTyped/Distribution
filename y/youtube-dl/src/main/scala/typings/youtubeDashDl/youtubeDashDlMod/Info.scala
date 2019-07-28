package typings.youtubeDashDl.youtubeDashDlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var _duration_hms: String
  var _duration_raw: Double
  var _filename: String
  var duration: String
  var filename: String
  var size: Double
}

object Info {
  @scala.inline
  def apply(
    _duration_hms: String,
    _duration_raw: Double,
    _filename: String,
    duration: String,
    filename: String,
    size: Double
  ): Info = {
    val __obj = js.Dynamic.literal(_duration_hms = _duration_hms, _duration_raw = _duration_raw, _filename = _filename, duration = duration, filename = filename, size = size)
  
    __obj.asInstanceOf[Info]
  }
}

