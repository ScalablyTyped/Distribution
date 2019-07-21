package typings
package zdogLib.zdogMod

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
  val centered: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables dragging to rotate on an item.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-dragrotate Zdog API}
    */
  val dragRotate: js.UndefOr[scala.Boolean | Anchor] = js.undefined
  /**
    * The HTML element to render on, either a <canvas> or an  <svg>.
    * @see {@link https://zzz.dog/api#illustration-element Zdog API}
    */
  val element: java.lang.String | stdLib.HTMLCanvasElement | stdLib.SVGSVGElement
  val onPrerender: js.UndefOr[PrerenderListener] = js.undefined
  val onResize: js.UndefOr[ResizeListener] = js.undefined
  /**
    * Enables fluid resizing of element.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-resize Zdog API}
    */
  val resize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enlarges or shrinks the displayed size of the rendering.
    * Whereas {@link Anchor#scale scale} will change the size of item geometry, `zoom` changes item geometry and {@link Shape#stroke stroke} size.
    * @default 1
    * @see {@link https://zzz.dog/api#illustration-zoom Zdog API}
    */
  val zoom: js.UndefOr[scala.Double] = js.undefined
}

object IllustrationOptions {
  @scala.inline
  def apply(
    element: java.lang.String | stdLib.HTMLCanvasElement | stdLib.SVGSVGElement,
    addTo: Anchor = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    dragRotate: scala.Boolean | Anchor = null,
    onDragEnd: DragEndListener = null,
    onDragMove: DragMoveListener = null,
    onDragStart: DragStartListener = null,
    onPrerender: PrerenderListener = null,
    onResize: ResizeListener = null,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    rotate: VectorOptions = null,
    scale: VectorOptions | scala.Double = null,
    startElement: java.lang.String | stdLib.Element = null,
    translate: VectorOptions = null,
    zoom: scala.Int | scala.Double = null
  ): IllustrationOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (addTo != null) __obj.updateDynamic("addTo")(addTo)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (dragRotate != null) __obj.updateDynamic("dragRotate")(dragRotate.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(onDragMove)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onPrerender != null) __obj.updateDynamic("onPrerender")(onPrerender)
    if (onResize != null) __obj.updateDynamic("onResize")(onResize)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (startElement != null) __obj.updateDynamic("startElement")(startElement.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IllustrationOptions]
  }
}

