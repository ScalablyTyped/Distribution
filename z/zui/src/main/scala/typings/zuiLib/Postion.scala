package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * draggable
  */
/**
  * droppable
  */
trait Postion extends js.Object {
  var height: scala.Double
  var left: scala.Double
  var top: scala.Double
  var width: scala.Double
}

object Postion {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): Postion = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Postion]
  }
}

