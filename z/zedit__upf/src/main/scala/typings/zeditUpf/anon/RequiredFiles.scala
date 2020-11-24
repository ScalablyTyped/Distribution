package typings.zeditUpf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredFiles extends js.Object {
  
  /**
    * @deprecated Use function version
    * @see Patcher.requiredFiles
    */
  var requiredFiles: js.Array[String] = js.native
}
object RequiredFiles {
  
  @scala.inline
  def apply(requiredFiles: js.Array[String]): RequiredFiles = {
    val __obj = js.Dynamic.literal(requiredFiles = requiredFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredFiles]
  }
  
  @scala.inline
  implicit class RequiredFilesOps[Self <: RequiredFiles] (val x: Self) extends AnyVal {
    
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
    def setRequiredFilesVarargs(value: String*): Self = this.set("requiredFiles", js.Array(value :_*))
    
    @scala.inline
    def setRequiredFiles(value: js.Array[String]): Self = this.set("requiredFiles", value.asInstanceOf[js.Any])
  }
}
