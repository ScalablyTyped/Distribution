package typings.zui

import typings.std.Date
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileObj extends StObject {
  
  def destroy(): Unit
  
  var ext: js.UndefOr[String] = js.undefined
  
  def getNative(): File
  
  var id: js.UndefOr[String] = js.undefined
  
  var isImage: js.UndefOr[Boolean] = js.undefined
  
  var lastModifiedDate: js.UndefOr[Date] = js.undefined
  
  var loaded: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var origSize: js.UndefOr[Double] = js.undefined
  
  var percent: js.UndefOr[Double] = js.undefined
  
  var previewImage: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[STATUS] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object FileObj {
  
  inline def apply(destroy: () => Unit, getNative: () => File): FileObj = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getNative = js.Any.fromFunction0(getNative))
    __obj.asInstanceOf[FileObj]
  }
  
  extension [Self <: FileObj](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setGetNative(value: () => File): Self = StObject.set(x, "getNative", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsImage(value: Boolean): Self = StObject.set(x, "isImage", value.asInstanceOf[js.Any])
    
    inline def setIsImageUndefined: Self = StObject.set(x, "isImage", js.undefined)
    
    inline def setLastModifiedDate(value: Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigSize(value: Double): Self = StObject.set(x, "origSize", value.asInstanceOf[js.Any])
    
    inline def setOrigSizeUndefined: Self = StObject.set(x, "origSize", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setPreviewImage(value: String): Self = StObject.set(x, "previewImage", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageUndefined: Self = StObject.set(x, "previewImage", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStatus(value: STATUS): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
