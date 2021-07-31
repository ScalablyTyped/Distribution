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
  
  @scala.inline
  def apply(destroy: () => Unit, getNative: () => File): FileObj = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getNative = js.Any.fromFunction0(getNative))
    __obj.asInstanceOf[FileObj]
  }
  
  @scala.inline
  implicit class FileObjMutableBuilder[Self <: FileObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    @scala.inline
    def setGetNative(value: () => File): Self = StObject.set(x, "getNative", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsImage(value: Boolean): Self = StObject.set(x, "isImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImageUndefined: Self = StObject.set(x, "isImage", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrigSize(value: Double): Self = StObject.set(x, "origSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigSizeUndefined: Self = StObject.set(x, "origSize", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setPreviewImage(value: String): Self = StObject.set(x, "previewImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewImageUndefined: Self = StObject.set(x, "previewImage", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: STATUS): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
