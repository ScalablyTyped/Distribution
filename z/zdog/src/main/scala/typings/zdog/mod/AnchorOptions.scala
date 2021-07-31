package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorOptions extends StObject {
  
  /**
    * Adds item to parent item.
    * Shapes can be added as children to other shapes.
    * A child shape is positioned relative to its parent.
    * @see {@link https://zzz.dog/api#anchor-addto Zdog API}
    */
  val addTo: js.UndefOr[Anchor] = js.undefined
  
  /**
    * Rotates the item.
    * Set to rotate the item around the corresponding axis.
    * @see {@link https://zzz.dog/api#anchor-rotate Zdog API}
    */
  val rotate: js.UndefOr[VectorOptions] = js.undefined
  
  /**
    * Enlarges or shrinks item geometry. `scale` does not scale `stroke`.
    * @see {@link https://zzz.dog/api#anchor-scale Zdog API}
    */
  val scale: js.UndefOr[VectorOptions | Double] = js.undefined
  
  /**
    * Positions the item.
    * @see {@link https://zzz.dog/api#anchor-translate Zdog API}
    */
  val translate: js.UndefOr[VectorOptions] = js.undefined
}
object AnchorOptions {
  
  @scala.inline
  def apply(): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorOptions]
  }
  
  @scala.inline
  implicit class AnchorOptionsMutableBuilder[Self <: AnchorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTo(value: Anchor): Self = StObject.set(x, "addTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToUndefined: Self = StObject.set(x, "addTo", js.undefined)
    
    @scala.inline
    def setRotate(value: VectorOptions): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setScale(value: VectorOptions | Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTranslate(value: VectorOptions): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
  }
}
