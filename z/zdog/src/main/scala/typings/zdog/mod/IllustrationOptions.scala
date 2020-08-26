package typings.zdog.mod

import typings.std.HTMLCanvasElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IllustrationOptions
  extends AnchorOptions
     with DraggerOptions {
  /**
    * Centers the scene in the element.
    * @default true
    * @see {@link https://zzz.dog/api#illustration-centered Zdog API}
    */
  val centered: js.UndefOr[Boolean] = js.native
  /**
    * Enables dragging to rotate on an item.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-dragrotate Zdog API}
    */
  val dragRotate: js.UndefOr[Boolean | Anchor] = js.native
  /**
    * The HTML element to render on, either a <canvas> or an  <svg>.
    * @see {@link https://zzz.dog/api#illustration-element Zdog API}
    */
  val element: String | HTMLCanvasElement | SVGSVGElement = js.native
  val onPrerender: js.UndefOr[PrerenderListener] = js.native
  val onResize: js.UndefOr[ResizeListener] = js.native
  /**
    * Enables fluid resizing of element.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-resize Zdog API}
    */
  val resize: js.UndefOr[Boolean] = js.native
  /**
    * Enlarges or shrinks the displayed size of the rendering.
    * Whereas {@link Anchor#scale scale} will change the size of item geometry, `zoom` changes item geometry and {@link Shape#stroke stroke} size.
    * @default 1
    * @see {@link https://zzz.dog/api#illustration-zoom Zdog API}
    */
  val zoom: js.UndefOr[Double] = js.native
}

object IllustrationOptions {
  @scala.inline
  def apply(element: String | HTMLCanvasElement | SVGSVGElement): IllustrationOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[IllustrationOptions]
  }
  @scala.inline
  implicit class IllustrationOptionsOps[Self <: IllustrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElement(value: String | HTMLCanvasElement | SVGSVGElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setDragRotate(value: Boolean | Anchor): Self = this.set("dragRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragRotate: Self = this.set("dragRotate", js.undefined)
    @scala.inline
    def setOnPrerender(value: PrerenderListener): Self = this.set("onPrerender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPrerender: Self = this.set("onPrerender", js.undefined)
    @scala.inline
    def setOnResize(value: ResizeListener): Self = this.set("onResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

