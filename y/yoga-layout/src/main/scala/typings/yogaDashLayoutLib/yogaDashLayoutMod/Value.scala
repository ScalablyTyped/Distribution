package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yoga-layout", "Value")
@js.native
class Value protected () extends js.Object {
  def this(unit: scala.Double, value: scala.Double) = this()
  def this(unit: YogaUnit, value: scala.Double) = this()
  val unit: YogaUnit | scala.Double = js.native
  val value: scala.Double = js.native
  def fromJS(expose: js.Function2[/* unit */ YogaUnit | scala.Double, /* value */ scala.Double, _]): scala.Unit = js.native
}

