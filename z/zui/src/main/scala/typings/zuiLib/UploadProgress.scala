package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgress extends js.Object {
  var bytesPerSec: js.UndefOr[scala.Double] = js.undefined
  var failed: js.UndefOr[scala.Double] = js.undefined
  var loaded: js.UndefOr[scala.Double] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var queued: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var uploaded: js.UndefOr[scala.Double] = js.undefined
}

object UploadProgress {
  @scala.inline
  def apply(
    bytesPerSec: scala.Int | scala.Double = null,
    failed: scala.Int | scala.Double = null,
    loaded: scala.Int | scala.Double = null,
    percent: scala.Int | scala.Double = null,
    queued: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    uploaded: scala.Int | scala.Double = null
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

