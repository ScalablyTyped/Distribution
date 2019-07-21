package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "RoundedRect")
@js.native
class RoundedRect () extends Shape {
  def this(options: RoundedRectOptions) = this()
  /** {@link RectOptions#cornerRadius} */
  var cornerRadius: scala.Double = js.native
  /** {@link RectOptions#height} */
  var height: scala.Double = js.native
  /** {@link RectOptions#width} */
  var width: scala.Double = js.native
  def copy(options: RoundedRectOptions): RoundedRect = js.native
  def copyGraph(options: RoundedRectOptions): RoundedRect = js.native
}

