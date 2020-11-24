package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "Group")
@js.native
class Group () extends Anchor {
  def this(options: GroupOptions) = this()
  
  def copy(options: GroupOptions): Group = js.native
  
  def copyGraph(options: GroupOptions): Group = js.native
  
  /** @see {@link GroupOptions#updateSort} */
  var updateSort: Boolean = js.native
  
  /** @see {@link GroupOptions#visible} */
  var visible: Boolean = js.native
}
