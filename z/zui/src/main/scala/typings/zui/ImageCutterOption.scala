package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * image cutter
  */
trait ImageCutterOption extends StObject {
  
  var coverColor: js.UndefOr[String] = js.undefined
  
  var coverOpacity: js.UndefOr[Double] = js.undefined
  
  var defaultHeight: js.UndefOr[Double] = js.undefined
  
  var defaultWidth: js.UndefOr[Double] = js.undefined
  
  var fixedRatio: js.UndefOr[Boolean] = js.undefined
  
  var get: js.UndefOr[String] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var post: js.UndefOr[String] = js.undefined
}
object ImageCutterOption {
  
  @scala.inline
  def apply(): ImageCutterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageCutterOption]
  }
  
  @scala.inline
  implicit class ImageCutterOptionMutableBuilder[Self <: ImageCutterOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverColor(value: String): Self = StObject.set(x, "coverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverColorUndefined: Self = StObject.set(x, "coverColor", js.undefined)
    
    @scala.inline
    def setCoverOpacity(value: Double): Self = StObject.set(x, "coverOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverOpacityUndefined: Self = StObject.set(x, "coverOpacity", js.undefined)
    
    @scala.inline
    def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
    
    @scala.inline
    def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
    
    @scala.inline
    def setFixedRatio(value: Boolean): Self = StObject.set(x, "fixedRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRatioUndefined: Self = StObject.set(x, "fixedRatio", js.undefined)
    
    @scala.inline
    def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
  }
}
