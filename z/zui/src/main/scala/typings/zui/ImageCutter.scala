package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCutter extends StObject {
  
  def getData(): ImageData
  
  def resetImage(img: String): js.Any
}
object ImageCutter {
  
  @scala.inline
  def apply(getData: () => ImageData, resetImage: String => js.Any): ImageCutter = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), resetImage = js.Any.fromFunction1(resetImage))
    __obj.asInstanceOf[ImageCutter]
  }
  
  @scala.inline
  implicit class ImageCutterMutableBuilder[Self <: ImageCutter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetData(value: () => ImageData): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetImage(value: String => js.Any): Self = StObject.set(x, "resetImage", js.Any.fromFunction1(value))
  }
}
