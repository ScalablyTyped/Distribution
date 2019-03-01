package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageCutter extends js.Object {
  def getData(): ImageData
  def resetImage(img: java.lang.String): js.Any
}

object ImageCutter {
  @scala.inline
  def apply(getData: js.Function0[ImageData], resetImage: js.Function1[java.lang.String, js.Any]): ImageCutter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("resetImage")(resetImage)
    __obj.asInstanceOf[ImageCutter]
  }
}

