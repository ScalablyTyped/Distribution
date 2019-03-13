package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  val bottom: scala.Double
  val height: scala.Double
  val left: scala.Double
  val right: scala.Double
  val top: scala.Double
  val width: scala.Double
  def fromJs(
    expose: js.Function6[
      /* left */ scala.Double, 
      /* right */ scala.Double, 
      /* top */ scala.Double, 
      /* bottom */ scala.Double, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      _
    ]
  ): scala.Unit
}

object Layout {
  @scala.inline
  def apply(
    bottom: scala.Double,
    fromJs: js.Function6[
      /* left */ scala.Double, 
      /* right */ scala.Double, 
      /* top */ scala.Double, 
      /* bottom */ scala.Double, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      _
    ] => scala.Unit,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    toString: () => java.lang.String,
    top: scala.Double,
    width: scala.Double
  ): Layout = {
    val __obj = js.Dynamic.literal(bottom = bottom, fromJs = js.Any.fromFunction1(fromJs), height = height, left = left, right = right, toString = js.Any.fromFunction0(toString), top = top, width = width)
  
    __obj.asInstanceOf[Layout]
  }
}

