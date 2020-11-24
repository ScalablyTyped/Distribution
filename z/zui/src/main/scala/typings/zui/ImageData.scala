package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageData extends js.Object {
  
  var bottom: Double = js.native
  
  // width: number;
  // height: number;
  var left: Double = js.native
  
  var originHeight: Double = js.native
  
  var originWidth: Double = js.native
  
  var right: Double = js.native
  
  var scaleHeight: Double = js.native
  
  var scaleWidth: Double = js.native
  
  var scaled: Boolean = js.native
  
  var top: Double = js.native
}
object ImageData {
  
  @scala.inline
  def apply(
    bottom: Double,
    left: Double,
    originHeight: Double,
    originWidth: Double,
    right: Double,
    scaleHeight: Double,
    scaleWidth: Double,
    scaled: Boolean,
    top: Double
  ): ImageData = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], originHeight = originHeight.asInstanceOf[js.Any], originWidth = originWidth.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], scaleHeight = scaleHeight.asInstanceOf[js.Any], scaleWidth = scaleWidth.asInstanceOf[js.Any], scaled = scaled.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
  
  @scala.inline
  implicit class ImageDataOps[Self <: ImageData] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginHeight(value: Double): Self = this.set("originHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginWidth(value: Double): Self = this.set("originWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleHeight(value: Double): Self = this.set("scaleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleWidth(value: Double): Self = this.set("scaleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaled(value: Boolean): Self = this.set("scaled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}
