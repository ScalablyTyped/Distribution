package typings.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maxfilesize extends js.Object {
  
  var max_file_size: js.UndefOr[String] = js.native
  
  var mime_type: js.Array[Extensions] = js.native
  
  var prevent_duplicates: js.UndefOr[String] = js.native
}
object Maxfilesize {
  
  @scala.inline
  def apply(mime_type: js.Array[Extensions]): Maxfilesize = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxfilesize]
  }
  
  @scala.inline
  implicit class MaxfilesizeOps[Self <: Maxfilesize] (val x: Self) extends AnyVal {
    
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
    def setMime_typeVarargs(value: Extensions*): Self = this.set("mime_type", js.Array(value :_*))
    
    @scala.inline
    def setMime_type(value: js.Array[Extensions]): Self = this.set("mime_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_file_size(value: String): Self = this.set("max_file_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_file_size: Self = this.set("max_file_size", js.undefined)
    
    @scala.inline
    def setPrevent_duplicates(value: String): Self = this.set("prevent_duplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevent_duplicates: Self = this.set("prevent_duplicates", js.undefined)
  }
}
