package typings.zeditUpf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchFileName extends js.Object {
  
  /**
    * Use the patchFileName setting if you want to use a unique patch file
    * for your patcher instead of the default zPatch.esp plugin file.
    * (using zPatch.esp is recommended)
    *
    * @default zPatch.esp
    */
  var patchFileName: js.UndefOr[String] = js.native
}
object PatchFileName {
  
  @scala.inline
  def apply(): PatchFileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchFileName]
  }
  
  @scala.inline
  implicit class PatchFileNameOps[Self <: PatchFileName] (val x: Self) extends AnyVal {
    
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
    def setPatchFileName(value: String): Self = this.set("patchFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchFileName: Self = this.set("patchFileName", js.undefined)
  }
}
