package typings.zdog.mod

import typings.zdog.zdogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeOptions extends AnchorOptions {
  
  /**
    * Shows or hides the shape when its backface is visible.
    * @default true
    * @see {@link https://zzz.dog/api#shape-backface Zdog API}
    */
  val backface: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Closes the path from the last point back to the first.
    * @default true
    * @see {@link https://zzz.dog/api#shape-closed Zdog API}
    * @see {@link https://zzz.dog/shapes#shape-closed Zdog Shapes API}
    */
  val closed: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets shape stroke and fill color.
    * Set to any color string — hex code, `rgb()`, `hsla()`, etc.
    * @default '#333'
    * @see {@link https://zzz.dog/api#shape-color Zdog API}
    */
  val color: js.UndefOr[String] = js.native
  
  /**
    * Renders the inner shape area.
    * @default false
    * @see {@link https://zzz.dog/api#shape-fill Zdog API}
    */
  val fill: js.UndefOr[Boolean] = js.native
  
  /**
    * A {@link Vector} used to determine where the front of the shape is.
    * Useful for changing how {@link backface} works for custom `Shape`s.
    * @default {z: 1}
    * @see {@link https://zzz.dog/api#shape-front Zdog API}
    */
  val front: js.UndefOr[VectorOptions] = js.native
  
  /**
    * Defines the shape.
    * @see {@link https://zzz.dog/shapes#shape-path Zdog Shape API}
    */
  val path: js.UndefOr[js.Array[PathCommand]] = js.native
  
  /**
    * Renders the shape line and sets line width.
    * Set to `0` or `false` to disable.
    * @default 1
    * @see {@link https://zzz.dog/api#shape-stroke Zdog API}
    */
  val stroke: js.UndefOr[Double | `false`] = js.native
  
  /**
    * Shows or hides shape. Does not affect child items.
    * @default true
    * @see {@link https://zzz.dog/api#shape-visible Zdog API}
    */
  val visible: js.UndefOr[Boolean] = js.native
}
object ShapeOptions {
  
  @scala.inline
  def apply(): ShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeOptions]
  }
  
  @scala.inline
  implicit class ShapeOptionsOps[Self <: ShapeOptions] (val x: Self) extends AnyVal {
    
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
    def setBackface(value: Boolean | String): Self = this.set("backface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackface: Self = this.set("backface", js.undefined)
    
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFront(value: VectorOptions): Self = this.set("front", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFront: Self = this.set("front", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: PathCommand*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[PathCommand]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setStroke(value: Double | `false`): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
