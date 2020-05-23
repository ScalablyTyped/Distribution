package typings.zdog.mod

import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IllustrationOptions
  extends AnchorOptions
     with DraggerOptions {
  /**
    * Centers the scene in the element.
    * @default true
    * @see {@link https://zzz.dog/api#illustration-centered Zdog API}
    */
  val centered: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables dragging to rotate on an item.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-dragrotate Zdog API}
    */
  val dragRotate: js.UndefOr[Boolean | Anchor] = js.undefined
  /**
    * The HTML element to render on, either a <canvas> or an  <svg>.
    * @see {@link https://zzz.dog/api#illustration-element Zdog API}
    */
  val element: String | HTMLCanvasElement | SVGSVGElement
  val onPrerender: js.UndefOr[PrerenderListener] = js.undefined
  val onResize: js.UndefOr[ResizeListener] = js.undefined
  /**
    * Enables fluid resizing of element.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-resize Zdog API}
    */
  val resize: js.UndefOr[Boolean] = js.undefined
  /**
    * Enlarges or shrinks the displayed size of the rendering.
    * Whereas {@link Anchor#scale scale} will change the size of item geometry, `zoom` changes item geometry and {@link Shape#stroke stroke} size.
    * @default 1
    * @see {@link https://zzz.dog/api#illustration-zoom Zdog API}
    */
  val zoom: js.UndefOr[Double] = js.undefined
}

object IllustrationOptions {
  @scala.inline
  def apply(
    element: String | HTMLCanvasElement | SVGSVGElement,
    addTo: Anchor = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    dragRotate: Boolean | Anchor = null,
    onDragEnd: DragEndListener = null,
    onDragMove: DragMoveListener = null,
    onDragStart: DragStartListener = null,
    onPrerender: PrerenderListener = null,
    onResize: ResizeListener = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    startElement: String | Element = null,
    translate: VectorOptions = null,
    zoom: js.UndefOr[Double] = js.undefined
  ): IllustrationOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (addTo != null) __obj.updateDynamic("addTo")(addTo.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (dragRotate != null) __obj.updateDynamic("dragRotate")(dragRotate.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(onDragMove.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onPrerender != null) __obj.updateDynamic("onPrerender")(onPrerender.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(onResize.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.get.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (startElement != null) __obj.updateDynamic("startElement")(startElement.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IllustrationOptions]
  }
}

