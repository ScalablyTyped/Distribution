package typings.zeditUpf.anon

import typings.xelib.mod.FileHandle
import typings.xelib.mod.RecordHandle
import typings.zeditUpf.mod.Helpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Records[S, L] extends js.Object {
  
  /**
    * A function which can be used instead of load.
    * The records function allows you to return a custom array of records to patch.
    */
  def records(filesToPatch: js.Array[FileHandle], helpers: Helpers, settings: S, locals: L): js.Array[RecordHandle] = js.native
}
object Records {
  
  @scala.inline
  def apply[S, L](records: (js.Array[FileHandle], Helpers, S, L) => js.Array[RecordHandle]): Records[S, L] = {
    val __obj = js.Dynamic.literal(records = js.Any.fromFunction4(records))
    __obj.asInstanceOf[Records[S, L]]
  }
  
  @scala.inline
  implicit class RecordsOps[Self <: Records[_, _], S, L] (val x: Self with (Records[S, L])) extends AnyVal {
    
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
    def setRecords(value: (js.Array[FileHandle], Helpers, S, L) => js.Array[RecordHandle]): Self = this.set("records", js.Any.fromFunction4(value))
  }
}
