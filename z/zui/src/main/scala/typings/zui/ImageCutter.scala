package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCutter extends StObject {
  
  def getData(): ImageData
  
  def resetImage(img: String): Any
}
object ImageCutter {
  
  inline def apply(getData: () => ImageData, resetImage: String => Any): ImageCutter = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), resetImage = js.Any.fromFunction1(resetImage))
    __obj.asInstanceOf[ImageCutter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageCutter] (val x: Self) extends AnyVal {
    
    inline def setGetData(value: () => ImageData): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setResetImage(value: String => Any): Self = StObject.set(x, "resetImage", js.Any.fromFunction1(value))
  }
}
