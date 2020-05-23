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
    bytesPerSec: js.UndefOr[Double] = js.undefined,
    failed: js.UndefOr[Double] = js.undefined,
    loaded: js.UndefOr[Double] = js.undefined,
    percent: js.UndefOr[Double] = js.undefined,
    queued: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    uploaded: js.UndefOr[Double] = js.undefined
  ): UploadProgress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytesPerSec)) __obj.updateDynamic("bytesPerSec")(bytesPerSec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failed)) __obj.updateDynamic("failed")(failed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queued)) __obj.updateDynamic("queued")(queued.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploaded)) __obj.updateDynamic("uploaded")(uploaded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgress]
  }
}

