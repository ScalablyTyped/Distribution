package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorOptions extends js.Object {
  
  /**
    * Adds item to parent item.
    * Shapes can be added as children to other shapes.
    * A child shape is positioned relative to its parent.
    * @see {@link https://zzz.dog/api#anchor-addto Zdog API}
    */
  val addTo: js.UndefOr[Anchor] = js.native
  
  /**
    * Rotates the item.
    * Set to rotate the item around the corresponding axis.
    * @see {@link https://zzz.dog/api#anchor-rotate Zdog API}
    */
  val rotate: js.UndefOr[VectorOptions] = js.native
  
  /**
    * Enlarges or shrinks item geometry. `scale` does not scale `stroke`.
    * @see {@link https://zzz.dog/api#anchor-scale Zdog API}
    */
  val scale: js.UndefOr[VectorOptions | Double] = js.native
  
  /**
    * Positions the item.
    * @see {@link https://zzz.dog/api#anchor-translate Zdog API}
    */
  val translate: js.UndefOr[VectorOptions] = js.native
}
object AnchorOptions {
  
  @scala.inline
  def apply(): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorOptions]
  }
  
  @scala.inline
  implicit class AnchorOptionsOps[Self <: AnchorOptions] (val x: Self) extends AnyVal {
    
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
    def setAddTo(value: Anchor): Self = this.set("addTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddTo: Self = this.set("addTo", js.undefined)
    
    @scala.inline
    def setRotate(value: VectorOptions): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setScale(value: VectorOptions | Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setTranslate(value: VectorOptions): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
  }
}
