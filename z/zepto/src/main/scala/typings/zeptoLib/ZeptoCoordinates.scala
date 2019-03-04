package typings
package zeptoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoCoordinates extends ZeptoPosition {
  var height: scala.Double
  var width: scala.Double
}

object ZeptoCoordinates {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): ZeptoCoordinates = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[ZeptoCoordinates]
  }
}

