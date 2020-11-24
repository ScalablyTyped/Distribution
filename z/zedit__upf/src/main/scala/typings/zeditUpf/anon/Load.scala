package typings.zeditUpf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Load extends js.Object {
  
  /**
    * Loaded records which pass filter will be copied to the patch plugin,
    * and then passed to the patch function.
    */
  var load: Filter = js.native
}
object Load {
  
  @scala.inline
  def apply(load: Filter): Load = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any])
    __obj.asInstanceOf[Load]
  }
  
  @scala.inline
  implicit class LoadOps[Self <: Load] (val x: Self) extends AnyVal {
    
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
    def setLoad(value: Filter): Self = this.set("load", value.asInstanceOf[js.Any])
  }
}
