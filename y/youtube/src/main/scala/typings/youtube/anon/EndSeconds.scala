package typings.youtube.anon

import typings.youtube.YT.SuggestedVideoQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndSeconds extends js.Object {
  var endSeconds: js.UndefOr[Double] = js.native
  var mediaContentUrl: String = js.native
  var startSeconds: js.UndefOr[Double] = js.native
  var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.native
}

object EndSeconds {
  @scala.inline
  def apply(mediaContentUrl: String): EndSeconds = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndSeconds]
  }
  @scala.inline
  implicit class EndSecondsOps[Self <: EndSeconds] (val x: Self) extends AnyVal {
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

