package typings.yogaDashLayout.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  val bottom: Double
  val height: Double
  val left: Double
  val right: Double
  val top: Double
  val width: Double
  def fromJs(
    expose: js.Function6[
      /* left */ Double, 
      /* right */ Double, 
      /* top */ Double, 
      /* bottom */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      _
    ]
  ): Unit
}

object Layout {
  @scala.inline
  def apply(
    bottom: Double,
    fromJs: js.Function6[
      /* left */ Double, 
      /* right */ Double, 
      /* top */ Double, 
      /* bottom */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      _
    ] => Unit,
    height: Double,
    left: Double,
    right: Double,
    toString: () => String,
    top: Double,
    width: Double
  ): Layout = {
    val __obj = js.Dynamic.literal(bottom = bottom, fromJs = js.Any.fromFunction1(fromJs), height = height, left = left, right = right, toString = js.Any.fromFunction0(toString), top = top, width = width)
  
    __obj.asInstanceOf[Layout]
  }
}

