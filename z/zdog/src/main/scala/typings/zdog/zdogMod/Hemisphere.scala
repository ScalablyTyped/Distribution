package typings.zdog.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Hemisphere")
@js.native
class Hemisphere () extends Ellipse {
  def this(options: HemisphereOptions) = this()
  def copy(options: HemisphereOptions): Hemisphere = js.native
  def copyGraph(options: HemisphereOptions): Hemisphere = js.native
}

