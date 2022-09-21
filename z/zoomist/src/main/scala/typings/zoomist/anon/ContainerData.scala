package typings.zoomist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerData extends StObject {
  
  var containerData: AspectRatio
  
  var dragData: StartX
  
  var imageData: Height
  
  var originalImageData: Height
  
  var pinchData: Dist
}
object ContainerData {
  
  inline def apply(
    containerData: AspectRatio,
    dragData: StartX,
    imageData: Height,
    originalImageData: Height,
    pinchData: Dist
  ): ContainerData = {
    val __obj = js.Dynamic.literal(containerData = containerData.asInstanceOf[js.Any], dragData = dragData.asInstanceOf[js.Any], imageData = imageData.asInstanceOf[js.Any], originalImageData = originalImageData.asInstanceOf[js.Any], pinchData = pinchData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerData]
  }
  
  extension [Self <: ContainerData](x: Self) {
    
    inline def setContainerData(value: AspectRatio): Self = StObject.set(x, "containerData", value.asInstanceOf[js.Any])
    
    inline def setDragData(value: StartX): Self = StObject.set(x, "dragData", value.asInstanceOf[js.Any])
    
    inline def setImageData(value: Height): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setOriginalImageData(value: Height): Self = StObject.set(x, "originalImageData", value.asInstanceOf[js.Any])
    
    inline def setPinchData(value: Dist): Self = StObject.set(x, "pinchData", value.asInstanceOf[js.Any])
  }
}
