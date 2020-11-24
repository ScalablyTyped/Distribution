package typings.zeditUpf.anon

import typings.xelib.mod.RecordHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  /**
    * Filter function. Called for each loaded record.
    * Return false to skip patching a record.
    */
  var filter: js.UndefOr[js.Function1[/* record */ RecordHandle, Boolean]] = js.native
  
  /**
    * Pass true to include override records.
    *
    * @default false
    */
  var overrides: js.UndefOr[Boolean] = js.native
  
  /**
    * Record signature to load.
    * You can view record signatures by top level group names
    * on the tree view and in record headers.
    */
  var signature: String = js.native
}
object Filter {
  
  @scala.inline
  def apply(signature: String): Filter = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: /* record */ RecordHandle => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setOverrides(value: Boolean): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
