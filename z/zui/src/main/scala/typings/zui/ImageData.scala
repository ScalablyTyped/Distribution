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
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, originHeight = originHeight, originWidth = originWidth, right = right, scaleHeight = scaleHeight, scaleWidth = scaleWidth, scaled = scaled, top = top)
  
    __obj.asInstanceOf[ImageData]
  }
}

