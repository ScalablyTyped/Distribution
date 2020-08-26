package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoOrPlaylistSettings extends js.Object {
  /**
    * Time, in seconds from the end of the (first) video, when to end playing.
    */
  var endSeconds: js.UndefOr[Double] = js.native
  /**
    * Time, in seconds from the beginning of the (first) video, when to start playing.
    */
  var startSeconds: js.UndefOr[Double] = js.native
  /**
    * Suggested video player quality.
    */
  var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.native
}

object VideoOrPlaylistSettings {
  @scala.inline
  def apply(): VideoOrPlaylistSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOrPlaylistSettings]
  }
  @scala.inline
  implicit class VideoOrPlaylistSettingsOps[Self <: VideoOrPlaylistSettings] (val x: Self) extends AnyVal {
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
    def setEndSeconds(value: Double): Self = this.set("endSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndSeconds: Self = this.set("endSeconds", js.undefined)
    @scala.inline
    def setStartSeconds(value: Double): Self = this.set("startSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartSeconds: Self = this.set("startSeconds", js.undefined)
    @scala.inline
    def setSuggestedQuality(value: SuggestedVideoQuality): Self = this.set("suggestedQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedQuality: Self = this.set("suggestedQuality", js.undefined)
  }
  
}

