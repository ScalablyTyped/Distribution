package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageData extends js.Object {
  var bottom: Double
  // width: number;
  // height: number;
  var left: Double
  var originHeight: Double
  var originWidth: Double
  var right: Double
  var scaleHeight: Double
  var scaleWidth: Double
  var scaled: Boolean
  var top: Double
}

object ImageData {
  @scala.inline
  def apply(
    bottom: Double,
    left: Double,
    originHeight: Double,
    originWidth: Double,
    right: Double,
    scaleHeight: Double,
    scaleWidth: Double,
    scaled: Boolean,
    top: Double
  ): ImageData = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], originHeight = originHeight.asInstanceOf[js.Any], originWidth = originWidth.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], scaleHeight = scaleHeight.asInstanceOf[js.Any], scaleWidth = scaleWidth.asInstanceOf[js.Any], scaled = scaled.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
}

