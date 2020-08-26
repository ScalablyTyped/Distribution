package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoByMediaContentUrlSettings extends VideoOrPlaylistSettings {
  /**
    * Fully qualified player URL.
    */
  var mediaContentUrl: String = js.native
}

object VideoByMediaContentUrlSettings {
  @scala.inline
  def apply(mediaContentUrl: String): VideoByMediaContentUrlSettings = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByMediaContentUrlSettings]
  }
  @scala.inline
  implicit class VideoByMediaContentUrlSettingsOps[Self <: VideoByMediaContentUrlSettings] (val x: Self) extends AnyVal {
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
    def setMediaContentUrl(value: String): Self = this.set("mediaContentUrl", value.asInstanceOf[js.Any])
  }
  
}

