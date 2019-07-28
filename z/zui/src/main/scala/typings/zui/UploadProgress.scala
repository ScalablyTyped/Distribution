package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgress extends js.Object {
  var bytesPerSec: js.UndefOr[Double] = js.undefined
  var failed: js.UndefOr[Double] = js.undefined
  var loaded: js.UndefOr[Double] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var queued: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var uploaded: js.UndefOr[Double] = js.undefined
}

object UploadProgress {
  @scala.inline
  def apply(
    bytesPerSec: Int | Double = null,
    failed: Int | Double = null,
    loaded: Int | Double = null,
    percent: Int | Double = null,
    queued: Int | Double = null,
    size: Int | Double = null,
    uploaded: Int | Double = null
  ): UploadProgress = {
    val __obj = js.Dynamic.literal()
    if (bytesPerSec != null) __obj.updateDynamic("bytesPerSec")(bytesPerSec.asInstanceOf[js.Any])
    if (failed != null) __obj.updateDynamic("failed")(failed.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (queued != null) __obj.updateDynamic("queued")(queued.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uploaded != null) __obj.updateDynamic("uploaded")(uploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgress]
  }
}

