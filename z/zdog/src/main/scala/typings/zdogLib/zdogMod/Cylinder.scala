package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Cylinder")
@js.native
class Cylinder () extends Shape {
  def this(options: CylinderOptions) = this()
  /** @see {@link CylinderOptions#diameter} */
  var diameter: scala.Double = js.native
  /** @see {@link CylinderOptions#frontFace} */
  var frontFace: js.UndefOr[scala.Boolean | java.lang.String] = js.native
  /** @see {@link CylinderOptions#length} */
  var length: scala.Double = js.native
}

