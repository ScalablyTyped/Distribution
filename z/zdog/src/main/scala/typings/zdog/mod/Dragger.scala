package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "Dragger")
@js.native
open class Dragger () extends StObject {
  def this(options: DraggerOptions) = this()
  
  /** @see {@link DraggerOptions#onDragEnd} */
  def onDragEnd(): Unit = js.native
  /** @see {@link DraggerOptions#onDragEnd} */
  @JSName("onDragEnd")
  var onDragEnd_Original: DragEndListener = js.native
  
  /** @see {@link DraggerOptions#onDragMove} */
  def onDragMove(pointer: PointerPosition, moveX: Double, moveY: Double): Unit = js.native
  /** @see {@link DraggerOptions#onDragMove} */
  @JSName("onDragMove")
  var onDragMove_Original: DragMoveListener = js.native
  
  /** @see {@link DraggerOptions#onDragStart} */
  def onDragStart(pointer: PointerPosition): Unit = js.native
  /** @see {@link DraggerOptions#onDragStart} */
  @JSName("onDragStart")
  var onDragStart_Original: DragStartListener = js.native
}
