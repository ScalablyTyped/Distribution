package typings.yogaLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  val height: Double
  val width: Double
  def fromJS(expose: js.Function2[/* width */ Double, /* height */ Double, _]): Unit
}

object Size {
  @scala.inline
  def apply(
    fromJS: js.Function2[/* width */ Double, /* height */ Double, _] => Unit,
    height: Double,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1(fromJS), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Size]
  }
}

