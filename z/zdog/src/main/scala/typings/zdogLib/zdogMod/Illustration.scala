package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- zdogLib.zdogMod.Dragger because Inheritance from two classes. Inlined onDragStart, onDragStart_Original, onDragMove, onDragMove_Original, onDragEnd, onDragEnd_Original */ @JSImport("zdog", "Illustration")
@js.native
class Illustration protected () extends Anchor {
  def this(options: IllustrationOptions) = this()
  /** @see {@link IllustrationOptions#centered} */
  var centered: scala.Boolean = js.native
  /** @see {@link IllustrationOptions#dragRotate} */
  var dragRotate: scala.Boolean = js.native
  /** @see {@link IllustrationOptions#element} */
  var element: stdLib.HTMLCanvasElement | stdLib.SVGSVGElement = js.native
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
  var resize: scala.Boolean = js.native
  /** @see {@link IllustrationOptions#zoom} */
  var zoom: scala.Double = js.native
  /** @see {@link DraggerOptions#onDragEnd} */
  def onDragEnd(`this`: Dragger): scala.Unit = js.native
  /** @see {@link DraggerOptions#onDragMove} */
  def onDragMove(`this`: Dragger, pointer: PointerPosition, moveX: scala.Double, moveY: scala.Double): scala.Unit = js.native
  /** @see {@link DraggerOptions#onDragStart} */
  def onDragStart(`this`: Dragger, pointer: PointerPosition): scala.Unit = js.native
  /** @see {@link IllustrationOptions#onPrerender} */
  def onPrerender(`this`: Illustration, context: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  def onPrerender(`this`: Illustration, context: stdLib.SVGSVGElement): scala.Unit = js.native
  /** @see {@link IllustrationOptions#onResize} */
  def onResize(`this`: Illustration, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Renders an item and its graph to the Illustration’s element.
    * @see {@link https://zzz.dog/api#illustration-rendergraph Zdog API}
    */
  def renderGraph(): scala.Unit = js.native
  def renderGraph(scene: Anchor): scala.Unit = js.native
  /**
    * Sets element size.
    * @see {@link https://zzz.dog/api#illustration-setsize Zdog API}
    */
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Combines {@link updateGraph}() and {@link renderGraph}() methods — to save you a line of code.
    * Updates and renders an item and its graph to the `Illustration`’s element.
    * @see {@link https://zzz.dog/api#illustration-updaterendergraph Zdog API}
    */
  def updateRenderGraph(): scala.Unit = js.native
  def updateRenderGraph(scene: Anchor): scala.Unit = js.native
}

