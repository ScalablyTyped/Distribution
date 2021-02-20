package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxOptions extends RectOptions {
  
  /** @default true */
  val bottomFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default 1 */
  val depth: js.UndefOr[Double] = js.native
  
  /** @default true */
  val frontFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default true */
  val leftFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default true */
  val rearFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default true */
  val rightFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default true */
  val topFace: js.UndefOr[Boolean | String] = js.native
}
object BoxOptions {
  
  @scala.inline
  def apply(): BoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxOptions]
  }
  
  @scala.inline
  implicit class BoxOptionsMutableBuilder[Self <: BoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomFace(value: Boolean | String): Self = StObject.set(x, "bottomFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomFaceUndefined: Self = StObject.set(x, "bottomFace", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setFrontFace(value: Boolean | String): Self = StObject.set(x, "frontFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontFaceUndefined: Self = StObject.set(x, "frontFace", js.undefined)
    
    @scala.inline
    def setLeftFace(value: Boolean | String): Self = StObject.set(x, "leftFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftFaceUndefined: Self = StObject.set(x, "leftFace", js.undefined)
    
    @scala.inline
    def setRearFace(value: Boolean | String): Self = StObject.set(x, "rearFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRearFaceUndefined: Self = StObject.set(x, "rearFace", js.undefined)
    
    @scala.inline
    def setRightFace(value: Boolean | String): Self = StObject.set(x, "rightFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightFaceUndefined: Self = StObject.set(x, "rightFace", js.undefined)
    
    @scala.inline
    def setTopFace(value: Boolean | String): Self = StObject.set(x, "topFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopFaceUndefined: Self = StObject.set(x, "topFace", js.undefined)
  }
}
