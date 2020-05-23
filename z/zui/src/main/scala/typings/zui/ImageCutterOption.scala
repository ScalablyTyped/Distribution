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
    coverOpacity: js.UndefOr[Double] = js.undefined,
    defaultHeight: js.UndefOr[Double] = js.undefined,
    defaultWidth: js.UndefOr[Double] = js.undefined,
    fixedRatio: js.UndefOr[Boolean] = js.undefined,
    get: String = null,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    post: String = null
  ): ImageCutterOption = {
    val __obj = js.Dynamic.literal()
    if (coverColor != null) __obj.updateDynamic("coverColor")(coverColor.asInstanceOf[js.Any])
    if (!js.isUndefined(coverOpacity)) __obj.updateDynamic("coverOpacity")(coverOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultHeight)) __obj.updateDynamic("defaultHeight")(defaultHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultWidth)) __obj.updateDynamic("defaultWidth")(defaultWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedRatio)) __obj.updateDynamic("fixedRatio")(fixedRatio.get.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCutterOption]
  }
}

