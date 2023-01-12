package typings.zrender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePatternObject
  extends StObject
     with PatternObject {
  
  var image: Any
  
  var imageHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Width and height of image.
    * `imageWidth` and `imageHeight` are only used in svg-ssr renderer.
    * Because we can't get the size of image in svg-ssr renderer.
    * They need to be give explictly.
    */
  var imageWidth: js.UndefOr[Double] = js.undefined
  
  var repeat: js.UndefOr[ImagePatternRepeat] = js.undefined
}
object ImagePatternObject {
  
  inline def apply(image: Any): ImagePatternObject = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePatternObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagePatternObject] (val x: Self) extends AnyVal {
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    inline def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
    
    inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    inline def setImageWidthUndefined: Self = StObject.set(x, "imageWidth", js.undefined)
    
    inline def setRepeat(value: ImagePatternRepeat): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
