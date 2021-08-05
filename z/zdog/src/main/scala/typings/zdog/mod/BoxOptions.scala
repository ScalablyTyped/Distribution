package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxOptions
  extends StObject
     with RectOptions {
  
  /** @default true */
  val bottomFace: js.UndefOr[Boolean | String] = js.undefined
  
  /** @default 1 */
  val depth: js.UndefOr[Double] = js.undefined
  
  /** @default true */
  val frontFace: js.UndefOr[Boolean | String] = js.undefined
  
  /** @default true */
  val leftFace: js.UndefOr[Boolean | String] = js.undefined
  
  /** @default true */
  val rearFace: js.UndefOr[Boolean | String] = js.undefined
  
  /** @default true */
  val rightFace: js.UndefOr[Boolean | String] = js.undefined
  
  /** @default true */
  val topFace: js.UndefOr[Boolean | String] = js.undefined
}
object BoxOptions {
  
  inline def apply(): BoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxOptions]
  }
  
  extension [Self <: BoxOptions](x: Self) {
    
    inline def setBottomFace(value: Boolean | String): Self = StObject.set(x, "bottomFace", value.asInstanceOf[js.Any])
    
    inline def setBottomFaceUndefined: Self = StObject.set(x, "bottomFace", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFrontFace(value: Boolean | String): Self = StObject.set(x, "frontFace", value.asInstanceOf[js.Any])
    
    inline def setFrontFaceUndefined: Self = StObject.set(x, "frontFace", js.undefined)
    
    inline def setLeftFace(value: Boolean | String): Self = StObject.set(x, "leftFace", value.asInstanceOf[js.Any])
    
    inline def setLeftFaceUndefined: Self = StObject.set(x, "leftFace", js.undefined)
    
    inline def setRearFace(value: Boolean | String): Self = StObject.set(x, "rearFace", value.asInstanceOf[js.Any])
    
    inline def setRearFaceUndefined: Self = StObject.set(x, "rearFace", js.undefined)
    
    inline def setRightFace(value: Boolean | String): Self = StObject.set(x, "rightFace", value.asInstanceOf[js.Any])
    
    inline def setRightFaceUndefined: Self = StObject.set(x, "rightFace", js.undefined)
    
    inline def setTopFace(value: Boolean | String): Self = StObject.set(x, "topFace", value.asInstanceOf[js.Any])
    
    inline def setTopFaceUndefined: Self = StObject.set(x, "topFace", js.undefined)
  }
}
