package typings.yogaDashLayout.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  val unit: YogaUnit | Double
  val value: Double
  def fromJS(expose: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, _]): Unit
}

object Value {
  @scala.inline
  def apply(
    fromJS: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, _] => Unit,
    toString: () => String,
    unit: YogaUnit | Double,
    value: Double,
    valueOf: () => Double
  ): Value = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1(fromJS), toString = js.Any.fromFunction0(toString), unit = unit.asInstanceOf[js.Any], value = value, valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[Value]
  }
}

