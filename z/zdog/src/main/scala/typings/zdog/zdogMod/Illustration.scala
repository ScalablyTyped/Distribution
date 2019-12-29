package typings.zdog.zdogMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.zdog.zdogMod.Dragger because Inheritance from two classes. Inlined onDragStart, onDragStart_Original, onDragMove, onDragMove_Original, onDragEnd, onDragEnd_Original */ @JSImport("zdog", "Illustration")
@js.native
class Illustration protected () extends Anchor {
  def this(options: IllustrationOptions) = this()
  /** @see {@link IllustrationOptions#centered} */
  var centered: Boolean = js.native
  /** @see {@link IllustrationOptions#dragRotate} */
  var dragRotate: Boolean = js.native
  /** @see {@link IllustrationOptions#element} */
  var element: HTMLCanvasElement | SVGSVGElement = js.native
  @JSName("onDragEnd")
  var onDragEnd_Original: DragEndListener = js.native
  @JSName("onDragMove")
  var onDragMove_Original: DragMoveListener = js.native
  @JSName("onDragStart")
  var onDragStart_Original: DragStartListener = js.native
  /** @see {@link IllustrationOptions#onPrerender} */
  @JSName("onPrerender")
  var onPrerender_Original: PrerenderListener = js.native
  /** @see {@link IllustrationOptions#onResize} */
  @JSName("onResize")
  var onResize_Original: ResizeListener = js.native
  /** @see {@link IllustrationOptions#resize} */
  var resize: Boolean = js.native
  /** @see {@link IllustrationOptions#zoom} */
  var zoom: Double = js.native
  /** @see {@link DraggerOptions#onDragEnd} */
  def onDragEnd(): Unit = js.native
  /** @see {@link DraggerOptions#onDragMove} */
  def onDragMove(pointer: PointerPosition, moveX: Double, moveY: Double): Unit = js.native
  /** @see {@link DraggerOptions#onDragStart} */
  def onDragStart(pointer: PointerPosition): Unit = js.native
  /** @see {@link IllustrationOptions#onPrerender} */
  def onPrerender(context: CanvasRenderingContext2D): Unit = js.native
  def onPrerender(context: SVGSVGElement): Unit = js.native
  /** @see {@link IllustrationOptions#onResize} */
  def onResize(width: Double, height: Double): Unit = js.native
  /**
    * Renders an item and its graph to the Illustration’s element.
    * @see {@link https://zzz.dog/api#illustration-rendergraph Zdog API}
    */
  def renderGraph(): Unit = js.native
  def renderGraph(scene: Anchor): Unit = js.native
  /**
    * Sets element size.
    * @see {@link https://zzz.dog/api#illustration-setsize Zdog API}
    */
  def setSize(width: Double, height: Double): Unit = js.native
  /**
    * Combines {@link updateGraph}() and {@link renderGraph}() methods — to save you a line of code.
    * Updates and renders an item and its graph to the `Illustration`’s element.
    * @see {@link https://zzz.dog/api#illustration-updaterendergraph Zdog API}
    */
  def updateRenderGraph(): Unit = js.native
  def updateRenderGraph(scene: Anchor): Unit = js.native
}

