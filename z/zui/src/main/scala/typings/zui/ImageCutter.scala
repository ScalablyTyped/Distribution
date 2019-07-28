package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageCutter extends js.Object {
  def getData(): ImageData
  def resetImage(img: String): js.Any
}

object ImageCutter {
  @scala.inline
  def apply(getData: () => ImageData, resetImage: String => js.Any): ImageCutter = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), resetImage = js.Any.fromFunction1(resetImage))
  
    __obj.asInstanceOf[ImageCutter]
  }
}

