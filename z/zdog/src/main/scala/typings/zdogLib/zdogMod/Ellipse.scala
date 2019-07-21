package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Ellipse")
@js.native
class Ellipse () extends Shape {
  def this(options: EllipseOptions) = this()
  /** @see {@link EllipseOptions#diameter} */
  var diameter: scala.Double = js.native
  /** @see {@link EllipseOptions#height} */
  var height: js.UndefOr[scala.Double] = js.native
  /** @see {@link EllipseOptions#quarters} */
  var quarters: QuartersValue = js.native
  /** @see {@link EllipseOptions#width} */
  var width: js.UndefOr[scala.Double] = js.native
  def copy(options: EllipseOptions): Ellipse = js.native
  def copyGraph(options: EllipseOptions): Ellipse = js.native
}

