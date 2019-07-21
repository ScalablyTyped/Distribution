package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Polygon")
@js.native
class Polygon () extends Shape {
  def this(options: PolygonOptions) = this()
  /** @see {@link PolygonOptions#radius} */
  val radius: js.UndefOr[scala.Double] = js.native
  /** @see {@link PolygonOptions#sides} */
  val sides: js.UndefOr[scala.Double] = js.native
  def copy(options: PolygonOptions): Polygon = js.native
  def copyGraph(options: PolygonOptions): Polygon = js.native
}

