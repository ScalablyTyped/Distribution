package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Crop extends js.Object {
  var crop: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var preserve_headers: js.UndefOr[scala.Boolean] = js.undefined
  var quuality: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Crop {
  @scala.inline
  def apply(
    crop: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    preserve_headers: js.UndefOr[scala.Boolean] = js.undefined,
    quuality: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Crop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_headers)) __obj.updateDynamic("preserve_headers")(preserve_headers)
    if (quuality != null) __obj.updateDynamic("quuality")(quuality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Crop]
  }
}

