package typings.zeditUpf.anon

import typings.zeditUpf.mod.Executor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Execute[S, L] extends js.Object {
  
  /**
    * @deprecated Use function version
    * @see Patcher.execute
    */
  var execute: Executor[S, L] = js.native
}
object Execute {
  
  @scala.inline
  def apply[S, L](execute: Executor[S, L]): Execute[S, L] = {
    val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Execute[S, L]]
  }
  
  @scala.inline
  implicit class ExecuteOps[Self <: Execute[_, _], S, L] (val x: Self with (Execute[S, L])) extends AnyVal {
    
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
    def setExecute(value: Executor[S, L]): Self = this.set("execute", value.asInstanceOf[js.Any])
  }
}
