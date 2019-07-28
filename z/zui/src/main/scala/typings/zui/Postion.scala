package typings.zui

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
  var height: Double
  var left: Double
  var top: Double
  var width: Double
}

object Postion {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): Postion = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Postion]
  }
}

