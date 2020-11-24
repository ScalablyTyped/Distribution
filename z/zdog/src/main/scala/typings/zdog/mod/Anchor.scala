package typings.zdog.mod

import typings.std.CanvasRenderingContext2D
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zdog", "Anchor")
@js.native
class Anchor () extends js.Object {
  def this(options: AnchorOptions) = this()
  
  /**
    * Adds child item. `addChild()` is useful for moving a child item to a new parent, or creating an item without {@link addTo}.
    * @see {@link https://zzz.dog/api#anchor-addchild Zdog API}
    */
  def addChild(anchor: Anchor): Unit = js.native
  
  /** @see {@link AnchorOptions#addTo} */
  var addTo: js.UndefOr[Anchor] = js.native
  
  /**
    * Copy an item.
    * `copy()` only copies the item, not the item’s graph of descendant items.
    * Use {@link copyGraph}() to copy the item and its graph.
    * @see {@link https://zzz.dog/api#anchor-copy Zdog API}
    */
  def copy(): Anchor = js.native
  def copy(options: AnchorOptions): Anchor = js.native
  
  /**
    * Copies item and its descendent items.
    * @see {@link https://zzz.dog/api#anchor-copygraph Zdog API}
    */
  def copyGraph(): Anchor = js.native
  def copyGraph(options: AnchorOptions): Anchor = js.native
  
  /**
    * Wraps-around {@link rotate} `x`, `y`, & `z` values between `0` and {@link TAU}.
    * @see {@link https://zzz.dog/api#anchor-normalizerotate Zdog API}
    */
  def normalizeRotate(): Unit = js.native
  
  /**
    * Removes item from parent.
    * @see {@link https://zzz.dog/api#anchor-remove Zdog API}
    */
  def remove(): Unit = js.native
  
  /**
    * Removes child item.
    * @see {@link https://zzz.dog/api#anchor-removechild Zdog API}
    */
  def removeChild(anchor: Anchor): Unit = js.native
  
  /**
    * Renders the item and all its descendant items to a `<canvas>` element.
    * Useful for {@link https://zzz.dog/extras#rendering-without-illustration rendering without `Illustration`}.
    * @see {@link https://zzz.dog/api#anchor-rendergraphcanvas Zdog API}
    */
  def renderGraphCanvas(ctx: CanvasRenderingContext2D): Unit = js.native
  
  /**
    * Renders the item and all its descendant items to an SVG element.
    * Useful for {@link https://zzz.dog/extras#rendering-without-illustration rendering without `Illustration`}.
    * @see {@link https://zzz.dog/api#anchor-rendergraphsvg Zdog API}
    */
  def renderGraphSvg(svg: SVGSVGElement): Unit = js.native
  
  /** @see {@link AnchorOptions#rotate} */
  var rotate: Vector = js.native
  
  /** @see {@link AnchorOptions#scale} */
  var scale: Vector = js.native
  
  /** @see {@link AnchorOptions#translate} */
  var translate: Vector = js.native
  
  /**
    * Updates the items and all its graph of descendant items so they are ready for rendering.
    * Useful for {@link https://zzz.dog/extras#rendering-without-illustration rendering without `Illustration`}.
    * @see {@link https://zzz.dog/api#anchor-updategraph Zdog API}
    */
  def updateGraph(): Unit = js.native
}
