package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Group")
@js.native
class Group () extends Anchor {
  def this(options: GroupOptions) = this()
  /** @see {@link GroupOptions#updateSort} */
  var updateSort: scala.Boolean = js.native
  /** @see {@link GroupOptions#visible} */
  var visible: scala.Boolean = js.native
  def copy(options: GroupOptions): Group = js.native
  def copyGraph(options: GroupOptions): Group = js.native
}

