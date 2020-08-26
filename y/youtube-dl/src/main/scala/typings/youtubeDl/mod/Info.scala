package typings.youtubeDl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Info extends js.Object {
  var _duration_hms: String = js.native
  var _duration_raw: Double = js.native
  var _filename: String = js.native
  var duration: String = js.native
  var filename: String = js.native
  var size: Double = js.native
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
    val __obj = js.Dynamic.literal(_duration_hms = _duration_hms.asInstanceOf[js.Any], _duration_raw = _duration_raw.asInstanceOf[js.Any], _filename = _filename.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
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
    def set_duration_hms(value: String): Self = this.set("_duration_hms", value.asInstanceOf[js.Any])
    @scala.inline
    def set_duration_raw(value: Double): Self = this.set("_duration_raw", value.asInstanceOf[js.Any])
    @scala.inline
    def set_filename(value: String): Self = this.set("_filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

