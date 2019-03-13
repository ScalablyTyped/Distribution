package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  val unit: yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaUnit | scala.Double
  val value: scala.Double
  def fromJS(
    expose: js.Function2[
      /* unit */ yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaUnit | scala.Double, 
      /* value */ scala.Double, 
      _
    ]
  ): scala.Unit
}

object Value {
  @scala.inline
  def apply(
    fromJS: js.Function2[
      /* unit */ yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaUnit | scala.Double, 
      /* value */ scala.Double, 
      _
    ] => scala.Unit,
    toString: () => java.lang.String,
    unit: yogaDashLayoutLib.yogaDashLayoutMod.YogaNs.YogaUnit | scala.Double,
    value: scala.Double,
    valueOf: () => scala.Double
  ): Value = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1(fromJS), toString = js.Any.fromFunction0(toString), unit = unit.asInstanceOf[js.Any], value = value, valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[Value]
  }
}

