package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadProgress extends StObject {
  
  var bytesPerSec: js.UndefOr[Double] = js.native
  
  var failed: js.UndefOr[Double] = js.native
  
  var loaded: js.UndefOr[Double] = js.native
  
  var percent: js.UndefOr[Double] = js.native
  
  var queued: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var uploaded: js.UndefOr[Double] = js.native
}
object UploadProgress {
  
  @scala.inline
  def apply(): UploadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadProgress]
  }
  
  @scala.inline
  implicit class UploadProgressMutableBuilder[Self <: UploadProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesPerSec(value: Double): Self = StObject.set(x, "bytesPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesPerSecUndefined: Self = StObject.set(x, "bytesPerSec", js.undefined)
    
    @scala.inline
    def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setQueued(value: Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadedUndefined: Self = StObject.set(x, "uploaded", js.undefined)
  }
}
