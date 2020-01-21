package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Cone")
@js.native
class Cone () extends Ellipse {
  def this(options: ConeOptions) = this()
  /** @see {@link ConeOptions#length} */
  var length: Double = js.native
  def copy(options: ConeOptions): Cone = js.native
  def copyGraph(options: ConeOptions): Cone = js.native
}

