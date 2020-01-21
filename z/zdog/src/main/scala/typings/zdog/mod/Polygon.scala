package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Polygon")
@js.native
class Polygon () extends Shape {
  def this(options: PolygonOptions) = this()
  /** @see {@link PolygonOptions#radius} */
  val radius: js.UndefOr[Double] = js.native
  /** @see {@link PolygonOptions#sides} */
  val sides: js.UndefOr[Double] = js.native
  def copy(options: PolygonOptions): Polygon = js.native
  def copyGraph(options: PolygonOptions): Polygon = js.native
}

