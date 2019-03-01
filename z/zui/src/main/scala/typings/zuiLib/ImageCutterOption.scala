package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * image cutter
  */
trait ImageCutterOption extends js.Object {
  var coverColor: js.UndefOr[java.lang.String] = js.undefined
  var coverOpacity: js.UndefOr[scala.Double] = js.undefined
  var defaultHeight: js.UndefOr[scala.Double] = js.undefined
  var defaultWidth: js.UndefOr[scala.Double] = js.undefined
  var fixedRatio: js.UndefOr[scala.Boolean] = js.undefined
  var get: js.UndefOr[java.lang.String] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var post: js.UndefOr[java.lang.String] = js.undefined
}

object ImageCutterOption {
  @scala.inline
  def apply(
    coverColor: java.lang.String = null,
    coverOpacity: scala.Int | scala.Double = null,
    defaultHeight: scala.Int | scala.Double = null,
    defaultWidth: scala.Int | scala.Double = null,
    fixedRatio: js.UndefOr[scala.Boolean] = js.undefined,
    get: java.lang.String = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    post: java.lang.String = null
  ): ImageCutterOption = {
    val __obj = js.Dynamic.literal()
    if (coverColor != null) __obj.updateDynamic("coverColor")(coverColor)
    if (coverOpacity != null) __obj.updateDynamic("coverOpacity")(coverOpacity.asInstanceOf[js.Any])
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedRatio)) __obj.updateDynamic("fixedRatio")(fixedRatio)
    if (get != null) __obj.updateDynamic("get")(get)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post)
    __obj.asInstanceOf[ImageCutterOption]
  }
}

