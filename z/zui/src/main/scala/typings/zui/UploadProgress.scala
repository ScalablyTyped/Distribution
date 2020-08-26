package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadProgress extends js.Object {
  var bytesPerSec: js.UndefOr[Double] = js.native
  var failed: js.UndefOr[Double] = js.native
  var loaded: js.UndefOr[Double] = js.native
  var percent: js.UndefOr[Double] = js.native
  var queued: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var uploaded: js.UndefOr[Double] = js.native
}

object UploadProgress {
  @scala.inline
  def apply(): UploadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadProgress]
  }
  @scala.inline
  implicit class UploadProgressOps[Self <: UploadProgress] (val x: Self) extends AnyVal {
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
    def setBytesPerSec(value: Double): Self = this.set("bytesPerSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesPerSec: Self = this.set("bytesPerSec", js.undefined)
    @scala.inline
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setQueued(value: Double): Self = this.set("queued", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueued: Self = this.set("queued", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setUploaded(value: Double): Self = this.set("uploaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploaded: Self = this.set("uploaded", js.undefined)
  }
  
}

