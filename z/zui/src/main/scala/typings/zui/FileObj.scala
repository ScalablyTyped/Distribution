package typings.zui

import typings.std.Date
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileObj extends js.Object {
  
  def destroy(): Unit = js.native
  
  var ext: js.UndefOr[String] = js.native
  
  def getNative(): File = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isImage: js.UndefOr[Boolean] = js.native
  
  var lastModifiedDate: js.UndefOr[Date] = js.native
  
  var loaded: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var origSize: js.UndefOr[Double] = js.native
  
  var percent: js.UndefOr[Double] = js.native
  
  var previewImage: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var status: js.UndefOr[STATUS] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object FileObj {
  
  @scala.inline
  def apply(destroy: () => Unit, getNative: () => File): FileObj = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getNative = js.Any.fromFunction0(getNative))
    __obj.asInstanceOf[FileObj]
  }
  
  @scala.inline
  implicit class FileObjOps[Self <: FileObj] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNative(value: () => File): Self = this.set("getNative", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsImage(value: Boolean): Self = this.set("isImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsImage: Self = this.set("isImage", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrigSize(value: Double): Self = this.set("origSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigSize: Self = this.set("origSize", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    
    @scala.inline
    def setPreviewImage(value: String): Self = this.set("previewImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewImage: Self = this.set("previewImage", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStatus(value: STATUS): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
