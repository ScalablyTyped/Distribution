package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Dragger")
@js.native
class Dragger () extends js.Object {
  def this(options: DraggerOptions) = this()
  /** @see {@link DraggerOptions#onDragEnd} */
  @JSName("onDragEnd")
  var onDragEnd_Original: DragEndListener = js.native
  /** @see {@link DraggerOptions#onDragMove} */
  @JSName("onDragMove")
  var onDragMove_Original: DragMoveListener = js.native
  /** @see {@link DraggerOptions#onDragStart} */
  @JSName("onDragStart")
  var onDragStart_Original: DragStartListener = js.native
  /** @see {@link DraggerOptions#onDragEnd} */
  def onDragEnd(`this`: Dragger): scala.Unit = js.native
  /** @see {@link DraggerOptions#onDragMove} */
  def onDragMove(`this`: Dragger, pointer: PointerPosition, moveX: scala.Double, moveY: scala.Double): scala.Unit = js.native
  /** @see {@link DraggerOptions#onDragStart} */
  def onDragStart(`this`: Dragger, pointer: PointerPosition): scala.Unit = js.native
}

