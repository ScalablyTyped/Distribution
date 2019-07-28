package typings.zdog.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Ellipse")
@js.native
class Ellipse () extends Shape {
  def this(options: EllipseOptions) = this()
  /** @see {@link EllipseOptions#diameter} */
  var diameter: Double = js.native
  /** @see {@link EllipseOptions#height} */
  var height: js.UndefOr[Double] = js.native
  /** @see {@link EllipseOptions#quarters} */
  var quarters: QuartersValue = js.native
  /** @see {@link EllipseOptions#width} */
  var width: js.UndefOr[Double] = js.native
  def copy(options: EllipseOptions): Ellipse = js.native
  def copyGraph(options: EllipseOptions): Ellipse = js.native
}

