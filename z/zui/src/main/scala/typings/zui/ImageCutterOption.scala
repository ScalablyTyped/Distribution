package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * image cutter
  */
trait ImageCutterOption extends js.Object {
  var coverColor: js.UndefOr[String] = js.undefined
  var coverOpacity: js.UndefOr[Double] = js.undefined
  var defaultHeight: js.UndefOr[Double] = js.undefined
  var defaultWidth: js.UndefOr[Double] = js.undefined
  var fixedRatio: js.UndefOr[Boolean] = js.undefined
  var get: js.UndefOr[String] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var post: js.UndefOr[String] = js.undefined
}

object ImageCutterOption {
  @scala.inline
  def apply(
    coverColor: String = null,
    coverOpacity: Int | Double = null,
    defaultHeight: Int | Double = null,
    defaultWidth: Int | Double = null,
    fixedRatio: js.UndefOr[Boolean] = js.undefined,
    get: String = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    post: String = null
  ): ImageCutterOption = {
    val __obj = js.Dynamic.literal()
    if (coverColor != null) __obj.updateDynamic("coverColor")(coverColor.asInstanceOf[js.Any])
    if (coverOpacity != null) __obj.updateDynamic("coverOpacity")(coverOpacity.asInstanceOf[js.Any])
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedRatio)) __obj.updateDynamic("fixedRatio")(fixedRatio.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCutterOption]
  }
}

