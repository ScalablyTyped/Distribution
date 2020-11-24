package typings.zeditUpf.anon

import typings.xelib.mod.RecordHandle
import typings.zeditUpf.mod.Helpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Patch[S, L] extends js.Object {
  
  /**
    * Called for each record copied to the patch plugin.
    * This is the step where you set values on the record.
    */
  var patch: js.UndefOr[
    js.Function4[/* record */ RecordHandle, /* helpers */ Helpers, /* settings */ S, /* locals */ L, Unit]
  ] = js.native
}
object Patch {
  
  @scala.inline
  def apply[S, L](): Patch[S, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Patch[S, L]]
  }
  
  @scala.inline
  implicit class PatchOps[Self <: Patch[_, _], S, L] (val x: Self with (Patch[S, L])) extends AnyVal {
    
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
    def setPatch(
      value: (/* record */ RecordHandle, /* helpers */ Helpers, /* settings */ S, /* locals */ L) => Unit
    ): Self = this.set("patch", js.Any.fromFunction4(value))
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
  }
}
