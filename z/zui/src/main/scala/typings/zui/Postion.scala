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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Postion]
  }
}

