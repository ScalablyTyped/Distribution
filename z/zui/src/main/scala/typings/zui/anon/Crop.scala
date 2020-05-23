package typings.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crop extends js.Object {
  var crop: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var preserve_headers: js.UndefOr[Boolean] = js.undefined
  var quuality: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Crop {
  @scala.inline
  def apply(
    crop: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    preserve_headers: js.UndefOr[Boolean] = js.undefined,
    quuality: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Crop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_headers)) __obj.updateDynamic("preserve_headers")(preserve_headers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quuality)) __obj.updateDynamic("quuality")(quuality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
}

