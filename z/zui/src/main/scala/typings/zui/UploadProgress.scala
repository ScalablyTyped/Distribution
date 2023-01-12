package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadProgress extends StObject {
  
  var bytesPerSec: js.UndefOr[Double] = js.undefined
  
  var failed: js.UndefOr[Double] = js.undefined
  
  var loaded: js.UndefOr[Double] = js.undefined
  
  var percent: js.UndefOr[Double] = js.undefined
  
  var queued: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var uploaded: js.UndefOr[Double] = js.undefined
}
object UploadProgress {
  
  inline def apply(): UploadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadProgress] (val x: Self) extends AnyVal {
    
    inline def setBytesPerSec(value: Double): Self = StObject.set(x, "bytesPerSec", value.asInstanceOf[js.Any])
    
    inline def setBytesPerSecUndefined: Self = StObject.set(x, "bytesPerSec", js.undefined)
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setQueued(value: Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
    
    inline def setUploadedUndefined: Self = StObject.set(x, "uploaded", js.undefined)
  }
}
