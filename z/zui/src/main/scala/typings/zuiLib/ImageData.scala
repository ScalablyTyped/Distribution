package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageData extends js.Object {
  var bottom: scala.Double
  // width: number;
  // height: number;
  var left: scala.Double
  var originHeight: scala.Double
  var originWidth: scala.Double
  var right: scala.Double
  var scaleHeight: scala.Double
  var scaleWidth: scala.Double
  var scaled: scala.Boolean
  var top: scala.Double
}

object ImageData {
  @scala.inline
  def apply(
    bottom: scala.Double,
    left: scala.Double,
    originHeight: scala.Double,
    originWidth: scala.Double,
    right: scala.Double,
    scaleHeight: scala.Double,
    scaleWidth: scala.Double,
    scaled: scala.Boolean,
    top: scala.Double
  ): ImageData = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, originHeight = originHeight, originWidth = originWidth, right = right, scaleHeight = scaleHeight, scaleWidth = scaleWidth, scaled = scaled, top = top)
  
    __obj.asInstanceOf[ImageData]
  }
}

